import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ffw extends ffm<ckf> {
   private static final ahh x = new ahh("container/smithing/error");
   private static final ahh y = new ahh("item/empty_slot_smithing_template_armor_trim");
   private static final ahh z = new ahh("item/empty_slot_smithing_template_netherite_upgrade");
   private static final vg A = vg.c("container.upgrade.missing_template_tooltip");
   private static final vg B = vg.c("container.upgrade.error_tooltip");
   private static final List<ahh> C = List.of(y, z);
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
   private final ffb R = new ffb(0);
   private final ffb S = new ffb(1);
   private final ffb T = new ffb(2);
   @Nullable
   private cbr U;

   public ffw(ckf $$0, cfp $$1, vg $$2) {
      super($$0, $$1, $$2, new ahh("textures/gui/container/smithing.png"));
      this.l = 44;
      this.m = 15;
   }

   @Override
   protected void I() {
      this.U = new cbr(this.f.r, 0.0, 0.0, 0.0);
      this.U.s(true);
      this.U.a(true);
      this.U.aU = 210.0F;
      this.U.s(25.0F);
      this.U.aW = this.U.dB();
      this.U.aX = this.U.dB();
      this.b(this.p.b(3).g());
   }

   @Override
   public void E() {
      super.E();
      Optional<coi> $$0 = this.J();
      this.R.a(C);
      this.S.a($$0.map(coi::y).orElse(List.of()));
      this.T.a($$0.map(coi::z).orElse(List.of()));
   }

   private Optional<coi> J() {
      cng $$0 = this.p.b(0).g();
      return !$$0.b() && $$0.d() instanceof coi $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(exe $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.R.a(this.p, $$0, $$1, this.t, this.u);
      this.S.a(this.p, $$0, $$1, this.t, this.u);
      this.T.a(this.p, $$0, $$1, this.t, this.u);
      ffl.a($$0, (float)(this.t + 141), (float)(this.u + 75), 25, M, N, null, this.U);
   }

   @Override
   public void a(cij $$0, int $$1, cng $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cng $$0) {
      if (this.U != null) {
         for (bmd $$1 : bmd.values()) {
            this.U.a($$1, cng.f);
         }

         if (!$$0.b()) {
            cng $$2 = $$0.p();
            if ($$0.d() instanceof ckr $$3) {
               this.U.a($$3.g(), $$2);
            } else {
               this.U.a(bmd.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(exe $$0, int $$1, int $$2) {
      if (this.K()) {
         $$0.a(x, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(exe $$0, int $$1, int $$2) {
      Optional<vg> $$3 = Optional.empty();
      if (this.K() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(B);
      }

      if (this.r != null) {
         cng $$4 = this.p.b(0).g();
         cng $$5 = this.r.g();
         if ($$4.b()) {
            if (this.r.e == 0) {
               $$3 = Optional.of(A);
            }
         } else if ($$4.d() instanceof coi $$6 && $$5.b()) {
            if (this.r.e == 1) {
               $$3 = Optional.of($$6.w());
            } else if (this.r.e == 2) {
               $$3 = Optional.of($$6.x());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.i, this.i.c($$3x, 115), $$1, $$2));
   }

   private boolean K() {
      return this.p.b(0).h() && this.p.b(1).h() && this.p.b(2).h() && !this.p.b(this.p.o()).h();
   }
}
