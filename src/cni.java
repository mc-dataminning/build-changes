import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cni extends cmx {
   private static final int cb = 5;
   @Nullable
   private je cc;
   private int cd;

   public cni(btq<? extends cni> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bT.a(0, new caw(this));
      this.bT.a(0, new ccn<>(this, cxn.a(cvo.sl, cxo.g), awd.BE, $$0 -> this.dS().T() && !$$0.cm()));
      this.bT.a(0, new ccn<>(this, new cvl(cvo.qF), awd.BJ, $$0 -> this.dS().S() && $$0.cm()));
      this.bT.a(1, new ccl(this));
      this.bT.a(1, new caj<>(this, clo.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new caj<>(this, cko.class, 12.0F, 0.5, 0.5));
      this.bT.a(1, new caj<>(this, clk.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new caj<>(this, clj.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new caj<>(this, cky.class, 15.0F, 0.5, 0.5));
      this.bT.a(1, new caj<>(this, ckt.class, 12.0F, 0.5, 0.5));
      this.bT.a(1, new caj<>(this, cln.class, 10.0F, 0.5, 0.5));
      this.bT.a(1, new cbv(this, 0.5));
      this.bT.a(1, new cbl(this));
      this.bT.a(2, new cni.a(this, 2.0, 0.35));
      this.bT.a(4, new cbq(this, 0.35));
      this.bT.a(8, new ccp(this, 0.35));
      this.bT.a(9, new cbf(this, cnp.class, 3.0F, 1.0F));
      this.bT.a(10, new cbk(this, buh.class, 8.0F));
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      return null;
   }

   @Override
   public boolean gr() {
      return false;
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if (!$$2.a(cvo.tK) && this.bI() && !this.gp() && !this.o_()) {
         if ($$1 == brj.a) {
            $$0.a(awn.S);
         }

         if (!this.dS().B) {
            if (this.gq().isEmpty()) {
               return brk.c;
            }

            this.a($$0);
            this.a($$0, this.Q_(), 1);
         }

         return brk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gv() {
      if (this.dS().J().b(cqj.c)) {
         this.gy();
      } else {
         cng.g[] $$0 = (cng.g[])cng.b.get(1);
         cng.g[] $$1 = (cng.g[])cng.b.get(2);
         if ($$0 != null && $$1 != null) {
            dcq $$2 = this.gq();
            this.a($$2, $$0, 5);
            int $$3 = this.af.a($$1.length);
            cng.g $$4 = $$1[$$3];
            dcp $$5 = $$4.a(this, this.af);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gy() {
      dcq $$0 = this.gq();

      for (Pair<cng.g[], Integer> $$1 : cng.d) {
         cng.g[] $$2 = (cng.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cd);
      if (this.cc != null) {
         $$0.a("wander_target", uu.a(this.cc));
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cd = $$0.h("DespawnDelay");
      }

      uu.a($$0, "wander_target").ifPresent($$0x -> this.cc = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dcp $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.af.a(4);
         this.dS().b(new btv(this.dS(), this.dx(), this.dz() + 0.5, this.dD(), $$1));
      }
   }

   @Override
   protected awc w() {
      return this.gp() ? awd.BK : awd.BC;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.BH;
   }

   @Override
   protected awc n_() {
      return awd.BD;
   }

   @Override
   protected awc c(cvl $$0) {
      return $$0.a(cvo.qF) ? awd.BF : awd.BG;
   }

   @Override
   protected awc x(boolean $$0) {
      return $$0 ? awd.BL : awd.BI;
   }

   @Override
   public awc gs() {
      return awd.BL;
   }

   public void u(int $$0) {
      this.cd = $$0;
   }

   public int gx() {
      return this.cd;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B) {
         this.gz();
      }
   }

   private void gz() {
      if (this.cd > 0 && !this.gp() && --this.cd == 0) {
         this.as();
      }
   }

   public void h(@Nullable je $$0) {
      this.cc = $$0;
   }

   @Nullable
   je gB() {
      return this.cc;
   }

   class a extends cbc {
      final cni a;
      final double b;
      final double c;

      a(final cni $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cni.this.bS.o();
      }

      @Override
      public boolean b() {
         je $$0 = this.a.gB();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         je $$0 = this.a.gB();
         if ($$0 != null && cni.this.bS.m()) {
            if (this.a($$0, 10.0)) {
               eye $$1 = new eye((double)$$0.u() - this.a.dx(), (double)$$0.v() - this.a.dz(), (double)$$0.w() - this.a.dD()).d();
               eye $$2 = $$1.c(10.0).b(this.a.dx(), this.a.dz(), this.a.dD());
               cni.this.bS.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cni.this.bS.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(je $$0, double $$1) {
         return !$$0.a(this.a.dq(), $$1);
      }
   }
}
