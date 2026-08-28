import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cfi extends cer implements bsy, btr {
   private static final ajp<Boolean> ca = ajt.a(cfi.class, ajr.k);
   private static final ajp<Integer> cb = ajt.a(cfi.class, ajr.b);
   private final bsx cd = new bsx(this.ao, cb, ca);

   public cfi(bsm<? extends cfi> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzt(this));
      this.bU.a(1, new cas(this, 1.25));
      this.bU.a(3, new bzl(this, 1.0));
      this.bU.a(4, new cbh(this, 1.2, $$0 -> $$0.a(cuf.nR), false));
      this.bU.a(4, new cbh(this, 1.2, $$0 -> $$0.a(awf.ar), false));
      this.bU.a(5, new bzy(this, 1.1));
      this.bU.a(6, new cbm(this, 1.0));
      this.bU.a(7, new cah(this, cmk.class, 6.0F));
      this.bU.a(8, new cau(this));
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 10.0).a(buj.v, 0.25);
   }

   @Nullable
   @Override
   public btb cR() {
      return (btb)(this.i() && this.cU() instanceof cmk $$0 && $$0.b(cuf.nR) ? $$0 : super.cR());
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cb.equals($$0) && this.dQ().B) {
         this.cd.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
      $$0.a(cb, 0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   protected avg v() {
      return avh.tA;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.tC;
   }

   @Override
   protected avg o_() {
      return avh.tB;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.tE, 0.15F, 1.0F);
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bT() && !$$0.fO()) {
         if (!this.dQ().B) {
            $$0.n(this);
         }

         return bqg.a(this.dQ().B);
      } else {
         bqg $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuc $$4 = $$0.b($$1);
            return $$4.a(cuf.nL) ? $$4.a($$0, this, $$1) : bqg.e;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bE() && !this.p_();
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.i()) {
         this.a(cuf.nL);
      }
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public void a(@Nullable avi $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dQ().a(null, this, avh.tD, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public ewf b(btb $$0) {
      jf $$1 = this.cJ();
      if ($$1.o() == jf.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cok.a($$1);
         ja $$3 = this.dq();
         ja.a $$4 = new ja.a();
         UnmodifiableIterator var6 = $$0.fF().iterator();

         while (var6.hasNext()) {
            btn $$5 = (btn)var6.next();
            ewa $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dQ().j($$4);
               if (cok.a($$8)) {
                  ewf $$9 = ewf.a($$4, $$8);
                  if (cok.a(this.dQ(), $$0, $$6.c($$9))) {
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
   public void a(aqm $$0, bta $$1) {
      if ($$0.al() != bqd.a) {
         ckl $$2 = bsm.bx.a((dcf)$$0);
         if ($$2 != null) {
            $$2.a(bsn.a, new cuc(cuf.oW));
            $$2.b(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
            $$2.t(this.gd());
            $$2.a(this.p_());
            if (this.ah()) {
               $$2.b(this.ai());
               $$2.o(this.cF());
            }

            $$2.fR();
            $$0.b($$2);
            this.ap();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cmk $$0, ewf $$1) {
      super.a($$0, $$1);
      this.a($$0.dG(), $$0.dI() * 0.5F);
      this.O = this.aY = this.ba = this.dG();
      this.cd.b();
   }

   @Override
   protected ewf b(cmk $$0, ewf $$1) {
      return new ewf(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmk $$0) {
      return (float)(this.g(buj.v) * 0.225 * (double)this.cd.c());
   }

   @Override
   public boolean a() {
      return this.cd.a(this.dT());
   }

   @Nullable
   public cfi b(aqm $$0, bsa $$1) {
      return bsm.az.a((dcf)$$0);
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.ar);
   }

   @Override
   public ewf cN() {
      return new ewf(0.0, (double)(0.6F * this.cM()), (double)(this.dk() * 0.4F));
   }
}
