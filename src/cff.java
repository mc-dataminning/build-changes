import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cff extends ceo implements bsv, bto {
   private static final ajp<Boolean> ca = ajt.a(cff.class, ajr.k);
   private static final ajp<Integer> cb = ajt.a(cff.class, ajr.b);
   private final bsu cd = new bsu(this.ao, cb, ca);

   public cff(bsj<? extends cff> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzq(this));
      this.bU.a(1, new cap(this, 1.25));
      this.bU.a(3, new bzi(this, 1.0));
      this.bU.a(4, new cbe(this, 1.2, $$0 -> $$0.a(cud.nR), false));
      this.bU.a(4, new cbe(this, 1.2, $$0 -> $$0.a(awd.ar), false));
      this.bU.a(5, new bzv(this, 1.1));
      this.bU.a(6, new cbj(this, 1.0));
      this.bU.a(7, new cae(this, cmh.class, 6.0F));
      this.bU.a(8, new car(this));
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 10.0).a(bug.v, 0.25);
   }

   @Nullable
   @Override
   public bsy cQ() {
      return (bsy)(this.i() && this.cT() instanceof cmh $$0 && $$0.b(cud.nR) ? $$0 : super.cQ());
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cb.equals($$0) && this.dP().B) {
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
   protected ave v() {
      return avf.tA;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.tC;
   }

   @Override
   protected ave o_() {
      return avf.tB;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.tE, 0.15F, 1.0F);
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fN()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqd.a(this.dP().B);
      } else {
         bqd $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cua $$4 = $$0.b($$1);
            return $$4.a(cud.nL) ? $$4.a($$0, this, $$1) : bqd.e;
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
   protected void ez() {
      super.ez();
      if (this.i()) {
         this.a(cud.nL);
      }
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public void a(@Nullable avg $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, avf.tD, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public evz b(bsy $$0) {
      jf $$1 = this.cI();
      if ($$1.o() == jf.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = coh.a($$1);
         ja $$3 = this.dp();
         ja.a $$4 = new ja.a();
         UnmodifiableIterator var6 = $$0.fE().iterator();

         while (var6.hasNext()) {
            btk $$5 = (btk)var6.next();
            evu $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dP().j($$4);
               if (coh.a($$8)) {
                  evz $$9 = evz.a($$4, $$8);
                  if (coh.a(this.dP(), $$0, $$6.c($$9))) {
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
   public void a(aqk $$0, bsx $$1) {
      if ($$0.al() != bqa.a) {
         cki $$2 = bsj.bx.a((dcd)$$0);
         if ($$2 != null) {
            $$2.a(bsk.a, new cua(cud.oV));
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.t(this.gc());
            $$2.a(this.p_());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cE());
            }

            $$2.fQ();
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
   protected void a(cmh $$0, evz $$1) {
      super.a($$0, $$1);
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cd.b();
   }

   @Override
   protected evz b(cmh $$0, evz $$1) {
      return new evz(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmh $$0) {
      return (float)(this.g(bug.v) * 0.225 * (double)this.cd.c());
   }

   @Override
   public boolean a() {
      return this.cd.a(this.dS());
   }

   @Nullable
   public cff b(aqk $$0, brx $$1) {
      return bsj.az.a((dcd)$$0);
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.ar);
   }

   @Override
   public evz cM() {
      return new evz(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
