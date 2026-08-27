import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdk extends cdi implements bms {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bnp d = new bnp(c, "Attacking speed boost", 0.05, bnp.a.a);
   private static final bjm bX = avp.a(0, 1);
   private int bY;
   private static final bjm bZ = avp.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bjm cd = avp.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public cdk(blz<? extends cdk> $$0, ctp $$1) {
      super($$0, $$1);
      this.a(efc.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void u() {
      this.bO.a(2, new buw(this, 1.0, false));
      this.bO.a(7, new buu(this, 1.0));
      this.bP.a(1, new buz(this).a());
      this.bP.a(2, new bva<>(this, cfi.class, 10, true, false, this::a_));
      this.bP.a(3, new bvg<>(this, true));
   }

   public static bnq.a go() {
      return cdi.gi().a(bnr.n, 0.0).a(bnr.m, 0.23F).a(bnr.c, 5.0);
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return this.o_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   protected void Z() {
      bnn $$0 = this.a(bnr.m);
      if (this.aa_()) {
         if (!this.o_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.gp();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((and)this.dM(), true);
      if (this.q() != null) {
         this.gq();
      }

      if (this.aa_()) {
         this.aZ = this.ah;
      }

      super.Z();
   }

   private void gp() {
      if (this.bY > 0) {
         this.bY--;
         if (this.bY == 0) {
            this.gs();
         }
      }
   }

   private void gq() {
      if (this.ce > 0) {
         this.ce--;
      } else {
         if (this.O().a(this.q())) {
            this.gr();
         }

         this.ce = cd.a(this.ag);
      }
   }

   private void gr() {
      double $$0 = this.b(bnr.g);
      elo $$1 = elo.a(this.dk()).c($$0, 10.0, $$0);
      this.dM()
         .a(cdk.class, $$1, bly.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.s(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gs() {
      this.a(ars.Cp, this.eW() * 2.0F, this.eX() * 1.8F);
   }

   @Override
   public void h(@Nullable bml $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cfi) {
         this.c((cfi)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(blz<cdk> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.ak() != bjy.a && !$$1.a_($$3.d()).a(cws.kK);
   }

   @Override
   public boolean a(cts $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a(this.dM(), $$0);
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
   protected arr y() {
      return this.aa_() ? ars.Cp : ars.Co;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.Cr;
   }

   @Override
   protected arr n_() {
      return ars.Cq;
   }

   @Override
   protected void a(auv $$0, bjz $$1) {
      this.a(bma.a, new cmy(cnb.oS));
   }

   @Override
   protected cmy ge() {
      return cmy.f;
   }

   @Override
   protected void gn() {
      this.a(bnr.n).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cfi $$0) {
      return this.a_((bml)$$0);
   }

   @Override
   public boolean k(cmy $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
