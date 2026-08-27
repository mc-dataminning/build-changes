import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cfa extends cep {
   private static final int bV = 5;
   @Nullable
   private hx bW;
   private int bX;

   public cfa(bly<? extends cfa> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bta(this));
      this.bO.a(0, new bur<>(this, cox.a(new cmx(cna.sh), coy.i), arr.An, $$0 -> this.dM().Q() && !$$0.ce()));
      this.bO.a(0, new bur<>(this, new cmx(cna.qB), arr.As, $$0 -> this.dM().P() && $$0.ce()));
      this.bO.a(1, new bup(this));
      this.bO.a(1, new bsn<>(this, cdh.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bsn<>(this, cch.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bsn<>(this, cdd.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bsn<>(this, cdc.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bsn<>(this, ccr.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bsn<>(this, ccm.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bsn<>(this, cdg.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new btz(this, 0.5));
      this.bO.a(1, new btp(this));
      this.bO.a(2, new cfa.a(this, 2.0, 0.35));
      this.bO.a(4, new btu(this, 0.35));
      this.bO.a(8, new but(this, 0.35));
      this.bO.a(9, new btj(this, cfh.class, 3.0F, 1.0F));
      this.bO.a(10, new bto(this, bmm.class, 8.0F));
   }

   @Nullable
   @Override
   public blp a(and $$0, blp $$1) {
      return null;
   }

   @Override
   public boolean gh() {
      return false;
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if (!$$2.a(cna.tE) && this.bx() && !this.gf() && !this.o_()) {
         if ($$1 == bjz.a) {
            $$0.a(asb.S);
         }

         if (this.gg().isEmpty()) {
            return bka.a(this.dM().B);
         } else {
            if (!this.dM().B) {
               this.f($$0);
               this.a($$0, this.Q_(), 1);
            }

            return bka.a(this.dM().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gl() {
      if (this.dM().I().b(cht.d)) {
         this.go();
      } else {
         cey.g[] $$0 = (cey.g[])cey.b.get(1);
         cey.g[] $$1 = (cey.g[])cey.b.get(2);
         if ($$0 != null && $$1 != null) {
            csn $$2 = this.gg();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cey.g $$4 = $$1[$$3];
            csm $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void go() {
      csn $$0 = this.gg();

      for (Pair<cey.g[], Integer> $$1 : cey.d) {
         cey.g[] $$2 = (cey.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", tc.a(this.bW));
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = tc.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(csm $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dM().b(new bma(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   @Override
   protected arq y() {
      return this.gf() ? arr.At : arr.Al;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.Aq;
   }

   @Override
   protected arq n_() {
      return arr.Am;
   }

   @Override
   protected arq c(cmx $$0) {
      return $$0.a(cna.qB) ? arr.Ao : arr.Ap;
   }

   @Override
   protected arq w(boolean $$0) {
      return $$0 ? arr.Au : arr.Ar;
   }

   @Override
   public arq gi() {
      return arr.Au;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int gn() {
      return this.bX;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         this.gp();
      }
   }

   private void gp() {
      if (this.bX > 0 && !this.gf() && --this.bX == 0) {
         this.am();
      }
   }

   public void i(@Nullable hx $$0) {
      this.bW = $$0;
   }

   @Nullable
   hx gr() {
      return this.bW;
   }

   class a extends btg {
      final cfa a;
      final double b;
      final double c;

      a(cfa $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(btg.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cfa.this.bN.n();
      }

      @Override
      public boolean a() {
         hx $$0 = this.a.gr();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         hx $$0 = this.a.gr();
         if ($$0 != null && cfa.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               els $$1 = new els((double)$$0.u() - this.a.dr(), (double)$$0.v() - this.a.dt(), (double)$$0.w() - this.a.dx()).d();
               els $$2 = $$1.a(10.0).b(this.a.dr(), this.a.dt(), this.a.dx());
               cfa.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cfa.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(hx $$0, double $$1) {
         return !$$0.a(this.a.dk(), $$1);
      }
   }
}
