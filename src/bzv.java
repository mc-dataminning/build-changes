import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzv extends bur implements bjd, bjw {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bkk bU = new bkk(bT, "Strider suffocating modifier", -0.34F, bkk.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final cmg bY = cmg.a(cji.dh);
   private static final cmg bZ = cmg.a(cji.dh, cji.ng);
   private static final aef<Integer> ca = aei.a(bzv.class, aeh.b);
   private static final aef<Boolean> cb = aei.a(bzv.class, aeh.k);
   private static final aef<Boolean> cc = aei.a(bzv.class, aeh.k);
   private final bjc cd = new bjc(this.an, ca, cc);
   @Nullable
   private brj ce;

   public bzv(biu<? extends bzv> $$0, cpv $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eax.j, -1.0F);
      this.a(eax.i, 0.0F);
      this.a(eax.n, 0.0F);
      this.a(eax.o, 0.0F);
   }

   public static boolean c(biu<bzv> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      gw.a $$5 = $$3.j();

      do {
         $$5.c(hc.b);
      } while ($$1.b_($$5).a(apy.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(aef<?> $$0) {
      if (ca.equals($$0) && this.dL().B) {
         this.cd.a();
      }

      super.a($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public boolean g() {
      return this.bv() && !this.m_();
   }

   @Override
   public void a(@Nullable apf $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dL().a(null, this, ape.wr, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqu(this, 1.65));
      this.bO.a(2, new bpn(this, 1.0));
      this.ce = new brj(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new bzv.a(this, 1.0));
      this.bO.a(5, new bqa(this, 1.0));
      this.bO.a(7, new bqy(this, 1.0, 60));
      this.bO.a(8, new bqj(this, cbu.class, 8.0F));
      this.bO.a(8, new bqw(this));
      this.bO.a(9, new bqj(this, bzv.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bki $$1 = this.a(bkm.d);
      if ($$1 != null) {
         $$1.b(bT);
         if ($$0) {
            $$1.b(bU);
         }
      }
   }

   public boolean s() {
      return this.an.b(cb);
   }

   @Override
   public boolean a(eam $$0) {
      return $$0.a(apy.b);
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * arx.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(cpy $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bjg cN() {
      return (bjg)(this.i() && this.cQ() instanceof cbu $$0 && $$0.b(cji.ng) ? $$0 : super.cN());
   }

   @Override
   public ehn b(bjg $$0) {
      ehn[] $$1 = new ehn[]{
         a((double)this.df(), (double)$$0.df(), $$0.dB()),
         a((double)this.df(), (double)$$0.df(), $$0.dB() - 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() + 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() - 45.0F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() + 45.0F)
      };
      Set<gw> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cG().e;
      double $$4 = this.cG().b - 0.5;
      gw.a $$5 = new gw.a();

      for (ehn $$6 : $$1) {
         $$5.b(this.dq() + $$6.c, $$3, this.dw() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(hc.a);
         }
      }

      for (gw $$8 : $$2) {
         if (!this.dL().b_($$8).a(apy.b)) {
            double $$9 = this.dL().i($$8);
            if (cdq.a($$9)) {
               ehn $$10 = ehn.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fz().iterator();

               while (var14.hasNext()) {
                  bjs $$11 = (bjs)var14.next();
                  ehi $$12 = $$0.e($$11);
                  if (cdq.a(this.dL(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ehn(this.dq(), this.cG().e, this.dw());
   }

   @Override
   protected void a(cbu $$0, ehn $$1) {
      this.a($$0.dB(), $$0.dD() * 0.5F);
      this.N = this.aU = this.aW = this.dB();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected ehn b(cbu $$0, ehn $$1) {
      return new ehn(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cbu $$0) {
      return (float)(this.b(bkm.d) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aK() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(this.bl() ? ape.wp : ape.wo, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.ef());
   }

   @Override
   protected void a(double $$0, boolean $$1, dfj $$2, gw $$3) {
      this.aO();
      if (this.bl()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.ag.a(140) == 0) {
         this.a(ape.wk, 1.0F, this.eW());
      } else if (this.ga() && this.ag.a(60) == 0) {
         this.a(ape.wl, 1.0F, this.eW());
      }

      if (!this.fT()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dfj $$0 = this.dL().a_(this.dl());
            dfj $$1 = this.bh();
            $$2 = $$0.a(apt.aT) || $$1.a(apt.aT) || this.b(apy.b) > 0.0;
            if (this.cY() instanceof bzv $$3 && $$3.s()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gd();
      this.aO();
   }

   private boolean y() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gd() {
      if (this.bl()) {
         ehs $$0 = ehs.a(this);
         if ($$0.a(cxi.c, this.dl(), true) && !this.dL().b_(this.dl().c()).a(apy.b)) {
            this.c(true);
         } else {
            this.f(this.do().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bkl.a t() {
      return bji.A().a(bkm.d, 0.175F).a(bkm.b, 16.0);
   }

   @Override
   protected apd w() {
      return !this.ga() && !this.y() ? ape.wj : null;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.wn;
   }

   @Override
   protected apd l_() {
      return ape.wm;
   }

   @Override
   protected boolean r(biq $$0) {
      return !this.bO() && !this.a(apy.b);
   }

   @Override
   public boolean ff() {
      return true;
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   protected bsp b(cpv $$0) {
      return new bzv.b(this, $$0);
   }

   @Override
   public float a(gw $$0, cpy $$1) {
      if ($$1.a_($$0).u().a(apy.b)) {
         return 10.0F;
      } else {
         return this.bl() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public bzv b(akr $$0, bil $$1) {
      return biu.aV.a((cpv)$$0);
   }

   @Override
   public boolean m(cjf $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.i()) {
         this.a(cji.mZ);
      }
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fH()) {
         if (!this.dL().B) {
            $$0.n(this);
         }

         return bgy.a(this.dL().B);
      } else {
         bgy $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cjf $$4 = $$0.b($$1);
            return $$4.a(cji.mZ) ? $$4.a($$0, this, $$1) : bgy.d;
         } else {
            if ($$2 && !this.aS()) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), ape.wq, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ehn cI() {
      return new ehn(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qy $$4) {
      if (this.m_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         asc $$5 = $$0.D_();
         if ($$5.a(30) == 0) {
            bji $$6 = biu.bs.a((cpv)$$0.C());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new cab.b(cab.a($$5), false));
               $$6.a(biv.a, new cjf(cji.ng));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bil $$7 = biu.aV.a((cpv)$$0.C());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bil.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bjz a(cqk $$0, bgw $$1, bji $$2, @Nullable bjz $$3) {
      $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
      $$2.a($$0, $$1, bjk.g, $$3, null);
      $$2.a(this, true);
      return new bil.a(0.0F);
   }

   static class a extends bqo {
      private final bzv g;

      a(bzv $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public gw k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bl() && this.a(this.g.dL(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bl() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(cpy $$0, gw $$1) {
         return $$0.a_($$1).a(csw.H) && $$0.a_($$1.c()).a($$0, $$1, ebc.a);
      }
   }

   static class b extends bso {
      b(bzv $$0, cpv $$1) {
         super($$0, $$1);
      }

      @Override
      protected ebd a(int $$0) {
         this.o = new ebg();
         this.o.a(true);
         return new ebd(this.o, $$0);
      }

      @Override
      protected boolean a(eax $$0) {
         return $$0 != eax.i && $$0 != eax.o && $$0 != eax.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(gw $$0) {
         return this.b.a_($$0).a(csw.H) || super.a($$0);
      }
   }
}
