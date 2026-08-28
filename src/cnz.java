import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cnz extends cno implements cyd.b {
   private static final int ca = 5;
   @Nullable
   private jg cb;
   private int cc;

   public cnz(bug<? extends cnz> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbn(this));
      this.bS.a(0, new cde<>(this, cxw.a(cwb.sm, cxx.g), awk.BC, $$0 -> this.dX().T() && !$$0.cq()));
      this.bS.a(0, new cde<>(this, new cvx(cwb.qF), awk.BH, $$0 -> this.dX().S() && $$0.cq()));
      this.bS.a(1, new cdc(this));
      this.bS.a(1, new cba<>(this, cmf.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cba<>(this, clf.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cba<>(this, cmb.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cba<>(this, cma.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cba<>(this, clp.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new cba<>(this, clk.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cba<>(this, cme.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new ccm(this, 0.5));
      this.bS.a(1, new ccc(this));
      this.bS.a(2, new cnz.a(this, 2.0, 0.35));
      this.bS.a(4, new cch(this, 0.35));
      this.bS.a(8, new cdg(this, 0.35));
      this.bS.a(9, new cbw(this, coh.class, 3.0F, 1.0F));
      this.bS.a(10, new ccb(this, bux.class, 8.0F));
   }

   @Nullable
   @Override
   public btq a(arm $$0, btq $$1) {
      return null;
   }

   @Override
   public boolean gy() {
      return false;
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if (!$$2.a(cwb.tK) && this.bM() && !this.gw() && !this.p_()) {
         if ($$1 == brx.a) {
            $$0.a(awu.S);
         }

         if (!this.dX().C) {
            if (this.gx().isEmpty()) {
               return bry.c;
            }

            this.a($$0);
            this.a($$0, this.S_(), 1);
         }

         return bry.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gC() {
      if (this.dX().J().b(crc.c)) {
         this.gF();
      } else {
         cnx.g[] $$0 = (cnx.g[])cnx.b.get(1);
         cnx.g[] $$1 = (cnx.g[])cnx.b.get(2);
         if ($$0 != null && $$1 != null) {
            ddt $$2 = this.gx();
            this.a($$2, $$0, 5);
            int $$3 = this.af.a($$1.length);
            cnx.g $$4 = $$1[$$3];
            dds $$5 = $$4.a(this, this.af);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gF() {
      ddt $$0 = this.gx();

      for (Pair<cnx.g[], Integer> $$1 : cnx.d) {
         cnx.g[] $$2 = (cnx.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", uy.a(this.cb));
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      uy.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dds $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.af.a(4);
         this.dX().b(new bul(this.dX(), this.dC(), this.dE() + 0.5, this.dI(), $$1));
      }
   }

   @Override
   protected awj w() {
      return this.gw() ? awk.BI : awk.BA;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.BF;
   }

   @Override
   protected awj o_() {
      return awk.BB;
   }

   @Override
   public awj l(cvx $$0) {
      return $$0.a(cwb.qF) ? awk.BD : awk.BE;
   }

   @Override
   protected awj x(boolean $$0) {
      return $$0 ? awk.BJ : awk.BG;
   }

   @Override
   public awj gz() {
      return awk.BJ;
   }

   public void u(int $$0) {
      this.cc = $$0;
   }

   public int gE() {
      return this.cc;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dX().C) {
         this.gG();
      }
   }

   private void gG() {
      if (this.cc > 0 && !this.gw() && --this.cc == 0) {
         this.au();
      }
   }

   public void h(@Nullable jg $$0) {
      this.cb = $$0;
   }

   @Nullable
   jg gI() {
      return this.cb;
   }

   class a extends cbt {
      final cnz a;
      final double b;
      final double c;

      a(final cnz $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cbt.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cnz.this.bR.o();
      }

      @Override
      public boolean b() {
         jg $$0 = this.a.gI();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jg $$0 = this.a.gI();
         if ($$0 != null && cnz.this.bR.m()) {
            if (this.a($$0, 10.0)) {
               ezh $$1 = new ezh((double)$$0.u() - this.a.dC(), (double)$$0.v() - this.a.dE(), (double)$$0.w() - this.a.dI()).d();
               ezh $$2 = $$1.c(10.0).b(this.a.dC(), this.a.dE(), this.a.dI());
               cnz.this.bR.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cnz.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jg $$0, double $$1) {
         return !$$0.a(this.a.dv(), $$1);
      }
   }
}
