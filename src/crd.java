import javax.annotation.Nullable;

public class crd implements bqk {
   private final dbt b;
   private final jv<cuq> c = jv.a(3, cuq.l);
   @Nullable
   private dbu d;
   private int e;
   private int f;

   public crd(dbt $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cuq $$0 : this.c) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuq a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cuq a(int $$0, int $$1) {
      cuq $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.e()) {
         return bql.a(this.c, $$0, $$2.H());
      } else {
         cuq $$3 = bql.a(this.c, $$0, $$1);
         if (!$$3.e() && this.d($$0)) {
            this.f();
         }

         return $$3;
      }
   }

   private boolean d(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }

   @Override
   public cuq b(int $$0) {
      return bql.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cuq $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cmx $$0) {
      return this.b.gl() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cuq $$0;
      cuq $$1;
      if (this.c.get(0).e()) {
         $$0 = this.c.get(1);
         $$1 = cuq.l;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.e()) {
         this.a(2, cuq.l);
         this.f = 0;
      } else {
         dbv $$4 = this.b.gn();
         if (!$$4.isEmpty()) {
            dbu $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cuq.l);
               this.f = 0;
            }
         }

         this.b.n(this.a(2));
      }
   }

   @Nullable
   public dbu g() {
      return this.d;
   }

   public void c(int $$0) {
      this.e = $$0;
      this.f();
   }

   @Override
   public void a() {
      this.c.clear();
   }

   public int h() {
      return this.f;
   }
}
