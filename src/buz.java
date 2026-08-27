import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class buz extends bui implements bit, bjn {
   private static final adx<Boolean> bT = aea.a(buz.class, adz.k);
   private static final adx<Integer> bU = aea.a(buz.class, adz.b);
   private static final clw bW = clw.a(ciz.tl, ciz.tm, ciz.uq);
   private final bis bX = new bis(this.an, bU, bT);

   public buz(bik<? extends buz> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpm(this));
      this.bO.a(1, new bql(this, 1.25));
      this.bO.a(3, new bpe(this, 1.0));
      this.bO.a(4, new bra(this, 1.2, clw.a(ciz.nf), false));
      this.bO.a(4, new bra(this, 1.2, bW, false));
      this.bO.a(5, new bpr(this, 1.1));
      this.bO.a(6, new brf(this, 1.0));
      this.bO.a(7, new bqa(this, cbl.class, 6.0F));
      this.bO.a(8, new bqn(this));
   }

   public static bkc.a p() {
      return biy.x().a(bkd.a, 10.0).a(bkd.d, 0.25);
   }

   @Nullable
   @Override
   public biw cN() {
      return (biw)(this.i() && this.cQ() instanceof cbl $$0 && $$0.b(ciz.nf) ? $$0 : super.cN());
   }

   @Override
   public void a(adx<?> $$0) {
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
   public void b(qs $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected aot r() {
      return aou.rO;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.rQ;
   }

   @Override
   protected aot h_() {
      return aou.rP;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.rS, 0.15F, 1.0F);
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
         this.a(ciz.mZ);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable aov $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dK().a(null, this, aou.rR, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public ehf b(biw $$0) {
      hb $$1 = this.cE();
      if ($$1.o() == hb.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cdh.a($$1);
         gv $$3 = this.dk();
         gv.a $$4 = new gv.a();
         UnmodifiableIterator var6 = $$0.fy().iterator();

         while (var6.hasNext()) {
            bji $$5 = (bji)var6.next();
            eha $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dK().i($$4);
               if (cdh.a($$8)) {
                  ehf $$9 = ehf.a($$4, $$8);
                  if (cdh.a(this.dK(), $$0, $$6.c($$9))) {
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
   public void a(aki $$0, biv $$1) {
      if ($$0.ai() != bgl.a) {
         bzu $$2 = bik.bs.a((cpk)$$0);
         if ($$2 != null) {
            $$2.a(bil.a, new ciw(ciz.oh));
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
   protected void a(cbl $$0, ehf $$1) {
      super.a($$0, $$1);
      this.a($$0.dA(), $$0.dC() * 0.5F);
      this.N = this.aU = this.aW = this.dA();
      this.bX.b();
   }

   @Override
   protected ehf b(cbl $$0, ehf $$1) {
      return new ehf(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cbl $$0) {
      return (float)(this.b(bkd.d) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.ee());
   }

   @Nullable
   public buz b(aki $$0, bib $$1) {
      return bik.av.a((cpk)$$0);
   }

   @Override
   public boolean m(ciw $$0) {
      return bW.a($$0);
   }

   @Override
   public ehf cI() {
      return new ehf(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
