import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdc extends bxy implements bmi, bnb {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bnp bU = new bnp(bT, "Strider suffocating modifier", -0.34F, bnp.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final cpz bY = cpz.a(cnb.dC);
   private static final cpz bZ = cpz.a(cnb.dC, cnb.nR);
   private static final agm<Integer> ca = agp.a(cdc.class, ago.b);
   private static final agm<Boolean> cb = agp.a(cdc.class, ago.k);
   private static final agm<Boolean> cc = agp.a(cdc.class, ago.k);
   private final bmh cd = new bmh(this.an, ca, cc);
   @Nullable
   private bup ce;

   public cdc(blz<? extends cdc> $$0, ctp $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(efc.j, -1.0F);
      this.a(efc.i, 0.0F);
      this.a(efc.n, 0.0F);
      this.a(efc.o, 0.0F);
   }

   public static boolean c(blz<cdc> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      hx.a $$5 = $$3.j();

      do {
         $$5.c(ic.b);
      } while ($$1.b_($$5).a(asm.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(agm<?> $$0) {
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
   public void b(sn $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(sn $$0) {
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
   public void a(@Nullable art $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, ars.xh, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bO.a(1, new bua(this, 1.65));
      this.bO.a(2, new bst(this, 1.0));
      this.ce = new bup(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new cdc.a(this, 1.0));
      this.bO.a(5, new btg(this, 1.0));
      this.bO.a(7, new bue(this, 1.0, 60));
      this.bO.a(8, new btp(this, cfi.class, 8.0F));
      this.bO.a(8, new buc(this));
      this.bO.a(9, new btp(this, cdc.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bnn $$1 = this.a(bnr.m);
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
   public boolean a(eer $$0) {
      return $$0.a(asm.b);
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * auo.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(cts $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bml cN() {
      return (bml)(this.i() && this.cQ() instanceof cfi $$0 && $$0.b(cnb.nR) ? $$0 : super.cN());
   }

   @Override
   public elt b(bml $$0) {
      elt[] $$1 = new elt[]{
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

      for (elt $$6 : $$1) {
         $$5.b(this.dr() + $$6.c, $$3, this.dx() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ic.a);
         }
      }

      for (hx $$8 : $$2) {
         if (!this.dM().b_($$8).a(asm.b)) {
            double $$9 = this.dM().j($$8);
            if (chf.a($$9)) {
               elt $$10 = elt.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fA().iterator();

               while (var14.hasNext()) {
                  bmx $$11 = (bmx)var14.next();
                  elo $$12 = $$0.e($$11);
                  if (chf.a(this.dM(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new elt(this.dr(), this.cH().e, this.dx());
   }

   @Override
   protected void a(cfi $$0, elt $$1) {
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aU = this.aW = this.dC();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected elt b(cfi $$0, elt $$1) {
      return new elt(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cfi $$0) {
      return (float)(this.b(bnr.m) * (double)(this.u() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aM() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(this.bn() ? ars.xf : ars.xe, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.eg());
   }

   @Override
   protected void a(double $$0, boolean $$1, djh $$2, hx $$3) {
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
         this.a(ars.xa, 1.0F, this.eX());
      } else if (this.gb() && this.ag.a(60) == 0) {
         this.a(ars.xb, 1.0F, this.eX());
      }

      if (!this.fU()) {
         boolean $$2;
         boolean var10000;
         label36: {
            djh $$0 = this.dM().a_(this.dm());
            djh $$1 = this.bj();
            $$2 = $$0.a(ash.aT) || $$1.a(ash.aT) || this.b(asm.b) > 0.0;
            if (this.cZ() instanceof cdc $$3 && $$3.u()) {
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
         ely $$0 = ely.a(this);
         if ($$0.a(dbf.d, this.dm(), true) && !this.dM().b_(this.dm().c()).a(asm.b)) {
            this.c(true);
         } else {
            this.g(this.dp().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bnq.a w() {
      return bmn.C().a(bnr.m, 0.175F).a(bnr.g, 16.0);
   }

   @Override
   protected arr y() {
      return !this.gb() && !this.A() ? ars.wZ : null;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.xd;
   }

   @Override
   protected arr n_() {
      return ars.xc;
   }

   @Override
   protected boolean r(blv $$0) {
      return !this.bP() && !this.a(asm.b);
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
   protected bvv b(ctp $$0) {
      return new cdc.b(this, $$0);
   }

   @Override
   public float a(hx $$0, cts $$1) {
      if ($$1.a_($$0).u().a(asm.b)) {
         return 10.0F;
      } else {
         return this.bn() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cdc b(and $$0, blq $$1) {
      return blz.aW.a((ctp)$$0);
   }

   @Override
   public boolean m(cmy $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ey() {
      super.ey();
      if (this.i()) {
         this.a(cnb.nK);
      }
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bkb.a(this.dM().B);
      } else {
         bkb $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cmy $$4 = $$0.b($$1);
            return $$4.a(cnb.nK) ? $$4.a($$0, this, $$1) : bkb.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), ars.xg, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public elt cJ() {
      return new elt(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         auv $$5 = $$0.F_();
         if ($$5.a(30) == 0) {
            bmn $$6 = blz.bu.a((ctp)$$0.E());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new cdi.b(cdi.a($$5), false));
               $$6.a(bma.a, new cmy(cnb.nR));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            blq $$7 = blz.aW.a((ctp)$$0.E());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new blq.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bne a(cue $$0, bjz $$1, bmn $$2, @Nullable bne $$3) {
      $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
      $$2.a($$0, $$1, bmp.g, $$3, null);
      $$2.a(this, true);
      return new blq.a(0.0F);
   }

   static class a extends btu {
      private final cdc g;

      a(cdc $$0, double $$1) {
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
      protected boolean a(cts $$0, hx $$1) {
         return $$0.a_($$1).a(cws.H) && $$0.a_($$1.c()).a($$0, $$1, efh.a);
      }
   }

   static class b extends bvu {
      b(cdc $$0, ctp $$1) {
         super($$0, $$1);
      }

      @Override
      protected efi a(int $$0) {
         this.o = new efl();
         this.o.a(true);
         return new efi(this.o, $$0);
      }

      @Override
      protected boolean a(efc $$0) {
         return $$0 != efc.i && $$0 != efc.o && $$0 != efc.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(hx $$0) {
         return this.b.a_($$0).a(cws.H) || super.a($$0);
      }
   }
}
