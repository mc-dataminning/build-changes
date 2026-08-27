import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdj extends cdh implements bmr {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bno d = new bno(c, "Attacking speed boost", 0.05, bno.a.a);
   private static final bjl bX = avo.a(0, 1);
   private int bY;
   private static final bjl bZ = avo.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bjl cd = avo.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public cdj(bly<? extends cdj> $$0, cto $$1) {
      super($$0, $$1);
      this.a(efb.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void u() {
      this.bO.a(2, new buv(this, 1.0, false));
      this.bO.a(7, new but(this, 1.0));
      this.bP.a(1, new buy(this).a());
      this.bP.a(2, new buz<>(this, cfh.class, 10, true, false, this::a_));
      this.bP.a(3, new bvf<>(this, true));
   }

   public static bnp.a go() {
      return cdh.gi().a(bnq.n, 0.0).a(bnq.m, 0.23F).a(bnq.c, 5.0);
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return this.o_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   protected void Z() {
      bnm $$0 = this.a(bnq.m);
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
      double $$0 = this.b(bnq.g);
      eln $$1 = eln.a(this.dk()).c($$0, 10.0, $$0);
      this.dM()
         .a(cdj.class, $$1, blx.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.s(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gs() {
      this.a(arr.Cp, this.eW() * 2.0F, this.eX() * 1.8F);
   }

   @Override
   public void h(@Nullable bmk $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cfh) {
         this.c((cfh)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(bly<cdj> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.ak() != bjx.a && !$$1.a_($$3.d()).a(cwr.kK);
   }

   @Override
   public boolean a(ctr $$0) {
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
   protected arq y() {
      return this.aa_() ? arr.Cp : arr.Co;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.Cr;
   }

   @Override
   protected arq n_() {
      return arr.Cq;
   }

   @Override
   protected void a(auu $$0, bjy $$1) {
      this.a(blz.a, new cmx(cna.oS));
   }

   @Override
   protected cmx ge() {
      return cmx.f;
   }

   @Override
   protected void gn() {
      this.a(bnq.n).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cfh $$0) {
      return this.a_((bmk)$$0);
   }

   @Override
   public boolean k(cmx $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
