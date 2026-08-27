import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccw extends bxs implements bmc, bmv {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bnj bU = new bnj(bT, "Strider suffocating modifier", -0.34F, bnj.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final cps bY = cps.a(cmu.dC);
   private static final cps bZ = cps.a(cmu.dC, cmu.nR);
   private static final agj<Integer> ca = agm.a(ccw.class, agl.b);
   private static final agj<Boolean> cb = agm.a(ccw.class, agl.k);
   private static final agj<Boolean> cc = agm.a(ccw.class, agl.k);
   private final bmb cd = new bmb(this.an, ca, cc);
   @Nullable
   private buj ce;

   public ccw(blt<? extends ccw> $$0, cti $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eev.j, -1.0F);
      this.a(eev.i, 0.0F);
      this.a(eev.n, 0.0F);
      this.a(eev.o, 0.0F);
   }

   public static boolean c(blt<ccw> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      hx.a $$5 = $$3.j();

      do {
         $$5.c(ic.b);
      } while ($$1.b_($$5).a(asg.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(agj<?> $$0) {
      if (ca.equals($$0) && this.dM().B) {
         this.cd.a();
      }

      super.a($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_();
   }

   @Override
   public void a(@Nullable arn $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, arm.xh, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bO.a(1, new btu(this, 1.65));
      this.bO.a(2, new bsn(this, 1.0));
      this.ce = new buj(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new ccw.a(this, 1.0));
      this.bO.a(5, new bta(this, 1.0));
      this.bO.a(7, new bty(this, 1.0, 60));
      this.bO.a(8, new btj(this, cfb.class, 8.0F));
      this.bO.a(8, new btw(this));
      this.bO.a(9, new btj(this, ccw.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bnh $$1 = this.a(bnl.m);
      if ($$1 != null) {
         $$1.b(bT);
         if ($$0) {
            $$1.b(bU);
         }
      }
   }

   @Override
   public boolean u() {
      return this.an.b(cb);
   }

   @Override
   public boolean a(eek $$0) {
      return $$0.a(asg.b);
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * aui.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(ctl $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bmf cN() {
      return (bmf)(this.i() && this.cQ() instanceof cfb $$0 && $$0.b(cmu.nR) ? $$0 : super.cN());
   }

   @Override
   public elm b(bmf $$0) {
      elm[] $$1 = new elm[]{
         a((double)this.dg(), (double)$$0.dg(), $$0.dC()),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 45.0F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 45.0F)
      };
      Set<hx> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cH().e;
      double $$4 = this.cH().b - 0.5;
      hx.a $$5 = new hx.a();

      for (elm $$6 : $$1) {
         $$5.b(this.dr() + $$6.c, $$3, this.dx() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ic.a);
         }
      }

      for (hx $$8 : $$2) {
         if (!this.dM().b_($$8).a(asg.b)) {
            double $$9 = this.dM().j($$8);
            if (cgy.a($$9)) {
               elm $$10 = elm.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fA().iterator();

               while (var14.hasNext()) {
                  bmr $$11 = (bmr)var14.next();
                  elh $$12 = $$0.e($$11);
                  if (cgy.a(this.dM(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new elm(this.dr(), this.cH().e, this.dx());
   }

   @Override
   protected void a(cfb $$0, elm $$1) {
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aU = this.aW = this.dC();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected elm b(cfb $$0, elm $$1) {
      return new elm(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cfb $$0) {
      return (float)(this.b(bnl.m) * (double)(this.u() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aM() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(this.bn() ? arm.xf : arm.xe, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.eg());
   }

   @Override
   protected void a(double $$0, boolean $$1, dja $$2, hx $$3) {
      this.aQ();
      if (this.bn()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.A() && this.ag.a(140) == 0) {
         this.a(arm.xa, 1.0F, this.eX());
      } else if (this.gb() && this.ag.a(60) == 0) {
         this.a(arm.xb, 1.0F, this.eX());
      }

      if (!this.fU()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dja $$0 = this.dM().a_(this.dm());
            dja $$1 = this.bj();
            $$2 = $$0.a(asb.aT) || $$1.a(asb.aT) || this.b(asg.b) > 0.0;
            if (this.cZ() instanceof ccw $$3 && $$3.u()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.ge();
      this.aQ();
   }

   private boolean A() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void ge() {
      if (this.bn()) {
         elr $$0 = elr.a(this);
         if ($$0.a(day.d, this.dm(), true) && !this.dM().b_(this.dm().c()).a(asg.b)) {
            this.c(true);
         } else {
            this.g(this.dp().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bnk.a w() {
      return bmh.C().a(bnl.m, 0.175F).a(bnl.g, 16.0);
   }

   @Override
   protected arl y() {
      return !this.gb() && !this.A() ? arm.wZ : null;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.xd;
   }

   @Override
   protected arl n_() {
      return arm.xc;
   }

   @Override
   protected boolean r(blp $$0) {
      return !this.bP() && !this.a(asg.b);
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected bvp b(cti $$0) {
      return new ccw.b(this, $$0);
   }

   @Override
   public float a(hx $$0, ctl $$1) {
      if ($$1.a_($$0).u().a(asg.b)) {
         return 10.0F;
      } else {
         return this.bn() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public ccw b(amz $$0, blk $$1) {
      return blt.aW.a((cti)$$0);
   }

   @Override
   public boolean m(cmr $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ey() {
      super.ey();
      if (this.i()) {
         this.a(cmu.nK);
      }
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bjv.a(this.dM().B);
      } else {
         bjv $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cmr $$4 = $$0.b($$1);
            return $$4.a(cmu.nK) ? $$4.a($$0, this, $$1) : bjv.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.xg, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public elm cJ() {
      return new elm(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         aup $$5 = $$0.F_();
         if ($$5.a(30) == 0) {
            bmh $$6 = blt.bu.a((cti)$$0.E());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new cdc.b(cdc.a($$5), false));
               $$6.a(blu.a, new cmr(cmu.nR));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            blk $$7 = blt.aW.a((cti)$$0.E());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new blk.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bmy a(ctx $$0, bjt $$1, bmh $$2, @Nullable bmy $$3) {
      $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
      $$2.a($$0, $$1, bmj.g, $$3, null);
      $$2.a(this, true);
      return new blk.a(0.0F);
   }

   static class a extends bto {
      private final ccw g;

      a(ccw $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public hx k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bn() && this.a(this.g.dM(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bn() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(ctl $$0, hx $$1) {
         return $$0.a_($$1).a(cwl.H) && $$0.a_($$1.c()).a($$0, $$1, efa.a);
      }
   }

   static class b extends bvo {
      b(ccw $$0, cti $$1) {
         super($$0, $$1);
      }

      @Override
      protected efb a(int $$0) {
         this.o = new efe();
         this.o.a(true);
         return new efb(this.o, $$0);
      }

      @Override
      protected boolean a(eev $$0) {
         return $$0 != eev.i && $$0 != eev.o && $$0 != eev.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(hx $$0) {
         return this.b.a_($$0).a(cwl.H) || super.a($$0);
      }
   }
}
