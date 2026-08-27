import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cla extends ckp {
   private static final int ca = 5;
   @Nullable
   private in cb;
   private int cc;

   public cla(brn<? extends cla> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new byr(this));
      this.bS.a(0, new cai<>(this, cuy.a(ctc.sk, cuz.g), avc.Bj, $$0 -> this.dN().R() && !$$0.cf()));
      this.bS.a(0, new cai<>(this, new csz(ctc.qE), avc.Bo, $$0 -> this.dN().Q() && $$0.cf()));
      this.bS.a(1, new cag(this));
      this.bS.a(1, new bye<>(this, cjg.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bye<>(this, cig.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bye<>(this, cjc.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bye<>(this, cjb.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bye<>(this, ciq.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new bye<>(this, cil.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bye<>(this, cjf.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new bzq(this, 0.5));
      this.bS.a(1, new bzg(this));
      this.bS.a(2, new cla.a(this, 2.0, 0.35));
      this.bS.a(4, new bzl(this, 0.35));
      this.bS.a(8, new cak(this, 0.35));
      this.bS.a(9, new bza(this, clh.class, 3.0F, 1.0F));
      this.bS.a(10, new bzf(this, bsc.class, 8.0F));
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      return null;
   }

   @Override
   public boolean gs() {
      return false;
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if (!$$2.a(ctc.tJ) && this.bB() && !this.gq() && !this.p_()) {
         if ($$1 == bpl.a) {
            $$0.a(avm.S);
         }

         if (this.gr().isEmpty()) {
            return bpm.a(this.dN().B);
         } else {
            if (!this.dN().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bpm.a(this.dN().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gw() {
      if (this.dN().J().b(cnw.d)) {
         this.gz();
      } else {
         cky.g[] $$0 = (cky.g[])cky.b.get(1);
         cky.g[] $$1 = (cky.g[])cky.b.get(2);
         if ($$0 != null && $$1 != null) {
            czc $$2 = this.gr();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            cky.g $$4 = $$1[$$3];
            czb $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gz() {
      czc $$0 = this.gr();

      for (Pair<cky.g[], Integer> $$1 : cky.d) {
         cky.g[] $$2 = (cky.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", up.a(this.cb));
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      up.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(czb $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dN().b(new brq(this.dN(), this.ds(), this.du() + 0.5, this.dy(), $$1));
      }
   }

   @Override
   protected avb v() {
      return this.gq() ? avc.Bp : avc.Bh;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.Bm;
   }

   @Override
   protected avb o_() {
      return avc.Bi;
   }

   @Override
   protected avb c(csz $$0) {
      return $$0.a(ctc.qE) ? avc.Bk : avc.Bl;
   }

   @Override
   protected avb w(boolean $$0) {
      return $$0 ? avc.Bq : avc.Bn;
   }

   @Override
   public avb gt() {
      return avc.Bq;
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

   public void i(@Nullable in $$0) {
      this.cb = $$0;
   }

   @Nullable
   in gC() {
      return this.cb;
   }

   class a extends byx {
      final cla a;
      final double b;
      final double c;

      a(cla $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(byx.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cla.this.bR.n();
      }

      @Override
      public boolean a() {
         in $$0 = this.a.gC();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         in $$0 = this.a.gC();
         if ($$0 != null && cla.this.bR.l()) {
            if (this.a($$0, 10.0)) {
               etp $$1 = new etp((double)$$0.u() - this.a.ds(), (double)$$0.v() - this.a.du(), (double)$$0.w() - this.a.dy()).d();
               etp $$2 = $$1.a(10.0).b(this.a.ds(), this.a.du(), this.a.dy());
               cla.this.bR.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cla.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(in $$0, double $$1) {
         return !$$0.a(this.a.dl(), $$1);
      }
   }
}
