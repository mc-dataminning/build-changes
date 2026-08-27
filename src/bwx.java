import java.util.UUID;
import javax.annotation.Nullable;

public class bwx extends bwv implements bgg {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bhe d = new bhe(c, "Attacking speed boost", 0.05, bhe.a.a);
   private static final bdi bX = apw.a(0, 1);
   private int bY;
   private static final bdi bZ = apw.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bdi cd = apw.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public bwx(bfn<? extends bwx> $$0, cmm $$1) {
      super($$0, $$1);
      this.a(dxp.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   public double bw() {
      return this.h_() ? -0.05 : -0.45;
   }

   @Override
   protected void q() {
      this.bO.a(2, new bok(this, 1.0, false));
      this.bO.a(7, new boi(this, 1.0));
      this.bP.a(1, new bon(this).a());
      this.bP.a(2, new boo<>(this, byo.class, 10, true, false, this::a_));
      this.bP.a(3, new bou<>(this, true));
   }

   public static bhf.a gi() {
      return bwv.gc().a(bhg.l, 0.0).a(bhg.d, 0.23F).a(bhg.f, 5.0);
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return this.h_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean fZ() {
      return false;
   }

   @Override
   protected void W() {
      bhc $$0 = this.a(bhg.d);
      if (this.S_()) {
         if (!this.h_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.gj();
      } else if ($$0.a(d)) {
         $$0.d(d);
      }

      this.a((aif)this.dI(), true);
      if (this.j() != null) {
         this.gk();
      }

      if (this.S_()) {
         this.ba = this.ag;
      }

      super.W();
   }

   private void gj() {
      if (this.bY > 0) {
         this.bY--;
         if (this.bY == 0) {
            this.gm();
         }
      }
   }

   private void gk() {
      if (this.ce > 0) {
         this.ce--;
      } else {
         if (this.K().a(this.j())) {
            this.gl();
         }

         this.ce = cd.a(this.af);
      }
   }

   private void gl() {
      double $$0 = this.b(bhg.b);
      eed $$1 = eed.a(this.dg()).c($$0, 10.0, $$0);
      this.dI()
         .a(bwx.class, $$1, bfm.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.j() == null)
         .filter($$0x -> !$$0x.p(this.j()))
         .forEach($$0x -> $$0x.h(this.j()));
   }

   private void gm() {
      this.a(amh.Bc, this.eR() * 2.0F, this.eS() * 1.8F);
   }

   @Override
   public void h(@Nullable bfz $$0) {
      if (this.j() == null && $$0 != null) {
         this.bY = bX.a(this.af);
         this.ce = cd.a(this.af);
      }

      if ($$0 instanceof byo) {
         this.c((byo)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.af));
   }

   public static boolean b(bfn<bwx> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return $$1.ai() != bdu.a && !$$1.a_($$3.d()).a(cpo.kK);
   }

   @Override
   public boolean a(cmp $$0) {
      return $$0.f(this) && !$$0.d(this.cE());
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(this.dI(), $$0);
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
   protected amg s() {
      return this.S_() ? amh.Bc : amh.Bb;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.Be;
   }

   @Override
   protected amg g_() {
      return amh.Bd;
   }

   @Override
   protected void a(apf $$0, bdv $$1) {
      this.a(bfo.a, new cfz(cgc.oh));
   }

   @Override
   protected cfz fY() {
      return cfz.b;
   }

   @Override
   protected void gh() {
      this.a(bhg.l).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(byo $$0) {
      return this.a_((bfz)$$0);
   }

   @Override
   public boolean k(cfz $$0) {
      return this.j($$0);
   }
}
