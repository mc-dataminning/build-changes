import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cev extends cee implements bsl, bte {
   private static final ajr<Boolean> bY = ajv.a(cev.class, ajt.k);
   private static final ajr<Integer> bZ = ajv.a(cev.class, ajt.b);
   private final bsk cb = new bsk(this.ao, bZ, bY);

   public cev(bsa<? extends cev> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzg(this));
      this.bS.a(1, new caf(this, 1.25));
      this.bS.a(3, new byy(this, 1.0));
      this.bS.a(4, new cau(this, 1.2, $$0 -> $$0.a(ctr.nR), false));
      this.bS.a(4, new cau(this, 1.2, $$0 -> $$0.a(awe.ar), false));
      this.bS.a(5, new bzl(this, 1.1));
      this.bS.a(6, new caz(this, 1.0));
      this.bS.a(7, new bzu(this, clw.class, 6.0F));
      this.bS.a(8, new cah(this));
   }

   public static btv.a s() {
      return bsq.A().a(btw.q, 10.0).a(btw.r, 0.25);
   }

   @Nullable
   @Override
   public bso cQ() {
      return (bso)(this.i() && this.cT() instanceof clw $$0 && $$0.b(ctr.nR) ? $$0 : super.cQ());
   }

   @Override
   public void a(ajr<?> $$0) {
      if (bZ.equals($$0) && this.dP().B) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajv.a $$0) {
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
   protected avg v() {
      return avh.tx;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.tz;
   }

   @Override
   protected avg o_() {
      return avh.ty;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.tB, 0.15F, 1.0F);
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bpu.a(this.dP().B);
      } else {
         bpu $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cto $$4 = $$0.b($$1);
            return $$4.a(ctr.nL) ? $$4.a($$0, this, $$1) : bpu.d;
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
         this.a(ctr.nL);
      }
   }

   @Override
   public boolean i() {
      return this.cb.d();
   }

   @Override
   public void a(@Nullable avi $$0) {
      this.cb.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, avh.tA, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public euk b(bso $$0) {
      it $$1 = this.cI();
      if ($$1.o() == it.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cnw.a($$1);
         io $$3 = this.dp();
         io.a $$4 = new io.a();
         UnmodifiableIterator var6 = $$0.fI().iterator();

         while (var6.hasNext()) {
            bta $$5 = (bta)var6.next();
            euf $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dP().j($$4);
               if (cnw.a($$8)) {
                  euk $$9 = euk.a($$4, $$8);
                  if (cnw.a(this.dP(), $$0, $$6.c($$9))) {
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
   public void a(aqm $$0, bsn $$1) {
      if ($$0.ak() != bpr.a) {
         cjx $$2 = bsa.bx.a((dax)$$0);
         if ($$2 != null) {
            $$2.a(bsb.a, new cto(ctr.oV));
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
   protected void a(clw $$0, euk $$1) {
      super.a($$0, $$1);
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aZ = this.bb = this.dF();
      this.cb.b();
   }

   @Override
   protected euk b(clw $$0, euk $$1) {
      return new euk(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(clw $$0) {
      return (float)(this.g(btw.r) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.el());
   }

   @Nullable
   public cev b(aqm $$0, bro $$1) {
      return bsa.az.a((dax)$$0);
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.ar);
   }

   @Override
   public euk cM() {
      return new euk(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
