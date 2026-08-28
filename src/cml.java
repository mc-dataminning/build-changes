import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cml extends cma {
   private static final int ca = 5;
   @Nullable
   private iz cb;
   private int cc;

   public cml(bsv<? extends cml> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cac(this));
      this.bS.a(0, new cbt<>(this, cwl.a(cun.sk, cwm.g), avw.Bu, $$0 -> this.dP().S() && !$$0.ch()));
      this.bS.a(0, new cbt<>(this, new cuk(cun.qE), avw.Bz, $$0 -> this.dP().R() && $$0.ch()));
      this.bS.a(1, new cbr(this));
      this.bS.a(1, new bzp<>(this, ckr.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzp<>(this, cjr.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bzp<>(this, ckn.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzp<>(this, ckm.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzp<>(this, ckb.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new bzp<>(this, cjw.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bzp<>(this, ckq.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new cbb(this, 0.5));
      this.bS.a(1, new car(this));
      this.bS.a(2, new cml.a(this, 2.0, 0.35));
      this.bS.a(4, new caw(this, 0.35));
      this.bS.a(8, new cbv(this, 0.35));
      this.bS.a(9, new cal(this, cms.class, 3.0F, 1.0F));
      this.bS.a(10, new caq(this, btm.class, 8.0F));
   }

   @Nullable
   @Override
   public bsj a(arb $$0, bsj $$1) {
      return null;
   }

   @Override
   public boolean gt() {
      return false;
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if (!$$2.a(cun.tJ) && this.bD() && !this.gr() && !this.p_()) {
         if ($$1 == bqo.a) {
            $$0.a(awg.S);
         }

         if (this.gs().isEmpty()) {
            return bqp.a(this.dP().B);
         } else {
            if (!this.dP().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bqp.a(this.dP().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gx() {
      if (this.dP().J().b(cpi.d)) {
         this.gA();
      } else {
         cmj.g[] $$0 = (cmj.g[])cmj.b.get(1);
         cmj.g[] $$1 = (cmj.g[])cmj.b.get(2);
         if ($$0 != null && $$1 != null) {
            das $$2 = this.gs();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            cmj.g $$4 = $$1[$$3];
            dar $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gA() {
      das $$0 = this.gs();

      for (Pair<cmj.g[], Integer> $$1 : cmj.d) {
         cmj.g[] $$2 = (cmj.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", vg.a(this.cb));
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      vg.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dar $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dP().b(new bta(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   @Override
   protected avv v() {
      return this.gr() ? avw.BA : avw.Bs;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.Bx;
   }

   @Override
   protected avv o_() {
      return avw.Bt;
   }

   @Override
   protected avv c(cuk $$0) {
      return $$0.a(cun.qE) ? avw.Bv : avw.Bw;
   }

   @Override
   protected avv w(boolean $$0) {
      return $$0 ? avw.BB : avw.By;
   }

   @Override
   public avv gu() {
      return avw.BB;
   }

   public void v(int $$0) {
      this.cc = $$0;
   }

   public int gz() {
      return this.cc;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.gB();
      }
   }

   private void gB() {
      if (this.cc > 0 && !this.gr() && --this.cc == 0) {
         this.ao();
      }
   }

   public void i(@Nullable iz $$0) {
      this.cb = $$0;
   }

   @Nullable
   iz gD() {
      return this.cb;
   }

   class a extends cai {
      final cml a;
      final double b;
      final double c;

      a(final cml $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cai.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cml.this.bR.n();
      }

      @Override
      public boolean a() {
         iz $$0 = this.a.gD();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         iz $$0 = this.a.gD();
         if ($$0 != null && cml.this.bR.l()) {
            if (this.a($$0, 10.0)) {
               evm $$1 = new evm((double)$$0.u() - this.a.du(), (double)$$0.v() - this.a.dw(), (double)$$0.w() - this.a.dA()).d();
               evm $$2 = $$1.a(10.0).b(this.a.du(), this.a.dw(), this.a.dA());
               cml.this.bR.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cml.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(iz $$0, double $$1) {
         return !$$0.a(this.a.dn(), $$1);
      }
   }
}
