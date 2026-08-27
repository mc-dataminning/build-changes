import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fah extends ezx<cfx> {
   private static final aer x = new aer("container/smithing/error");
   private static final aer y = new aer("item/empty_slot_smithing_template_armor_trim");
   private static final aer z = new aer("item/empty_slot_smithing_template_netherite_upgrade");
   private static final tf A = tf.c("container.upgrade.missing_template_tooltip");
   private static final tf B = tf.c("container.upgrade.error_tooltip");
   private static final List<aer> C = List.of(y, z);
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
   private final ezm R = new ezm(0);
   private final ezm S = new ezm(1);
   private final ezm T = new ezm(2);
   @Nullable
   private bxw U;

   public fah(cfx $$0, cbm $$1, tf $$2) {
      super($$0, $$1, $$2, new aer("textures/gui/container/smithing.png"));
      this.l = 44;
      this.m = 15;
   }

   @Override
   protected void D() {
      this.U = new bxw(this.f.u, 0.0, 0.0, 0.0);
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
      Optional<cka> $$0 = this.E();
      this.R.a(C);
      this.S.a($$0.map(cka::y).orElse(List.of()));
      this.T.a($$0.map(cka::z).orElse(List.of()));
   }

   private Optional<cka> E() {
      ciy $$0 = this.p.b(0).e();
      return !$$0.b() && $$0.d() instanceof cka $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(erw $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.R.a(this.p, $$0, $$1, this.t, this.u);
      this.S.a(this.p, $$0, $$1, this.t, this.u);
      this.T.a(this.p, $$0, $$1, this.t, this.u);
      ezw.a($$0, (float)(this.t + 141), (float)(this.u + 75), 25, M, N, null, this.U);
   }

   @Override
   public void a(cee $$0, int $$1, ciy $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(ciy $$0) {
      if (this.U != null) {
         for (bin $$1 : bin.values()) {
            this.U.a($$1, ciy.b);
         }

         if (!$$0.b()) {
            ciy $$2 = $$0.p();
            if ($$0.d() instanceof cgi $$3) {
               this.U.a($$3.g(), $$2);
            } else {
               this.U.a(bin.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(erw $$0, int $$1, int $$2) {
      if (this.F()) {
         $$0.a(x, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(erw $$0, int $$1, int $$2) {
      Optional<tf> $$3 = Optional.empty();
      if (this.F() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(B);
      }

      if (this.s != null) {
         ciy $$4 = this.p.b(0).e();
         ciy $$5 = this.s.e();
         if ($$4.b()) {
            if (this.s.e == 0) {
               $$3 = Optional.of(A);
            }
         } else if ($$4.d() instanceof cka $$6 && $$5.b()) {
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
