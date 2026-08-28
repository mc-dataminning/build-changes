import javax.annotation.Nullable;

public class cqq implements bpz {
   private final dbc b;
   private final js<cuc> c = js.a(3, cuc.l);
   @Nullable
   private dbd d;
   private int e;
   private int f;

   public cqq(dbc $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cuc $$0 : this.c) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuc a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cuc a(int $$0, int $$1) {
      cuc $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.e()) {
         return bqa.a(this.c, $$0, $$2.H());
      } else {
         cuc $$3 = bqa.a(this.c, $$0, $$1);
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
   public cuc b(int $$0) {
      return bqa.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cuc $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cmk $$0) {
      return this.b.go() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cuc $$0;
      cuc $$1;
      if (this.c.get(0).e()) {
         $$0 = this.c.get(1);
         $$1 = cuc.l;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.e()) {
         this.a(2, cuc.l);
         this.f = 0;
      } else {
         dbe $$4 = this.b.gq();
         if (!$$4.isEmpty()) {
            dbd $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cuc.l);
               this.f = 0;
            }
         }

         this.b.n(this.a(2));
      }
   }

   @Nullable
   public dbd g() {
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
