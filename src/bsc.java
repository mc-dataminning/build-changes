import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class bsc extends brl implements bfw, bgq {
   private static final aby<Boolean> bT = acb.a(bsc.class, aca.k);
   private static final aby<Integer> bU = acb.a(bsc.class, aca.b);
   private static final ciz bW = ciz.a(cgc.tl, cgc.tm, cgc.uq);
   private final bfv bX = new bfv(this.am, bU, bT);

   public bsc(bfn<? extends bsc> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void x() {
      this.bO.a(0, new bmp(this));
      this.bO.a(1, new bno(this, 1.25));
      this.bO.a(3, new bmh(this, 1.0));
      this.bO.a(4, new bod(this, 1.2, ciz.a(cgc.nf), false));
      this.bO.a(4, new bod(this, 1.2, bW, false));
      this.bO.a(5, new bmu(this, 1.1));
      this.bO.a(6, new boi(this, 1.0));
      this.bO.a(7, new bnd(this, byo.class, 6.0F));
      this.bO.a(8, new bnq(this));
   }

   public static bhf.a q() {
      return bgb.y().a(bhg.a, 10.0).a(bhg.d, 0.25);
   }

   @Nullable
   @Override
   public bfz cL() {
      return !this.i() || !(this.cO() instanceof byo $$0) || !$$0.eO().a(cgc.nf) && !$$0.eP().a(cgc.nf) ? null : $$0;
   }

   @Override
   public void a(aby<?> $$0) {
      if (bU.equals($$0) && this.dI().B) {
         this.bX.a();
      }

      super.a($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bT, false);
      this.am.a(bU, 0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected amg s() {
      return amh.rO;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.rQ;
   }

   @Override
   protected amg g_() {
      return amh.rP;
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(amh.rS, 0.15F, 1.0F);
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bN() && !$$0.fD()) {
         if (!this.dI().B) {
            $$0.k(this);
         }

         return bdx.a(this.dI().B);
      } else {
         bdx $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cfz $$4 = $$0.b($$1);
            return $$4.a(cgc.mZ) ? $$4.a($$0, this, $$1) : bdx.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean g() {
      return this.bs() && !this.h_();
   }

   @Override
   protected void eu() {
      super.eu();
      if (this.i()) {
         this.a(cgc.mZ);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable ami $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dI().a(null, this, amh.rR, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public eei b(bfz $$0) {
      ha $$1 = this.cC();
      if ($$1.o() == ha.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cak.a($$1);
         gu $$3 = this.di();
         gu.a $$4 = new gu.a();
         UnmodifiableIterator var6 = $$0.fv().iterator();

         while (var6.hasNext()) {
            bgl $$5 = (bgl)var6.next();
            eed $$6 = $$0.g($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dI().i($$4);
               if (cak.a($$8)) {
                  eei $$9 = eei.a($$4, $$8);
                  if (cak.a(this.dI(), $$0, $$6.c($$9))) {
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
   public void a(aif $$0, bfy $$1) {
      if ($$0.ai() != bdu.a) {
         bwx $$2 = bfn.bs.a((cmm)$$0);
         if ($$2 != null) {
            $$2.a(bfo.a, new cfz(cgc.oh));
            $$2.b(this.dn(), this.dp(), this.dt(), this.dy(), this.dA());
            $$2.t(this.fQ());
            $$2.a(this.h_());
            if (this.aa()) {
               $$2.b(this.ab());
               $$2.n(this.cy());
            }

            $$2.fF();
            $$0.b($$2);
            this.ai();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(byo $$0, eei $$1) {
      super.a($$0, $$1);
      this.a($$0.dy(), $$0.dA() * 0.5F);
      this.M = this.aV = this.aX = this.dy();
      this.bX.b();
   }

   @Override
   protected eei b(byo $$0, eei $$1) {
      return new eei(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(byo $$0) {
      return (float)(this.b(bhg.d) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.ec());
   }

   @Nullable
   public bsc b(aif $$0, bfe $$1) {
      return bfn.av.a((cmm)$$0);
   }

   @Override
   public boolean m(cfz $$0) {
      return bW.a($$0);
   }

   @Override
   public eei cG() {
      return new eei(0.0, (double)(0.6F * this.cF()), (double)(this.dd() * 0.4F));
   }
}
