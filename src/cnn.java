import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cnn extends cnc implements cyb.b {
   private static final int ca = 5;
   @Nullable
   private je cb;
   private int cc;

   public cnn(btv<? extends cnn> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbb(this));
      this.bS.a(0, new ccs<>(this, cxo.a(cvt.sm, cxp.g), awe.BE, $$0 -> this.dS().T() && !$$0.cm()));
      this.bS.a(0, new ccs<>(this, new cvp(cvt.qF), awe.BJ, $$0 -> this.dS().S() && $$0.cm()));
      this.bS.a(1, new ccq(this));
      this.bS.a(1, new cao<>(this, clt.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cao<>(this, ckt.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cao<>(this, clp.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cao<>(this, clo.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cao<>(this, cld.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new cao<>(this, cky.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cao<>(this, cls.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new cca(this, 0.5));
      this.bS.a(1, new cbq(this));
      this.bS.a(2, new cnn.a(this, 2.0, 0.35));
      this.bS.a(4, new cbv(this, 0.35));
      this.bS.a(8, new ccu(this, 0.35));
      this.bS.a(9, new cbk(this, cnu.class, 3.0F, 1.0F));
      this.bS.a(10, new cbp(this, bum.class, 8.0F));
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      return null;
   }

   @Override
   public boolean gs() {
      return false;
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if (!$$2.a(cvt.tK) && this.bI() && !this.gq() && !this.o_()) {
         if ($$1 == bro.a) {
            $$0.a(awo.S);
         }

         if (!this.dS().B) {
            if (this.gr().isEmpty()) {
               return brp.c;
            }

            this.a($$0);
            this.a($$0, this.Q_(), 1);
         }

         return brp.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gw() {
      if (this.dS().J().b(cqp.c)) {
         this.gz();
      } else {
         cnl.g[] $$0 = (cnl.g[])cnl.b.get(1);
         cnl.g[] $$1 = (cnl.g[])cnl.b.get(2);
         if ($$0 != null && $$1 != null) {
            dde $$2 = this.gr();
            this.a($$2, $$0, 5);
            int $$3 = this.af.a($$1.length);
            cnl.g $$4 = $$1[$$3];
            ddd $$5 = $$4.a(this, this.af);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gz() {
      dde $$0 = this.gr();

      for (Pair<cnl.g[], Integer> $$1 : cnl.d) {
         cnl.g[] $$2 = (cnl.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", uu.a(this.cb));
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      uu.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(ddd $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.af.a(4);
         this.dS().b(new bua(this.dS(), this.dx(), this.dz() + 0.5, this.dD(), $$1));
      }
   }

   @Override
   protected awd w() {
      return this.gq() ? awe.BK : awe.BC;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.BH;
   }

   @Override
   protected awd n_() {
      return awe.BD;
   }

   @Override
   public awd n(cvp $$0) {
      return $$0.a(cvt.qF) ? awe.BF : awe.BG;
   }

   @Override
   protected awd x(boolean $$0) {
      return $$0 ? awe.BL : awe.BI;
   }

   @Override
   public awd gt() {
      return awe.BL;
   }

   public void u(int $$0) {
      this.cc = $$0;
   }

   public int gy() {
      return this.cc;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B) {
         this.gA();
      }
   }

   private void gA() {
      if (this.cc > 0 && !this.gq() && --this.cc == 0) {
         this.as();
      }
   }

   public void h(@Nullable je $$0) {
      this.cb = $$0;
   }

   @Nullable
   je gC() {
      return this.cb;
   }

   class a extends cbh {
      final cnn a;
      final double b;
      final double c;

      a(final cnn $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cnn.this.bR.o();
      }

      @Override
      public boolean b() {
         je $$0 = this.a.gC();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         je $$0 = this.a.gC();
         if ($$0 != null && cnn.this.bR.m()) {
            if (this.a($$0, 10.0)) {
               eys $$1 = new eys((double)$$0.u() - this.a.dx(), (double)$$0.v() - this.a.dz(), (double)$$0.w() - this.a.dD()).d();
               eys $$2 = $$1.c(10.0).b(this.a.dx(), this.a.dz(), this.a.dD());
               cnn.this.bR.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cnn.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(je $$0, double $$1) {
         return !$$0.a(this.a.dq(), $$1);
      }
   }
}
