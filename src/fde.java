import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fde extends fcu<cii> {
   private static final agi x = new agi("container/smithing/error");
   private static final agi y = new agi("item/empty_slot_smithing_template_armor_trim");
   private static final agi z = new agi("item/empty_slot_smithing_template_netherite_upgrade");
   private static final ur A = ur.c("container.upgrade.missing_template_tooltip");
   private static final ur B = ur.c("container.upgrade.error_tooltip");
   private static final List<agi> C = List.of(y, z);
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
   private final fcj R = new fcj(0);
   private final fcj S = new fcj(1);
   private final fcj T = new fcj(2);
   @Nullable
   private cad U;

   public fde(cii $$0, cdt $$1, ur $$2) {
      super($$0, $$1, $$2, new agi("textures/gui/container/smithing.png"));
      this.l = 44;
      this.m = 15;
   }

   @Override
   protected void E() {
      this.U = new cad(this.f.r, 0.0, 0.0, 0.0);
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
      Optional<cml> $$0 = this.F();
      this.R.a(C);
      this.S.a($$0.map(cml::y).orElse(List.of()));
      this.T.a($$0.map(cml::z).orElse(List.of()));
   }

   private Optional<cml> F() {
      clj $$0 = this.p.b(0).f();
      return !$$0.b() && $$0.d() instanceof cml $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(euo $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.R.a(this.p, $$0, $$1, this.t, this.u);
      this.S.a(this.p, $$0, $$1, this.t, this.u);
      this.T.a(this.p, $$0, $$1, this.t, this.u);
      fct.a($$0, (float)(this.t + 141), (float)(this.u + 75), 25, M, N, null, this.U);
   }

   @Override
   public void a(cgm $$0, int $$1, clj $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(clj $$0) {
      if (this.U != null) {
         for (bkv $$1 : bkv.values()) {
            this.U.a($$1, clj.b);
         }

         if (!$$0.b()) {
            clj $$2 = $$0.p();
            if ($$0.d() instanceof cit $$3) {
               this.U.a($$3.g(), $$2);
            } else {
               this.U.a(bkv.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(euo $$0, int $$1, int $$2) {
      if (this.G()) {
         $$0.a(x, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(euo $$0, int $$1, int $$2) {
      Optional<ur> $$3 = Optional.empty();
      if (this.G() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(B);
      }

      if (this.r != null) {
         clj $$4 = this.p.b(0).f();
         clj $$5 = this.r.f();
         if ($$4.b()) {
            if (this.r.e == 0) {
               $$3 = Optional.of(A);
            }
         } else if ($$4.d() instanceof cml $$6 && $$5.b()) {
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
