import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class coi extends cnx implements cyl.b {
   private static final int ca = 5;
   @Nullable
   private jh cb;
   private int cc;

   public coi(bup<? extends coi> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbw(this));
      this.bS.a(0, new cdn<>(this, cye.a(cwj.sC, cyf.g), awo.BC, $$0 -> this.dY().T() && !$$0.cr()));
      this.bS.a(0, new cdn<>(this, new cwf(cwj.qF), awo.BH, $$0 -> this.dY().S() && $$0.cr()));
      this.bS.a(1, new cdl(this));
      this.bS.a(1, new cbj<>(this, cmo.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbj<>(this, clo.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cbj<>(this, cmk.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbj<>(this, cmj.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbj<>(this, cly.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new cbj<>(this, clt.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cbj<>(this, cmn.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new ccv(this, 0.5));
      this.bS.a(1, new ccl(this));
      this.bS.a(2, new coi.a(this, 2.0, 0.35));
      this.bS.a(4, new ccq(this, 0.35));
      this.bS.a(8, new cdp(this, 0.35));
      this.bS.a(9, new ccf(this, cor.class, 3.0F, 1.0F));
      this.bS.a(10, new cck(this, bvg.class, 8.0F));
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      return null;
   }

   @Override
   public boolean gy() {
      return false;
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if (!$$2.a(cwj.ua) && this.bN() && !this.gw() && !this.p_()) {
         if ($$1 == bsg.a) {
            $$0.a(awy.S);
         }

         if (!this.dY().C) {
            if (this.gx().isEmpty()) {
               return bsh.c;
            }

            this.a($$0);
            this.a($$0, this.S_(), 1);
         }

         return bsh.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gC() {
      if (this.dY().J().b(crl.c)) {
         this.gF();
      } else {
         cog.g[] $$0 = (cog.g[])cog.b.get(1);
         cog.g[] $$1 = (cog.g[])cog.b.get(2);
         if ($$0 != null && $$1 != null) {
            ded $$2 = this.gx();
            this.a($$2, $$0, 5);
            int $$3 = this.af.a($$1.length);
            cog.g $$4 = $$1[$$3];
            dec $$5 = $$4.a(this, this.af);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gF() {
      ded $$0 = this.gx();

      for (Pair<cog.g[], Integer> $$1 : cog.d) {
         cog.g[] $$2 = (cog.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", vc.a(this.cb));
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      vc.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dec $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.af.a(4);
         this.dY().b(new buu(this.dY(), this.dD(), this.dF() + 0.5, this.dJ(), $$1));
      }
   }

   @Override
   protected awn w() {
      return this.gw() ? awo.BI : awo.BA;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.BF;
   }

   @Override
   protected awn o_() {
      return awo.BB;
   }

   @Override
   public awn l(cwf $$0) {
      return $$0.a(cwj.qF) ? awo.BD : awo.BE;
   }

   @Override
   protected awn x(boolean $$0) {
      return $$0 ? awo.BJ : awo.BG;
   }

   @Override
   public awn gz() {
      return awo.BJ;
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
      if (!this.dY().C) {
         this.gG();
      }
   }

   private void gG() {
      if (this.cc > 0 && !this.gw() && --this.cc == 0) {
         this.av();
      }
   }

   public void h(@Nullable jh $$0) {
      this.cb = $$0;
   }

   @Nullable
   jh gI() {
      return this.cb;
   }

   class a extends ccc {
      final coi a;
      final double b;
      final double c;

      a(final coi $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         coi.this.bR.o();
      }

      @Override
      public boolean b() {
         jh $$0 = this.a.gI();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jh $$0 = this.a.gI();
         if ($$0 != null && coi.this.bR.m()) {
            if (this.a($$0, 10.0)) {
               ezr $$1 = new ezr((double)$$0.u() - this.a.dD(), (double)$$0.v() - this.a.dF(), (double)$$0.w() - this.a.dJ()).d();
               ezr $$2 = $$1.c(10.0).b(this.a.dD(), this.a.dF(), this.a.dJ());
               coi.this.bR.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               coi.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jh $$0, double $$1) {
         return !$$0.a(this.a.dw(), $$1);
      }
   }
}
