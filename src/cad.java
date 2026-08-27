import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cad extends cab implements bjn {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bkk d = new bkk(c, "Attacking speed boost", 0.05, bkk.a.a);
   private static final bgj bX = asu.a(0, 1);
   private int bY;
   private static final bgj bZ = asu.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bgj cd = asu.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public cad(biu<? extends cad> $$0, cpv $$1) {
      super($$0, $$1);
      this.a(eax.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void s() {
      this.bO.a(2, new brq(this, 1.0, false));
      this.bO.a(7, new bro(this, 1.0));
      this.bP.a(1, new brt(this).a());
      this.bP.a(2, new bru<>(this, cbu.class, 10, true, false, this::a_));
      this.bP.a(3, new bsa<>(this, true));
   }

   public static bkl.a gn() {
      return cab.gh().a(bkm.m, 0.0).a(bkm.d, 0.23F).a(bkm.f, 5.0);
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return this.m_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean ge() {
      return false;
   }

   @Override
   protected void X() {
      bki $$0 = this.a(bkm.d);
      if (this.X_()) {
         if (!this.m_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.go();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((akq)this.dL(), true);
      if (this.q() != null) {
         this.gp();
      }

      if (this.X_()) {
         this.aZ = this.ah;
      }

      super.X();
   }

   private void go() {
      if (this.bY > 0) {
         this.bY--;
         if (this.bY == 0) {
            this.gr();
         }
      }
   }

   private void gp() {
      if (this.ce > 0) {
         this.ce--;
      } else {
         if (this.M().a(this.q())) {
            this.gq();
         }

         this.ce = cd.a(this.ag);
      }
   }

   private void gq() {
      double $$0 = this.b(bkm.b);
      ehi $$1 = ehi.a(this.dj()).c($$0, 10.0, $$0);
      this.dL()
         .a(cad.class, $$1, bit.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.s(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gr() {
      this.a(apd.Bn, this.eV() * 2.0F, this.eW() * 1.8F);
   }

   @Override
   public void h(@Nullable bjg $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cbu) {
         this.c((cbu)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(biu<cad> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.ai() != bgv.a && !$$1.a_($$3.d()).a(csw.kK);
   }

   @Override
   public boolean a(cpy $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a(this.dL(), $$0);
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
   protected apc w() {
      return this.X_() ? apd.Bn : apd.Bm;
   }

   @Override
   protected apc d(bho $$0) {
      return apd.Bp;
   }

   @Override
   protected apc l_() {
      return apd.Bo;
   }

   @Override
   protected void a(asc $$0, bgw $$1) {
      this.a(biv.a, new cjf(cji.oh));
   }

   @Override
   protected cjf gd() {
      return cjf.b;
   }

   @Override
   protected void gm() {
      this.a(bkm.m).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cbu $$0) {
      return this.a_((bjg)$$0);
   }

   @Override
   public boolean k(cjf $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
