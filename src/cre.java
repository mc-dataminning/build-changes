import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cre extends cqt implements dbs.b {
   @Nullable
   private iv bI;
   private int bJ;

   public cre(bwr<? extends cre> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdz(this));
      this.bD.a(0, new cfq<>(this, dbj.a(czr.tt, dbk.g), awn.CC, $$0 -> this.dU().W() && !$$0.cn()));
      this.bD.a(0, new cfq<>(this, new czn(czr.ru), awn.CH, $$0 -> this.dU().V() && $$0.cn()));
      this.bD.a(1, new cfo(this));
      this.bD.a(1, new cdm<>(this, cph.class, 8.0F, 0.5, 0.5));
      this.bD.a(1, new cdm<>(this, cog.class, 12.0F, 0.5, 0.5));
      this.bD.a(1, new cdm<>(this, cpd.class, 8.0F, 0.5, 0.5));
      this.bD.a(1, new cdm<>(this, cpc.class, 8.0F, 0.5, 0.5));
      this.bD.a(1, new cdm<>(this, cor.class, 15.0F, 0.5, 0.5));
      this.bD.a(1, new cdm<>(this, col.class, 12.0F, 0.5, 0.5));
      this.bD.a(1, new cdm<>(this, cpg.class, 10.0F, 0.5, 0.5));
      this.bD.a(1, new cey(this, 0.5));
      this.bD.a(1, new ceo(this));
      this.bD.a(2, new cre.a(this, 2.0, 0.35));
      this.bD.a(4, new cet(this, 0.35));
      this.bD.a(8, new cfs(this, 0.35));
      this.bD.a(9, new cei(this, crm.class, 3.0F, 1.0F));
      this.bD.a(10, new cen(this, bxl.class, 8.0F));
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      return null;
   }

   @Override
   public boolean gv() {
      return false;
   }

   @Override
   public bug b(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      if (!$$2.a(czr.uR) && this.bI() && !this.gt() && !this.n_()) {
         if ($$1 == buf.a) {
            $$0.a(awx.S);
         }

         if (!this.dU().C) {
            if (this.gu().isEmpty()) {
               return bug.c;
            }

            this.a($$0);
            this.a($$0, this.m_(), 1);
         }

         return bug.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gz() {
      dij $$0 = this.gu();

      for (Pair<crc.g[], Integer> $$1 : crc.b) {
         crc.g[] $$2 = (crc.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bJ);
      $$0.b("wander_target", iv.a, this.bI);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bJ = $$0.f("DespawnDelay");
      }

      this.bI = $$0.<iv>a("wander_target", iv.a).orElse(null);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dii $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dU().b(new bww(this.dU(), this.dz(), this.dB() + 0.5, this.dF(), $$1));
      }
   }

   @Override
   protected awm u() {
      return this.gt() ? awn.CI : awn.CA;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.CF;
   }

   @Override
   protected awm l_() {
      return awn.CB;
   }

   @Override
   public awm j(czn $$0) {
      return $$0.a(czr.ru) ? awn.CD : awn.CE;
   }

   @Override
   protected awm w(boolean $$0) {
      return $$0 ? awn.CJ : awn.CG;
   }

   @Override
   public awm gw() {
      return awn.CJ;
   }

   public void t(int $$0) {
      this.bJ = $$0;
   }

   public int gB() {
      return this.bJ;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C) {
         this.gC();
      }
   }

   private void gC() {
      if (this.bJ > 0 && !this.gt() && --this.bJ == 0) {
         this.aq();
      }
   }

   public void h(@Nullable iv $$0) {
      this.bI = $$0;
   }

   @Nullable
   iv gD() {
      return this.bI;
   }

   class a extends cef {
      final cre a;
      final double b;
      final double c;

      a(final cre $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cre.this.bC.m();
      }

      @Override
      public boolean b() {
         iv $$0 = this.a.gD();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         iv $$0 = this.a.gD();
         if ($$0 != null && cre.this.bC.k()) {
            if (this.a($$0, 10.0)) {
               ffc $$1 = new ffc((double)$$0.u() - this.a.dz(), (double)$$0.v() - this.a.dB(), (double)$$0.w() - this.a.dF()).d();
               ffc $$2 = $$1.c(10.0).b(this.a.dz(), this.a.dB(), this.a.dF());
               cre.this.bC.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cre.this.bC.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(iv $$0, double $$1) {
         return !$$0.a(this.a.ds(), $$1);
      }
   }
}
