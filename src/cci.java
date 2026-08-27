import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cci extends ccg implements bls {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bmp d = new bmp(c, "Attacking speed boost", 0.05, bmp.a.a);
   private static final bim bX = aup.a(0, 1);
   private int bY;
   private static final bim bZ = aup.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bim cd = aup.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public cci(bkz<? extends cci> $$0, csf $$1) {
      super($$0, $$1);
      this.a(edi.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void u() {
      this.bO.a(2, new btv(this, 1.0, false));
      this.bO.a(7, new btt(this, 1.0));
      this.bP.a(1, new bty(this).a());
      this.bP.a(2, new btz<>(this, cdz.class, 10, true, false, this::a_));
      this.bP.a(3, new buf<>(this, true));
   }

   public static bmq.a gp() {
      return ccg.gj().a(bmr.n, 0.0).a(bmr.m, 0.23F).a(bmr.c, 5.0);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return this.o_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean gg() {
      return false;
   }

   @Override
   protected void Z() {
      bmn $$0 = this.a(bmr.m);
      if (this.aa_()) {
         if (!this.o_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.gq();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((ami)this.dN(), true);
      if (this.q() != null) {
         this.gr();
      }

      if (this.aa_()) {
         this.aZ = this.ah;
      }

      super.Z();
   }

   private void gq() {
      if (this.bY > 0) {
         this.bY--;
         if (this.bY == 0) {
            this.gt();
         }
      }
   }

   private void gr() {
      if (this.ce > 0) {
         this.ce--;
      } else {
         if (this.O().a(this.q())) {
            this.gs();
         }

         this.ce = cd.a(this.ag);
      }
   }

   private void gs() {
      double $$0 = this.b(bmr.g);
      eju $$1 = eju.a(this.dl()).c($$0, 10.0, $$0);
      this.dN()
         .a(cci.class, $$1, bky.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.s(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gt() {
      this.a(aqv.BT, this.eX() * 2.0F, this.eY() * 1.8F);
   }

   @Override
   public void h(@Nullable bll $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cdz) {
         this.c((cdz)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(bkz<cci> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.aj() != biy.a && !$$1.a_($$3.d()).a(cvh.kK);
   }

   @Override
   public boolean a(csi $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.a(this.dN(), $$0);
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
   protected aqu y() {
      return this.aa_() ? aqv.BT : aqv.BS;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.BV;
   }

   @Override
   protected aqu n_() {
      return aqv.BU;
   }

   @Override
   protected void a(atw $$0, biz $$1) {
      this.a(bla.a, new clo(clr.oS));
   }

   @Override
   protected clo gf() {
      return clo.b;
   }

   @Override
   protected void go() {
      this.a(bmr.n).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cdz $$0) {
      return this.a_((bll)$$0);
   }

   @Override
   public boolean k(clo $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
