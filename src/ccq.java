import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccq extends cdk {
   private static final aja<id> d = aje.a(ccq.class, ajc.n);
   private static final aja<Boolean> e = aje.a(ccq.class, ajc.k);
   private static final aja<Integer> bX = aje.a(ccq.class, ajc.b);
   static final cbj bY = cbj.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bZ = 2400;
   public static final Predicate<cgk> c = $$0 -> !$$0.y() && $$0.bA() && $$0.bc();

   public ccq(bqg<? extends ccq> $$0, czg $$1) {
      super($$0, $$1);
      this.bO = new bwv(this, 85, 10, 0.02F, 0.1F, true);
      this.bN = new bwu(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      this.k(this.ch());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(id $$0) {
      this.an.a(d, $$0);
   }

   public id r() {
      return this.an.a(d);
   }

   public boolean u() {
      return this.an.a(e);
   }

   public void w(boolean $$0) {
      this.an.a(e, $$0);
   }

   public int y() {
      return this.an.a(bX);
   }

   public void c(int $$0) {
      this.an.a(bX, $$0);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(d, id.c);
      $$0.a(e, false);
      $$0.a(bX, 2400);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.r().u());
      $$0.a("TreasurePosY", this.r().v());
      $$0.a("TreasurePosZ", this.r().w());
      $$0.a("GotFish", this.u());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(to $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new id($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxb(this));
      this.bR.a(0, new bza(this));
      this.bR.a(1, new ccq.a(this));
      this.bR.a(2, new ccq.b(this, 4.0));
      this.bR.a(4, new byo(this, 1.0, 10));
      this.bR.a(4, new byl(this));
      this.bR.a(5, new bxy(this, cka.class, 6.0F));
      this.bR.a(5, new bxg(this, 10));
      this.bR.a(6, new bya(this, 1.2F, true));
      this.bR.a(8, new ccq.c());
      this.bR.a(8, new bxl(this));
      this.bR.a(9, new bwx<>(this, chc.class, 8.0F, 1.0, 1.0));
      this.bS.a(1, new bzi(this, chc.class).a());
   }

   public static brz.a gn() {
      return bqv.A().a(bsa.q, 10.0).a(bsa.r, 1.2F).a(bsa.c, 3.0);
   }

   @Override
   protected cae b(czg $$0) {
      return new cag(this, $$0);
   }

   @Override
   public boolean C(bqa $$0) {
      boolean $$1 = $$0.a(this.dN().b((bqt)this), (float)((int)this.g(bsa.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(auo.gS, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int ch() {
      return 4800;
   }

   @Override
   protected int o(int $$0) {
      return this.ch();
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   protected boolean o(bqa $$0) {
      return true;
   }

   @Override
   public boolean f(crs $$0) {
      bqh $$1 = bqv.h($$0);
      return !this.d($$1).d() ? false : $$1 == bqh.a && super.f($$0);
   }

   @Override
   protected void b(cgk $$0) {
      if (this.d(bqh.a).d()) {
         crs $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bqh.a, $$1);
            this.f(bqh.a);
            this.a($$0, $$1.G());
            $$0.am();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gd()) {
         this.k(this.ch());
      } else {
         if (this.be()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dN().r(), 1.0F);
            }

            if (this.aC()) {
               this.g(this.dp().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ag.i() * 360.0F);
               this.c(false);
               this.au = true;
            }
         }

         if (this.dM().B && this.bc() && this.dp().g() > 0.03) {
            esj $$0 = this.f(0.0F);
            float $$1 = axm.b(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = axm.a(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dM()
                  .a(kn.aq, this.dr() - $$0.c * (double)$$3 + (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dM()
                  .a(kn.aq, this.dr() - $$0.c * (double)$$3 - (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(kn.N);
      } else {
         super.b($$0);
      }
   }

   private void a(kl $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dM().a($$0, this.d(1.0), this.du() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if (!$$2.d() && $$2.a(avm.ao)) {
         if (!this.dM().B) {
            this.a(auo.gU, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bof.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected aun d(boy $$0) {
      return auo.gV;
   }

   @Nullable
   @Override
   protected aun o_() {
      return auo.gT;
   }

   @Nullable
   @Override
   protected aun v() {
      return this.bc() ? auo.gR : auo.gQ;
   }

   @Override
   protected aun aO() {
      return auo.gY;
   }

   @Override
   protected aun aN() {
      return auo.gZ;
   }

   protected boolean go() {
      id $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.dk(), 12.0) : false;
   }

   @Override
   public void a(esj $$0) {
      if (this.cY() && this.bc()) {
         this.a(this.fk(), $$0);
         this.a(bqy.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.p() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cka $$0) {
      return true;
   }

   static class a extends bxq {
      private final ccq a;
      private boolean b;

      a(ccq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bxq.a.a, bxq.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.u() && this.a.ci() >= 100;
      }

      @Override
      public boolean b() {
         id $$0 = this.a.r();
         return !id.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) && !this.b && this.a.ci() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dM() instanceof apu) {
            apu $$0 = (apu)this.a.dM();
            this.b = false;
            this.a.K().n();
            id $$1 = this.a.dm();
            id $$2 = $$0.a(avp.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.i($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void d() {
         id $$0 = this.a.r();
         if (id.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         czg $$0 = this.a.dM();
         if (this.a.go() || this.a.K().l()) {
            esj $$1 = esj.b(this.a.r());
            esj $$2 = cbn.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cbn.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               id $$3 = id.a($$2);
               if (!$$0.b_($$3).a(avj.a) || !$$0.a_($$3).a(elq.b)) {
                  $$2 = cbn.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.G().a($$2.c, $$2.d, $$2.e, (float)(this.a.aa() + 20), (float)this.a.Z());
            this.a.K().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bxq {
      private final ccq a;
      private final double b;
      @Nullable
      private cka c;

      b(ccq $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bxq.a.a, bxq.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dM().a(ccq.bY, this.a);
         return this.c == null ? false : this.c.bZ() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bZ() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bpm(bpo.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.c, (float)(this.a.aa() + 20), (float)this.a.Z());
         if (this.a.g(this.c) < 6.25) {
            this.a.K().n();
         } else {
            this.a.K().a(this.c, this.b);
         }

         if (this.c.bZ() && this.c.dM().z.a(6) == 0) {
            this.c.b(new bpm(bpo.D, 100), this.a);
         }
      }
   }

   class c extends bxq {
      private int b;

      @Override
      public boolean a() {
         if (this.b > ccq.this.ah) {
            return false;
         } else {
            List<cgk> $$0 = ccq.this.dM().a(cgk.class, ccq.this.cH().c(8.0, 8.0, 8.0), ccq.c);
            return !$$0.isEmpty() || !ccq.this.d(bqh.a).d();
         }
      }

      @Override
      public void c() {
         List<cgk> $$0 = ccq.this.dM().a(cgk.class, ccq.this.cH().c(8.0, 8.0, 8.0), ccq.c);
         if (!$$0.isEmpty()) {
            ccq.this.K().a($$0.get(0), 1.2F);
            ccq.this.a(auo.gX, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         crs $$0 = ccq.this.d(bqh.a);
         if (!$$0.d()) {
            this.a($$0);
            ccq.this.a(bqh.a, crs.i);
            this.b = ccq.this.ah + ccq.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<cgk> $$0 = ccq.this.dM().a(cgk.class, ccq.this.cH().c(8.0, 8.0, 8.0), ccq.c);
         crs $$1 = ccq.this.d(bqh.a);
         if (!$$1.d()) {
            this.a($$1);
            ccq.this.a(bqh.a, crs.i);
         } else if (!$$0.isEmpty()) {
            ccq.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(crs $$0) {
         if (!$$0.d()) {
            double $$1 = ccq.this.dv() - 0.3F;
            cgk $$2 = new cgk(ccq.this.dM(), ccq.this.dr(), $$1, ccq.this.dx(), $$0);
            $$2.b(40);
            $$2.b(ccq.this);
            float $$3 = 0.3F;
            float $$4 = ccq.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * ccq.this.ag.i();
            $$2.o(
               (double)(0.3F * -axm.a(ccq.this.dC() * (float) (Math.PI / 180.0)) * axm.b(ccq.this.dE() * (float) (Math.PI / 180.0)) + axm.b($$4) * $$5),
               (double)(0.3F * axm.a(ccq.this.dE() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * axm.b(ccq.this.dC() * (float) (Math.PI / 180.0)) * axm.b(ccq.this.dE() * (float) (Math.PI / 180.0)) + axm.a($$4) * $$5)
            );
            ccq.this.dM().b($$2);
         }
      }
   }
}
