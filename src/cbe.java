import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cbe extends cat {
   private static final int bV = 5;
   @Nullable
   private gv bW;
   private int bX;

   public cbe(bik<? extends cbe> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpm(this));
      this.bO.a(0, new brd<>(this, ckv.a(new ciw(ciz.rv), ckw.i), aou.zi, $$0 -> this.dK().O() && !$$0.cd()));
      this.bO.a(0, new brd<>(this, new ciw(ciz.pQ), aou.zn, $$0 -> this.dK().N() && $$0.cd()));
      this.bO.a(1, new brb(this));
      this.bO.a(1, new boz<>(this, bzs.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new boz<>(this, bys.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new boz<>(this, bzo.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new boz<>(this, bzn.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new boz<>(this, bzc.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new boz<>(this, byx.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new boz<>(this, bzr.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bql(this, 0.5));
      this.bO.a(1, new bqb(this));
      this.bO.a(2, new cbe.a(this, 2.0, 0.35));
      this.bO.a(4, new bqg(this, 0.35));
      this.bO.a(8, new brf(this, 0.35));
      this.bO.a(9, new bpv(this, cbl.class, 3.0F, 1.0F));
      this.bO.a(10, new bqa(this, biy.class, 8.0F));
   }

   @Nullable
   @Override
   public bib a(aki $$0, bib $$1) {
      return null;
   }

   @Override
   public boolean gc() {
      return false;
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if (!$$2.a(ciz.sR) && this.bv() && !this.ga() && !this.i_()) {
         if ($$1 == bgn.a) {
            $$0.a(ape.S);
         }

         if (this.gb().isEmpty()) {
            return bgo.a(this.dK().B);
         } else {
            if (!this.dK().B) {
               this.f($$0);
               this.a($$0, this.H_(), 1);
            }

            return bgo.a(this.dK().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gg() {
      if (this.dK().G().b(cdv.c)) {
         this.gj();
      } else {
         cbc.f[] $$0 = (cbc.f[])cbc.b.get(1);
         cbc.f[] $$1 = (cbc.f[])cbc.b.get(2);
         if ($$0 != null && $$1 != null) {
            coi $$2 = this.gb();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cbc.f $$4 = $$1[$$3];
            coh $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gj() {
      coi $$0 = this.gb();

      for (Pair<cbc.f[], Integer> $$1 : cbc.d) {
         cbc.f[] $$2 = (cbc.f[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", re.a(this.bW));
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = re.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(coh $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dK().b(new bim(this.dK(), this.dp(), this.dr() + 0.5, this.dv(), $$1));
      }
   }

   @Override
   protected aot r() {
      return this.ga() ? aou.zo : aou.zg;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.zl;
   }

   @Override
   protected aot h_() {
      return aou.zh;
   }

   @Override
   protected aot c(ciw $$0) {
      return $$0.a(ciz.pQ) ? aou.zj : aou.zk;
   }

   @Override
   protected aot w(boolean $$0) {
      return $$0 ? aou.zp : aou.zm;
   }

   @Override
   public aot gd() {
      return aou.zp;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int gi() {
      return this.bX;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         this.gk();
      }
   }

   private void gk() {
      if (this.bX > 0 && !this.ga() && --this.bX == 0) {
         this.ak();
      }
   }

   public void i(@Nullable gv $$0) {
      this.bW = $$0;
   }

   @Nullable
   gv gm() {
      return this.bW;
   }

   class a extends bps {
      final cbe a;
      final double b;
      final double c;

      a(cbe $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cbe.this.bN.n();
      }

      @Override
      public boolean a() {
         gv $$0 = this.a.gm();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         gv $$0 = this.a.gm();
         if ($$0 != null && cbe.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               ehf $$1 = new ehf((double)$$0.u() - this.a.dp(), (double)$$0.v() - this.a.dr(), (double)$$0.w() - this.a.dv()).d();
               ehf $$2 = $$1.a(10.0).b(this.a.dp(), this.a.dr(), this.a.dv());
               cbe.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cbe.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(gv $$0, double $$1) {
         return !$$0.a(this.a.di(), $$1);
      }
   }
}
