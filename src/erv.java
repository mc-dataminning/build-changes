import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erv implements esa {
   private static final Logger b = LogUtils.getLogger();
   private final dej c;
   private final int d;
   private final ArrayDeque<erv.c> e = new ArrayDeque<>();
   private final List<erv.c> f = new ArrayList<>();
   private int g = 0;

   public erv(dej $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jk $$0, dus $$1, jf $$2, jf $$3, int $$4, int $$5) {
      this.a($$2, new erv.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(jf $$0, dhm $$1, @Nullable esb $$2) {
      this.a($$0, new erv.e($$0, $$1, $$2));
   }

   @Override
   public void a(dus $$0, jf $$1, dhm $$2, @Nullable esb $$3, boolean $$4) {
      this.a($$1, new erv.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(jf $$0, dhm $$1, @Nullable jk $$2, @Nullable esb $$3) {
      this.a($$0, new erv.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(jf $$0, erv.c $$1) {
      boolean $$2 = this.g > 0;
      boolean $$3 = this.d >= 0 && this.g >= this.d;
      this.g++;
      if (!$$3) {
         if ($$2) {
            this.f.add($$1);
         } else {
            this.e.push($$1);
         }
      } else if (this.g - 1 == this.d) {
         b.error("Too many chained neighbor updates. Skipping the rest. First skipped position: " + $$0.x());
      }

      if (!$$2) {
         this.a();
      }
   }

   private void a() {
      try {
         while (!this.e.isEmpty() || !this.f.isEmpty()) {
            for (int $$0 = this.f.size() - 1; $$0 >= 0; $$0--) {
               this.e.push(this.f.get($$0));
            }

            this.f.clear();
            erv.c $$1 = this.e.peek();

            while (this.f.isEmpty()) {
               if (!$$1.a(this.c)) {
                  this.e.pop();
                  break;
               }
            }
         }
      } finally {
         this.e.clear();
         this.f.clear();
         this.g = 0;
      }
   }

   static record a(dus a, jf b, dhm c, @Nullable esb d, boolean e) implements erv.c {
      @Override
      public boolean a(dej $$0) {
         esa.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements erv.c {
      private final jf a;
      private final dhm b;
      @Nullable
      private esb c;
      @Nullable
      private final jk d;
      private int e = 0;

      b(jf $$0, dhm $$1, @Nullable esb $$2, @Nullable jk $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (esa.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dej $$0) {
         jk $$1 = esa.a[this.e++];
         jf $$2 = this.a.a($$1);
         dus $$3 = $$0.a_($$2);
         esb $$4 = null;
         if ($$0.J().b(cqs.d)) {
            if (this.c == null) {
               this.c = erx.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         esa.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < esa.a.length && esa.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < esa.a.length;
      }
   }

   interface c {
      boolean a(dej var1);
   }

   static record d(jk a, dus b, jf c, jf d, int e, int f) implements erv.c {
      @Override
      public boolean a(dej $$0) {
         esa.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(jf a, dhm b, @Nullable esb c) implements erv.c {
      @Override
      public boolean a(dej $$0) {
         dus $$1 = $$0.a_(this.a);
         esa.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
