import java.util.Collection;
import javax.annotation.Nullable;

public class cgs extends chg implements brf {
   private static final aja<Integer> b = aje.a(cgs.class, ajc.b);
   private static final aja<Boolean> c = aje.a(cgs.class, ajc.k);
   private static final aja<Boolean> d = aje.a(cgs.class, ajc.k);
   private int e;
   private int bX;
   private int bY = 30;
   private int bZ = 3;
   private int ca;

   public cgs(bqg<? extends cgs> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxk(this));
      this.bR.a(2, new byx(this));
      this.bR.a(3, new bwx<>(this, ccw.class, 6.0F, 1.0, 1.2));
      this.bR.a(3, new bwx<>(this, ccl.class, 6.0F, 1.0, 1.2));
      this.bR.a(4, new bya(this, 1.0, false));
      this.bR.a(5, new bzd(this, 0.8));
      this.bR.a(6, new bxy(this, cka.class, 8.0F));
      this.bR.a(6, new byl(this));
      this.bS.a(1, new bzj<>(this, cka.class, true));
      this.bS.a(2, new bzi(this));
   }

   public static brz.a r() {
      return chg.gt().a(bsa.r, 0.25);
   }

   @Override
   public int cu() {
      return this.p() == null ? this.u(0.0F) : this.u(this.ex() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, boy $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bX += (int)($$0 * 1.5F);
      if (this.bX > this.bY - 5) {
         this.bX = this.bY - 5;
      }

      return $$3;
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      if (this.an.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bY);
      $$0.a("ExplosionRadius", (byte)this.bZ);
      $$0.a("ignited", this.y());
   }

   @Override
   public void a(to $$0) {
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
            this.a(auo.gf, 1.0F, 0.5F);
            this.a(dub.I);
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
   public void h(@Nullable bqt $$0) {
      if (!($$0 instanceof cei)) {
         super.h($$0);
      }
   }

   @Override
   protected aun d(boy $$0) {
      return auo.ge;
   }

   @Override
   protected aun o_() {
      return auo.gd;
   }

   @Override
   protected void a(boy $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bqa $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof cgs $$4 && $$4.go()) {
         $$4.gp();
         this.a(crv.un);
      }
   }

   @Override
   public boolean C(bqa $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.an.a(c);
   }

   public float G(float $$0) {
      return axm.i($$0, (float)this.e, (float)this.bX) / (float)(this.bY - 2);
   }

   public int u() {
      return this.an.a(b);
   }

   public void b(int $$0) {
      this.an.a(b, $$0);
   }

   @Override
   public void a(apu $$0, bqs $$1) {
      super.a($$0, $$1);
      this.an.a(c, true);
   }

   @Override
   protected bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if ($$2.a(avm.aF)) {
         aun $$3 = $$2.a(crv.tW) ? auo.iF : auo.iU;
         this.dM().a($$0, this.dr(), this.dt(), this.dx(), $$3, this.db(), 1.0F, this.ag.i() * 0.4F + 0.8F);
         if (!this.dM().B) {
            this.gn();
            if (!$$2.k()) {
               $$2.g(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bof.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gq() {
      if (!this.dM().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.bd = true;
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.bZ * $$0, czg.a.c);
         this.am();
         this.gr();
      }
   }

   private void gr() {
      Collection<bpm> $$0 = this.eu();
      if (!$$0.isEmpty()) {
         bpw $$1 = new bpw(this.dM(), this.dr(), this.dt(), this.dx());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.k() / 2);
         $$1.c(-$$1.g() / (float)$$1.k());

         for (bpm $$2 : $$0) {
            $$1.a(new bpm($$2));
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
