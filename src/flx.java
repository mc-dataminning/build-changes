import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class flx extends fln<col> {
   private static final ajt A = new ajt("container/smithing/error");
   private static final ajt B = new ajt("item/empty_slot_smithing_template_armor_trim");
   private static final ajt C = new ajt("item/empty_slot_smithing_template_netherite_upgrade");
   private static final wg D = wg.c("container.upgrade.missing_template_tooltip");
   private static final wg E = wg.c("container.upgrade.error_tooltip");
   private static final List<ajt> F = List.of(B, C);
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
   private final flc U = new flc(0);
   private final flc V = new flc(1);
   private final flc W = new flc(2);
   @Nullable
   private cft X;

   public flx(col $$0, cjs $$1, wg $$2) {
      super($$0, $$1, $$2, new ajt("textures/gui/container/smithing.png"));
      this.o = 44;
      this.p = 15;
   }

   @Override
   protected void E() {
      this.X = new cft(this.j.r, 0.0, 0.0, 0.0);
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
      Optional<csk> $$0 = this.F();
      this.U.a(F);
      this.V.a($$0.map(csk::k).orElse(List.of()));
      this.W.a($$0.map(csk::l).orElse(List.of()));
   }

   private Optional<csk> F() {
      crj $$0 = this.s.b(0).g();
      return !$$0.d() && $$0.f() instanceof csk $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.U.a(this.s, $$0, $$1, this.w, this.x);
      this.V.a(this.s, $$0, $$1, this.w, this.x);
      this.W.a(this.s, $$0, $$1, this.w, this.x);
      flm.a($$0, (float)(this.w + 141), (float)(this.x + 75), 25.0F, P, Q, null, this.X);
   }

   @Override
   public void a(cmp $$0, int $$1, crj $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(crj $$0) {
      if (this.X != null) {
         for (bqc $$1 : bqc.values()) {
            this.X.a($$1, crj.i);
         }

         if (!$$0.d()) {
            crj $$2 = $$0.r();
            if ($$0.f() instanceof coy $$3) {
               this.X.a($$3.k(), $$2);
            } else {
               this.X.a(bqc.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(fdc $$0, int $$1, int $$2) {
      if (this.I()) {
         $$0.a(A, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fdc $$0, int $$1, int $$2) {
      Optional<wg> $$3 = Optional.empty();
      if (this.I() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(E);
      }

      if (this.v != null) {
         crj $$4 = this.s.b(0).g();
         crj $$5 = this.v.g();
         if ($$4.d()) {
            if (this.v.e == 0) {
               $$3 = Optional.of(D);
            }
         } else if ($$4.f() instanceof csk $$6 && $$5.d()) {
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
