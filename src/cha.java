import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cha extends cgp {
   private static final int bV = 5;
   @Nullable
   private hz bW;
   private int bX;

   public cha(bnu<? extends cha> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new buv(this));
      this.bO.a(0, new bwm<>(this, cqx.a(new coz(cpc.sj), cqy.i), atk.AC, $$0 -> this.dM().Q() && !$$0.ce()));
      this.bO.a(0, new bwm<>(this, new coz(cpc.qD), atk.AH, $$0 -> this.dM().P() && $$0.ce()));
      this.bO.a(1, new bwk(this));
      this.bO.a(1, new bui<>(this, cfg.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bui<>(this, ceg.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bui<>(this, cfc.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bui<>(this, cfb.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bui<>(this, ceq.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bui<>(this, cel.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bui<>(this, cff.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bvu(this, 0.5));
      this.bO.a(1, new bvk(this));
      this.bO.a(2, new cha.a(this, 2.0, 0.35));
      this.bO.a(4, new bvp(this, 0.35));
      this.bO.a(8, new bwo(this, 0.35));
      this.bO.a(9, new bve(this, chh.class, 3.0F, 1.0F));
      this.bO.a(10, new bvj(this, boi.class, 8.0F));
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      return null;
   }

   @Override
   public boolean gj() {
      return false;
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if (!$$2.a(cpc.tH) && this.bx() && !this.gh() && !this.o_()) {
         if ($$1 == blt.a) {
            $$0.a(atu.S);
         }

         if (this.gi().isEmpty()) {
            return blu.a(this.dM().B);
         } else {
            if (!this.dM().B) {
               this.f($$0);
               this.a($$0, this.Q_(), 1);
            }

            return blu.a(this.dM().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gn() {
      if (this.dM().I().b(cju.d)) {
         this.gq();
      } else {
         cgy.g[] $$0 = (cgy.g[])cgy.b.get(1);
         cgy.g[] $$1 = (cgy.g[])cgy.b.get(2);
         if ($$0 != null && $$1 != null) {
            cum $$2 = this.gi();
            this.a($$2, $$0, 5);
            int $$3 = this.af.a($$1.length);
            cgy.g $$4 = $$1[$$3];
            cul $$5 = $$4.a(this, this.af);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gq() {
      cum $$0 = this.gi();

      for (Pair<cgy.g[], Integer> $$1 : cgy.d) {
         cgy.g[] $$2 = (cgy.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", tl.a(this.bW));
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = tl.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(cul $$0) {
      if ($$0.t()) {
         int $$1 = 3 + this.af.a(4);
         this.dM().b(new bnw(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   @Override
   protected atj y() {
      return this.gh() ? atk.AI : atk.AA;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.AF;
   }

   @Override
   protected atj n_() {
      return atk.AB;
   }

   @Override
   protected atj c(coz $$0) {
      return $$0.a(cpc.qD) ? atk.AD : atk.AE;
   }

   @Override
   protected atj w(boolean $$0) {
      return $$0 ? atk.AJ : atk.AG;
   }

   @Override
   public atj gk() {
      return atk.AJ;
   }

   public void v(int $$0) {
      this.bX = $$0;
   }

   public int gp() {
      return this.bX;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         this.gr();
      }
   }

   private void gr() {
      if (this.bX > 0 && !this.gh() && --this.bX == 0) {
         this.am();
      }
   }

   public void i(@Nullable hz $$0) {
      this.bW = $$0;
   }

   @Nullable
   hz gt() {
      return this.bW;
   }

   class a extends bvb {
      final cha a;
      final double b;
      final double c;

      a(cha $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cha.this.bN.n();
      }

      @Override
      public boolean a() {
         hz $$0 = this.a.gt();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         hz $$0 = this.a.gt();
         if ($$0 != null && cha.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               ens $$1 = new ens((double)$$0.u() - this.a.dr(), (double)$$0.v() - this.a.dt(), (double)$$0.w() - this.a.dx()).d();
               ens $$2 = $$1.a(10.0).b(this.a.dr(), this.a.dt(), this.a.dx());
               cha.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cha.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(hz $$0, double $$1) {
         return !$$0.a(this.a.dk(), $$1);
      }
   }
}
