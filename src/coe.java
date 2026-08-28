import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class coe extends cnt implements cyh.b {
   private static final int ca = 5;
   @Nullable
   private jh cb;
   private int cc;

   public coe(bul<? extends coe> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbs(this));
      this.bS.a(0, new cdj<>(this, cya.a(cwf.sm, cyb.g), awl.BC, $$0 -> this.dX().T() && !$$0.cq()));
      this.bS.a(0, new cdj<>(this, new cwb(cwf.qF), awl.BH, $$0 -> this.dX().S() && $$0.cq()));
      this.bS.a(1, new cdh(this));
      this.bS.a(1, new cbf<>(this, cmk.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbf<>(this, clk.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cbf<>(this, cmg.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbf<>(this, cmf.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbf<>(this, clu.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new cbf<>(this, clp.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cbf<>(this, cmj.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new ccr(this, 0.5));
      this.bS.a(1, new cch(this));
      this.bS.a(2, new coe.a(this, 2.0, 0.35));
      this.bS.a(4, new ccm(this, 0.35));
      this.bS.a(8, new cdl(this, 0.35));
      this.bS.a(9, new ccb(this, com.class, 3.0F, 1.0F));
      this.bS.a(10, new ccg(this, bvc.class, 8.0F));
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      return null;
   }

   @Override
   public boolean gx() {
      return false;
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if (!$$2.a(cwf.tK) && this.bM() && !this.gv() && !this.p_()) {
         if ($$1 == bsc.a) {
            $$0.a(awv.S);
         }

         if (!this.dX().C) {
            if (this.gw().isEmpty()) {
               return bsd.c;
            }

            this.a($$0);
            this.a($$0, this.S_(), 1);
         }

         return bsd.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gB() {
      if (this.dX().J().b(crh.c)) {
         this.gE();
      } else {
         coc.g[] $$0 = (coc.g[])coc.b.get(1);
         coc.g[] $$1 = (coc.g[])coc.b.get(2);
         if ($$0 != null && $$1 != null) {
            ddz $$2 = this.gw();
            this.a($$2, $$0, 5);
            int $$3 = this.af.a($$1.length);
            coc.g $$4 = $$1[$$3];
            ddy $$5 = $$4.a(this, this.af);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gE() {
      ddz $$0 = this.gw();

      for (Pair<coc.g[], Integer> $$1 : coc.d) {
         coc.g[] $$2 = (coc.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", uz.a(this.cb));
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      uz.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(ddy $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.af.a(4);
         this.dX().b(new buq(this.dX(), this.dC(), this.dE() + 0.5, this.dI(), $$1));
      }
   }

   @Override
   protected awk w() {
      return this.gv() ? awl.BI : awl.BA;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.BF;
   }

   @Override
   protected awk o_() {
      return awl.BB;
   }

   @Override
   public awk l(cwb $$0) {
      return $$0.a(cwf.qF) ? awl.BD : awl.BE;
   }

   @Override
   protected awk x(boolean $$0) {
      return $$0 ? awl.BJ : awl.BG;
   }

   @Override
   public awk gy() {
      return awl.BJ;
   }

   public void u(int $$0) {
      this.cc = $$0;
   }

   public int gD() {
      return this.cc;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dX().C) {
         this.gF();
      }
   }

   private void gF() {
      if (this.cc > 0 && !this.gv() && --this.cc == 0) {
         this.av();
      }
   }

   public void h(@Nullable jh $$0) {
      this.cb = $$0;
   }

   @Nullable
   jh gH() {
      return this.cb;
   }

   class a extends cby {
      final coe a;
      final double b;
      final double c;

      a(final coe $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         coe.this.bR.o();
      }

      @Override
      public boolean b() {
         jh $$0 = this.a.gH();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jh $$0 = this.a.gH();
         if ($$0 != null && coe.this.bR.m()) {
            if (this.a($$0, 10.0)) {
               ezn $$1 = new ezn((double)$$0.u() - this.a.dC(), (double)$$0.v() - this.a.dE(), (double)$$0.w() - this.a.dI()).d();
               ezn $$2 = $$1.c(10.0).b(this.a.dC(), this.a.dE(), this.a.dI());
               coe.this.bR.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               coe.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jh $$0, double $$1) {
         return !$$0.a(this.a.dv(), $$1);
      }
   }
}
