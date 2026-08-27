import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ces extends cee {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.33;
   private static final ajr<Boolean> cc = ajv.a(ces.class, ajt.k);
   @Nullable
   private ces.a<clw> cd;
   @Nullable
   private ces.b ce;

   public ces(bsa<? extends ces> $$0, dax $$1) {
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
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void z() {
      this.ce = new ces.b(this, 0.6, $$0 -> $$0.a(awe.ap), true);
      this.bS.a(1, new bzg(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new bzs(this, 0.3F));
      this.bS.a(8, new cac(this));
      this.bS.a(9, new byy(this, 0.8));
      this.bS.a(10, new caz(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new bzu(this, clw.class, 10.0F));
      this.bT.a(1, new cbf<>(this, cej.class, false));
      this.bT.a(1, new cbf<>(this, cff.class, 10, false, false, cff.bY));
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bta.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bta.a);
            this.h(true);
         } else {
            this.b(bta.a);
            this.h(false);
         }
      } else {
         this.b(bta.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ai > 2400;
   }

   public static btv.a s() {
      return bsq.A().a(btw.q, 10.0).a(btw.r, 0.3F).a(btw.c, 3.0);
   }

   @Nullable
   @Override
   protected avg v() {
      return avh.sm;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.sl;
   }

   @Override
   protected avg o_() {
      return avh.sn;
   }

   private float gp() {
      return (float)this.g(btw.c);
   }

   @Override
   public boolean C(bru $$0) {
      return $$0.a(this.dQ().b((bso)this), this.gp());
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.y() && this.o($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dP().B) {
            if (this.ah.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dP().a(this, (byte)41);
            } else {
               this.x(false);
               this.dP().a(this, (byte)40);
            }
         }

         return bpu.a(this.dP().B);
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
      kw $$1 = ky.Q;
      if (!$$0) {
         $$1 = ky.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dP().a($$1, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void u() {
      if (this.cd == null) {
         this.cd = new ces.a<>(this, clw.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.y()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public ces b(aqm $$0, bro $$1) {
      return bsa.au.a((dax)$$0);
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.ap);
   }

   public static boolean c(bsa<ces> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dba $$0) {
      if ($$0.f(this) && !$$0.d(this.cK())) {
         io $$1 = this.dp();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         drb $$2 = $$0.a_($$1.d());
         if ($$2.a(dea.i) || $$2.a(avw.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      if ($$3 == null) {
         $$3 = new bro.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public euk cM() {
      return new euk(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Override
   public boolean bW() {
      return this.ca() || super.bW();
   }

   static class a<T extends bso> extends byt<T> {
      private final ces i;

      public a(ces $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, brz.e::test);
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

   static class b extends cau {
      private final ces c;

      public b(ces $$0, double $$1, Predicate<cto> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
