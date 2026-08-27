import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cjt extends cji {
   private static final int bZ = 5;
   @Nullable
   private id ca;
   private int cb;

   public cjt(bqg<? extends cjt> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxk(this));
      this.bR.a(0, new bzb<>(this, ctq.a(crv.sj, ctr.g), auo.Bb, $$0 -> this.dM().R() && !$$0.ce()));
      this.bR.a(0, new bzb<>(this, new crs(crv.qD), auo.Bg, $$0 -> this.dM().Q() && $$0.ce()));
      this.bR.a(1, new byz(this));
      this.bR.a(1, new bwx<>(this, chz.class, 8.0F, 0.5, 0.5));
      this.bR.a(1, new bwx<>(this, cgz.class, 12.0F, 0.5, 0.5));
      this.bR.a(1, new bwx<>(this, chv.class, 8.0F, 0.5, 0.5));
      this.bR.a(1, new bwx<>(this, chu.class, 8.0F, 0.5, 0.5));
      this.bR.a(1, new bwx<>(this, chj.class, 15.0F, 0.5, 0.5));
      this.bR.a(1, new bwx<>(this, che.class, 12.0F, 0.5, 0.5));
      this.bR.a(1, new bwx<>(this, chy.class, 10.0F, 0.5, 0.5));
      this.bR.a(1, new byj(this, 0.5));
      this.bR.a(1, new bxz(this));
      this.bR.a(2, new cjt.a(this, 2.0, 0.35));
      this.bR.a(4, new bye(this, 0.35));
      this.bR.a(8, new bzd(this, 0.35));
      this.bR.a(9, new bxt(this, cka.class, 3.0F, 1.0F));
      this.bR.a(10, new bxy(this, bqv.class, 8.0F));
   }

   @Nullable
   @Override
   public bpu a(apu $$0, bpu $$1) {
      return null;
   }

   @Override
   public boolean gq() {
      return false;
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if (!$$2.a(crv.tI) && this.bA() && !this.go() && !this.p_()) {
         if ($$1 == boe.a) {
            $$0.a(auz.S);
         }

         if (this.gp().isEmpty()) {
            return bof.a(this.dM().B);
         } else {
            if (!this.dM().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bof.a(this.dM().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gu() {
      if (this.dM().J().b(cmp.d)) {
         this.gx();
      } else {
         cjr.g[] $$0 = (cjr.g[])cjr.b.get(1);
         cjr.g[] $$1 = (cjr.g[])cjr.b.get(2);
         if ($$0 != null && $$1 != null) {
            cyf $$2 = this.gp();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cjr.g $$4 = $$1[$$3];
            cye $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gx() {
      cyf $$0 = this.gp();

      for (Pair<cjr.g[], Integer> $$1 : cjr.d) {
         cjr.g[] $$2 = (cjr.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cb);
      if (this.ca != null) {
         $$0.a("wander_target", ud.a(this.ca));
      }
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cb = $$0.h("DespawnDelay");
      }

      ud.a($$0, "wander_target").ifPresent($$0x -> this.ca = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(cye $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ag.a(4);
         this.dM().b(new bqj(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   @Override
   protected aun v() {
      return this.go() ? auo.Bh : auo.AZ;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.Be;
   }

   @Override
   protected aun o_() {
      return auo.Ba;
   }

   @Override
   protected aun c(crs $$0) {
      return $$0.a(crv.qD) ? auo.Bc : auo.Bd;
   }

   @Override
   protected aun w(boolean $$0) {
      return $$0 ? auo.Bi : auo.Bf;
   }

   @Override
   public aun gr() {
      return auo.Bi;
   }

   public void v(int $$0) {
      this.cb = $$0;
   }

   public int gw() {
      return this.cb;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dM().B) {
         this.gy();
      }
   }

   private void gy() {
      if (this.cb > 0 && !this.go() && --this.cb == 0) {
         this.am();
      }
   }

   public void i(@Nullable id $$0) {
      this.ca = $$0;
   }

   @Nullable
   id gA() {
      return this.ca;
   }

   class a extends bxq {
      final cjt a;
      final double b;
      final double c;

      a(cjt $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bxq.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cjt.this.bQ.n();
      }

      @Override
      public boolean a() {
         id $$0 = this.a.gA();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         id $$0 = this.a.gA();
         if ($$0 != null && cjt.this.bQ.l()) {
            if (this.a($$0, 10.0)) {
               esj $$1 = new esj((double)$$0.u() - this.a.dr(), (double)$$0.v() - this.a.dt(), (double)$$0.w() - this.a.dx()).d();
               esj $$2 = $$1.a(10.0).b(this.a.dr(), this.a.dt(), this.a.dx());
               cjt.this.bQ.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cjt.this.bQ.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(id $$0, double $$1) {
         return !$$0.a(this.a.dk(), $$1);
      }
   }
}
