import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fad extends ezt<cfv> {
   private static final aep x = new aep("container/smithing/error");
   private static final aep y = new aep("item/empty_slot_smithing_template_armor_trim");
   private static final aep z = new aep("item/empty_slot_smithing_template_netherite_upgrade");
   private static final te A = te.c("container.upgrade.missing_template_tooltip");
   private static final te B = te.c("container.upgrade.error_tooltip");
   private static final List<aep> C = List.of(y, z);
   private static final int D = 44;
   private static final int E = 15;
   private static final int F = 28;
   private static final int G = 21;
   private static final int H = 65;
   private static final int I = 46;
   private static final int J = 115;
   private static final int K = 210;
   private static final int L = 25;
   private static final Vector3f M = new Vector3f();
   private static final Quaternionf N = new Quaternionf().rotationXYZ(0.43633232F, 0.0F, (float) Math.PI);
   private static final int O = 25;
   private static final int P = 75;
   private static final int Q = 141;
   private final ezi R = new ezi(0);
   private final ezi S = new ezi(1);
   private final ezi T = new ezi(2);
   @Nullable
   private bxu U;

   public fad(cfv $$0, cbk $$1, te $$2) {
      super($$0, $$1, $$2, new aep("textures/gui/container/smithing.png"));
      this.l = 44;
      this.m = 15;
   }

   @Override
   protected void D() {
      this.U = new bxu(this.f.s, 0.0, 0.0, 0.0);
      this.U.s(true);
      this.U.a(true);
      this.U.aU = 210.0F;
      this.U.s(25.0F);
      this.U.aW = this.U.dA();
      this.U.aX = this.U.dA();
      this.b(this.p.b(3).e());
   }

   @Override
   public void B() {
      super.B();
      Optional<cjy> $$0 = this.E();
      this.R.a(C);
      this.S.a($$0.map(cjy::y).orElse(List.of()));
      this.T.a($$0.map(cjy::z).orElse(List.of()));
   }

   private Optional<cjy> E() {
      ciw $$0 = this.p.b(0).e();
      return !$$0.b() && $$0.d() instanceof cjy $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(erx $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.R.a(this.p, $$0, $$1, this.t, this.u);
      this.S.a(this.p, $$0, $$1, this.t, this.u);
      this.T.a(this.p, $$0, $$1, this.t, this.u);
      ezs.a($$0, (float)(this.t + 141), (float)(this.u + 75), 25, M, N, null, this.U);
   }

   @Override
   public void a(cec $$0, int $$1, ciw $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(ciw $$0) {
      if (this.U != null) {
         for (bil $$1 : bil.values()) {
            this.U.a($$1, ciw.b);
         }

         if (!$$0.b()) {
            ciw $$2 = $$0.p();
            if ($$0.d() instanceof cgg $$3) {
               this.U.a($$3.g(), $$2);
            } else {
               this.U.a(bil.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(erx $$0, int $$1, int $$2) {
      if (this.F()) {
         $$0.a(x, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(erx $$0, int $$1, int $$2) {
      Optional<te> $$3 = Optional.empty();
      if (this.F() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(B);
      }

      if (this.s != null) {
         ciw $$4 = this.p.b(0).e();
         ciw $$5 = this.s.e();
         if ($$4.b()) {
            if (this.s.e == 0) {
               $$3 = Optional.of(A);
            }
         } else if ($$4.d() instanceof cjy $$6 && $$5.b()) {
            if (this.s.e == 1) {
               $$3 = Optional.of($$6.i());
            } else if (this.s.e == 2) {
               $$3 = Optional.of($$6.x());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.i, this.i.c($$3x, 115), $$1, $$2));
   }

   private boolean F() {
      return this.p.b(0).f() && this.p.b(1).f() && this.p.b(2).f() && !this.p.b(this.p.o()).f();
   }
}
