import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cde extends cdc implements bmm {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bnj d = new bnj(c, "Attacking speed boost", 0.05, bnj.a.a);
   private static final bjg bX = avj.a(0, 1);
   private int bY;
   private static final bjg bZ = avj.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bjg cd = avj.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public cde(blt<? extends cde> $$0, cti $$1) {
      super($$0, $$1);
      this.a(eev.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void u() {
      this.bO.a(2, new buq(this, 1.0, false));
      this.bO.a(7, new buo(this, 1.0));
      this.bP.a(1, new but(this).a());
      this.bP.a(2, new buu<>(this, cfb.class, 10, true, false, this::a_));
      this.bP.a(3, new bva<>(this, true));
   }

   public static bnk.a go() {
      return cdc.gi().a(bnl.n, 0.0).a(bnl.m, 0.23F).a(bnl.c, 5.0);
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return this.o_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   protected void Z() {
      bnh $$0 = this.a(bnl.m);
      if (this.aa_()) {
         if (!this.o_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.gp();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((amz)this.dM(), true);
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
      double $$0 = this.b(bnl.g);
      elh $$1 = elh.a(this.dk()).c($$0, 10.0, $$0);
      this.dM()
         .a(cde.class, $$1, bls.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.s(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gs() {
      this.a(arm.Cp, this.eW() * 2.0F, this.eX() * 1.8F);
   }

   @Override
   public void h(@Nullable bmf $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cfb) {
         this.c((cfb)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(blt<cde> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.ak() != bjs.a && !$$1.a_($$3.d()).a(cwl.kK);
   }

   @Override
   public boolean a(ctl $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(sl $$0) {
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
   protected arl y() {
      return this.aa_() ? arm.Cp : arm.Co;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.Cr;
   }

   @Override
   protected arl n_() {
      return arm.Cq;
   }

   @Override
   protected void a(aup $$0, bjt $$1) {
      this.a(blu.a, new cmr(cmu.oS));
   }

   @Override
   protected cmr ge() {
      return cmr.f;
   }

   @Override
   protected void gn() {
      this.a(bnl.n).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cfb $$0) {
      return this.a_((bmf)$$0);
   }

   @Override
   public boolean k(cmr $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
