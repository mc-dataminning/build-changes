import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fdj extends fcz<cin> {
   private static final agm x = new agm("container/smithing/error");
   private static final agm y = new agm("item/empty_slot_smithing_template_armor_trim");
   private static final agm z = new agm("item/empty_slot_smithing_template_netherite_upgrade");
   private static final uv A = uv.c("container.upgrade.missing_template_tooltip");
   private static final uv B = uv.c("container.upgrade.error_tooltip");
   private static final List<agm> C = List.of(y, z);
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
   private final fco R = new fco(0);
   private final fco S = new fco(1);
   private final fco T = new fco(2);
   @Nullable
   private cai U;

   public fdj(cin $$0, cdy $$1, uv $$2) {
      super($$0, $$1, $$2, new agm("textures/gui/container/smithing.png"));
      this.l = 44;
      this.m = 15;
   }

   @Override
   protected void E() {
      this.U = new cai(this.f.r, 0.0, 0.0, 0.0);
      this.U.s(true);
      this.U.a(true);
      this.U.aU = 210.0F;
      this.U.s(25.0F);
      this.U.aW = this.U.dD();
      this.U.aX = this.U.dD();
      this.b(this.p.b(3).f());
   }

   @Override
   public void C() {
      super.C();
      Optional<cmq> $$0 = this.F();
      this.R.a(C);
      this.S.a($$0.map(cmq::y).orElse(List.of()));
      this.T.a($$0.map(cmq::z).orElse(List.of()));
   }

   private Optional<cmq> F() {
      clo $$0 = this.p.b(0).f();
      return !$$0.b() && $$0.d() instanceof cmq $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(eut $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.R.a(this.p, $$0, $$1, this.t, this.u);
      this.S.a(this.p, $$0, $$1, this.t, this.u);
      this.T.a(this.p, $$0, $$1, this.t, this.u);
      fcy.a($$0, (float)(this.t + 141), (float)(this.u + 75), 25, M, N, null, this.U);
   }

   @Override
   public void a(cgr $$0, int $$1, clo $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(clo $$0) {
      if (this.U != null) {
         for (bla $$1 : bla.values()) {
            this.U.a($$1, clo.b);
         }

         if (!$$0.b()) {
            clo $$2 = $$0.p();
            if ($$0.d() instanceof ciy $$3) {
               this.U.a($$3.g(), $$2);
            } else {
               this.U.a(bla.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(eut $$0, int $$1, int $$2) {
      if (this.G()) {
         $$0.a(x, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(eut $$0, int $$1, int $$2) {
      Optional<uv> $$3 = Optional.empty();
      if (this.G() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(B);
      }

      if (this.r != null) {
         clo $$4 = this.p.b(0).f();
         clo $$5 = this.r.f();
         if ($$4.b()) {
            if (this.r.e == 0) {
               $$3 = Optional.of(A);
            }
         } else if ($$4.d() instanceof cmq $$6 && $$5.b()) {
            if (this.r.e == 1) {
               $$3 = Optional.of($$6.i());
            } else if (this.r.e == 2) {
               $$3 = Optional.of($$6.x());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.i, this.i.c($$3x, 115), $$1, $$2));
   }

   private boolean G() {
      return this.p.b(0).g() && this.p.b(1).g() && this.p.b(2).g() && !this.p.b(this.p.o()).g();
   }
}
