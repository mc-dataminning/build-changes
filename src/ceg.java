import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class ceg extends cdp implements brx, bsp {
   private static final ajm<Boolean> bY = ajq.a(ceg.class, ajo.k);
   private static final ajm<Integer> bZ = ajq.a(ceg.class, ajo.b);
   private final brw cb = new brw(this.ao, bZ, bY);

   public ceg(brn<? extends ceg> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new byr(this));
      this.bS.a(1, new bzq(this, 1.25));
      this.bS.a(3, new byj(this, 1.0));
      this.bS.a(4, new caf(this, 1.2, $$0 -> $$0.a(ctc.nR), false));
      this.bS.a(4, new caf(this, 1.2, $$0 -> $$0.a(avz.ar), false));
      this.bS.a(5, new byw(this, 1.1));
      this.bS.a(6, new cak(this, 1.0));
      this.bS.a(7, new bzf(this, clh.class, 6.0F));
      this.bS.a(8, new bzs(this));
   }

   public static btg.a r() {
      return bsc.A().a(bth.q, 10.0).a(bth.r, 0.25);
   }

   @Nullable
   @Override
   public bsa cO() {
      return (bsa)(this.i() && this.cR() instanceof clh $$0 && $$0.b(ctc.nR) ? $$0 : super.cO());
   }

   @Override
   public void a(ajm<?> $$0) {
      if (bZ.equals($$0) && this.dN().B) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.cb.a($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.cb.b($$0);
   }

   @Override
   protected avb v() {
      return avc.tm;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.to;
   }

   @Override
   protected avb o_() {
      return avc.tn;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.tq, 0.15F, 1.0F);
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bQ() && !$$0.fP()) {
         if (!this.dN().B) {
            $$0.n(this);
         }

         return bpm.a(this.dN().B);
      } else {
         bpm $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            csz $$4 = $$0.b($$1);
            return $$4.a(ctc.nL) ? $$4.a($$0, this, $$1) : bpm.d;
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
         this.a(ctc.nL);
      }
   }

   @Override
   public boolean i() {
      return this.cb.d();
   }

   @Override
   public void a(@Nullable avd $$0) {
      this.cb.a(true);
      if ($$0 != null) {
         this.dN().a(null, this, avc.tp, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public etp b(bsa $$0) {
      is $$1 = this.cG();
      if ($$1.o() == is.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cnh.a($$1);
         in $$3 = this.dn();
         in.a $$4 = new in.a();
         UnmodifiableIterator var6 = $$0.fG().iterator();

         while (var6.hasNext()) {
            bsl $$5 = (bsl)var6.next();
            etk $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dN().j($$4);
               if (cnh.a($$8)) {
                  etp $$9 = etp.a($$4, $$8);
                  if (cnh.a(this.dN(), $$0, $$6.c($$9))) {
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
   public void a(aqh $$0, brz $$1) {
      if ($$0.ak() != bpj.a) {
         cji $$2 = brn.bw.a((dad)$$0);
         if ($$2 != null) {
            $$2.a(bro.a, new csz(ctc.oV));
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
   protected void a(clh $$0, etp $$1) {
      super.a($$0, $$1);
      this.a($$0.dD(), $$0.dF() * 0.5F);
      this.O = this.aZ = this.bb = this.dD();
      this.cb.b();
   }

   @Override
   protected etp b(clh $$0, etp $$1) {
      return new etp(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(clh $$0) {
      return (float)(this.g(bth.r) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.ej());
   }

   @Nullable
   public ceg b(aqh $$0, brb $$1) {
      return brn.ay.a((dad)$$0);
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.ar);
   }

   @Override
   public etp cK() {
      return new etp(0.0, (double)(0.6F * this.cJ()), (double)(this.dh() * 0.4F));
   }
}
