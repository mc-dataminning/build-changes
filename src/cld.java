import java.util.Optional;
import javax.annotation.Nullable;

public class cld extends bul implements bwg {
   private static final ajy<Integer> b = akc.a(cld.class, aka.b);
   private static final ajy<dwx> c = akc.a(cld.class, aka.i);
   private static final int d = 80;
   private static final float e = 4.0F;
   private static final String f = "block_state";
   public static final String a = "fuse";
   private static final String g = "explosion_power";
   private static final dgb h = new dgb() {
      @Override
      public boolean a(dga $$0, dfn $$1, ji $$2, dwx $$3, float $$4) {
         return $$3.a(djo.eq) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(dga $$0, dfn $$1, ji $$2, dwx $$3, esz $$4) {
         return $$3.a(djo.eq) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bvh i;
   private boolean j;
   private float k = 4.0F;

   public cld(bus<? extends cld> $$0, dgi $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cld(dgi $$0, double $$1, double $$2, double $$3, @Nullable bvh $$4) {
      this(bus.bv, $$0);
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
   protected void a(akc.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, djo.cr.m());
   }

   @Override
   protected bul.c bg() {
      return bul.c.a;
   }

   @Override
   public boolean bH() {
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
      this.a(bvl.a, this.dy());
      this.aK();
      this.i(this.dy().c(0.98));
      if (this.aJ()) {
         this.i(this.dy().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.m() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.at();
         if (!this.dV().C) {
            this.t();
         }
      } else {
         this.bq();
         if (this.dV().C) {
            this.dV().a(lt.ag, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void t() {
      this.dV().a(this, dga.a(this.dV(), this), this.j ? h : null, this.dA(), this.e(0.0625), this.dG(), this.k, false, dgi.a.d);
   }

   @Override
   protected void b(tq $$0) {
      $$0.a("fuse", (short)this.m());
      $$0.a("block_state", uf.a(this.s()));
      if (this.k != 4.0F) {
         $$0.a("explosion_power", this.k);
      }
   }

   @Override
   protected void a(tq $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(uf.a(this.dV().a(mc.f), $$0.p("block_state")));
      }

      if ($$0.b("explosion_power", 99)) {
         this.k = ayz.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Nullable
   public bvh l() {
      return this.i;
   }

   @Override
   public void x(bul $$0) {
      super.x($$0);
      if ($$0 instanceof cld $$1) {
         this.i = $$1.i;
      }
   }

   public void b(int $$0) {
      this.al.a(b, $$0);
   }

   public int m() {
      return this.al.a(b);
   }

   public void c(dwx $$0) {
      this.al.a(c, $$0);
   }

   public dwx s() {
      return this.al.a(c);
   }

   private void a(boolean $$0) {
      this.j = $$0;
   }

   @Nullable
   @Override
   public bul b(etz $$0) {
      bul $$1 = super.b($$0);
      if ($$1 instanceof cld $$2) {
         $$2.a(true);
      }

      return $$1;
   }

   @Override
   public final boolean a(ard $$0, btb $$1, float $$2) {
      return false;
   }
}
