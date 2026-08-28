import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cqk extends cpz implements dax.b {
   private static final int bH = 5;
   @Nullable
   private iu bI;
   private int bJ;

   public cqk(bwj<? extends cqk> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cdp(this));
      this.bC.a(0, new cfg<>(this, dao.a(cyw.tm, dap.g), awl.Cw, $$0 -> this.dV().W() && !$$0.cp()));
      this.bC.a(0, new cfg<>(this, new cys(cyw.rp), awl.CB, $$0 -> this.dV().V() && $$0.cp()));
      this.bC.a(1, new cfe(this));
      this.bC.a(1, new cdc<>(this, com.class, 8.0F, 0.5, 0.5));
      this.bC.a(1, new cdc<>(this, cnm.class, 12.0F, 0.5, 0.5));
      this.bC.a(1, new cdc<>(this, coi.class, 8.0F, 0.5, 0.5));
      this.bC.a(1, new cdc<>(this, coh.class, 8.0F, 0.5, 0.5));
      this.bC.a(1, new cdc<>(this, cnw.class, 15.0F, 0.5, 0.5));
      this.bC.a(1, new cdc<>(this, cnr.class, 12.0F, 0.5, 0.5));
      this.bC.a(1, new cdc<>(this, col.class, 10.0F, 0.5, 0.5));
      this.bC.a(1, new ceo(this, 0.5));
      this.bC.a(1, new cee(this));
      this.bC.a(2, new cqk.a(this, 2.0, 0.35));
      this.bC.a(4, new cej(this, 0.35));
      this.bC.a(8, new cfi(this, 0.35));
      this.bC.a(9, new cdy(this, cqs.class, 3.0F, 1.0F));
      this.bC.a(10, new ced(this, bxb.class, 8.0F));
   }

   @Nullable
   @Override
   public bvq a(aro $$0, bvq $$1) {
      return null;
   }

   @Override
   public boolean gs() {
      return false;
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if (!$$2.a(cyw.uK) && this.bK() && !this.gq() && !this.n_()) {
         if ($$1 == btx.a) {
            $$0.a(awv.S);
         }

         if (!this.dV().C) {
            if (this.gr().isEmpty()) {
               return bty.c;
            }

            this.a($$0);
            this.a($$0, this.m_(), 1);
         }

         return bty.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gw() {
      if (this.dV().K().b(cud.b)) {
         this.gz();
      } else {
         cqi.g[] $$0 = (cqi.g[])cqi.b.get(1);
         cqi.g[] $$1 = (cqi.g[])cqi.b.get(2);
         if ($$0 != null && $$1 != null) {
            dho $$2 = this.gr();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            cqi.g $$4 = $$1[$$3];
            dhn $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gz() {
      dho $$0 = this.gr();

      for (Pair<cqi.g[], Integer> $$1 : cqi.d) {
         cqi.g[] $$2 = (cqi.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bJ);
      if (this.bI != null) {
         $$0.a("wander_target", um.a(this.bI));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bJ = $$0.h("DespawnDelay");
      }

      um.a($$0, "wander_target").ifPresent($$0x -> this.bI = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dhn $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dV().b(new bwo(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   protected awk u() {
      return this.gq() ? awl.CC : awl.Cu;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.Cz;
   }

   @Override
   protected awk l_() {
      return awl.Cv;
   }

   @Override
   public awk k(cys $$0) {
      return $$0.a(cyw.rp) ? awl.Cx : awl.Cy;
   }

   @Override
   protected awk w(boolean $$0) {
      return $$0 ? awl.CD : awl.CA;
   }

   @Override
   public awk gt() {
      return awl.CD;
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

   class a extends cdv {
      final cqk a;
      final double b;
      final double c;

      a(final cqk $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cqk.this.bB.m();
      }

      @Override
      public boolean b() {
         iu $$0 = this.a.gC();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         iu $$0 = this.a.gC();
         if ($$0 != null && cqk.this.bB.k()) {
            if (this.a($$0, 10.0)) {
               fdw $$1 = new fdw((double)$$0.u() - this.a.dA(), (double)$$0.v() - this.a.dC(), (double)$$0.w() - this.a.dG()).d();
               fdw $$2 = $$1.c(10.0).b(this.a.dA(), this.a.dC(), this.a.dG());
               cqk.this.bB.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cqk.this.bB.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(iu $$0, double $$1) {
         return !$$0.a(this.a.dt(), $$1);
      }
   }
}
