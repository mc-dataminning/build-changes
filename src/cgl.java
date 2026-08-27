import java.util.Collection;
import javax.annotation.Nullable;

public class cgl extends cgz implements bra {
   private static final aiy<Integer> b = ajc.a(cgl.class, aja.b);
   private static final aiy<Boolean> c = ajc.a(cgl.class, aja.k);
   private static final aiy<Boolean> d = ajc.a(cgl.class, aja.k);
   private int e;
   private int bX;
   private int bY = 30;
   private int bZ = 3;
   private int ca;

   public cgl(bqb<? extends cgl> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxf(this));
      this.bR.a(2, new bys(this));
      this.bR.a(3, new bws<>(this, ccr.class, 6.0F, 1.0, 1.2));
      this.bR.a(3, new bws<>(this, ccg.class, 6.0F, 1.0, 1.2));
      this.bR.a(4, new bxv(this, 1.0, false));
      this.bR.a(5, new byy(this, 0.8));
      this.bR.a(6, new bxt(this, cjt.class, 8.0F));
      this.bR.a(6, new byg(this));
      this.bS.a(1, new bze<>(this, cjt.class, true));
      this.bS.a(2, new bzd(this));
   }

   public static bru.a r() {
      return cgz.gt().a(brv.r, 0.25);
   }

   @Override
   public int cu() {
      return this.p() == null ? this.u(0.0F) : this.u(this.ex() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bot $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bX += (int)($$0 * 1.5F);
      if (this.bX > this.bY - 5) {
         this.bX = this.bY - 5;
      }

      return $$3;
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      if (this.an.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bY);
      $$0.a("ExplosionRadius", (byte)this.bZ);
      $$0.a("ignited", this.y());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.an.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bY = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bZ = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gn();
      }
   }

   @Override
   public void l() {
      if (this.bA()) {
         this.e = this.bX;
         if (this.y()) {
            this.b(1);
         }

         int $$0 = this.u();
         if ($$0 > 0 && this.bX == 0) {
            this.a(aum.gf, 1.0F, 0.5F);
            this.a(dts.I);
         }

         this.bX += $$0;
         if (this.bX < 0) {
            this.bX = 0;
         }

         if (this.bX >= this.bY) {
            this.bX = this.bY;
            this.gq();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable bqo $$0) {
      if (!($$0 instanceof ceb)) {
         super.h($$0);
      }
   }

   @Override
   protected aul d(bot $$0) {
      return aum.ge;
   }

   @Override
   protected aul o_() {
      return aum.gd;
   }

   @Override
   protected void a(bot $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bpv $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof cgl $$4 && $$4.go()) {
         $$4.gp();
         this.a(crm.un);
      }
   }

   @Override
   public boolean C(bpv $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.an.a(c);
   }

   public float G(float $$0) {
      return axk.i($$0, (float)this.e, (float)this.bX) / (float)(this.bY - 2);
   }

   public int u() {
      return this.an.a(b);
   }

   public void b(int $$0) {
      this.an.a(b, $$0);
   }

   @Override
   public void a(aps $$0, bqn $$1) {
      super.a($$0, $$1);
      this.an.a(c, true);
   }

   @Override
   protected boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$2.a(avk.aF)) {
         aul $$3 = $$2.a(crm.tW) ? aum.iF : aum.iU;
         this.dM().a($$0, this.dr(), this.dt(), this.dx(), $$3, this.db(), 1.0F, this.ag.i() * 0.4F + 0.8F);
         if (!this.dM().B) {
            this.gn();
            if (!$$2.k()) {
               $$2.g(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return boa.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gq() {
      if (!this.dM().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.bd = true;
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.bZ * $$0, cyx.a.c);
         this.am();
         this.gr();
      }
   }

   private void gr() {
      Collection<bph> $$0 = this.eu();
      if (!$$0.isEmpty()) {
         bpr $$1 = new bpr(this.dM(), this.dr(), this.dt(), this.dx());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.k() / 2);
         $$1.c(-$$1.g() / (float)$$1.k());

         for (bph $$2 : $$0) {
            $$1.a(new bph($$2));
         }

         this.dM().b($$1);
      }
   }

   public boolean y() {
      return this.an.a(d);
   }

   public void gn() {
      this.an.a(d, true);
   }

   public boolean go() {
      return this.a() && this.ca < 1;
   }

   public void gp() {
      this.ca++;
   }
}
