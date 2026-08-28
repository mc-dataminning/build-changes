import java.util.Optional;
import javax.annotation.Nullable;

public class cmo extends bvs implements bxp {
   private static final akg<Integer> b = akk.a(cmo.class, aki.b);
   private static final akg<dym> c = akk.a(cmo.class, aki.i);
   private static final int d = 80;
   private static final float e = 4.0F;
   private static final String f = "block_state";
   public static final String a = "fuse";
   private static final String g = "explosion_power";
   private static final dhj h = new dhj() {
      @Override
      public boolean a(dhi $$0, dgv $$1, jj $$2, dym $$3, float $$4) {
         return $$3.a(dkw.eq) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(dhi $$0, dgv $$1, jj $$2, dym $$3, eut $$4) {
         return $$3.a(dkw.eq) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bwr i;
   private boolean j;
   private float k = 4.0F;

   public cmo(bwb<? extends cmo> $$0, dhp $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cmo(dhp $$0, double $$1, double $$2, double $$3, @Nullable bwr $$4) {
      this(bwb.bv, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.A.j() * (float) (Math.PI * 2);
      this.n(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.i = $$4;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, dkw.cr.m());
   }

   @Override
   protected bvs.d bg() {
      return bvs.d.a;
   }

   @Override
   public boolean bG() {
      return !this.dQ();
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   @Override
   public void h() {
      this.bW();
      this.bf();
      this.a(bwv.a, this.dy());
      this.aK();
      this.i(this.dy().c(0.98));
      if (this.aJ()) {
         this.i(this.dy().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.g() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.at();
         if (!this.dV().C) {
            this.m();
         }
      } else {
         this.bp();
         if (this.dV().C) {
            this.dV().a(lv.ah, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void m() {
      this.dV().a(this, dhi.a(this.dV(), this), this.j ? h : null, this.dA(), this.e(0.0625), this.dG(), this.k, false, dhp.a.d);
   }

   @Override
   protected void b(tw $$0) {
      $$0.a("fuse", (short)this.g());
      $$0.a("block_state", ul.a(this.j()));
      if (this.k != 4.0F) {
         $$0.a("explosion_power", this.k);
      }
   }

   @Override
   protected void a(tw $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(ul.a(this.dV().a(me.f), $$0.p("block_state")));
      }

      if ($$0.b("explosion_power", 99)) {
         this.k = azk.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Nullable
   public bwr f() {
      return this.i;
   }

   @Override
   public void x(bvs $$0) {
      super.x($$0);
      if ($$0 instanceof cmo $$1) {
         this.i = $$1.i;
      }
   }

   public void b(int $$0) {
      this.al.a(b, $$0);
   }

   public int g() {
      return this.al.a(b);
   }

   public void c(dym $$0) {
      this.al.a(c, $$0);
   }

   public dym j() {
      return this.al.a(c);
   }

   private void a(boolean $$0) {
      this.j = $$0;
   }

   @Nullable
   @Override
   public bvs b(evt $$0) {
      bvs $$1 = super.b($$0);
      if ($$1 instanceof cmo $$2) {
         $$2.a(true);
      }

      return $$1;
   }

   @Override
   public final boolean a(arn $$0, buh $$1, float $$2) {
      return false;
   }
}
