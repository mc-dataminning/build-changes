import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class frb extends fqp<crh> {
   private static final akt D = new akt("container/smithing/error");
   private static final akt E = new akt("item/empty_slot_smithing_template_armor_trim");
   private static final akt F = new akt("item/empty_slot_smithing_template_netherite_upgrade");
   private static final xe G = xe.c("container.upgrade.missing_template_tooltip");
   private static final xe H = xe.c("container.upgrade.error_tooltip");
   private static final List<akt> I = List.of(E, F);
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
   private final fqd X = new fqd(0);
   private final fqd Y = new fqd(1);
   private final fqd Z = new fqd(2);
   @Nullable
   private chw aa;

   public frb(crh $$0, clx $$1, xe $$2) {
      super($$0, $$1, $$2, new akt("textures/gui/container/smithing.png"));
      this.r = 44;
      this.s = 15;
   }

   @Override
   protected void E() {
      this.aa = new chw(this.m.r, 0.0, 0.0, 0.0);
      this.aa.b(true);
      this.aa.a(true);
      this.aa.bj = 210.0F;
      this.aa.s(25.0F);
      this.aa.bl = this.aa.dK();
      this.aa.bm = this.aa.dK();
      this.b(this.w.b(3).g());
   }

   @Override
   public void C() {
      super.C();
      Optional<cvt> $$0 = this.F();
      this.X.a(I);
      this.Y.a($$0.map(cvt::j).orElse(List.of()));
      this.Z.a($$0.map(cvt::k).orElse(List.of()));
   }

   private Optional<cvt> F() {
      cuh $$0 = this.w.b(0).g();
      return !$$0.d() && $$0.f() instanceof cvt $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fia $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.X.a(this.w, $$0, $$1, this.z, this.A);
      this.Y.a(this.w, $$0, $$1, this.z, this.A);
      this.Z.a(this.w, $$0, $$1, this.z, this.A);
      fqo.a($$0, (float)(this.z + 141), (float)(this.A + 75), 25.0F, S, T, null, this.aa);
   }

   @Override
   public void a(cpg $$0, int $$1, cuh $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cuh $$0) {
      if (this.aa != null) {
         for (bsc $$1 : bsc.values()) {
            this.aa.a($$1, cuh.i);
         }

         if (!$$0.d()) {
            cuh $$2 = $$0.r();
            if ($$0.f() instanceof crt $$3) {
               this.aa.a($$3.k(), $$2);
            } else {
               this.aa.a(bsc.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(fia $$0, int $$1, int $$2) {
      if (this.I()) {
         $$0.a(D, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fia $$0, int $$1, int $$2) {
      Optional<xe> $$3 = Optional.empty();
      if (this.I() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(H);
      }

      if (this.y != null) {
         cuh $$4 = this.w.b(0).g();
         cuh $$5 = this.y.g();
         if ($$4.d()) {
            if (this.y.e == 0) {
               $$3 = Optional.of(G);
            }
         } else if ($$4.f() instanceof cvt $$6 && $$5.d()) {
            if (this.y.e == 1) {
               $$3 = Optional.of($$6.h());
            } else if (this.y.e == 2) {
               $$3 = Optional.of($$6.i());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.p, this.p.c($$3x, 115), $$1, $$2));
   }

   private boolean I() {
      return this.w.b(0).h() && this.w.b(1).h() && this.w.b(2).h() && !this.w.b(this.w.o()).h();
   }
}
