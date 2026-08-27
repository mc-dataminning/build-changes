import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cke extends cjt {
   private static final int ca = 5;
   @Nullable
   private im cb;
   private int cc;

   public cke(bqr<? extends cke> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bxv(this));
      this.bS.a(0, new bzm<>(this, cuc.a(csg.sk, cud.g), auz.Bi, $$0 -> this.dN().R() && !$$0.cf()));
      this.bS.a(0, new bzm<>(this, new csd(csg.qE), auz.Bn, $$0 -> this.dN().Q() && $$0.cf()));
      this.bS.a(1, new bzk(this));
      this.bS.a(1, new bxi<>(this, cik.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bxi<>(this, chk.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bxi<>(this, cig.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bxi<>(this, cif.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bxi<>(this, chu.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new bxi<>(this, chp.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bxi<>(this, cij.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new byu(this, 0.5));
      this.bS.a(1, new byk(this));
      this.bS.a(2, new cke.a(this, 2.0, 0.35));
      this.bS.a(4, new byp(this, 0.35));
      this.bS.a(8, new bzo(this, 0.35));
      this.bS.a(9, new bye(this, ckl.class, 3.0F, 1.0F));
      this.bS.a(10, new byj(this, brg.class, 8.0F));
   }

   @Nullable
   @Override
   public bqf a(aqe $$0, bqf $$1) {
      return null;
   }

   @Override
   public boolean gs() {
      return false;
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if (!$$2.a(csg.tJ) && this.bB() && !this.gq() && !this.p_()) {
         if ($$1 == bop.a) {
            $$0.a(avj.S);
         }

         if (this.gr().isEmpty()) {
            return boq.a(this.dN().B);
         } else {
            if (!this.dN().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return boq.a(this.dN().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gw() {
      if (this.dN().J().b(cna.d)) {
         this.gz();
      } else {
         ckc.g[] $$0 = (ckc.g[])ckc.b.get(1);
         ckc.g[] $$1 = (ckc.g[])ckc.b.get(2);
         if ($$0 != null && $$1 != null) {
            cyt $$2 = this.gr();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            ckc.g $$4 = $$1[$$3];
            cys $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gz() {
      cyt $$0 = this.gr();

      for (Pair<ckc.g[], Integer> $$1 : ckc.d) {
         ckc.g[] $$2 = (ckc.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", un.a(this.cb));
      }
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      un.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(cys $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dN().b(new bqu(this.dN(), this.ds(), this.du() + 0.5, this.dy(), $$1));
      }
   }

   @Override
   protected auy v() {
      return this.gq() ? auz.Bo : auz.Bg;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.Bl;
   }

   @Override
   protected auy o_() {
      return auz.Bh;
   }

   @Override
   protected auy c(csd $$0) {
      return $$0.a(csg.qE) ? auz.Bj : auz.Bk;
   }

   @Override
   protected auy w(boolean $$0) {
      return $$0 ? auz.Bp : auz.Bm;
   }

   @Override
   public auy gt() {
      return auz.Bp;
   }

   public void v(int $$0) {
      this.cc = $$0;
   }

   public int gy() {
      return this.cc;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dN().B) {
         this.gA();
      }
   }

   private void gA() {
      if (this.cc > 0 && !this.gq() && --this.cc == 0) {
         this.am();
      }
   }

   public void i(@Nullable im $$0) {
      this.cb = $$0;
   }

   @Nullable
   im gC() {
      return this.cb;
   }

   class a extends byb {
      final cke a;
      final double b;
      final double c;

      a(cke $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cke.this.bR.n();
      }

      @Override
      public boolean a() {
         im $$0 = this.a.gC();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         im $$0 = this.a.gC();
         if ($$0 != null && cke.this.bR.l()) {
            if (this.a($$0, 10.0)) {
               etf $$1 = new etf((double)$$0.u() - this.a.ds(), (double)$$0.v() - this.a.du(), (double)$$0.w() - this.a.dy()).d();
               etf $$2 = $$1.a(10.0).b(this.a.ds(), this.a.du(), this.a.dy());
               cke.this.bR.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cke.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(im $$0, double $$1) {
         return !$$0.a(this.a.dl(), $$1);
      }
   }
}
