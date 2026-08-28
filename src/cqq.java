import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cqq extends cqf implements dbd.b {
   private static final int bH = 5;
   @Nullable
   private iu bI;
   private int bJ;

   public cqq(bwm<? extends cqq> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cds(this));
      this.bC.a(0, new cfj<>(this, dau.a(czc.to, dav.g), awn.Cz, $$0 -> this.dV().W() && !$$0.cp()));
      this.bC.a(0, new cfj<>(this, new cyy(czc.rr), awn.CE, $$0 -> this.dV().V() && $$0.cp()));
      this.bC.a(1, new cfh(this));
      this.bC.a(1, new cdf<>(this, cot.class, 8.0F, 0.5, 0.5));
      this.bC.a(1, new cdf<>(this, cns.class, 12.0F, 0.5, 0.5));
      this.bC.a(1, new cdf<>(this, cop.class, 8.0F, 0.5, 0.5));
      this.bC.a(1, new cdf<>(this, coo.class, 8.0F, 0.5, 0.5));
      this.bC.a(1, new cdf<>(this, coc.class, 15.0F, 0.5, 0.5));
      this.bC.a(1, new cdf<>(this, cnx.class, 12.0F, 0.5, 0.5));
      this.bC.a(1, new cdf<>(this, cos.class, 10.0F, 0.5, 0.5));
      this.bC.a(1, new cer(this, 0.5));
      this.bC.a(1, new ceh(this));
      this.bC.a(2, new cqq.a(this, 2.0, 0.35));
      this.bC.a(4, new cem(this, 0.35));
      this.bC.a(8, new cfl(this, 0.35));
      this.bC.a(9, new ceb(this, cqy.class, 3.0F, 1.0F));
      this.bC.a(10, new ceg(this, bxe.class, 8.0F));
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      return null;
   }

   @Override
   public boolean gs() {
      return false;
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if (!$$2.a(czc.uM) && this.bK() && !this.gq() && !this.n_()) {
         if ($$1 == bua.a) {
            $$0.a(awx.S);
         }

         if (!this.dV().C) {
            if (this.gr().isEmpty()) {
               return bub.c;
            }

            this.a($$0);
            this.a($$0, this.m_(), 1);
         }

         return bub.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gw() {
      if (this.dV().K().b(cuj.b)) {
         this.gz();
      } else {
         cqo.g[] $$0 = (cqo.g[])cqo.b.get(1);
         cqo.g[] $$1 = (cqo.g[])cqo.b.get(2);
         if ($$0 != null && $$1 != null) {
            dhu $$2 = this.gr();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            cqo.g $$4 = $$1[$$3];
            dht $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gz() {
      dhu $$0 = this.gr();

      for (Pair<cqo.g[], Integer> $$1 : cqo.d) {
         cqo.g[] $$2 = (cqo.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bJ);
      if (this.bI != null) {
         $$0.a("wander_target", uo.a(this.bI));
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bJ = $$0.h("DespawnDelay");
      }

      uo.a($$0, "wander_target").ifPresent($$0x -> this.bI = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dht $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dV().b(new bwr(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   protected awm u() {
      return this.gq() ? awn.CF : awn.Cx;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.CC;
   }

   @Override
   protected awm l_() {
      return awn.Cy;
   }

   @Override
   public awm k(cyy $$0) {
      return $$0.a(czc.rr) ? awn.CA : awn.CB;
   }

   @Override
   protected awm w(boolean $$0) {
      return $$0 ? awn.CG : awn.CD;
   }

   @Override
   public awm gt() {
      return awn.CG;
   }

   public void t(int $$0) {
      this.bJ = $$0;
   }

   public int gy() {
      return this.bJ;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.gA();
      }
   }

   private void gA() {
      if (this.bJ > 0 && !this.gq() && --this.bJ == 0) {
         this.at();
      }
   }

   public void h(@Nullable iu $$0) {
      this.bI = $$0;
   }

   @Nullable
   iu gC() {
      return this.bI;
   }

   class a extends cdy {
      final cqq a;
      final double b;
      final double c;

      a(final cqq $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cqq.this.bB.m();
      }

      @Override
      public boolean b() {
         iu $$0 = this.a.gC();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         iu $$0 = this.a.gC();
         if ($$0 != null && cqq.this.bB.k()) {
            if (this.a($$0, 10.0)) {
               fei $$1 = new fei((double)$$0.u() - this.a.dA(), (double)$$0.v() - this.a.dC(), (double)$$0.w() - this.a.dG()).d();
               fei $$2 = $$1.c(10.0).b(this.a.dA(), this.a.dC(), this.a.dG());
               cqq.this.bB.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cqq.this.bB.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(iu $$0, double $$1) {
         return !$$0.a(this.a.dt(), $$1);
      }
   }
}
