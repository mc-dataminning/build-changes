import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cfb extends ceq {
   private static final int bV = 5;
   @Nullable
   private hx bW;
   private int bX;

   public cfb(blz<? extends cfb> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new btb(this));
      this.bO.a(0, new bus<>(this, coy.a(new cmy(cnb.sh), coz.i), ars.An, $$0 -> this.dM().Q() && !$$0.ce()));
      this.bO.a(0, new bus<>(this, new cmy(cnb.qB), ars.As, $$0 -> this.dM().P() && $$0.ce()));
      this.bO.a(1, new buq(this));
      this.bO.a(1, new bso<>(this, cdi.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bso<>(this, cci.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bso<>(this, cde.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bso<>(this, cdd.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bso<>(this, ccs.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bso<>(this, ccn.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bso<>(this, cdh.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bua(this, 0.5));
      this.bO.a(1, new btq(this));
      this.bO.a(2, new cfb.a(this, 2.0, 0.35));
      this.bO.a(4, new btv(this, 0.35));
      this.bO.a(8, new buu(this, 0.35));
      this.bO.a(9, new btk(this, cfi.class, 3.0F, 1.0F));
      this.bO.a(10, new btp(this, bmn.class, 8.0F));
   }

   @Nullable
   @Override
   public blq a(and $$0, blq $$1) {
      return null;
   }

   @Override
   public boolean gh() {
      return false;
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if (!$$2.a(cnb.tE) && this.bx() && !this.gf() && !this.o_()) {
         if ($$1 == bka.a) {
            $$0.a(asc.S);
         }

         if (this.gg().isEmpty()) {
            return bkb.a(this.dM().B);
         } else {
            if (!this.dM().B) {
               this.f($$0);
               this.a($$0, this.Q_(), 1);
            }

            return bkb.a(this.dM().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gl() {
      if (this.dM().I().b(chu.d)) {
         this.go();
      } else {
         cez.g[] $$0 = (cez.g[])cez.b.get(1);
         cez.g[] $$1 = (cez.g[])cez.b.get(2);
         if ($$0 != null && $$1 != null) {
            cso $$2 = this.gg();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cez.g $$4 = $$1[$$3];
            csn $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void go() {
      cso $$0 = this.gg();

      for (Pair<cez.g[], Integer> $$1 : cez.d) {
         cez.g[] $$2 = (cez.g[])$$1.getLeft();
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
   protected void b(csn $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dM().b(new bmb(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   @Override
   protected arr y() {
      return this.gf() ? ars.At : ars.Al;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.Aq;
   }

   @Override
   protected arr n_() {
      return ars.Am;
   }

   @Override
   protected arr c(cmy $$0) {
      return $$0.a(cnb.qB) ? ars.Ao : ars.Ap;
   }

   @Override
   protected arr w(boolean $$0) {
      return $$0 ? ars.Au : ars.Ar;
   }

   @Override
   public arr gi() {
      return ars.Au;
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

   class a extends bth {
      final cfb a;
      final double b;
      final double c;

      a(cfb $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bth.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cfb.this.bN.n();
      }

      @Override
      public boolean a() {
         hx $$0 = this.a.gr();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         hx $$0 = this.a.gr();
         if ($$0 != null && cfb.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               elt $$1 = new elt((double)$$0.u() - this.a.dr(), (double)$$0.v() - this.a.dt(), (double)$$0.w() - this.a.dx()).d();
               elt $$2 = $$1.a(10.0).b(this.a.dr(), this.a.dt(), this.a.dx());
               cfb.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cfb.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(hx $$0, double $$1) {
         return !$$0.a(this.a.dk(), $$1);
      }
   }
}
