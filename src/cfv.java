import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cfv extends cfe implements btl, bue {
   private static final akj<Boolean> bY = akn.a(cfv.class, akl.k);
   private static final akj<Integer> bZ = akn.a(cfv.class, akl.b);
   private final btk cb = new btk(this.ao, bZ, bY);

   public cfv(bsz<? extends cfv> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cag(this));
      this.bS.a(1, new cbf(this, 1.25));
      this.bS.a(3, new bzy(this, 1.0));
      this.bS.a(4, new cbu(this, 1.2, $$0 -> $$0.a(cur.nR), false));
      this.bS.a(4, new cbu(this, 1.2, $$0 -> $$0.a(awx.ar), false));
      this.bS.a(5, new cal(this, 1.1));
      this.bS.a(6, new cbz(this, 1.0));
      this.bS.a(7, new cau(this, cmw.class, 6.0F));
      this.bS.a(8, new cbh(this));
   }

   public static buv.a s() {
      return btq.A().a(buw.q, 10.0).a(buw.r, 0.25);
   }

   @Nullable
   @Override
   public bto cQ() {
      return (bto)(this.i() && this.cT() instanceof cmw $$0 && $$0.b(cur.nR) ? $$0 : super.cQ());
   }

   @Override
   public void a(akj<?> $$0) {
      if (bZ.equals($$0) && this.dP().B) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      this.cb.a($$0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.cb.b($$0);
   }

   @Override
   protected avy v() {
      return avz.tx;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.tz;
   }

   @Override
   protected avy o_() {
      return avz.ty;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.tB, 0.15F, 1.0F);
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqt.a(this.dP().B);
      } else {
         bqt $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuo $$4 = $$0.b($$1);
            return $$4.a(cur.nL) ? $$4.a($$0, this, $$1) : bqt.e;
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
         this.a(cur.nL);
      }
   }

   @Override
   public boolean i() {
      return this.cb.d();
   }

   @Override
   public void a(@Nullable awa $$0) {
      this.cb.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, avz.tA, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public evq b(bto $$0) {
      je $$1 = this.cI();
      if ($$1.o() == je.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cox.a($$1);
         iz $$3 = this.dp();
         iz.a $$4 = new iz.a();
         UnmodifiableIterator var6 = $$0.fI().iterator();

         while (var6.hasNext()) {
            bua $$5 = (bua)var6.next();
            evl $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dP().j($$4);
               if (cox.a($$8)) {
                  evq $$9 = evq.a($$4, $$8);
                  if (cox.a(this.dP(), $$0, $$6.c($$9))) {
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
   public void a(are $$0, btn $$1) {
      if ($$0.al() != bqq.a) {
         ckx $$2 = bsz.bx.a((dbx)$$0);
         if ($$2 != null) {
            $$2.a(bta.a, new cuo(cur.oV));
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.t(this.gg());
            $$2.a(this.p_());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cE());
            }

            $$2.fU();
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
   protected void a(cmw $$0, evq $$1) {
      super.a($$0, $$1);
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cb.b();
   }

   @Override
   protected evq b(cmw $$0, evq $$1) {
      return new evq(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmw $$0) {
      return (float)(this.g(buw.r) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.el());
   }

   @Nullable
   public cfv b(are $$0, bsn $$1) {
      return bsz.az.a((dbx)$$0);
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.ar);
   }

   @Override
   public evq cM() {
      return new evq(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
