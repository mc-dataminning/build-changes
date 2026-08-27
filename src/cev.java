import com.google.common.collect.UnmodifiableIterator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cev extends cee implements bsl, btd {
   private static final ajy<Boolean> ch = akc.a(cev.class, aka.k);
   private static final ajy<Integer> ci = akc.a(cev.class, aka.b);
   private static final ajy<Boolean> ck = akc.a(cev.class, aka.k);
   private final bsk cl = new bsk(this.as, ci, ch);

   public cev(bsb<? extends cev> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   protected void y() {
      this.cb.a(0, new bzf(this));
      this.cb.a(1, new cae(this, 1.25));
      this.cb.a(3, new byx(this, 1.0));
      this.cb.a(4, new cat(this, 1.2, $$0 -> $$0.a(cuk.ph), false));
      this.cb.a(4, new cat(this, 1.2, $$0 -> $$0.a(awm.ar), false) {
         @Override
         public void c() {
            if (cev.this.dV()) {
               cev.this.w(true);
            }

            super.c();
         }

         @Override
         public void d() {
            super.d();
            cev.this.w(false);
         }
      });
      this.cb.a(5, new bzk(this, 1.1));
      this.cb.a(6, new cay(this, 1.0));
      this.cb.a(7, new bzt(this, cly.class, 6.0F) {
         @Override
         public void c() {
            super.c();
            if (cev.this.dV() && this.c instanceof cly) {
               cev.this.w(true);
            }
         }

         @Override
         public void d() {
            super.d();
            cev.this.w(false);
         }
      });
      this.cb.a(8, new cag(this));
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 10.0).a(btv.r, 0.25);
   }

   @Nullable
   @Override
   public bso cV() {
      return (bso)(this.i() && this.cY() instanceof cly $$0 && $$0.b(cuk.ph) ? $$0 : super.cV());
   }

   @Override
   public void a(ajy<?> $$0) {
      if (ci.equals($$0) && this.dU().C) {
         this.cl.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, 0);
      $$0.a(ck, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      this.cl.a($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.cl.b($$0);
   }

   @Override
   protected avn u() {
      return avo.tV;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.tX;
   }

   @Override
   protected avn n_() {
      return avo.tW;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.tZ, 0.15F, 1.0F);
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bX() && !$$0.ga()) {
         if (!this.dU().C) {
            $$0.n(this);
         }

         return bqa.a(this.dU().C);
      } else {
         bqa $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuh $$4 = $$0.b($$1);
            return $$4.a(cuk.pb) ? $$4.a($$0, this, $$1) : bqa.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bI() && !this.o_();
   }

   @Override
   protected void eL() {
      super.eL();
      if (this.i()) {
         this.a(cuk.pb);
      }
   }

   @Override
   public boolean i() {
      return this.cl.d();
   }

   @Override
   public void a(@Nullable avq $$0) {
      this.cl.a(true);
      if ($$0 != null) {
         this.dU().a(null, this, avo.tY, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public ewu b(bso $$0) {
      iw $$1 = this.cN();
      if ($$1.o() == iw.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cob.a($$1);
         ir $$3 = this.du();
         ir.a $$4 = new ir.a();
         UnmodifiableIterator var6 = $$0.fR().iterator();

         while (var6.hasNext()) {
            bsz $$5 = (bsz)var6.next();
            ewp $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dU().j($$4);
               if (cob.a($$8)) {
                  ewu $$9 = ewu.a($$4, $$8);
                  if (cob.a(this.dU(), $$0, $$6.c($$9))) {
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
   public void a(aqt $$0, bsn $$1) {
      if ($$0.al() != bpx.a) {
         cjz $$2 = bsb.bC.a((dca)$$0);
         if ($$2 != null) {
            $$2.a(bsc.a, new cuh(cuk.qo));
            $$2.b(this.dz(), this.dB(), this.dF(), this.dK(), this.dM());
            $$2.t(this.go());
            $$2.a(this.o_());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cJ());
            }

            $$2.gc();
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
   protected void a(cly $$0, ewu $$1) {
      super.a($$0, $$1);
      this.a($$0.dK(), $$0.dM() * 0.5F);
      this.P = this.bj = this.bl = this.dK();
      this.cl.b();
   }

   @Override
   protected ewu b(cly $$0, ewu $$1) {
      return new ewu(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cly $$0) {
      return (float)(this.g(btv.r) * 0.225 * (double)this.cl.c());
   }

   @Override
   public boolean a() {
      return this.cl.a(this.et());
   }

   @Nullable
   public cev b(aqt $$0, brp $$1) {
      return bsb.aA.a((dca)$$0);
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.ar);
   }

   @Override
   public ewu cR() {
      return new ewu(0.0, (double)(0.6F * this.cQ()), (double)(this.do() * 0.4F));
   }

   public boolean t() {
      return this.as.a(ck);
   }

   public void w(boolean $$0) {
      this.as.a(ck, $$0);
   }
}
