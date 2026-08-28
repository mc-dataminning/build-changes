import java.util.Optional;
import javax.annotation.Nullable;

public class cji extends bsr implements bun {
   private static final ajw<Integer> c = aka.a(cji.class, ajy.b);
   private static final ajw<dtc> d = aka.a(cji.class, ajy.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   private static final dcp g = new dcp() {
      @Override
      public boolean a(dco $$0, dcc $$1, jd $$2, dtc $$3, float $$4) {
         return $$3.a(dga.ed) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(dco $$0, dcc $$1, jd $$2, dtc $$3, epe $$4) {
         return $$3.a(dga.ed) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private btn h;
   private boolean i;

   public cji(bsx<? extends cji> $$0, dcw $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cji(dcw $$0, double $$1, double $$2, double $$3, @Nullable btn $$4) {
      this(bsx.bc, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.z.j() * (float) (Math.PI * 2);
      this.n(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.h = $$4;
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dga.ck.o());
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.a;
   }

   @Override
   public boolean bA() {
      return !this.dJ();
   }

   @Override
   protected double aZ() {
      return 0.04;
   }

   @Override
   public void l() {
      this.bP();
      this.bb();
      this.a(bts.a, this.dr());
      this.i(this.dr().a(0.98));
      if (this.aF()) {
         this.i(this.dr().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.t() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.aq();
         if (!this.dO().B) {
            this.w();
         }
      } else {
         this.bm();
         if (this.dO().B) {
            this.dO().a(lm.ae, this.dt(), this.dv() + 0.5, this.dz(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dO().a(this, dco.a(this.dO(), this), this.i ? g : null, this.dt(), this.e(0.0625), this.dz(), 4.0F, false, dcw.a.d);
   }

   @Override
   protected void b(ub $$0) {
      $$0.a("fuse", (short)this.t());
      $$0.a("block_state", uq.a(this.v()));
   }

   @Override
   protected void a(ub $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(uq.a(this.dO().a(lu.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public btn p() {
      return this.h;
   }

   @Override
   public void w(bsr $$0) {
      super.w($$0);
      if ($$0 instanceof cji $$1) {
         this.h = $$1.h;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int t() {
      return this.ao.a(c);
   }

   public void c(dtc $$0) {
      this.ao.a(d, $$0);
   }

   public dtc v() {
      return this.ao.a(d);
   }

   private void a(boolean $$0) {
      this.i = $$0;
   }

   @Nullable
   @Override
   public bsr a(eqc $$0) {
      bsr $$1 = super.a($$0);
      if ($$1 instanceof cji $$2) {
         $$2.a(true);
      }

      return $$1;
   }
}
