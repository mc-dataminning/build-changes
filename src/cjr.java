import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cjr extends cee implements bsl, btd {
   private static final UUID ch = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final btt ci = new btt(ch, "Strider suffocating modifier", -0.34F, btt.a.b);
   private static final float ck = 0.35F;
   private static final float cl = 0.55F;
   private static final ajy<Integer> cm = akc.a(cjr.class, aka.b);
   private static final ajy<Boolean> cn = akc.a(cjr.class, aka.k);
   private static final ajy<Boolean> co = akc.a(cjr.class, aka.k);
   private final bsk cp = new bsk(this.as, cm, co);
   @Nullable
   private cat cq;

   public cjr(bsb<? extends cjr> $$0, dca $$1) {
      super($$0, $$1);
      this.K = true;
      this.a(epv.j, -1.0F);
      this.a(epv.i, 0.0F);
      this.a(epv.n, 0.0F);
      this.a(epv.o, 0.0F);
   }

   public static boolean c(bsb<cjr> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      ir.a $$5 = $$3.j();

      do {
         $$5.d(iw.b);
      } while ($$1.b_($$5).a(awj.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(ajy<?> $$0) {
      if (cm.equals($$0) && this.dU().C) {
         this.cp.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cm, 0);
      $$0.a(cn, false);
      $$0.a(co, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      this.cp.a($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.cp.b($$0);
   }

   @Override
   public boolean i() {
      return this.cp.d();
   }

   @Override
   public boolean f() {
      return this.bI() && !this.o_();
   }

   @Override
   public void a(@Nullable avq $$0) {
      this.cp.a(true);
      if ($$0 != null) {
         this.dU().a(null, this, avo.yz, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void y() {
      this.cb.a(1, new cae(this, 1.65));
      this.cb.a(2, new byx(this, 1.0));
      this.cq = new cat(this, 1.4, $$0 -> $$0.a(awm.au), false);
      this.cb.a(3, this.cq);
      this.cb.a(4, new cjr.a(this, 1.0));
      this.cb.a(5, new bzk(this, 1.0));
      this.cb.a(7, new cai(this, 1.0, 60));
      this.cb.a(8, new bzt(this, cly.class, 8.0F));
      this.cb.a(8, new cag(this));
      this.cb.a(9, new bzt(this, cjr.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.as.a(cn, $$0);
      btr $$1 = this.f(btv.r);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(ci);
         } else {
            $$1.e(ci);
         }
      }
   }

   public boolean r() {
      return this.as.a(cn);
   }

   @Override
   public boolean a(epe $$0) {
      return $$0.a(awj.b);
   }

   @Override
   protected ewu a(brv $$0, bry $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.bf.a());
      float $$4 = this.bf.b();
      float $$5 = 0.12F * aym.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dcd $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bso cV() {
      return (bso)(this.i() && this.cY() instanceof cly $$0 && $$0.b(cuk.pi) ? $$0 : super.cV());
   }

   @Override
   public ewu b(bso $$0) {
      ewu[] $$1 = new ewu[]{
         a((double)this.do(), (double)$$0.do(), $$0.dK()),
         a((double)this.do(), (double)$$0.do(), $$0.dK() - 22.5F),
         a((double)this.do(), (double)$$0.do(), $$0.dK() + 22.5F),
         a((double)this.do(), (double)$$0.do(), $$0.dK() - 45.0F),
         a((double)this.do(), (double)$$0.do(), $$0.dK() + 45.0F)
      };
      Set<ir> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cP().e;
      double $$4 = this.cP().b - 0.5;
      ir.a $$5 = new ir.a();

      for (ewu $$6 : $$1) {
         $$5.b(this.dz() + $$6.c, $$3, this.dF() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.d(iw.a);
         }
      }

      for (ir $$8 : $$2) {
         if (!this.dU().b_($$8).a(awj.b)) {
            double $$9 = this.dU().j($$8);
            if (cob.a($$9)) {
               ewu $$10 = ewu.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fR().iterator();

               while (var14.hasNext()) {
                  bsz $$11 = (bsz)var14.next();
                  ewp $$12 = $$0.f($$11);
                  if (cob.a(this.dU(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ewu(this.dz(), this.cP().e, this.dF());
   }

   @Override
   protected void a(cly $$0, ewu $$1) {
      this.a($$0.dK(), $$0.dM() * 0.5F);
      this.P = this.bj = this.bl = this.dK();
      this.cp.b();
      super.a($$0, $$1);
   }

   @Override
   protected ewu b(cly $$0, ewu $$1) {
      return new ewu(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cly $$0) {
      return (float)(this.g(btv.r) * (double)(this.r() ? 0.35F : 0.55F) * (double)this.cp.c());
   }

   @Override
   protected float aS() {
      return this.ab + 0.6F;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(this.bx() ? avo.yx : avo.yw, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cp.a(this.et());
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, ir $$3) {
      this.aW();
      if (this.bx()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.x() && this.al.a(140) == 0) {
         this.b(avo.ys);
      } else if (this.gv() && this.al.a(60) == 0) {
         this.b(avo.yt);
      }

      if (!this.go()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dtc $$0 = this.dU().a_(this.du());
            dtc $$1 = this.bs();
            $$2 = $$0.a(awe.aW) || $$1.a(awe.aW) || this.b(awj.b) > 0.0;
            if (this.dh() instanceof cjr $$3 && $$3.r()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gy();
      this.aW();
   }

   private boolean x() {
      return this.cq != null && this.cq.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gy() {
      if (this.bx()) {
         ewz $$0 = ewz.a(this);
         if ($$0.a(djw.d, this.du(), true) && !this.dU().b_(this.du().c()).a(awj.b)) {
            this.d(true);
         } else {
            this.g(this.dx().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static btu.a t() {
      return bsq.A().a(btv.r, 0.175F).a(btv.k, 16.0);
   }

   @Override
   protected avn u() {
      return !this.gv() && !this.x() ? avo.yr : null;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.yv;
   }

   @Override
   protected avn n_() {
      return avo.yu;
   }

   @Override
   protected boolean r(brv $$0) {
      return !this.bX() && !this.a(awj.b);
   }

   @Override
   public boolean fy() {
      return true;
   }

   @Override
   public boolean bV() {
      return false;
   }

   @Override
   protected cbz b(dca $$0) {
      return new cjr.b(this, $$0);
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      if ($$1.a_($$0).u().a(awj.b)) {
         return 10.0F;
      } else {
         return this.bx() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cjr b(aqt $$0, brp $$1) {
      return bsb.bc.a((dca)$$0);
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.at);
   }

   @Override
   protected void eL() {
      super.eL();
      if (this.i()) {
         this.a(cuk.pb);
      }
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bX() && !$$0.ga()) {
         if (!this.dU().C) {
            $$0.n(this);
         }

         return bqa.a(this.dU().C);
      } else {
         bqa $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuh $$4 = $$0.b($$1);
            return $$4.a(cuk.pb) ? $$4.a($$0, this, $$1) : bqa.d;
         } else {
            if ($$2 && !this.ba()) {
               this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.yy, this.dj(), 1.0F, 1.0F + (this.al.i() - this.al.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ewu cR() {
      return new ewu(0.0, (double)(0.6F * this.cQ()), (double)(this.do() * 0.4F));
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ayt $$4 = $$0.F_();
         if ($$4.a(30) == 0) {
            bsq $$5 = bsb.bC.a((dca)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cjx.b(cjx.a($$4), false));
               $$5.a(bsc.a, new cuh(cuk.pi));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            brp $$6 = bsb.bc.a((dca)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new brp.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private btg a(dcp $$0, bpy $$1, bsq $$2, @Nullable btg $$3) {
      $$2.b(this.dz(), this.dB(), this.dF(), this.dK(), 0.0F);
      $$2.a($$0, $$1, bss.g, $$3);
      $$2.a(this, true);
      return new brp.a(0.0F);
   }

   static class a extends bzy {
      private final cjr g;

      a(cjr $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public ir k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bx() && this.a(this.g.dU(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bx() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dcd $$0, ir $$1) {
         return $$0.a_($$1).a(dfe.am) && $$0.a_($$1.c()).a(ept.a);
      }
   }

   static class b extends cby {
      b(cjr $$0, dca $$1) {
         super($$0, $$1);
      }

      @Override
      protected epu a(int $$0) {
         this.o = new eqa();
         this.o.a(true);
         return new epu(this.o, $$0);
      }

      @Override
      protected boolean a(epv $$0) {
         return $$0 != epv.i && $$0 != epv.o && $$0 != epv.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ir $$0) {
         return this.b.a_($$0).a(dfe.am) || super.a($$0);
      }
   }
}
