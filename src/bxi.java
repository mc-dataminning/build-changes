import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxi extends bwr implements bld, blw {
   private static final afo<Boolean> bT = afr.a(bxi.class, afq.k);
   private static final afo<Integer> bU = afr.a(bxi.class, afq.b);
   private static final cok bW = cok.a(clm.tX, clm.tY, clm.vc);
   private final blc bX = new blc(this.an, bU, bT);

   public bxi(bku<? extends bxi> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new brv(this));
      this.bO.a(1, new bsu(this, 1.25));
      this.bO.a(3, new brn(this, 1.0));
      this.bO.a(4, new btj(this, 1.2, cok.a(clm.nQ), false));
      this.bO.a(4, new btj(this, 1.2, bW, false));
      this.bO.a(5, new bsa(this, 1.1));
      this.bO.a(6, new bto(this, 1.0));
      this.bO.a(7, new bsj(this, cdu.class, 6.0F));
      this.bO.a(8, new bsw(this));
   }

   public static bml.a u() {
      return bli.C().a(bmm.l, 10.0).a(bmm.m, 0.25);
   }

   @Nullable
   @Override
   public blg cO() {
      return (blg)(this.i() && this.cR() instanceof cdu $$0 && $$0.b(clm.nQ) ? $$0 : super.cO());
   }

   @Override
   public void a(afo<?> $$0) {
      if (bU.equals($$0) && this.dN().B) {
         this.bX.a();
      }

      super.a($$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bT, false);
      this.an.a(bU, 0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected aqq y() {
      return aqr.si;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.sk;
   }

   @Override
   protected aqq m_() {
      return aqr.sj;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.sm, 0.15F, 1.0F);
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
            return $$3;
         }
      }
   }

   @Override
   public boolean g() {
      return this.bx() && !this.n_();
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.i()) {
         this.a(clm.nK);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable aqs $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dN().a(null, this, aqr.sl, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public eju b(blg $$0) {
      hx $$1 = this.cF();
      if ($$1.o() == hx.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cfq.a($$1);
         ht $$3 = this.dn();
         ht.a $$4 = new ht.a();
         UnmodifiableIterator var6 = $$0.fB().iterator();

         while (var6.hasNext()) {
            bls $$5 = (bls)var6.next();
            ejp $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dN().i($$4);
               if (cfq.a($$8)) {
                  eju $$9 = eju.a($$4, $$8);
                  if (cfq.a(this.dN(), $$0, $$6.c($$9))) {
                     $$0.b($$5);
                     return $$9;
                  }
               }
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public void a(ame $$0, blf $$1) {
      if ($$0.aj() != biu.a) {
         ccd $$2 = bku.bs.a((csa)$$0);
         if ($$2 != null) {
            $$2.a(bkv.a, new clj(clm.oS));
            $$2.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$2.t(this.fV());
            $$2.a(this.n_());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fK();
            $$0.b($$2);
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cdu $$0, eju $$1) {
      super.a($$0, $$1);
      this.a($$0.dD(), $$0.dF() * 0.5F);
      this.N = this.aU = this.aW = this.dD();
      this.bX.b();
   }

   @Override
   protected eju b(cdu $$0, eju $$1) {
      return new eju(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cdu $$0) {
      return (float)(this.b(bmm.m) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.eh());
   }

   @Nullable
   public bxi b(ame $$0, bkl $$1) {
      return bku.av.a((csa)$$0);
   }

   @Override
   public boolean m(clj $$0) {
      return bW.a($$0);
   }

   @Override
   public eju cJ() {
      return new eju(0.0, (double)(0.6F * this.cI()), (double)(this.dh() * 0.4F));
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
