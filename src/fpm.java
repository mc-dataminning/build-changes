import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fpm extends fpc<crr> {
   private static final ale D = new ale("container/smithing/error");
   private static final ale E = new ale("item/empty_slot_smithing_template_armor_trim");
   private static final ale F = new ale("item/empty_slot_smithing_template_netherite_upgrade");
   private static final xo G = xo.c("container.upgrade.missing_template_tooltip");
   private static final xo H = xo.c("container.upgrade.error_tooltip");
   private static final List<ale> I = List.of(E, F);
   private static final int J = 44;
   private static final int K = 15;
   private static final int L = 28;
   private static final int M = 21;
   private static final int N = 65;
   private static final int O = 46;
   private static final int P = 115;
   private static final int Q = 210;
   private static final int R = 25;
   private static final Vector3f S = new Vector3f();
   private static final Quaternionf T = new Quaternionf().rotationXYZ(0.43633232F, 0.0F, (float) Math.PI);
   private static final int U = 25;
   private static final int V = 75;
   private static final int W = 141;
   private final foq X = new foq(0);
   private final foq Y = new foq(1);
   private final foq Z = new foq(2);
   @Nullable
   private ciw aa;

   public fpm(crr $$0, cmv $$1, xo $$2) {
      super($$0, $$1, $$2, new ale("textures/gui/container/smithing.png"));
      this.r = 44;
      this.s = 15;
   }

   @Override
   protected void I() {
      this.aa = new ciw(this.m.r, 0.0, 0.0, 0.0);
      this.aa.b(true);
      this.aa.a(true);
      this.aa.aY = 210.0F;
      this.aa.s(25.0F);
      this.aa.ba = this.aa.dF();
      this.aa.bb = this.aa.dF();
      this.b(this.w.b(3).g());
   }

   @Override
   public void E() {
      super.E();
      Optional<cvs> $$0 = this.J();
      this.X.a(I);
      this.Y.a($$0.map(cvs::m).orElse(List.of()));
      this.Z.a($$0.map(cvs::n).orElse(List.of()));
   }

   private Optional<cvs> J() {
      cuo $$0 = this.w.b(0).g();
      return !$$0.e() && $$0.g() instanceof cvs $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fgq $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.X.a(this.w, $$0, $$1, this.z, this.A);
      this.Y.a(this.w, $$0, $$1, this.z, this.A);
      this.Z.a(this.w, $$0, $$1, this.z, this.A);
      fpb.a($$0, (float)(this.z + 141), (float)(this.A + 75), 25.0F, S, T, null, this.aa);
   }

   @Override
   public void a(cpt $$0, int $$1, cuo $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cuo $$0) {
      if (this.aa != null) {
         for (bta $$1 : bta.values()) {
            this.aa.a($$1, cuo.l);
         }

         if (!$$0.e()) {
            cuo $$2 = $$0.s();
            if ($$0.g() instanceof csd $$3) {
               this.aa.a($$3.m(), $$2);
            } else {
               this.aa.a(bta.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(fgq $$0, int $$1, int $$2) {
      if (this.K()) {
         $$0.a(D, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fgq $$0, int $$1, int $$2) {
      Optional<xo> $$3 = Optional.empty();
      if (this.K() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(H);
      }

      if (this.y != null) {
         cuo $$4 = this.w.b(0).g();
         cuo $$5 = this.y.g();
         if ($$4.e()) {
            if (this.y.d == 0) {
               $$3 = Optional.of(G);
            }
         } else if ($$4.g() instanceof cvs $$6 && $$5.e()) {
            if (this.y.d == 1) {
               $$3 = Optional.of($$6.k());
            } else if (this.y.d == 2) {
               $$3 = Optional.of($$6.l());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.p, this.p.c($$3x, 115), $$1, $$2));
   }

   private boolean K() {
      return this.w.b(0).h() && this.w.b(1).h() && this.w.b(2).h() && !this.w.b(this.w.o()).h();
   }
}
