import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cmr extends cmg {
   private static final int ca = 5;
   @Nullable
   private iz cb;
   private int cc;

   public cmr(btb<? extends cmr> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cai(this));
      this.bS.a(0, new cbz<>(this, cwr.a(cut.sk, cws.g), awa.Bu, $$0 -> this.dP().S() && !$$0.ch()));
      this.bS.a(0, new cbz<>(this, new cuq(cut.qE), awa.Bz, $$0 -> this.dP().R() && $$0.ch()));
      this.bS.a(1, new cbx(this));
      this.bS.a(1, new bzv<>(this, ckx.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzv<>(this, cjx.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bzv<>(this, ckt.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzv<>(this, cks.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzv<>(this, ckh.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new bzv<>(this, ckc.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bzv<>(this, ckw.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new cbh(this, 0.5));
      this.bS.a(1, new cax(this));
      this.bS.a(2, new cmr.a(this, 2.0, 0.35));
      this.bS.a(4, new cbc(this, 0.35));
      this.bS.a(8, new ccb(this, 0.35));
      this.bS.a(9, new car(this, cmy.class, 3.0F, 1.0F));
      this.bS.a(10, new caw(this, bts.class, 8.0F));
   }

   @Nullable
   @Override
   public bsp a(arf $$0, bsp $$1) {
      return null;
   }

   @Override
   public boolean gt() {
      return false;
   }

   @Override
   public bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      if (!$$2.a(cut.tJ) && this.bD() && !this.gr() && !this.p_()) {
         if ($$1 == bqu.a) {
            $$0.a(awk.S);
         }

         if (this.gs().isEmpty()) {
            return bqv.a(this.dP().B);
         } else {
            if (!this.dP().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bqv.a(this.dP().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gx() {
      if (this.dP().J().b(cpo.d)) {
         this.gA();
      } else {
         cmp.g[] $$0 = (cmp.g[])cmp.b.get(1);
         cmp.g[] $$1 = (cmp.g[])cmp.b.get(2);
         if ($$0 != null && $$1 != null) {
            day $$2 = this.gs();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            cmp.g $$4 = $$1[$$3];
            dax $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gA() {
      day $$0 = this.gs();

      for (Pair<cmp.g[], Integer> $$1 : cmp.d) {
         cmp.g[] $$2 = (cmp.g[])$$1.getLeft();
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
   protected void b(dax $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dP().b(new btg(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   @Override
   protected avz v() {
      return this.gr() ? awa.BA : awa.Bs;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.Bx;
   }

   @Override
   protected avz o_() {
      return awa.Bt;
   }

   @Override
   protected avz c(cuq $$0) {
      return $$0.a(cut.qE) ? awa.Bv : awa.Bw;
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

   class a extends cao {
      final cmr a;
      final double b;
      final double c;

      a(final cmr $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cao.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cmr.this.bR.n();
      }

      @Override
      public boolean a() {
         iz $$0 = this.a.gD();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         iz $$0 = this.a.gD();
         if ($$0 != null && cmr.this.bR.l()) {
            if (this.a($$0, 10.0)) {
               evs $$1 = new evs((double)$$0.u() - this.a.du(), (double)$$0.v() - this.a.dw(), (double)$$0.w() - this.a.dA()).d();
               evs $$2 = $$1.a(10.0).b(this.a.du(), this.a.dw(), this.a.dA());
               cmr.this.bR.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cmr.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(iz $$0, double $$1) {
         return !$$0.a(this.a.dn(), $$1);
      }
   }
}
