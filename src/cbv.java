import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbv extends bwr implements bld, blw {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bmk bU = new bmk(bT, "Strider suffocating modifier", -0.34F, bmk.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final cok bY = cok.a(clm.dC);
   private static final cok bZ = cok.a(clm.dC, clm.nR);
   private static final afo<Integer> ca = afr.a(cbv.class, afq.b);
   private static final afo<Boolean> cb = afr.a(cbv.class, afq.k);
   private static final afo<Boolean> cc = afr.a(cbv.class, afq.k);
   private final blc cd = new blc(this.an, ca, cc);
   @Nullable
   private btj ce;

   public cbv(bku<? extends cbv> $$0, csa $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(edd.j, -1.0F);
      this.a(edd.i, 0.0F);
      this.a(edd.n, 0.0F);
      this.a(edd.o, 0.0F);
   }

   public static boolean c(bku<cbv> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      ht.a $$5 = $$3.j();

      do {
         $$5.c(hx.b);
      } while ($$1.b_($$5).a(arl.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(afo<?> $$0) {
      if (ca.equals($$0) && this.dN().B) {
         this.cd.a();
      }

      super.a($$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public boolean g() {
      return this.bx() && !this.n_();
   }

   @Override
   public void a(@Nullable aqs $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dN().a(null, this, aqr.wM, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsu(this, 1.65));
      this.bO.a(2, new brn(this, 1.0));
      this.ce = new btj(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new cbv.a(this, 1.0));
      this.bO.a(5, new bsa(this, 1.0));
      this.bO.a(7, new bsy(this, 1.0, 60));
      this.bO.a(8, new bsj(this, cdu.class, 8.0F));
      this.bO.a(8, new bsw(this));
      this.bO.a(9, new bsj(this, cbv.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bmi $$1 = this.a(bmm.m);
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
   public boolean a(ecs $$0) {
      return $$0.a(arl.b);
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * atm.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(csd $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public blg cO() {
      return (blg)(this.i() && this.cR() instanceof cdu $$0 && $$0.b(clm.nR) ? $$0 : super.cO());
   }

   @Override
   public eju b(blg $$0) {
      eju[] $$1 = new eju[]{
         a((double)this.dh(), (double)$$0.dh(), $$0.dD()),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() - 22.5F),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() + 22.5F),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() - 45.0F),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() + 45.0F)
      };
      Set<ht> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cH().e;
      double $$4 = this.cH().b - 0.5;
      ht.a $$5 = new ht.a();

      for (eju $$6 : $$1) {
         $$5.b(this.ds() + $$6.c, $$3, this.dy() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(hx.a);
         }
      }

      for (ht $$8 : $$2) {
         if (!this.dN().b_($$8).a(arl.b)) {
            double $$9 = this.dN().i($$8);
            if (cfq.a($$9)) {
               eju $$10 = eju.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fB().iterator();

               while (var14.hasNext()) {
                  bls $$11 = (bls)var14.next();
                  ejp $$12 = $$0.e($$11);
                  if (cfq.a(this.dN(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new eju(this.ds(), this.cH().e, this.dy());
   }

   @Override
   protected void a(cdu $$0, eju $$1) {
      this.a($$0.dD(), $$0.dF() * 0.5F);
      this.N = this.aU = this.aW = this.dD();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected eju b(cdu $$0, eju $$1) {
      return new eju(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cdu $$0) {
      return (float)(this.b(bmm.m) * (double)(this.u() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aM() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(this.bn() ? aqr.wK : aqr.wJ, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.eh());
   }

   @Override
   protected void a(double $$0, boolean $$1, dhi $$2, ht $$3) {
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
         this.a(aqr.wF, 1.0F, this.eY());
      } else if (this.gc() && this.ag.a(60) == 0) {
         this.a(aqr.wG, 1.0F, this.eY());
      }

      if (!this.fV()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dhi $$0 = this.dN().a_(this.dn());
            dhi $$1 = this.bj();
            $$2 = $$0.a(arg.aT) || $$1.a(arg.aT) || this.b(arl.b) > 0.0;
            if (this.da() instanceof cbv $$3 && $$3.u()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gf();
      this.aQ();
   }

   private boolean A() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void gf() {
      if (this.bn()) {
         ejz $$0 = ejz.a(this);
         if ($$0.a(czp.d, this.dn(), true) && !this.dN().b_(this.dn().c()).a(arl.b)) {
            this.c(true);
         } else {
            this.g(this.dq().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bml.a w() {
      return bli.C().a(bmm.m, 0.175F).a(bmm.g, 16.0);
   }

   @Override
   protected aqq y() {
      return !this.gc() && !this.A() ? aqr.wE : null;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.wI;
   }

   @Override
   protected aqq m_() {
      return aqr.wH;
   }

   @Override
   protected boolean r(bkq $$0) {
      return !this.bP() && !this.a(arl.b);
   }

   @Override
   public boolean fi() {
      return true;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected bup b(csa $$0) {
      return new cbv.b(this, $$0);
   }

   @Override
   public float a(ht $$0, csd $$1) {
      if ($$1.a_($$0).u().a(arl.b)) {
         return 10.0F;
      } else {
         return this.bn() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cbv b(ame $$0, bkl $$1) {
      return bku.aV.a((csa)$$0);
   }

   @Override
   public boolean m(clj $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.i()) {
         this.a(clm.nK);
      }
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fJ()) {
         if (!this.dN().B) {
            $$0.n(this);
         }

         return bix.a(this.dN().B);
      } else {
         bix $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            clj $$4 = $$0.b($$1);
            return $$4.a(clm.nK) ? $$4.a($$0, this, $$1) : bix.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.wL, this.dc(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public eju cJ() {
      return new eju(0.0, (double)(0.6F * this.cI()), (double)(this.dh() * 0.4F));
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      if (this.n_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         ats $$5 = $$0.E_();
         if ($$5.a(30) == 0) {
            bli $$6 = bku.bs.a((csa)$$0.D());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new ccb.b(ccb.a($$5), false));
               $$6.a(bkv.a, new clj(clm.nR));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bkl $$7 = bku.aV.a((csa)$$0.D());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bkl.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private blz a(csp $$0, biv $$1, bli $$2, @Nullable blz $$3) {
      $$2.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
      $$2.a($$0, $$1, blk.g, $$3, null);
      $$2.a(this, true);
      return new bkl.a(0.0F);
   }

   static class a extends bso {
      private final cbv g;

      a(cbv $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public ht k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bn() && this.a(this.g.dN(), this.e);
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
      protected boolean a(csd $$0, ht $$1) {
         return $$0.a_($$1).a(cvc.H) && $$0.a_($$1.c()).a($$0, $$1, edi.a);
      }
   }

   static class b extends buo {
      b(cbv $$0, csa $$1) {
         super($$0, $$1);
      }

      @Override
      protected edj a(int $$0) {
         this.o = new edm();
         this.o.a(true);
         return new edj(this.o, $$0);
      }

      @Override
      protected boolean a(edd $$0) {
         return $$0 != edd.i && $$0 != edd.o && $$0 != edd.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ht $$0) {
         return this.b.a_($$0).a(cvc.H) || super.a($$0);
      }
   }
}
