import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fmg extends flw<cov> {
   private static final ajv A = new ajv("container/smithing/error");
   private static final ajv B = new ajv("item/empty_slot_smithing_template_armor_trim");
   private static final ajv C = new ajv("item/empty_slot_smithing_template_netherite_upgrade");
   private static final wi D = wi.c("container.upgrade.missing_template_tooltip");
   private static final wi E = wi.c("container.upgrade.error_tooltip");
   private static final List<ajv> F = List.of(B, C);
   private static final int G = 44;
   private static final int H = 15;
   private static final int I = 28;
   private static final int J = 21;
   private static final int K = 65;
   private static final int L = 46;
   private static final int M = 115;
   private static final int N = 210;
   private static final int O = 25;
   private static final Vector3f P = new Vector3f();
   private static final Quaternionf Q = new Quaternionf().rotationXYZ(0.43633232F, 0.0F, (float) Math.PI);
   private static final int R = 25;
   private static final int S = 75;
   private static final int T = 141;
   private final fll U = new fll(0);
   private final fll V = new fll(1);
   private final fll W = new fll(2);
   @Nullable
   private cga X;

   public fmg(cov $$0, cjz $$1, wi $$2) {
      super($$0, $$1, $$2, new ajv("textures/gui/container/smithing.png"));
      this.o = 44;
      this.p = 15;
   }

   @Override
   protected void E() {
      this.X = new cga(this.j.r, 0.0, 0.0, 0.0);
      this.X.s(true);
      this.X.a(true);
      this.X.aX = 210.0F;
      this.X.s(25.0F);
      this.X.aZ = this.X.dC();
      this.X.ba = this.X.dC();
      this.b(this.s.b(3).g());
   }

   @Override
   public void C() {
      super.C();
      Optional<cst> $$0 = this.F();
      this.U.a(F);
      this.V.a($$0.map(cst::k).orElse(List.of()));
      this.W.a($$0.map(cst::l).orElse(List.of()));
   }

   private Optional<cst> F() {
      crs $$0 = this.s.b(0).g();
      return !$$0.d() && $$0.f() instanceof cst $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fdl $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.U.a(this.s, $$0, $$1, this.w, this.x);
      this.V.a(this.s, $$0, $$1, this.w, this.x);
      this.W.a(this.s, $$0, $$1, this.w, this.x);
      flv.a($$0, (float)(this.w + 141), (float)(this.x + 75), 25.0F, P, Q, null, this.X);
   }

   @Override
   public void a(cmw $$0, int $$1, crs $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(crs $$0) {
      if (this.X != null) {
         for (bqh $$1 : bqh.values()) {
            this.X.a($$1, crs.i);
         }

         if (!$$0.d()) {
            crs $$2 = $$0.r();
            if ($$0.f() instanceof cph $$3) {
               this.X.a($$3.k(), $$2);
            } else {
               this.X.a(bqh.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(fdl $$0, int $$1, int $$2) {
      if (this.I()) {
         $$0.a(A, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fdl $$0, int $$1, int $$2) {
      Optional<wi> $$3 = Optional.empty();
      if (this.I() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(E);
      }

      if (this.v != null) {
         crs $$4 = this.s.b(0).g();
         crs $$5 = this.v.g();
         if ($$4.d()) {
            if (this.v.e == 0) {
               $$3 = Optional.of(D);
            }
         } else if ($$4.f() instanceof cst $$6 && $$5.d()) {
            if (this.v.e == 1) {
               $$3 = Optional.of($$6.i());
            } else if (this.v.e == 2) {
               $$3 = Optional.of($$6.j());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.m, this.m.c($$3x, 115), $$1, $$2));
   }

   private boolean I() {
      return this.s.b(0).h() && this.s.b(1).h() && this.s.b(2).h() && !this.s.b(this.s.o()).h();
   }
}
