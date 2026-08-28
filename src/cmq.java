import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cmq extends cmf {
   private static final int ca = 5;
   @Nullable
   private iz cb;
   private int cc;

   public cmq(bta<? extends cmq> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cah(this));
      this.bS.a(0, new cby<>(this, cwq.a(cus.sk, cwr.g), awa.Bu, $$0 -> this.dP().S() && !$$0.ch()));
      this.bS.a(0, new cby<>(this, new cup(cus.qE), awa.Bz, $$0 -> this.dP().R() && $$0.ch()));
      this.bS.a(1, new cbw(this));
      this.bS.a(1, new bzu<>(this, ckw.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzu<>(this, cjw.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bzu<>(this, cks.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzu<>(this, ckr.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzu<>(this, ckg.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new bzu<>(this, ckb.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bzu<>(this, ckv.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new cbg(this, 0.5));
      this.bS.a(1, new caw(this));
      this.bS.a(2, new cmq.a(this, 2.0, 0.35));
      this.bS.a(4, new cbb(this, 0.35));
      this.bS.a(8, new cca(this, 0.35));
      this.bS.a(9, new caq(this, cmx.class, 3.0F, 1.0F));
      this.bS.a(10, new cav(this, btr.class, 8.0F));
   }

   @Nullable
   @Override
   public bso a(arf $$0, bso $$1) {
      return null;
   }

   @Override
   public boolean gt() {
      return false;
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if (!$$2.a(cus.tJ) && this.bD() && !this.gr() && !this.p_()) {
         if ($$1 == bqt.a) {
            $$0.a(awk.S);
         }

         if (this.gs().isEmpty()) {
            return bqu.a(this.dP().B);
         } else {
            if (!this.dP().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bqu.a(this.dP().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gx() {
      if (this.dP().J().b(cpn.d)) {
         this.gA();
      } else {
         cmo.g[] $$0 = (cmo.g[])cmo.b.get(1);
         cmo.g[] $$1 = (cmo.g[])cmo.b.get(2);
         if ($$0 != null && $$1 != null) {
            dax $$2 = this.gs();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            cmo.g $$4 = $$1[$$3];
            daw $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gA() {
      dax $$0 = this.gs();

      for (Pair<cmo.g[], Integer> $$1 : cmo.d) {
         cmo.g[] $$2 = (cmo.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", vh.a(this.cb));
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      vh.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(daw $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dP().b(new btf(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   @Override
   protected avz v() {
      return this.gr() ? awa.BA : awa.Bs;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.Bx;
   }

   @Override
   protected avz o_() {
      return awa.Bt;
   }

   @Override
   protected avz c(cup $$0) {
      return $$0.a(cus.qE) ? awa.Bv : awa.Bw;
   }

   @Override
   protected avz w(boolean $$0) {
      return $$0 ? awa.BB : awa.By;
   }

   @Override
   public avz gu() {
      return awa.BB;
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

   class a extends can {
      final cmq a;
      final double b;
      final double c;

      a(final cmq $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(can.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cmq.this.bR.n();
      }

      @Override
      public boolean a() {
         iz $$0 = this.a.gD();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         iz $$0 = this.a.gD();
         if ($$0 != null && cmq.this.bR.l()) {
            if (this.a($$0, 10.0)) {
               evr $$1 = new evr((double)$$0.u() - this.a.du(), (double)$$0.v() - this.a.dw(), (double)$$0.w() - this.a.dA()).d();
               evr $$2 = $$1.a(10.0).b(this.a.du(), this.a.dw(), this.a.dA());
               cmq.this.bR.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cmq.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(iz $$0, double $$1) {
         return !$$0.a(this.a.dn(), $$1);
      }
   }
}
