import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class com extends cob implements cyt.b {
   private static final int ca = 5;
   @Nullable
   private ji cb;
   private int cc;

   public com(buq<? extends com> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbx(this));
      this.bS.a(0, new cdo<>(this, cym.a(cwr.ti, cyn.g), avz.Cm, $$0 -> this.dW().W() && !$$0.cp()));
      this.bS.a(0, new cdo<>(this, new cwn(cwr.rl), avz.Cr, $$0 -> this.dW().V() && $$0.cp()));
      this.bS.a(1, new cdm(this));
      this.bS.a(1, new cbk<>(this, cmp.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbk<>(this, clp.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cbk<>(this, cml.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbk<>(this, cmk.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbk<>(this, clz.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new cbk<>(this, clu.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cbk<>(this, cmo.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new ccw(this, 0.5));
      this.bS.a(1, new ccm(this));
      this.bS.a(2, new com.a(this, 2.0, 0.35));
      this.bS.a(4, new ccr(this, 0.35));
      this.bS.a(8, new cdq(this, 0.35));
      this.bS.a(9, new ccg(this, cov.class, 3.0F, 1.0F));
      this.bS.a(10, new ccl(this, bvh.class, 8.0F));
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      return null;
   }

   @Override
   public boolean gs() {
      return false;
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if (!$$2.a(cwr.uG) && this.bL() && !this.gq() && !this.e_()) {
         if ($$1 == bsh.a) {
            $$0.a(awj.S);
         }

         if (!this.dW().C) {
            if (this.gr().isEmpty()) {
               return bsi.c;
            }

            this.a($$0);
            this.a($$0, this.p_(), 1);
         }

         return bsi.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gw() {
      if (this.dW().K().b(crt.b)) {
         this.gz();
      } else {
         cok.g[] $$0 = (cok.g[])cok.b.get(1);
         cok.g[] $$1 = (cok.g[])cok.b.get(2);
         if ($$0 != null && $$1 != null) {
            dfe $$2 = this.gr();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            cok.g $$4 = $$1[$$3];
            dfd $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gz() {
      dfe $$0 = this.gr();

      for (Pair<cok.g[], Integer> $$1 : cok.d) {
         cok.g[] $$2 = (cok.g[])$$1.getLeft();
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
   protected void b(dfd $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dW().b(new buv(this.dW(), this.dB(), this.dD() + 0.5, this.dH(), $$1));
      }
   }

   @Override
   protected avy u() {
      return this.gq() ? avz.Cs : avz.Ck;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.Cp;
   }

   @Override
   protected avy o_() {
      return avz.Cl;
   }

   @Override
   public avy j(cwn $$0) {
      return $$0.a(cwr.rl) ? avz.Cn : avz.Co;
   }

   @Override
   protected avy x(boolean $$0) {
      return $$0 ? avz.Ct : avz.Cq;
   }

   @Override
   public avy gt() {
      return avz.Ct;
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

   class a extends ccd {
      final com a;
      final double b;
      final double c;

      a(final com $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(ccd.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         com.this.bR.m();
      }

      @Override
      public boolean b() {
         ji $$0 = this.a.gC();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         ji $$0 = this.a.gC();
         if ($$0 != null && com.this.bR.k()) {
            if (this.a($$0, 10.0)) {
               fay $$1 = new fay((double)$$0.u() - this.a.dB(), (double)$$0.v() - this.a.dD(), (double)$$0.w() - this.a.dH()).d();
               fay $$2 = $$1.c(10.0).b(this.a.dB(), this.a.dD(), this.a.dH());
               com.this.bR.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               com.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ji $$0, double $$1) {
         return !$$0.a(this.a.du(), $$1);
      }
   }
}
