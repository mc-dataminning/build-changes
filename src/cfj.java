import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cfj extends ces implements bsz, bts {
   private static final ajp<Boolean> ca = ajt.a(cfj.class, ajr.k);
   private static final ajp<Integer> cb = ajt.a(cfj.class, ajr.b);
   private final bsy cd = new bsy(this.ao, cb, ca);

   public cfj(bsn<? extends cfj> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzu(this));
      this.bU.a(1, new cat(this, 1.25));
      this.bU.a(3, new bzm(this, 1.0));
      this.bU.a(4, new cbi(this, 1.2, $$0 -> $$0.a(cug.nR), false));
      this.bU.a(4, new cbi(this, 1.2, $$0 -> $$0.a(awf.ar), false));
      this.bU.a(5, new bzz(this, 1.1));
      this.bU.a(6, new cbn(this, 1.0));
      this.bU.a(7, new cai(this, cml.class, 6.0F));
      this.bU.a(8, new cav(this));
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 10.0).a(buk.v, 0.25);
   }

   @Nullable
   @Override
   public btc cS() {
      return (btc)(this.i() && this.cV() instanceof cml $$0 && $$0.b(cug.nR) ? $$0 : super.cS());
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cb.equals($$0) && this.dR().B) {
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
   protected avg d(bra $$0) {
      return avh.tC;
   }

   @Override
   protected avg n_() {
      return avh.tB;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.tE, 0.15F, 1.0F);
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bU() && !$$0.fP()) {
         if (!this.dR().B) {
            $$0.n(this);
         }

         return bqh.a(this.dR().B);
      } else {
         bqh $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cud $$4 = $$0.b($$1);
            return $$4.a(cug.nL) ? $$4.a($$0, this, $$1) : bqh.e;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bF() && !this.o_();
   }

   @Override
   protected void eB() {
      super.eB();
      if (this.i()) {
         this.a(cug.nL);
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
         this.dR().a(null, this, avh.tD, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public ewh b(btc $$0) {
      jf $$1 = this.cK();
      if ($$1.o() == jf.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = col.a($$1);
         ja $$3 = this.dr();
         ja.a $$4 = new ja.a();
         UnmodifiableIterator var6 = $$0.fG().iterator();

         while (var6.hasNext()) {
            bto $$5 = (bto)var6.next();
            ewc $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dR().j($$4);
               if (col.a($$8)) {
                  ewh $$9 = ewh.a($$4, $$8);
                  if (col.a(this.dR(), $$0, $$6.c($$9))) {
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
   public void a(aqm $$0, btb $$1) {
      if ($$0.al() != bqe.a) {
         ckm $$2 = bsn.bx.a((dcg)$$0);
         if ($$2 != null) {
            $$2.a(bso.a, new cud(cug.oW));
            $$2.b(this.dw(), this.dy(), this.dC(), this.dH(), this.dJ());
            $$2.c(this.gc());
            $$2.a(this.o_());
            if (this.ai()) {
               $$2.b(this.aj());
               $$2.p(this.cG());
            }

            $$2.fQ();
            $$0.b($$2);
            this.aq();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cml $$0, ewh $$1) {
      super.a($$0, $$1);
      this.a($$0.dH(), $$0.dJ() * 0.5F);
      this.O = this.aZ = this.bb = this.dH();
      this.cd.b();
   }

   @Override
   protected ewh b(cml $$0, ewh $$1) {
      return new ewh(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cml $$0) {
      return (float)(this.g(buk.v) * 0.225 * (double)this.cd.c());
   }

   @Override
   public boolean a() {
      return this.cd.a(this.dU());
   }

   @Nullable
   public cfj b(aqm $$0, bsb $$1) {
      return bsn.az.a((dcg)$$0);
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.ar);
   }

   @Override
   public ewh cO() {
      return new ewh(0.0, (double)(0.6F * this.cN()), (double)(this.dl() * 0.4F));
   }
}
