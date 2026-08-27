import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccm extends bxi implements bls, bml {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bmz bU = new bmz(bT, "Strider suffocating modifier", -0.34F, bmz.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final cpi bY = cpi.a(cmk.dC);
   private static final cpi bZ = cpi.a(cmk.dC, cmk.nR);
   private static final afz<Integer> ca = agc.a(ccm.class, agb.b);
   private static final afz<Boolean> cb = agc.a(ccm.class, agb.k);
   private static final afz<Boolean> cc = agc.a(ccm.class, agb.k);
   private final blr cd = new blr(this.an, ca, cc);
   @Nullable
   private btz ce;

   public ccm(blj<? extends ccm> $$0, csy $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eek.j, -1.0F);
      this.a(eek.i, 0.0F);
      this.a(eek.n, 0.0F);
      this.a(eek.o, 0.0F);
   }

   public static boolean c(blj<ccm> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      hv.a $$5 = $$3.j();

      do {
         $$5.c(ia.b);
      } while ($$1.b_($$5).a(arw.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(afz<?> $$0) {
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
   public void b(sj $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(sj $$0) {
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
   public void a(@Nullable ard $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, arc.xh, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bO.a(1, new btk(this, 1.65));
      this.bO.a(2, new bsd(this, 1.0));
      this.ce = new btz(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new ccm.a(this, 1.0));
      this.bO.a(5, new bsq(this, 1.0));
      this.bO.a(7, new bto(this, 1.0, 60));
      this.bO.a(8, new bsz(this, cer.class, 8.0F));
      this.bO.a(8, new btm(this));
      this.bO.a(9, new bsz(this, ccm.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bmx $$1 = this.a(bnb.m);
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
   public boolean a(edz $$0) {
      return $$0.a(arw.b);
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * aty.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(ctb $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public blv cN() {
      return (blv)(this.i() && this.cQ() instanceof cer $$0 && $$0.b(cmk.nR) ? $$0 : super.cN());
   }

   @Override
   public elb b(blv $$0) {
      elb[] $$1 = new elb[]{
         a((double)this.dg(), (double)$$0.dg(), $$0.dC()),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 45.0F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 45.0F)
      };
      Set<hv> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cH().e;
      double $$4 = this.cH().b - 0.5;
      hv.a $$5 = new hv.a();

      for (elb $$6 : $$1) {
         $$5.b(this.dr() + $$6.c, $$3, this.dx() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ia.a);
         }
      }

      for (hv $$8 : $$2) {
         if (!this.dM().b_($$8).a(arw.b)) {
            double $$9 = this.dM().i($$8);
            if (cgo.a($$9)) {
               elb $$10 = elb.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fA().iterator();

               while (var14.hasNext()) {
                  bmh $$11 = (bmh)var14.next();
                  ekw $$12 = $$0.e($$11);
                  if (cgo.a(this.dM(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new elb(this.dr(), this.cH().e, this.dx());
   }

   @Override
   protected void a(cer $$0, elb $$1) {
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aU = this.aW = this.dC();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected elb b(cer $$0, elb $$1) {
      return new elb(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cer $$0) {
      return (float)(this.b(bnb.m) * (double)(this.u() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aM() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(this.bn() ? arc.xf : arc.xe, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.eg());
   }

   @Override
   protected void a(double $$0, boolean $$1, dip $$2, hv $$3) {
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
         this.a(arc.xa, 1.0F, this.eX());
      } else if (this.gb() && this.ag.a(60) == 0) {
         this.a(arc.xb, 1.0F, this.eX());
      }

      if (!this.fU()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dip $$0 = this.dM().a_(this.dm());
            dip $$1 = this.bj();
            $$2 = $$0.a(arr.aT) || $$1.a(arr.aT) || this.b(arw.b) > 0.0;
            if (this.cZ() instanceof ccm $$3 && $$3.u()) {
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
         elg $$0 = elg.a(this);
         if ($$0.a(dao.d, this.dm(), true) && !this.dM().b_(this.dm().c()).a(arw.b)) {
            this.c(true);
         } else {
            this.g(this.dp().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bna.a w() {
      return blx.C().a(bnb.m, 0.175F).a(bnb.g, 16.0);
   }

   @Override
   protected arb y() {
      return !this.gb() && !this.A() ? arc.wZ : null;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.xd;
   }

   @Override
   protected arb n_() {
      return arc.xc;
   }

   @Override
   protected boolean r(blf $$0) {
      return !this.bP() && !this.a(arw.b);
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
   protected bvf b(csy $$0) {
      return new ccm.b(this, $$0);
   }

   @Override
   public float a(hv $$0, ctb $$1) {
      if ($$1.a_($$0).u().a(arw.b)) {
         return 10.0F;
      } else {
         return this.bn() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public ccm b(amp $$0, bla $$1) {
      return blj.aW.a((csy)$$0);
   }

   @Override
   public boolean m(cmh $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ey() {
      super.ey();
      if (this.i()) {
         this.a(cmk.nK);
      }
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bjl.a(this.dM().B);
      } else {
         bjl $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cmh $$4 = $$0.b($$1);
            return $$4.a(cmk.nK) ? $$4.a($$0, this, $$1) : bjl.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), arc.xg, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public elb cJ() {
      return new elb(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         auf $$5 = $$0.F_();
         if ($$5.a(30) == 0) {
            blx $$6 = blj.bu.a((csy)$$0.D());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new ccs.b(ccs.a($$5), false));
               $$6.a(blk.a, new cmh(cmk.nR));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bla $$7 = blj.aW.a((csy)$$0.D());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bla.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bmo a(ctn $$0, bjj $$1, blx $$2, @Nullable bmo $$3) {
      $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
      $$2.a($$0, $$1, blz.g, $$3, null);
      $$2.a(this, true);
      return new bla.a(0.0F);
   }

   static class a extends bte {
      private final ccm g;

      a(ccm $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public hv k() {
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
      protected boolean a(ctb $$0, hv $$1) {
         return $$0.a_($$1).a(cwb.H) && $$0.a_($$1.c()).a($$0, $$1, eep.a);
      }
   }

   static class b extends bve {
      b(ccm $$0, csy $$1) {
         super($$0, $$1);
      }

      @Override
      protected eeq a(int $$0) {
         this.o = new eet();
         this.o.a(true);
         return new eeq(this.o, $$0);
      }

      @Override
      protected boolean a(eek $$0) {
         return $$0 != eek.i && $$0 != eek.o && $$0 != eek.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(hv $$0) {
         return this.b.a_($$0).a(cwb.H) || super.a($$0);
      }
   }
}
