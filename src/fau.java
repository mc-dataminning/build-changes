import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fau extends fak<cgg> {
   private static final aey x = new aey("container/smithing/error");
   private static final aey y = new aey("item/empty_slot_smithing_template_armor_trim");
   private static final aey z = new aey("item/empty_slot_smithing_template_netherite_upgrade");
   private static final tn A = tn.c("container.upgrade.missing_template_tooltip");
   private static final tn B = tn.c("container.upgrade.error_tooltip");
   private static final List<aey> C = List.of(y, z);
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
   private final ezz R = new ezz(0);
   private final ezz S = new ezz(1);
   private final ezz T = new ezz(2);
   @Nullable
   private byf U;

   public fau(cgg $$0, cbv $$1, tn $$2) {
      super($$0, $$1, $$2, new aey("textures/gui/container/smithing.png"));
      this.l = 44;
      this.m = 15;
   }

   @Override
   protected void F() {
      this.U = new byf(this.f.r, 0.0, 0.0, 0.0);
      this.U.s(true);
      this.U.a(true);
      this.U.aU = 210.0F;
      this.U.s(25.0F);
      this.U.aW = this.U.dB();
      this.U.aX = this.U.dB();
      this.b(this.p.b(3).e());
   }

   @Override
   public void D() {
      super.D();
      Optional<ckj> $$0 = this.G();
      this.R.a(C);
      this.S.a($$0.map(ckj::y).orElse(List.of()));
      this.T.a($$0.map(ckj::z).orElse(List.of()));
   }

   private Optional<ckj> G() {
      cjh $$0 = this.p.b(0).e();
      return !$$0.b() && $$0.d() instanceof ckj $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(esh $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.R.a(this.p, $$0, $$1, this.t, this.u);
      this.S.a(this.p, $$0, $$1, this.t, this.u);
      this.T.a(this.p, $$0, $$1, this.t, this.u);
      faj.a($$0, (float)(this.t + 141), (float)(this.u + 75), 25, M, N, null, this.U);
   }

   @Override
   public void a(cen $$0, int $$1, cjh $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cjh $$0) {
      if (this.U != null) {
         for (bix $$1 : bix.values()) {
            this.U.a($$1, cjh.b);
         }

         if (!$$0.b()) {
            cjh $$2 = $$0.p();
            if ($$0.d() instanceof cgr $$3) {
               this.U.a($$3.g(), $$2);
            } else {
               this.U.a(bix.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(esh $$0, int $$1, int $$2) {
      if (this.H()) {
         $$0.a(x, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(esh $$0, int $$1, int $$2) {
      Optional<tn> $$3 = Optional.empty();
      if (this.H() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(B);
      }

      if (this.s != null) {
         cjh $$4 = this.p.b(0).e();
         cjh $$5 = this.s.e();
         if ($$4.b()) {
            if (this.s.e == 0) {
               $$3 = Optional.of(A);
            }
         } else if ($$4.d() instanceof ckj $$6 && $$5.b()) {
            if (this.s.e == 1) {
               $$3 = Optional.of($$6.i());
            } else if (this.s.e == 2) {
               $$3 = Optional.of($$6.x());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.i, this.i.c($$3x, 115), $$1, $$2));
   }

   private boolean H() {
      return this.p.b(0).f() && this.p.b(1).f() && this.p.b(2).f() && !this.p.b(this.p.o()).f();
   }
}
