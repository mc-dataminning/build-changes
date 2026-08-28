import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chm extends cgy {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.33;
   private static final akm<Boolean> cc = akq.a(chm.class, ako.k);
   @Nullable
   private chm.a<cou> cd;
   @Nullable
   private chm.b ce;

   public chm(bus<? extends chm> $$0, dfm $$1) {
      super($$0, $$1);
      this.q();
   }

   boolean v() {
      return this.al.a(cc);
   }

   private void x(boolean $$0) {
      this.al.a(cc, $$0);
      this.q();
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Trusting", this.v());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.x($$0.q("Trusting"));
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void B() {
      this.ce = new chm.b(this, 0.6, $$0 -> $$0.a(axl.at), true);
      this.bS.a(1, new cbz(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new ccl(this, 0.3F));
      this.bS.a(8, new ccv(this));
      this.bS.a(9, new cbr(this, 0.8));
      this.bS.a(10, new cds(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new ccn(this, cou.class, 10.0F));
      this.bT.a(1, new cdy<>(this, chd.class, false));
      this.bT.a(1, new cdy<>(this, chz.class, 10, false, false, chz.bY));
   }

   @Override
   public void a(arp $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
         if ($$1 == 0.6) {
            this.b(bvt.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bvt.a);
            this.h(true);
         } else {
            this.b(bvt.a);
            this.h(false);
         }
      } else {
         this.b(bvt.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.v() && this.af > 2400;
   }

   public static bwo.a n() {
      return cgy.gr().a(bwp.s, 10.0).a(bwp.v, 0.3F).a(bwp.c, 3.0);
   }

   @Nullable
   @Override
   protected awm t() {
      return awn.so;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.sn;
   }

   @Override
   protected awm n_() {
      return awn.sp;
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.v() && this.j($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dV().C) {
            if (this.ae.a(3) == 0) {
               this.x(true);
               this.y(true);
               this.dV().a(this, (byte)41);
            } else {
               this.y(false);
               this.dV().a(this, (byte)40);
            }
         }

         return bsk.a;
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
      lq $$1 = ls.Q;
      if (!$$0) {
         $$1 = ls.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dV().a($$1, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void q() {
      if (this.cd == null) {
         this.cd = new chm.a<>(this, cou.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.v()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public chm b(arp $$0, buc $$1) {
      return bus.aH.a($$0, bur.e);
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.at);
   }

   public static boolean c(bus<chm> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dfp $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         jh $$1 = this.dv();
         if ($$1.v() < $$0.O()) {
            return false;
         }

         dvv $$2 = $$0.a_($$1.e());
         if ($$2.a(dis.i) || $$2.a(axc.P)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if ($$3 == null) {
         $$3 = new buc.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ezy cT() {
      return new ezy(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bvh> extends cbm<T> {
      private final chm i;

      public a(chm $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, buq.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.v() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.v() && super.c();
      }
   }

   static class b extends cdn {
      private final chm c;

      public b(chm $$0, double $$1, Predicate<cwm> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.v();
      }
   }
}
