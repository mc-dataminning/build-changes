import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euc implements euh {
   private static final Logger b = LogUtils.getLogger();
   private final dgj c;
   private final int d;
   private final ArrayDeque<euc.c> e = new ArrayDeque<>();
   private final List<euc.c> f = new ArrayList<>();
   private int g = 0;

   public euc(dgj $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jn $$0, dwy $$1, ji $$2, ji $$3, int $$4, int $$5) {
      this.a($$2, new euc.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(ji $$0, djn $$1, @Nullable eui $$2) {
      this.a($$0, new euc.e($$0, $$1, $$2));
   }

   @Override
   public void a(dwy $$0, ji $$1, djn $$2, @Nullable eui $$3, boolean $$4) {
      this.a($$1, new euc.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(ji $$0, djn $$1, @Nullable jn $$2, @Nullable eui $$3) {
      this.a($$0, new euc.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(ji $$0, euc.c $$1) {
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
            euc.c $$1 = this.e.peek();

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

   static record a(dwy a, ji b, djn c, @Nullable eui d, boolean e) implements euc.c {
      @Override
      public boolean a(dgj $$0) {
         euh.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements euc.c {
      private final ji a;
      private final djn b;
      @Nullable
      private eui c;
      @Nullable
      private final jn d;
      private int e = 0;

      b(ji $$0, djn $$1, @Nullable eui $$2, @Nullable jn $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (euh.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dgj $$0) {
         jn $$1 = euh.a[this.e++];
         ji $$2 = this.a.a($$1);
         dwy $$3 = $$0.a_($$2);
         eui $$4 = null;
         if ($$0.K().b(crw.c)) {
            if (this.c == null) {
               this.c = eue.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         euh.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < euh.a.length && euh.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < euh.a.length;
      }
   }

   interface c {
      boolean a(dgj var1);
   }

   static record d(jn a, dwy b, ji c, ji d, int e, int f) implements euc.c {
      @Override
      public boolean a(dgj $$0) {
         euh.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(ji a, djn b, @Nullable eui c) implements euc.c {
      @Override
      public boolean a(dgj $$0) {
         dwy $$1 = $$0.a_(this.a);
         euh.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
