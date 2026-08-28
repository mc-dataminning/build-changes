import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cha extends cgm {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.33;
   private static final akk<Boolean> cc = ako.a(cha.class, akm.k);
   @Nullable
   private cha.a<coh> cd;
   @Nullable
   private cha.b ce;

   public cha(bug<? extends cha> $$0, dev $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean y() {
      return this.am.a(cc);
   }

   private void x(boolean $$0) {
      this.am.a(cc, $$0);
      this.t();
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.x($$0.q("Trusting"));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void D() {
      this.ce = new cha.b(this, 0.6, $$0 -> $$0.a(axi.aq), true);
      this.bS.a(1, new cbn(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new cbz(this, 0.3F));
      this.bS.a(8, new ccj(this));
      this.bS.a(9, new cbf(this, 0.8));
      this.bS.a(10, new cdg(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new ccb(this, coh.class, 10.0F));
      this.bT.a(1, new cdm<>(this, cgr.class, false));
      this.bT.a(1, new cdm<>(this, chn.class, 10, false, false, chn.bY));
   }

   @Override
   public void ac() {
      if (this.M().b()) {
         double $$0 = this.M().c();
         if ($$0 == 0.6) {
            this.b(bvh.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bvh.a);
            this.h(true);
         } else {
            this.b(bvh.a);
            this.h(false);
         }
      } else {
         this.b(bvh.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ag > 2400;
   }

   public static bwc.a q() {
      return cgm.gA().a(bwd.s, 10.0).a(bwd.v, 0.3F).a(bwd.c, 3.0);
   }

   @Nullable
   @Override
   protected awj w() {
      return awk.so;
   }

   @Override
   public int T() {
      return 900;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.sn;
   }

   @Override
   protected awj o_() {
      return awk.sp;
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.y() && this.l($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dX().C) {
            if (this.af.a(3) == 0) {
               this.x(true);
               this.y(true);
               this.dX().a(this, (byte)41);
            } else {
               this.y(false);
               this.dX().a(this, (byte)40);
            }
         }

         return bry.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.y(true);
      } else if ($$0 == 40) {
         this.y(false);
      } else {
         super.b($$0);
      }
   }

   private void y(boolean $$0) {
      lo $$1 = lq.Q;
      if (!$$0) {
         $$1 = lq.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dX().a($$1, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.cd == null) {
         this.cd = new cha.a<>(this, coh.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.y()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public cha b(arm $$0, btq $$1) {
      return bug.au.a($$0, buf.e);
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.aq);
   }

   public static boolean c(bug<cha> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dey $$0) {
      if ($$0.f(this) && !$$0.d(this.cS())) {
         jg $$1 = this.dx();
         if ($$1.v() < $$0.N()) {
            return false;
         }

         dvd $$2 = $$0.a_($$1.e());
         if ($$2.a(dia.i) || $$2.a(awz.P)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      if ($$3 == null) {
         $$3 = new btq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ezh cU() {
      return new ezh(0.0, (double)(0.5F * this.cT()), (double)(this.ds() * 0.4F));
   }

   @Override
   public boolean cf() {
      return this.cj() || super.cf();
   }

   static class a<T extends buv> extends cba<T> {
      private final cha i;

      public a(cha $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bue.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.y() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.y() && super.c();
      }
   }

   static class b extends cdb {
      private final cha c;

      public b(cha $$0, double $$1, Predicate<cvx> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
