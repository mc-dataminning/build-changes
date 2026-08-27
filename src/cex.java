import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cex extends ceg implements bsn, btg {
   private static final ajs<Boolean> bY = ajw.a(cex.class, aju.k);
   private static final ajs<Integer> bZ = ajw.a(cex.class, aju.b);
   private final bsm cb = new bsm(this.ao, bZ, bY);

   public cex(bsc<? extends cex> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzi(this));
      this.bS.a(1, new cah(this, 1.25));
      this.bS.a(3, new bza(this, 1.0));
      this.bS.a(4, new caw(this, 1.2, $$0 -> $$0.a(ctt.nR), false));
      this.bS.a(4, new caw(this, 1.2, $$0 -> $$0.a(awf.ar), false));
      this.bS.a(5, new bzn(this, 1.1));
      this.bS.a(6, new cbb(this, 1.0));
      this.bS.a(7, new bzw(this, cly.class, 6.0F));
      this.bS.a(8, new caj(this));
   }

   public static btx.a s() {
      return bss.A().a(bty.q, 10.0).a(bty.r, 0.25);
   }

   @Nullable
   @Override
   public bsq cQ() {
      return (bsq)(this.i() && this.cT() instanceof cly $$0 && $$0.b(ctt.nR) ? $$0 : super.cQ());
   }

   @Override
   public void a(ajs<?> $$0) {
      if (bZ.equals($$0) && this.dP().B) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      this.cb.a($$0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.cb.b($$0);
   }

   @Override
   protected avh v() {
      return avi.tx;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.tz;
   }

   @Override
   protected avh o_() {
      return avi.ty;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.tB, 0.15F, 1.0F);
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bpw.a(this.dP().B);
      } else {
         bpw $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            ctq $$4 = $$0.b($$1);
            return $$4.a(ctt.nL) ? $$4.a($$0, this, $$1) : bpw.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bD() && !this.p_();
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(ctt.nL);
      }
   }

   @Override
   public boolean i() {
      return this.cb.d();
   }

   @Override
   public void a(@Nullable avj $$0) {
      this.cb.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, avi.tA, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public eum b(bsq $$0) {
      it $$1 = this.cI();
      if ($$1.o() == it.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cny.a($$1);
         io $$3 = this.dp();
         io.a $$4 = new io.a();
         UnmodifiableIterator var6 = $$0.fI().iterator();

         while (var6.hasNext()) {
            btc $$5 = (btc)var6.next();
            euh $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dP().j($$4);
               if (cny.a($$8)) {
                  eum $$9 = eum.a($$4, $$8);
                  if (cny.a(this.dP(), $$0, $$6.c($$9))) {
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
   public void a(aqn $$0, bsp $$1) {
      if ($$0.ak() != bpt.a) {
         cjz $$2 = bsc.bx.a((daz)$$0);
         if ($$2 != null) {
            $$2.a(bsd.a, new ctq(ctt.oV));
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.t(this.gf());
            $$2.a(this.p_());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cE());
            }

            $$2.fT();
            $$0.b($$2);
            this.ao();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cly $$0, eum $$1) {
      super.a($$0, $$1);
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cb.b();
   }

   @Override
   protected eum b(cly $$0, eum $$1) {
      return new eum(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cly $$0) {
      return (float)(this.g(bty.r) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.el());
   }

   @Nullable
   public cex b(aqn $$0, brq $$1) {
      return bsc.az.a((daz)$$0);
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.ar);
   }

   @Override
   public eum cM() {
      return new eum(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
