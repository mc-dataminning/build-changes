import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cgm extends cfv implements buc, buu {
   private static final akg<Boolean> bZ = akk.a(cgm.class, aki.k);
   private static final akg<Integer> ca = akk.a(cgm.class, aki.b);
   private final bub cb = new bub(this.am, ca, bZ);

   public cgm(btq<? extends cgm> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bT.a(0, new caw(this));
      this.bT.a(1, new cbv(this, 1.25));
      this.bT.a(3, new cao(this, 1.0));
      this.bT.a(4, new cck(this, 1.2, $$0 -> $$0.a(cvo.nR), false));
      this.bT.a(4, new cck(this, 1.2, $$0 -> $$0.a(axb.ar), false));
      this.bT.a(5, new cbb(this, 1.1));
      this.bT.a(6, new ccp(this, 1.0));
      this.bT.a(7, new cbk(this, cnp.class, 6.0F));
      this.bT.a(8, new cbx(this));
   }

   public static bvl.a q() {
      return cfv.gt().a(bvm.s, 10.0).a(bvm.v, 0.25);
   }

   @Nullable
   @Override
   public buf cU() {
      return (buf)(this.i() && this.cX() instanceof cnp $$0 && $$0.b(cvo.nR) ? $$0 : super.cU());
   }

   @Override
   public void a(akg<?> $$0) {
      if (ca.equals($$0) && this.dS().B) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, 0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      this.cb.a($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.cb.b($$0);
   }

   @Override
   protected awc w() {
      return awd.tB;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.tD;
   }

   @Override
   protected awc n_() {
      return awd.tC;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.tF, 0.15F, 1.0F);
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      boolean $$2 = this.p($$0.b($$1));
      if (!$$2 && this.i() && !this.bX() && !$$0.fR()) {
         if (!this.dS().B) {
            $$0.n(this);
         }

         return brk.a;
      } else {
         brk $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cvl $$4 = $$0.b($$1);
            return (brk)($$4.a(cvo.nL) ? $$4.a($$0, this, $$1) : brk.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bI() && !this.o_();
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(cvo.nL);
      }
   }

   @Override
   public boolean i() {
      return this.cb.d();
   }

   @Override
   public void a(cvl $$0, @Nullable awe $$1) {
      this.cb.a(true);
      if ($$1 != null) {
         this.dS().a(null, this, awd.tE, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public eye b(buf $$0) {
      jj $$1 = this.cM();
      if ($$1.o() == jj.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cpr.a($$1);
         je $$3 = this.ds();
         je.a $$4 = new je.a();
         UnmodifiableIterator var6 = $$0.fI().iterator();

         while (var6.hasNext()) {
            bur $$5 = (bur)var6.next();
            exz $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dS().j($$4);
               if (cpr.a($$8)) {
                  eye $$9 = eye.a($$4, $$8);
                  if (cpr.a(this.dS(), $$0, $$6.c($$9))) {
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
   public void a(arg $$0, bue $$1) {
      if ($$0.am() != brh.a) {
         clq $$2 = btq.bx.a($$0, btp.i);
         if ($$2 != null) {
            $$2.a(btr.a, new cvl(cvo.oX));
            $$2.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
            $$2.u(this.gd());
            $$2.a(this.o_());
            if (this.ak()) {
               $$2.b(this.al());
               $$2.p(this.cI());
            }

            $$2.fV();
            $$0.b($$2);
            this.as();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cnp $$0, eye $$1) {
      super.a($$0, $$1);
      this.a($$0.dI(), $$0.dK() * 0.5F);
      this.O = this.aU = this.aW = this.dI();
      this.cb.b();
   }

   @Override
   protected eye b(cnp $$0, eye $$1) {
      return new eye(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cnp $$0) {
      return (float)(this.h(bvm.v) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.dV());
   }

   @Nullable
   public cgm b(arg $$0, btc $$1) {
      return btq.az.a($$0, btp.e);
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.ar);
   }

   @Override
   public eye cQ() {
      return new eye(0.0, (double)(0.6F * this.cP()), (double)(this.dn() * 0.4F));
   }
}
