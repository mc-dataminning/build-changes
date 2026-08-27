import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fhv extends fhl<cmb> {
   private static final aiy x = new aiy("container/smithing/error");
   private static final aiy y = new aiy("item/empty_slot_smithing_template_armor_trim");
   private static final aiy z = new aiy("item/empty_slot_smithing_template_netherite_upgrade");
   private static final vq A = vq.c("container.upgrade.missing_template_tooltip");
   private static final vq B = vq.c("container.upgrade.error_tooltip");
   private static final List<aiy> C = List.of(y, z);
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
   private final fha R = new fha(0);
   private final fha S = new fha(1);
   private final fha T = new fha(2);
   @Nullable
   private cdm U;

   public fhv(cmb $$0, chk $$1, vq $$2) {
      super($$0, $$1, $$2, new aiy("textures/gui/container/smithing.png"));
      this.l = 44;
      this.m = 15;
   }

   @Override
   protected void I() {
      this.U = new cdm(this.f.r, 0.0, 0.0, 0.0);
      this.U.s(true);
      this.U.a(true);
      this.U.aU = 210.0F;
      this.U.s(25.0F);
      this.U.aW = this.U.dC();
      this.U.aX = this.U.dC();
      this.b(this.p.b(3).g());
   }

   @Override
   public void E() {
      super.E();
      Optional<cqf> $$0 = this.J();
      this.R.a(C);
      this.S.a($$0.map(cqf::y).orElse(List.of()));
      this.T.a($$0.map(cqf::z).orElse(List.of()));
   }

   private Optional<cqf> J() {
      cpd $$0 = this.p.b(0).g();
      return !$$0.b() && $$0.d() instanceof cqf $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(ezb $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.R.a(this.p, $$0, $$1, this.t, this.u);
      this.S.a(this.p, $$0, $$1, this.t, this.u);
      this.T.a(this.p, $$0, $$1, this.t, this.u);
      fhk.a($$0, (float)(this.t + 141), (float)(this.u + 75), 25.0F, M, N, null, this.U);
   }

   @Override
   public void a(ckf $$0, int $$1, cpd $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cpd $$0) {
      if (this.U != null) {
         for (bnx $$1 : bnx.values()) {
            this.U.a($$1, cpd.h);
         }

         if (!$$0.b()) {
            cpd $$2 = $$0.q();
            if ($$0.d() instanceof cmn $$3) {
               this.U.a($$3.g(), $$2);
            } else {
               this.U.a(bnx.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(ezb $$0, int $$1, int $$2) {
      if (this.K()) {
         $$0.a(x, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(ezb $$0, int $$1, int $$2) {
      Optional<vq> $$3 = Optional.empty();
      if (this.K() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(B);
      }

      if (this.r != null) {
         cpd $$4 = this.p.b(0).g();
         cpd $$5 = this.r.g();
         if ($$4.b()) {
            if (this.r.e == 0) {
               $$3 = Optional.of(A);
            }
         } else if ($$4.d() instanceof cqf $$6 && $$5.b()) {
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
