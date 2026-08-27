import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceu extends ceg {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.33;
   private static final ajs<Boolean> cc = ajw.a(ceu.class, aju.k);
   @Nullable
   private ceu.a<cly> cd;
   @Nullable
   private ceu.b ce;

   public ceu(bsc<? extends ceu> $$0, daz $$1) {
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
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void z() {
      this.ce = new ceu.b(this, 0.6, $$0 -> $$0.a(awf.ap), true);
      this.bS.a(1, new bzi(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new bzu(this, 0.3F));
      this.bS.a(8, new cae(this));
      this.bS.a(9, new bza(this, 0.8));
      this.bS.a(10, new cbb(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new bzw(this, cly.class, 10.0F));
      this.bT.a(1, new cbh<>(this, cel.class, false));
      this.bT.a(1, new cbh<>(this, cfh.class, 10, false, false, cfh.bY));
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(btc.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(btc.a);
            this.h(true);
         } else {
            this.b(btc.a);
            this.h(false);
         }
      } else {
         this.b(btc.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ai > 2400;
   }

   public static btx.a s() {
      return bss.A().a(bty.q, 10.0).a(bty.r, 0.3F).a(bty.c, 3.0);
   }

   @Nullable
   @Override
   protected avh v() {
      return avi.sm;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.sl;
   }

   @Override
   protected avh o_() {
      return avi.sn;
   }

   private float gp() {
      return (float)this.g(bty.c);
   }

   @Override
   public boolean C(brw $$0) {
      return $$0.a(this.dQ().b((bsq)this), this.gp());
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
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

         return bpw.a(this.dP().B);
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
         this.cd = new ceu.a<>(this, cly.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.y()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public ceu b(aqn $$0, brq $$1) {
      return bsc.au.a((daz)$$0);
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.ap);
   }

   public static boolean c(bsc<ceu> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dbc $$0) {
      if ($$0.f(this) && !$$0.d(this.cK())) {
         io $$1 = this.dp();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         drd $$2 = $$0.a_($$1.d());
         if ($$2.a(dec.i) || $$2.a(avx.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      if ($$3 == null) {
         $$3 = new brq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public eum cM() {
      return new eum(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Override
   public boolean bW() {
      return this.ca() || super.bW();
   }

   static class a<T extends bsq> extends byv<T> {
      private final ceu i;

      public a(ceu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsb.e::test);
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

   static class b extends caw {
      private final ceu c;

      public b(ceu $$0, double $$1, Predicate<ctq> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
