import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class caf extends cad implements bjp {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bkm d = new bkm(c, "Attacking speed boost", 0.05, bkm.a.a);
   private static final bgl bX = asw.a(0, 1);
   private int bY;
   private static final bgl bZ = asw.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bgl cd = asw.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public caf(biw<? extends caf> $$0, cpx $$1) {
      super($$0, $$1);
      this.a(eaz.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void s() {
      this.bO.a(2, new brs(this, 1.0, false));
      this.bO.a(7, new brq(this, 1.0));
      this.bP.a(1, new brv(this).a());
      this.bP.a(2, new brw<>(this, cbw.class, 10, true, false, this::a_));
      this.bP.a(3, new bsc<>(this, true));
   }

   public static bkn.a gn() {
      return cad.gh().a(bko.m, 0.0).a(bko.d, 0.23F).a(bko.f, 5.0);
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return this.m_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean ge() {
      return false;
   }

   @Override
   protected void X() {
      bkk $$0 = this.a(bko.d);
      if (this.X_()) {
         if (!this.m_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.go();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((aks)this.dL(), true);
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
      double $$0 = this.b(bko.b);
      ehk $$1 = ehk.a(this.dj()).c($$0, 10.0, $$0);
      this.dL()
         .a(caf.class, $$1, biv.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.s(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gr() {
      this.a(apf.Bn, this.eV() * 2.0F, this.eW() * 1.8F);
   }

   @Override
   public void h(@Nullable bji $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cbw) {
         this.c((cbw)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(biw<caf> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$1.ai() != bgx.a && !$$1.a_($$3.d()).a(csy.kK);
   }

   @Override
   public boolean a(cqa $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(qy $$0) {
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
   protected ape w() {
      return this.X_() ? apf.Bn : apf.Bm;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.Bp;
   }

   @Override
   protected ape l_() {
      return apf.Bo;
   }

   @Override
   protected void a(ase $$0, bgy $$1) {
      this.a(bix.a, new cjh(cjk.oh));
   }

   @Override
   protected cjh gd() {
      return cjh.b;
   }

   @Override
   protected void gm() {
      this.a(bko.m).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cbw $$0) {
      return this.a_((bji)$$0);
   }

   @Override
   public boolean k(cjh $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
