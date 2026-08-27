import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cdk extends cct implements brb, brt {
   private static final ajk<Boolean> bY = ajo.a(cdk.class, ajm.k);
   private static final ajk<Integer> bZ = ajo.a(cdk.class, ajm.b);
   private static final cwd cb = cwd.a(csg.uf, csg.ug, csg.vk);
   private final bra cc = new bra(this.ao, bZ, bY);

   public cdk(bqr<? extends cdk> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bxv(this));
      this.bS.a(1, new byu(this, 1.25));
      this.bS.a(3, new bxn(this, 1.0));
      this.bS.a(4, new bzj(this, 1.2, cwd.a(csg.nR), false));
      this.bS.a(4, new bzj(this, 1.2, cb, false));
      this.bS.a(5, new bya(this, 1.1));
      this.bS.a(6, new bzo(this, 1.0));
      this.bS.a(7, new byj(this, ckl.class, 6.0F));
      this.bS.a(8, new byw(this));
   }

   public static bsk.a r() {
      return brg.A().a(bsl.q, 10.0).a(bsl.r, 0.25);
   }

   @Nullable
   @Override
   public bre cO() {
      return (bre)(this.i() && this.cR() instanceof ckl $$0 && $$0.b(csg.nR) ? $$0 : super.cO());
   }

   @Override
   public void a(ajk<?> $$0) {
      if (bZ.equals($$0) && this.dN().B) {
         this.cc.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      this.cc.a($$0);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.cc.b($$0);
   }

   @Override
   protected auy v() {
      return auz.tl;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.tn;
   }

   @Override
   protected auy o_() {
      return auz.tm;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.tp, 0.15F, 1.0F);
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bQ() && !$$0.fP()) {
         if (!this.dN().B) {
            $$0.n(this);
         }

         return boq.a(this.dN().B);
      } else {
         boq $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            csd $$4 = $$0.b($$1);
            return $$4.a(csg.nL) ? $$4.a($$0, this, $$1) : boq.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bB() && !this.p_();
   }

   @Override
   protected void eB() {
      super.eB();
      if (this.i()) {
         this.a(csg.nL);
      }
   }

   @Override
   public boolean i() {
      return this.cc.d();
   }

   @Override
   public void a(@Nullable ava $$0) {
      this.cc.a(true);
      if ($$0 != null) {
         this.dN().a(null, this, auz.to, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public etf b(bre $$0) {
      ir $$1 = this.cG();
      if ($$1.o() == ir.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cml.a($$1);
         im $$3 = this.dn();
         im.a $$4 = new im.a();
         UnmodifiableIterator var6 = $$0.fG().iterator();

         while (var6.hasNext()) {
            brp $$5 = (brp)var6.next();
            eta $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dN().j($$4);
               if (cml.a($$8)) {
                  etf $$9 = etf.a($$4, $$8);
                  if (cml.a(this.dN(), $$0, $$6.c($$9))) {
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
   public void a(aqe $$0, brd $$1) {
      if ($$0.ak() != bon.a) {
         cim $$2 = bqr.bw.a((czu)$$0);
         if ($$2 != null) {
            $$2.a(bqs.a, new csd(csg.oV));
            $$2.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$2.t(this.gf());
            $$2.a(this.p_());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.o(this.cC());
            }

            $$2.fT();
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
   protected void a(ckl $$0, etf $$1) {
      super.a($$0, $$1);
      this.a($$0.dD(), $$0.dF() * 0.5F);
      this.O = this.aZ = this.bb = this.dD();
      this.cc.b();
   }

   @Override
   protected etf b(ckl $$0, etf $$1) {
      return new etf(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(ckl $$0) {
      return (float)(this.g(bsl.r) * 0.225 * (double)this.cc.c());
   }

   @Override
   public boolean a() {
      return this.cc.a(this.ej());
   }

   @Nullable
   public cdk b(aqe $$0, bqf $$1) {
      return bqr.ay.a((czu)$$0);
   }

   @Override
   public boolean o(csd $$0) {
      return cb.a($$0);
   }

   @Override
   public etf cK() {
      return new etf(0.0, (double)(0.6F * this.cJ()), (double)(this.dh() * 0.4F));
   }
}
