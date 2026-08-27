import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccd extends ccb implements bln {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bmk d = new bmk(c, "Attacking speed boost", 0.05, bmk.a.a);
   private static final bii bX = aul.a(0, 1);
   private int bY;
   private static final bii bZ = aul.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bii cd = aul.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public ccd(bku<? extends ccd> $$0, csa $$1) {
      super($$0, $$1);
      this.a(edd.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void u() {
      this.bO.a(2, new btq(this, 1.0, false));
      this.bO.a(7, new bto(this, 1.0));
      this.bP.a(1, new btt(this).a());
      this.bP.a(2, new btu<>(this, cdu.class, 10, true, false, this::a_));
      this.bP.a(3, new bua<>(this, true));
   }

   public static bml.a gp() {
      return ccb.gj().a(bmm.n, 0.0).a(bmm.m, 0.23F).a(bmm.c, 5.0);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return this.n_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean gg() {
      return false;
   }

   @Override
   protected void Z() {
      bmi $$0 = this.a(bmm.m);
      if (this.Z_()) {
         if (!this.n_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.gq();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((ame)this.dN(), true);
      if (this.q() != null) {
         this.gr();
      }

      if (this.Z_()) {
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
      double $$0 = this.b(bmm.g);
      ejp $$1 = ejp.a(this.dl()).c($$0, 10.0, $$0);
      this.dN()
         .a(ccd.class, $$1, bkt.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.s(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gt() {
      this.a(aqr.BT, this.eX() * 2.0F, this.eY() * 1.8F);
   }

   @Override
   public void h(@Nullable blg $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cdu) {
         this.c((cdu)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(bku<ccd> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.aj() != biu.a && !$$1.a_($$3.d()).a(cvc.kK);
   }

   @Override
   public boolean a(csd $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(rz $$0) {
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
   protected aqq y() {
      return this.Z_() ? aqr.BT : aqr.BS;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.BV;
   }

   @Override
   protected aqq m_() {
      return aqr.BU;
   }

   @Override
   protected void a(ats $$0, biv $$1) {
      this.a(bkv.a, new clj(clm.oS));
   }

   @Override
   protected clj gf() {
      return clj.b;
   }

   @Override
   protected void go() {
      this.a(bmm.n).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cdu $$0) {
      return this.a_((blg)$$0);
   }

   @Override
   public boolean k(clj $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
