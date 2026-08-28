import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cop extends cod implements cyv.b {
   private static final int ca = 5;
   @Nullable
   private ji cb;
   private int cc;

   public cop(bur<? extends cop> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(0, new cby(this));
      this.bS.a(0, new cdp<>(this, cyo.a(cwt.ti, cyp.g), awa.Cn, $$0 -> this.dW().W() && !$$0.cp()));
      this.bS.a(0, new cdp<>(this, new cwp(cwt.rl), awa.Cs, $$0 -> this.dW().V() && $$0.cp()));
      this.bS.a(1, new cdn(this));
      this.bS.a(1, new cbl<>(this, cmq.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbl<>(this, clq.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cbl<>(this, cmm.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbl<>(this, cml.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbl<>(this, cma.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new cbl<>(this, clv.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cbl<>(this, cmp.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new ccx(this, 0.5));
      this.bS.a(1, new ccn(this));
      this.bS.a(2, new cop.a(this, 2.0, 0.35));
      this.bS.a(4, new ccs(this, 0.35));
      this.bS.a(8, new cdr(this, 0.35));
      this.bS.a(9, new cch(this, cox.class, 3.0F, 1.0F));
      this.bS.a(10, new ccm(this, bvi.class, 8.0F));
   }

   @Nullable
   @Override
   public bub a(arc $$0, bub $$1) {
      return null;
   }

   @Override
   public boolean gs() {
      return false;
   }

   @Override
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if (!$$2.a(cwt.uG) && this.bL() && !this.gq() && !this.e_()) {
         if ($$1 == bsi.a) {
            $$0.a(awk.S);
         }

         if (!this.dW().C) {
            if (this.gr().isEmpty()) {
               return bsj.c;
            }

            this.a($$0);
            this.a($$0, this.p_(), 1);
         }

         return bsj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gw() {
      if (this.dW().K().b(crv.b)) {
         this.gz();
      } else {
         com.g[] $$0 = (com.g[])com.b.get(1);
         com.g[] $$1 = (com.g[])com.b.get(2);
         if ($$0 != null && $$1 != null) {
            dfg $$2 = this.gr();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            com.g $$4 = $$1[$$3];
            dff $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gz() {
      dfg $$0 = this.gr();

      for (Pair<com.g[], Integer> $$1 : com.d) {
         com.g[] $$2 = (com.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", uf.a(this.cb));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      uf.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.Y_()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dff $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dW().b(new buw(this.dW(), this.dB(), this.dD() + 0.5, this.dH(), $$1));
      }
   }

   @Override
   protected avz u() {
      return this.gq() ? awa.Ct : awa.Cl;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.Cq;
   }

   @Override
   protected avz o_() {
      return awa.Cm;
   }

   @Override
   public avz j(cwp $$0) {
      return $$0.a(cwt.rl) ? awa.Co : awa.Cp;
   }

   @Override
   protected avz x(boolean $$0) {
      return $$0 ? awa.Cu : awa.Cr;
   }

   @Override
   public avz gt() {
      return awa.Cu;
   }

   public void t(int $$0) {
      this.cc = $$0;
   }

   public int gy() {
      return this.cc;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C) {
         this.gA();
      }
   }

   private void gA() {
      if (this.cc > 0 && !this.gq() && --this.cc == 0) {
         this.at();
      }
   }

   public void h(@Nullable ji $$0) {
      this.cb = $$0;
   }

   @Nullable
   ji gC() {
      return this.cb;
   }

   class a extends cce {
      final cop a;
      final double b;
      final double c;

      a(final cop $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cop.this.bR.m();
      }

      @Override
      public boolean b() {
         ji $$0 = this.a.gC();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         ji $$0 = this.a.gC();
         if ($$0 != null && cop.this.bR.k()) {
            if (this.a($$0, 10.0)) {
               fba $$1 = new fba((double)$$0.u() - this.a.dB(), (double)$$0.v() - this.a.dD(), (double)$$0.w() - this.a.dH()).d();
               fba $$2 = $$1.c(10.0).b(this.a.dB(), this.a.dD(), this.a.dH());
               cop.this.bR.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cop.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ji $$0, double $$1) {
         return !$$0.a(this.a.du(), $$1);
      }
   }
}
