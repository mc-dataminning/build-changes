import javax.annotation.Nullable;

public class cnx implements bnt {
   private final cxu c;
   private final iu<crj> d = iu.a(3, crj.i);
   @Nullable
   private cxv e;
   private int f;
   private int g;

   public cnx(cxu $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean ah_() {
      for (crj $$0 : this.d) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public crj a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public crj a(int $$0, int $$1) {
      crj $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.d()) {
         return bnu.a(this.d, $$0, $$2.G());
      } else {
         crj $$3 = bnu.a(this.d, $$0, $$1);
         if (!$$3.d() && this.d($$0)) {
            this.f();
         }

         return $$3;
      }
   }

   private boolean d(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }

   @Override
   public crj b(int $$0) {
      return bnu.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, crj $$1) {
      this.d.set($$0, $$1);
      if (!$$1.d() && $$1.G() > this.aj_()) {
         $$1.e(this.aj_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return this.c.gn() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      crj $$0;
      crj $$1;
      if (this.d.get(0).d()) {
         $$0 = this.d.get(1);
         $$1 = crj.i;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.d()) {
         this.a(2, crj.i);
         this.g = 0;
      } else {
         cxw $$4 = this.c.gp();
         if (!$$4.isEmpty()) {
            cxv $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.r()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.r()) {
               this.e = $$5;
               this.a(2, $$5.h());
               this.g = $$5.q();
            } else {
               this.a(2, crj.i);
               this.g = 0;
            }
         }

         this.c.n(this.a(2));
      }
   }

   @Nullable
   public cxv g() {
      return this.e;
   }

   public void c(int $$0) {
      this.f = $$0;
      this.f();
   }

   @Override
   public void a() {
      this.d.clear();
   }

   public int h() {
      return this.g;
   }
}
