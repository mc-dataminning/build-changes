import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzv extends bzt implements bjf {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bkc d = new bkc(c, "Attacking speed boost", 0.05, bkc.a.a);
   private static final bgb bX = asm.a(0, 1);
   private int bY;
   private static final bgb bZ = asm.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bgb cd = asm.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public bzv(bim<? extends bzv> $$0, cpl $$1) {
      super($$0, $$1);
      this.a(ean.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void p() {
      this.bO.a(2, new bri(this, 1.0, false));
      this.bO.a(7, new brg(this, 1.0));
      this.bP.a(1, new brl(this).a());
      this.bP.a(2, new brm<>(this, cbm.class, 10, true, false, this::a_));
      this.bP.a(3, new brs<>(this, true));
   }

   public static bkd.a gk() {
      return bzt.ge().a(bke.m, 0.0).a(bke.d, 0.23F).a(bke.f, 5.0);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return this.i_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean gb() {
      return false;
   }

   @Override
   protected void V() {
      bka $$0 = this.a(bke.d);
      if (this.S_()) {
         if (!this.i_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.gl();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((akk)this.dK(), true);
      if (this.j() != null) {
         this.gm();
      }

      if (this.S_()) {
         this.aZ = this.ah;
      }

      super.V();
   }

   private void gl() {
      if (this.bY > 0) {
         this.bY--;
         if (this.bY == 0) {
            this.go();
         }
      }
   }

   private void gm() {
      if (this.ce > 0) {
         this.ce--;
      } else {
         if (this.J().a(this.j())) {
            this.gn();
         }

         this.ce = cd.a(this.ag);
      }
   }

   private void gn() {
      double $$0 = this.b(bke.b);
      egy $$1 = egy.a(this.di()).c($$0, 10.0, $$0);
      this.dK()
         .a(bzv.class, $$1, bil.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.j() == null)
         .filter($$0x -> !$$0x.s(this.j()))
         .forEach($$0x -> $$0x.h(this.j()));
   }

   private void go() {
      this.a(aow.Bn, this.eU() * 2.0F, this.eV() * 1.8F);
   }

   @Override
   public void h(@Nullable biy $$0) {
      if (this.j() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cbm) {
         this.c((cbm)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(bim<bzv> $$0, cpm $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.ai() != bgn.a && !$$1.a_($$3.d()).a(csm.kK);
   }

   @Override
   public boolean a(cpo $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(this.dK(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   protected aov r() {
      return this.S_() ? aow.Bn : aow.Bm;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.Bp;
   }

   @Override
   protected aov h_() {
      return aow.Bo;
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      this.a(bin.a, new cix(cja.oh));
   }

   @Override
   protected cix ga() {
      return cix.b;
   }

   @Override
   protected void gj() {
      this.a(bke.m).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cbm $$0) {
      return this.a_((biy)$$0);
   }

   @Override
   public boolean k(cix $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
