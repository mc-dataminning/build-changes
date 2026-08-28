import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqa implements eqc {
   private static final Logger b = LogUtils.getLogger();
   private final dcu c;
   private final int d;
   private final ArrayDeque<eqa.c> e = new ArrayDeque<>();
   private final List<eqa.c> f = new ArrayList<>();
   private int g = 0;

   public eqa(dcu $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ji $$0, dta $$1, jd $$2, jd $$3, int $$4, int $$5) {
      this.a($$2, new eqa.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(jd $$0, dfw $$1, jd $$2) {
      this.a($$0, new eqa.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dta $$0, jd $$1, dfw $$2, jd $$3, boolean $$4) {
      this.a($$1, new eqa.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(jd $$0, dfw $$1, @Nullable ji $$2) {
      this.a($$0, new eqa.b($$0.i(), $$1, $$2));
   }

   private void a(jd $$0, eqa.c $$1) {
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
            eqa.c $$1 = this.e.peek();

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

   static record a(dta a, jd b, dfw c, jd d, boolean e) implements eqa.c {
      @Override
      public boolean a(dcu $$0) {
         eqc.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements eqa.c {
      private final jd a;
      private final dfw b;
      @Nullable
      private final ji c;
      private int d = 0;

      b(jd $$0, dfw $$1, @Nullable ji $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (eqc.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(dcu $$0) {
         jd $$1 = this.a.a(eqc.a[this.d++]);
         dta $$2 = $$0.a_($$1);
         eqc.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < eqc.a.length && eqc.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < eqc.a.length;
      }
   }

   interface c {
      boolean a(dcu var1);
   }

   static record d(ji a, dta b, jd c, jd d, int e, int f) implements eqa.c {
      @Override
      public boolean a(dcu $$0) {
         eqc.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(jd a, dfw b, jd c) implements eqa.c {
      @Override
      public boolean a(dcu $$0) {
         dta $$1 = $$0.a_(this.a);
         eqc.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
