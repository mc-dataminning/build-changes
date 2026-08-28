import javax.annotation.Nullable;

public class cpd extends cpb {
   private static final int e = 600;
   private static final int f = -1;
   private static final akm<Integer> g = akq.a(cpd.class, ako.b);
   private static final byte h = 0;

   public cpd(bus<? extends cpd> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cpd(dfm $$0, double $$1, double $$2, double $$3, cwm $$4, @Nullable cwm $$5) {
      super(bus.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.E();
   }

   public cpd(dfm $$0, bvh $$1, cwm $$2, @Nullable cwm $$3) {
      super(bus.g, $$1, $$0, $$2, $$3);
      this.E();
   }

   private cyl D() {
      return this.t().a(ku.Q, cyl.a);
   }

   private void a(cyl $$0) {
      this.t().b(ku.Q, $$0);
      this.E();
   }

   @Override
   protected void a(cwm $$0) {
      super.a($$0);
      this.E();
   }

   private void E() {
      cyl $$0 = this.D();
      this.al.a(g, $$0.equals(cyl.a) ? -1 : $$0.b());
   }

   public void a(btq $$0) {
      this.a(this.D().a($$0));
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(g, -1);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         if (this.a) {
            if (this.b % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.a && this.b != 0 && !this.D().equals(cyl.a) && this.b >= 600) {
         this.dV().a(this, (byte)0);
         this.a(new cwm(cwq.ox));
      }
   }

   private void b(int $$0) {
      int $$1 = this.A();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dV().a(ll.a(ls.u, $$1), this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int A() {
      return this.al.a(g);
   }

   @Override
   protected void a(bvh $$0) {
      super.a($$0);
      bul $$1 = this.B();
      cyl $$2 = this.D();
      if ($$2.e().isPresent()) {
         for (btq $$3 : $$2.e().get().a().a()) {
            $$0.b(new btq($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (btq $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cwm s() {
      return new cwm(cwq.ox);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.A();
         if ($$1 != -1) {
            float $$2 = (float)($$1 >> 16 & 0xFF) / 255.0F;
            float $$3 = (float)($$1 >> 8 & 0xFF) / 255.0F;
            float $$4 = (float)($$1 >> 0 & 0xFF) / 255.0F;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dV().a(ll.a(ls.u, $$2, $$3, $$4), this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
