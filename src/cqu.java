import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cqu extends cqj implements dbi.b {
   private static final int bI = 5;
   @Nullable
   private iu bJ;
   private int bK;

   public cqu(bwo<? extends cqu> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdu(this));
      this.bD.a(0, new cfl<>(this, daz.a(czh.tt, dba.g), awn.CC, $$0 -> this.dV().W() && !$$0.cp()));
      this.bD.a(0, new cfl<>(this, new czd(czh.ru), awn.CH, $$0 -> this.dV().V() && $$0.cp()));
      this.bD.a(1, new cfj(this));
      this.bD.a(1, new cdh<>(this, cox.class, 8.0F, 0.5, 0.5));
      this.bD.a(1, new cdh<>(this, cnw.class, 12.0F, 0.5, 0.5));
      this.bD.a(1, new cdh<>(this, cot.class, 8.0F, 0.5, 0.5));
      this.bD.a(1, new cdh<>(this, cos.class, 8.0F, 0.5, 0.5));
      this.bD.a(1, new cdh<>(this, cog.class, 15.0F, 0.5, 0.5));
      this.bD.a(1, new cdh<>(this, cob.class, 12.0F, 0.5, 0.5));
      this.bD.a(1, new cdh<>(this, cow.class, 10.0F, 0.5, 0.5));
      this.bD.a(1, new cet(this, 0.5));
      this.bD.a(1, new cej(this));
      this.bD.a(2, new cqu.a(this, 2.0, 0.35));
      this.bD.a(4, new ceo(this, 0.35));
      this.bD.a(8, new cfn(this, 0.35));
      this.bD.a(9, new ced(this, crc.class, 3.0F, 1.0F));
      this.bD.a(10, new cei(this, bxg.class, 8.0F));
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      return null;
   }

   @Override
   public boolean gt() {
      return false;
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if (!$$2.a(czh.uR) && this.bK() && !this.gr() && !this.n_()) {
         if ($$1 == buc.a) {
            $$0.a(awx.S);
         }

         if (!this.dV().C) {
            if (this.gs().isEmpty()) {
               return bud.c;
            }

            this.a($$0);
            this.a($$0, this.m_(), 1);
         }

         return bud.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gx() {
      if (this.dV().K().b(cuo.b)) {
         this.gA();
      } else {
         cqs.g[] $$0 = (cqs.g[])cqs.b.get(1);
         cqs.g[] $$1 = (cqs.g[])cqs.b.get(2);
         if ($$0 != null && $$1 != null) {
            dhz $$2 = this.gs();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            cqs.g $$4 = $$1[$$3];
            dhy $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gA() {
      dhz $$0 = this.gs();

      for (Pair<cqs.g[], Integer> $$1 : cqs.d) {
         cqs.g[] $$2 = (cqs.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bK);
      if (this.bJ != null) {
         $$0.a("wander_target", uo.a(this.bJ));
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bK = $$0.h("DespawnDelay");
      }

      uo.a($$0, "wander_target").ifPresent($$0x -> this.bJ = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dhy $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dV().b(new bwt(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   protected awm u() {
      return this.gr() ? awn.CI : awn.CA;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.CF;
   }

   @Override
   protected awm l_() {
      return awn.CB;
   }

   @Override
   public awm j(czd $$0) {
      return $$0.a(czh.ru) ? awn.CD : awn.CE;
   }

   @Override
   protected awm w(boolean $$0) {
      return $$0 ? awn.CJ : awn.CG;
   }

   @Override
   public awm gu() {
      return awn.CJ;
   }

   public void t(int $$0) {
      this.bK = $$0;
   }

   public int gz() {
      return this.bK;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.gB();
      }
   }

   private void gB() {
      if (this.bK > 0 && !this.gr() && --this.bK == 0) {
         this.at();
      }
   }

   public void h(@Nullable iu $$0) {
      this.bJ = $$0;
   }

   @Nullable
   iu gD() {
      return this.bJ;
   }

   class a extends cea {
      final cqu a;
      final double b;
      final double c;

      a(final cqu $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cqu.this.bC.m();
      }

      @Override
      public boolean b() {
         iu $$0 = this.a.gD();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         iu $$0 = this.a.gD();
         if ($$0 != null && cqu.this.bC.k()) {
            if (this.a($$0, 10.0)) {
               feq $$1 = new feq((double)$$0.u() - this.a.dA(), (double)$$0.v() - this.a.dC(), (double)$$0.w() - this.a.dG()).d();
               feq $$2 = $$1.c(10.0).b(this.a.dA(), this.a.dC(), this.a.dG());
               cqu.this.bC.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cqu.this.bC.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(iu $$0, double $$1) {
         return !$$0.a(this.a.dt(), $$1);
      }
   }
}
