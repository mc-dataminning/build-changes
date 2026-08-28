import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class coo extends coc implements cyu.b {
   private static final int ca = 5;
   @Nullable
   private ji cb;
   private int cc;

   public coo(bur<? extends coo> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(0, new cby(this));
      this.bS.a(0, new cdp<>(this, cyn.a(cws.ti, cyo.g), awa.Cm, $$0 -> this.dV().W() && !$$0.cp()));
      this.bS.a(0, new cdp<>(this, new cwo(cws.rl), awa.Cr, $$0 -> this.dV().V() && $$0.cp()));
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
      this.bS.a(2, new coo.a(this, 2.0, 0.35));
      this.bS.a(4, new ccs(this, 0.35));
      this.bS.a(8, new cdr(this, 0.35));
      this.bS.a(9, new cch(this, cow.class, 3.0F, 1.0F));
      this.bS.a(10, new ccm(this, bvi.class, 8.0F));
   }

   @Nullable
   @Override
   public bub a(ard $$0, bub $$1) {
      return null;
   }

   @Override
   public boolean gv() {
      return false;
   }

   @Override
   public bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      if (!$$2.a(cws.uG) && this.bL() && !this.gt() && !this.e_()) {
         if ($$1 == bsi.a) {
            $$0.a(awk.S);
         }

         if (!this.dV().C) {
            if (this.gu().isEmpty()) {
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
   protected void gz() {
      if (this.dV().K().b(cru.b)) {
         this.gC();
      } else {
         col.g[] $$0 = (col.g[])col.b.get(1);
         col.g[] $$1 = (col.g[])col.b.get(2);
         if ($$0 != null && $$1 != null) {
            dff $$2 = this.gu();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            col.g $$4 = $$1[$$3];
            dfe $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gC() {
      dff $$0 = this.gu();

      for (Pair<col.g[], Integer> $$1 : col.d) {
         col.g[] $$2 = (col.g[])$$1.getLeft();
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
   protected void b(dfe $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dV().b(new buw(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   protected avz u() {
      return this.gt() ? awa.Cs : awa.Ck;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.Cp;
   }

   @Override
   protected avz o_() {
      return awa.Cl;
   }

   @Override
   public avz j(cwo $$0) {
      return $$0.a(cws.rl) ? awa.Cn : awa.Co;
   }

   @Override
   protected avz x(boolean $$0) {
      return $$0 ? awa.Ct : awa.Cq;
   }

   @Override
   public avz gw() {
      return awa.Ct;
   }

   public void t(int $$0) {
      this.cc = $$0;
   }

   public int gB() {
      return this.cc;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
         this.gD();
      }
   }

   private void gD() {
      if (this.cc > 0 && !this.gt() && --this.cc == 0) {
         this.at();
      }
   }

   public void h(@Nullable ji $$0) {
      this.cb = $$0;
   }

   @Nullable
   ji gF() {
      return this.cb;
   }

   class a extends cce {
      final coo a;
      final double b;
      final double c;

      a(final coo $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         coo.this.bR.m();
      }

      @Override
      public boolean b() {
         ji $$0 = this.a.gF();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         ji $$0 = this.a.gF();
         if ($$0 != null && coo.this.bR.k()) {
            if (this.a($$0, 10.0)) {
               faz $$1 = new faz((double)$$0.u() - this.a.dA(), (double)$$0.v() - this.a.dC(), (double)$$0.w() - this.a.dG()).d();
               faz $$2 = $$1.c(10.0).b(this.a.dA(), this.a.dC(), this.a.dG());
               coo.this.bR.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               coo.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ji $$0, double $$1) {
         return !$$0.a(this.a.dt(), $$1);
      }
   }
}
