import java.util.Optional;
import javax.annotation.Nullable;

public class cld extends bul implements bwg {
   private static final akm<Integer> a = akq.a(cld.class, ako.b);
   private static final akm<dvv> b = akq.a(cld.class, ako.i);
   private static final int c = 80;
   private static final float d = 4.0F;
   private static final String e = "block_state";
   private static final String f = "fuse";
   private static final String g = "explosion_power";
   private static final dff h = new dff() {
      @Override
      public boolean a(dfe $$0, der $$1, jh $$2, dvv $$3, float $$4) {
         return $$3.a(dis.ed) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(dfe $$0, der $$1, jh $$2, dvv $$3, erv $$4) {
         return $$3.a(dis.ed) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bvh i;
   private boolean j;
   private float k = 4.0F;

   public cld(bus<? extends cld> $$0, dfm $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cld(dfm $$0, double $$1, double $$2, double $$3, @Nullable bvh $$4) {
      this(bus.bs, $$0);
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
   protected void a(akq.a $$0) {
      $$0.a(a, 80);
      $$0.a(b, dis.ck.m());
   }

   @Override
   protected bul.b bg() {
      return bul.b.a;
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
      this.h(this.dy().c(0.98));
      if (this.aJ()) {
         this.h(this.dy().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.l() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.at();
         if (!this.dV().C) {
            this.q();
         }
      } else {
         this.bq();
         if (this.dV().C) {
            this.dV().a(ls.ae, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void q() {
      this.dV().a(this, dfe.a(this.dV(), this), this.j ? h : null, this.dA(), this.e(0.0625), this.dG(), this.k, false, dfm.a.d);
   }

   @Override
   protected void b(ul $$0) {
      $$0.a("fuse", (short)this.l());
      $$0.a("block_state", va.a(this.n()));
      if (this.k != 4.0F) {
         $$0.a("explosion_power", this.k);
      }
   }

   @Override
   protected void a(ul $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(va.a(this.dV().a(ma.f), $$0.p("block_state")));
      }

      if ($$0.b("explosion_power", 99)) {
         this.k = azm.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Nullable
   public bvh j() {
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
      this.al.a(a, $$0);
   }

   public int l() {
      return this.al.a(a);
   }

   public void c(dvv $$0) {
      this.al.a(b, $$0);
   }

   public dvv n() {
      return this.al.a(b);
   }

   private void a(boolean $$0) {
      this.j = $$0;
   }

   @Nullable
   @Override
   public bul b(est $$0) {
      bul $$1 = super.b($$0);
      if ($$1 instanceof cld $$2) {
         $$2.a(true);
      }

      return $$1;
   }

   @Override
   public final boolean a(arp $$0, btb $$1, float $$2) {
      return false;
   }
}
