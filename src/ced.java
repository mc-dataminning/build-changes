import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ced extends cdp {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.33;
   private static final ajm<Boolean> cc = ajq.a(ced.class, ajo.k);
   @Nullable
   private ced.a<clh> cd;
   @Nullable
   private ced.b ce;

   public ced(brn<? extends ced> $$0, dad $$1) {
      super($$0, $$1);
      this.u();
   }

   boolean y() {
      return this.ao.a(cc);
   }

   private void w(boolean $$0) {
      this.ao.a(cc, $$0);
      this.u();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void z() {
      this.ce = new ced.b(this, 0.6, $$0 -> $$0.a(avz.ap), true);
      this.bS.a(1, new byr(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new bzd(this, 0.3F));
      this.bS.a(8, new bzn(this));
      this.bS.a(9, new byj(this, 0.8));
      this.bS.a(10, new cak(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new bzf(this, clh.class, 10.0F));
      this.bT.a(1, new caq<>(this, cdu.class, false));
      this.bT.a(1, new caq<>(this, ceq.class, 10, false, false, ceq.bY));
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bsl.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bsl.a);
            this.h(true);
         } else {
            this.b(bsl.a);
            this.h(false);
         }
      } else {
         this.b(bsl.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ai > 2400;
   }

   public static btg.a r() {
      return bsc.A().a(bth.q, 10.0).a(bth.r, 0.3F).a(bth.c, 3.0);
   }

   @Nullable
   @Override
   protected avb v() {
      return avc.sc;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.sb;
   }

   @Override
   protected avb o_() {
      return avc.sd;
   }

   private float gp() {
      return (float)this.g(bth.c);
   }

   @Override
   public boolean C(brh $$0) {
      return $$0.a(this.dO().b((bsa)this), this.gp());
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.y() && this.o($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dN().B) {
            if (this.ah.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dN().a(this, (byte)41);
            } else {
               this.x(false);
               this.dN().a(this, (byte)40);
            }
         }

         return bpm.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.x(true);
      } else if ($$0 == 40) {
         this.x(false);
      } else {
         super.b($$0);
      }
   }

   private void x(boolean $$0) {
      kv $$1 = kx.O;
      if (!$$0) {
         $$1 = kx.ab;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dN().a($$1, this.d(1.0), this.dv() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void u() {
      if (this.cd == null) {
         this.cd = new ced.a<>(this, clh.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.y()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public ced b(aqh $$0, brb $$1) {
      return brn.at.a((dad)$$0);
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.ap);
   }

   public static boolean c(brn<ced> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dag $$0) {
      if ($$0.f(this) && !$$0.d(this.cI())) {
         in $$1 = this.dn();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dqh $$2 = $$0.a_($$1.d());
         if ($$2.a(ddg.i) || $$2.a(avr.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      if ($$3 == null) {
         $$3 = new brb.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public etp cK() {
      return new etp(0.0, (double)(0.5F * this.cJ()), (double)(this.dh() * 0.4F));
   }

   @Override
   public boolean bU() {
      return this.bY() || super.bU();
   }

   static class a<T extends bsa> extends bye<T> {
      private final ced i;

      public a(ced $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, brm.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.y() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.y() && super.b();
      }
   }

   static class b extends caf {
      private final ced c;

      public b(ced $$0, double $$1, Predicate<csz> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
