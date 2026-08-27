import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bva extends buj implements biv, bjo {
   private static final adz<Boolean> bT = aec.a(bva.class, aeb.k);
   private static final adz<Integer> bU = aec.a(bva.class, aeb.b);
   private static final clx bW = clx.a(cja.tl, cja.tm, cja.uq);
   private final biu bX = new biu(this.an, bU, bT);

   public bva(bim<? extends bva> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpn(this));
      this.bO.a(1, new bqm(this, 1.25));
      this.bO.a(3, new bpf(this, 1.0));
      this.bO.a(4, new brb(this, 1.2, clx.a(cja.nf), false));
      this.bO.a(4, new brb(this, 1.2, bW, false));
      this.bO.a(5, new bps(this, 1.1));
      this.bO.a(6, new brg(this, 1.0));
      this.bO.a(7, new bqb(this, cbm.class, 6.0F));
      this.bO.a(8, new bqo(this));
   }

   public static bkd.a p() {
      return bja.x().a(bke.a, 10.0).a(bke.d, 0.25);
   }

   @Nullable
   @Override
   public biy cN() {
      return (biy)(this.i() && this.cQ() instanceof cbm $$0 && $$0.b(cja.nf) ? $$0 : super.cN());
   }

   @Override
   public void a(adz<?> $$0) {
      if (bU.equals($$0) && this.dK().B) {
         this.bX.a();
      }

      super.a($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, false);
      this.an.a(bU, 0);
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
   protected aov r() {
      return aow.rO;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.rQ;
   }

   @Override
   protected aov h_() {
      return aow.rP;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.rS, 0.15F, 1.0F);
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fG()) {
         if (!this.dK().B) {
            $$0.n(this);
         }

         return bgq.a(this.dK().B);
      } else {
         bgq $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cix $$4 = $$0.b($$1);
            return $$4.a(cja.mZ) ? $$4.a($$0, this, $$1) : bgq.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean g() {
      return this.bv() && !this.i_();
   }

   @Override
   protected void ew() {
      super.ew();
      if (this.i()) {
         this.a(cja.mZ);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable aox $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dK().a(null, this, aow.rR, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public ehd b(biy $$0) {
      ha $$1 = this.cE();
      if ($$1.o() == ha.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cdi.a($$1);
         gu $$3 = this.dk();
         gu.a $$4 = new gu.a();
         UnmodifiableIterator var6 = $$0.fy().iterator();

         while (var6.hasNext()) {
            bjk $$5 = (bjk)var6.next();
            egy $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dK().i($$4);
               if (cdi.a($$8)) {
                  ehd $$9 = ehd.a($$4, $$8);
                  if (cdi.a(this.dK(), $$0, $$6.c($$9))) {
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
   public void a(akk $$0, bix $$1) {
      if ($$0.ai() != bgn.a) {
         bzv $$2 = bim.bs.a((cpl)$$0);
         if ($$2 != null) {
            $$2.a(bin.a, new cix(cja.oh));
            $$2.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
            $$2.t(this.fQ());
            $$2.a(this.i_());
            if (this.ac()) {
               $$2.b(this.ad());
               $$2.n(this.cA());
            }

            $$2.fF();
            $$0.b($$2);
            this.ak();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cbm $$0, ehd $$1) {
      super.a($$0, $$1);
      this.a($$0.dA(), $$0.dC() * 0.5F);
      this.N = this.aU = this.aW = this.dA();
      this.bX.b();
   }

   @Override
   protected ehd b(cbm $$0, ehd $$1) {
      return new ehd(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cbm $$0) {
      return (float)(this.b(bke.d) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.ee());
   }

   @Nullable
   public bva b(akk $$0, bid $$1) {
      return bim.av.a((cpl)$$0);
   }

   @Override
   public boolean m(cix $$0) {
      return bW.a($$0);
   }

   @Override
   public ehd cI() {
      return new ehd(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
