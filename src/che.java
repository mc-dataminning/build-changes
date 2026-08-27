import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class che extends cgt {
   private static final int bV = 5;
   @Nullable
   private hz bW;
   private int bX;

   public che(bnw<? extends che> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new buz(this));
      this.bO.a(0, new bwq<>(this, crb.a(new cpd(cpg.sj), crc.i), atl.AD, $$0 -> this.dM().Q() && !$$0.ce()));
      this.bO.a(0, new bwq<>(this, new cpd(cpg.qD), atl.AI, $$0 -> this.dM().P() && $$0.ce()));
      this.bO.a(1, new bwo(this));
      this.bO.a(1, new bum<>(this, cfk.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bum<>(this, cek.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bum<>(this, cfg.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bum<>(this, cff.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bum<>(this, ceu.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bum<>(this, cep.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bum<>(this, cfj.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bvy(this, 0.5));
      this.bO.a(1, new bvo(this));
      this.bO.a(2, new che.a(this, 2.0, 0.35));
      this.bO.a(4, new bvt(this, 0.35));
      this.bO.a(8, new bws(this, 0.35));
      this.bO.a(9, new bvi(this, chl.class, 3.0F, 1.0F));
      this.bO.a(10, new bvn(this, bok.class, 8.0F));
   }

   @Nullable
   @Override
   public bnl a(aow $$0, bnl $$1) {
      return null;
   }

   @Override
   public boolean gj() {
      return false;
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if (!$$2.a(cpg.tH) && this.bx() && !this.gh() && !this.o_()) {
         if ($$1 == blv.a) {
            $$0.a(atv.S);
         }

         if (this.gi().isEmpty()) {
            return blw.a(this.dM().B);
         } else {
            if (!this.dM().B) {
               this.f($$0);
               this.a($$0, this.Q_(), 1);
            }

            return blw.a(this.dM().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gn() {
      if (this.dM().I().b(cjy.d)) {
         this.gq();
      } else {
         chc.g[] $$0 = (chc.g[])chc.b.get(1);
         chc.g[] $$1 = (chc.g[])chc.b.get(2);
         if ($$0 != null && $$1 != null) {
            cuq $$2 = this.gi();
            this.a($$2, $$0, 5);
            int $$3 = this.af.a($$1.length);
            chc.g $$4 = $$1[$$3];
            cup $$5 = $$4.a(this, this.af);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gq() {
      cuq $$0 = this.gi();

      for (Pair<chc.g[], Integer> $$1 : chc.d) {
         chc.g[] $$2 = (chc.g[])$$1.getLeft();
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
   protected void b(cup $$0) {
      if ($$0.t()) {
         int $$1 = 3 + this.af.a(4);
         this.dM().b(new bny(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   @Override
   protected atk y() {
      return this.gh() ? atl.AJ : atl.AB;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.AG;
   }

   @Override
   protected atk n_() {
      return atl.AC;
   }

   @Override
   protected atk c(cpd $$0) {
      return $$0.a(cpg.qD) ? atl.AE : atl.AF;
   }

   @Override
   protected atk w(boolean $$0) {
      return $$0 ? atl.AK : atl.AH;
   }

   @Override
   public atk gk() {
      return atl.AK;
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

   class a extends bvf {
      final che a;
      final double b;
      final double c;

      a(che $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bvf.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         che.this.bN.n();
      }

      @Override
      public boolean a() {
         hz $$0 = this.a.gt();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         hz $$0 = this.a.gt();
         if ($$0 != null && che.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               enz $$1 = new enz((double)$$0.u() - this.a.dr(), (double)$$0.v() - this.a.dt(), (double)$$0.w() - this.a.dx()).d();
               enz $$2 = $$1.a(10.0).b(this.a.dr(), this.a.dt(), this.a.dx());
               che.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               che.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(hz $$0, double $$1) {
         return !$$0.a(this.a.dk(), $$1);
      }
   }
}
