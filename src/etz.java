import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etz implements eue {
   private static final Logger b = LogUtils.getLogger();
   private final dgg c;
   private final int d;
   private final ArrayDeque<etz.c> e = new ArrayDeque<>();
   private final List<etz.c> f = new ArrayList<>();
   private int g = 0;

   public etz(dgg $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jn $$0, dwv $$1, ji $$2, ji $$3, int $$4, int $$5) {
      this.a($$2, new etz.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(ji $$0, djk $$1, @Nullable euf $$2) {
      this.a($$0, new etz.e($$0, $$1, $$2));
   }

   @Override
   public void a(dwv $$0, ji $$1, djk $$2, @Nullable euf $$3, boolean $$4) {
      this.a($$1, new etz.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(ji $$0, djk $$1, @Nullable jn $$2, @Nullable euf $$3) {
      this.a($$0, new etz.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(ji $$0, etz.c $$1) {
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
            etz.c $$1 = this.e.peek();

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

   static record a(dwv a, ji b, djk c, @Nullable euf d, boolean e) implements etz.c {
      @Override
      public boolean a(dgg $$0) {
         eue.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements etz.c {
      private final ji a;
      private final djk b;
      @Nullable
      private euf c;
      @Nullable
      private final jn d;
      private int e = 0;

      b(ji $$0, djk $$1, @Nullable euf $$2, @Nullable jn $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (eue.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dgg $$0) {
         jn $$1 = eue.a[this.e++];
         ji $$2 = this.a.a($$1);
         dwv $$3 = $$0.a_($$2);
         euf $$4 = null;
         if ($$0.K().b(crt.c)) {
            if (this.c == null) {
               this.c = eub.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         eue.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < eue.a.length && eue.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < eue.a.length;
      }
   }

   interface c {
      boolean a(dgg var1);
   }

   static record d(jn a, dwv b, ji c, ji d, int e, int f) implements etz.c {
      @Override
      public boolean a(dgg $$0) {
         eue.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(ji a, djk b, @Nullable euf c) implements etz.c {
      @Override
      public boolean a(dgg $$0) {
         dwv $$1 = $$0.a_(this.a);
         eue.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
