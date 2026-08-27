import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzm extends bui implements bit, bjn {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bkb bU = new bkb(bT, "Strider suffocating modifier", -0.34F, bkb.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final clw bY = clw.a(ciz.dh);
   private static final clw bZ = clw.a(ciz.dh, ciz.ng);
   private static final adx<Integer> ca = aea.a(bzm.class, adz.b);
   private static final adx<Boolean> cb = aea.a(bzm.class, adz.k);
   private static final adx<Boolean> cc = aea.a(bzm.class, adz.k);
   private final bis cd = new bis(this.an, ca, cc);
   @Nullable
   private bra ce;

   public bzm(bik<? extends bzm> $$0, cpk $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eam.j, -1.0F);
      this.a(eam.i, 0.0F);
      this.a(eam.n, 0.0F);
      this.a(eam.o, 0.0F);
   }

   public static boolean c(bik<bzm> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      gv.a $$5 = $$3.j();

      do {
         $$5.c(hb.b);
      } while ($$1.b_($$5).a(apo.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(adx<?> $$0) {
      if (ca.equals($$0) && this.dK().B) {
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
   public void b(qs $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public boolean g() {
      return this.bv() && !this.i_();
   }

   @Override
   public void a(@Nullable aov $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dK().a(null, this, aou.wr, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void w() {
      this.bO.a(1, new bql(this, 1.65));
      this.bO.a(2, new bpe(this, 1.0));
      this.ce = new bra(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new bzm.a(this, 1.0));
      this.bO.a(5, new bpr(this, 1.0));
      this.bO.a(7, new bqp(this, 1.0, 60));
      this.bO.a(8, new bqa(this, cbl.class, 8.0F));
      this.bO.a(8, new bqn(this));
      this.bO.a(9, new bqa(this, bzm.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bjz $$1 = this.a(bkd.d);
      if ($$1 != null) {
         $$1.b(bT);
         if ($$0) {
            $$1.b(bU);
         }
      }
   }

   @Override
   public boolean p() {
      return this.an.b(cb);
   }

   @Override
   public boolean a(eab $$0) {
      return $$0.a(apo.b);
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * aro.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(cpn $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public biw cN() {
      return (biw)(this.i() && this.cQ() instanceof cbl $$0 && $$0.b(ciz.ng) ? $$0 : super.cN());
   }

   @Override
   public ehf b(biw $$0) {
      ehf[] $$1 = new ehf[]{
         a((double)this.df(), (double)$$0.df(), $$0.dA()),
         a((double)this.df(), (double)$$0.df(), $$0.dA() - 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dA() + 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dA() - 45.0F),
         a((double)this.df(), (double)$$0.df(), $$0.dA() + 45.0F)
      };
      Set<gv> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cG().e;
      double $$4 = this.cG().b - 0.5;
      gv.a $$5 = new gv.a();

      for (ehf $$6 : $$1) {
         $$5.b(this.dp() + $$6.c, $$3, this.dv() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(hb.a);
         }
      }

      for (gv $$8 : $$2) {
         if (!this.dK().b_($$8).a(apo.b)) {
            double $$9 = this.dK().i($$8);
            if (cdh.a($$9)) {
               ehf $$10 = ehf.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fy().iterator();

               while (var14.hasNext()) {
                  bji $$11 = (bji)var14.next();
                  eha $$12 = $$0.e($$11);
                  if (cdh.a(this.dK(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ehf(this.dp(), this.cG().e, this.dv());
   }

   @Override
   protected void a(cbl $$0, ehf $$1) {
      this.a($$0.dA(), $$0.dC() * 0.5F);
      this.N = this.aU = this.aW = this.dA();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected ehf b(cbl $$0, ehf $$1) {
      return new ehf(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cbl $$0) {
      return (float)(this.b(bkd.d) * (double)(this.p() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aK() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(this.bl() ? aou.wp : aou.wo, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.ee());
   }

   @Override
   protected void a(double $$0, boolean $$1, dey $$2, gv $$3) {
      this.aO();
      if (this.bl()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.t() && this.ag.a(140) == 0) {
         this.a(aou.wk, 1.0F, this.eV());
      } else if (this.fW() && this.ag.a(60) == 0) {
         this.a(aou.wl, 1.0F, this.eV());
      }

      if (!this.fQ()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dey $$0 = this.dK().a_(this.dk());
            dey $$1 = this.bh();
            $$2 = $$0.a(apj.aT) || $$1.a(apj.aT) || this.b(apo.b) > 0.0;
            if (this.cY() instanceof bzm $$3 && $$3.p()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.fZ();
      this.aO();
   }

   private boolean t() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean y() {
      return true;
   }

   private void fZ() {
      if (this.bl()) {
         ehk $$0 = ehk.a(this);
         if ($$0.a(cwx.c, this.dk(), true) && !this.dK().b_(this.dk().c()).a(apo.b)) {
            this.c(true);
         } else {
            this.f(this.dn().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bkc.a q() {
      return biy.x().a(bkd.d, 0.175F).a(bkd.b, 16.0);
   }

   @Override
   protected aot r() {
      return !this.fW() && !this.t() ? aou.wj : null;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.wn;
   }

   @Override
   protected aot h_() {
      return aou.wm;
   }

   @Override
   protected boolean r(big $$0) {
      return !this.bO() && !this.a(apo.b);
   }

   @Override
   public boolean fe() {
      return true;
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   protected bsg b(cpk $$0) {
      return new bzm.b(this, $$0);
   }

   @Override
   public float a(gv $$0, cpn $$1) {
      if ($$1.a_($$0).u().a(apo.b)) {
         return 10.0F;
      } else {
         return this.bl() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public bzm b(aki $$0, bib $$1) {
      return bik.aV.a((cpk)$$0);
   }

   @Override
   public boolean m(ciw $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ew() {
      super.ew();
      if (this.i()) {
         this.a(ciz.mZ);
      }
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fG()) {
         if (!this.dK().B) {
            $$0.n(this);
         }

         return bgo.a(this.dK().B);
      } else {
         bgo $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            ciw $$4 = $$0.b($$1);
            return $$4.a(ciz.mZ) ? $$4.a($$0, this, $$1) : bgo.d;
         } else {
            if ($$2 && !this.aS()) {
               this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.wq, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ehf cI() {
      return new ehf(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      if (this.i_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         art $$5 = $$0.y_();
         if ($$5.a(30) == 0) {
            biy $$6 = bik.bs.a((cpk)$$0.C());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new bzs.b(bzs.a($$5), false));
               $$6.a(bil.a, new ciw(ciz.ng));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bib $$7 = bik.aV.a((cpk)$$0.C());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bib.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bjq a(cpz $$0, bgm $$1, biy $$2, @Nullable bjq $$3) {
      $$2.b(this.dp(), this.dr(), this.dv(), this.dA(), 0.0F);
      $$2.a($$0, $$1, bja.g, $$3, null);
      $$2.a(this, true);
      return new bib.a(0.0F);
   }

   static class a extends bqf {
      private final bzm g;

      a(bzm $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public gv k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bl() && this.a(this.g.dK(), this.e);
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
      protected boolean a(cpn $$0, gv $$1) {
         return $$0.a_($$1).a(csl.H) && $$0.a_($$1.c()).a($$0, $$1, ear.a);
      }
   }

   static class b extends bsf {
      b(bzm $$0, cpk $$1) {
         super($$0, $$1);
      }

      @Override
      protected eas a(int $$0) {
         this.o = new eav();
         this.o.a(true);
         return new eas(this.o, $$0);
      }

      @Override
      protected boolean a(eam $$0) {
         return $$0 != eam.i && $$0 != eam.o && $$0 != eam.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(gv $$0) {
         return this.b.a_($$0).a(csl.H) || super.a($$0);
      }
   }
}
