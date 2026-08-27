import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cek extends cdz {
   private static final int bV = 5;
   @Nullable
   private hv bW;
   private int bX;

   public cek(blj<? extends cek> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsl(this));
      this.bO.a(0, new buc<>(this, cog.a(new cmh(cmk.sh), coh.i), arc.An, $$0 -> this.dM().P() && !$$0.ce()));
      this.bO.a(0, new buc<>(this, new cmh(cmk.qB), arc.As, $$0 -> this.dM().O() && $$0.ce()));
      this.bO.a(1, new bua(this));
      this.bO.a(1, new bry<>(this, ccs.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bry<>(this, cbs.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bry<>(this, cco.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bry<>(this, ccn.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bry<>(this, ccc.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bry<>(this, cbx.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bry<>(this, ccr.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new btk(this, 0.5));
      this.bO.a(1, new bta(this));
      this.bO.a(2, new cek.a(this, 2.0, 0.35));
      this.bO.a(4, new btf(this, 0.35));
      this.bO.a(8, new bue(this, 0.35));
      this.bO.a(9, new bsu(this, cer.class, 3.0F, 1.0F));
      this.bO.a(10, new bsz(this, blx.class, 8.0F));
   }

   @Nullable
   @Override
   public bla a(amp $$0, bla $$1) {
      return null;
   }

   @Override
   public boolean gh() {
      return false;
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if (!$$2.a(cmk.tE) && this.bx() && !this.gf() && !this.o_()) {
         if ($$1 == bjk.a) {
            $$0.a(arm.S);
         }

         if (this.gg().isEmpty()) {
            return bjl.a(this.dM().B);
         } else {
            if (!this.dM().B) {
               this.f($$0);
               this.a($$0, this.Q_(), 1);
            }

            return bjl.a(this.dM().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gl() {
      if (this.dM().H().b(chd.d)) {
         this.go();
      } else {
         cei.g[] $$0 = (cei.g[])cei.b.get(1);
         cei.g[] $$1 = (cei.g[])cei.b.get(2);
         if ($$0 != null && $$1 != null) {
            crx $$2 = this.gg();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cei.g $$4 = $$1[$$3];
            crw $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void go() {
      crx $$0 = this.gg();

      for (Pair<cei.g[], Integer> $$1 : cei.d) {
         cei.g[] $$2 = (cei.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", sy.a(this.bW));
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = sy.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(crw $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dM().b(new bll(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   @Override
   protected arb y() {
      return this.gf() ? arc.At : arc.Al;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.Aq;
   }

   @Override
   protected arb n_() {
      return arc.Am;
   }

   @Override
   protected arb c(cmh $$0) {
      return $$0.a(cmk.qB) ? arc.Ao : arc.Ap;
   }

   @Override
   protected arb w(boolean $$0) {
      return $$0 ? arc.Au : arc.Ar;
   }

   @Override
   public arb gi() {
      return arc.Au;
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

   public void i(@Nullable hv $$0) {
      this.bW = $$0;
   }

   @Nullable
   hv gr() {
      return this.bW;
   }

   class a extends bsr {
      final cek a;
      final double b;
      final double c;

      a(cek $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cek.this.bN.n();
      }

      @Override
      public boolean a() {
         hv $$0 = this.a.gr();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         hv $$0 = this.a.gr();
         if ($$0 != null && cek.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               elb $$1 = new elb((double)$$0.u() - this.a.dr(), (double)$$0.v() - this.a.dt(), (double)$$0.w() - this.a.dx()).d();
               elb $$2 = $$1.a(10.0).b(this.a.dr(), this.a.dt(), this.a.dx());
               cek.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cek.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(hv $$0, double $$1) {
         return !$$0.a(this.a.dk(), $$1);
      }
   }
}
