import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ffl extends ffb<cjx> {
   private static final ahg x = new ahg("container/smithing/error");
   private static final ahg y = new ahg("item/empty_slot_smithing_template_armor_trim");
   private static final ahg z = new ahg("item/empty_slot_smithing_template_netherite_upgrade");
   private static final vf A = vf.c("container.upgrade.missing_template_tooltip");
   private static final vf B = vf.c("container.upgrade.error_tooltip");
   private static final List<ahg> C = List.of(y, z);
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
   private final feq R = new feq(0);
   private final feq S = new feq(1);
   private final feq T = new feq(2);
   @Nullable
   private cbk U;

   public ffl(cjx $$0, cfh $$1, vf $$2) {
      super($$0, $$1, $$2, new ahg("textures/gui/container/smithing.png"));
      this.l = 44;
      this.m = 15;
   }

   @Override
   protected void H() {
      this.U = new cbk(this.f.r, 0.0, 0.0, 0.0);
      this.U.s(true);
      this.U.a(true);
      this.U.aU = 210.0F;
      this.U.s(25.0F);
      this.U.aW = this.U.dC();
      this.U.aX = this.U.dC();
      this.b(this.p.b(3).g());
   }

   @Override
   public void D() {
      super.D();
      Optional<coa> $$0 = this.I();
      this.R.a(C);
      this.S.a($$0.map(coa::y).orElse(List.of()));
      this.T.a($$0.map(coa::z).orElse(List.of()));
   }

   private Optional<coa> I() {
      cmy $$0 = this.p.b(0).g();
      return !$$0.b() && $$0.d() instanceof coa $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(ewu $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.R.a(this.p, $$0, $$1, this.t, this.u);
      this.S.a(this.p, $$0, $$1, this.t, this.u);
      this.T.a(this.p, $$0, $$1, this.t, this.u);
      ffa.a($$0, (float)(this.t + 141), (float)(this.u + 75), 25, M, N, null, this.U);
   }

   @Override
   public void a(cib $$0, int $$1, cmy $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cmy $$0) {
      if (this.U != null) {
         for (bma $$1 : bma.values()) {
            this.U.a($$1, cmy.f);
         }

         if (!$$0.b()) {
            cmy $$2 = $$0.p();
            if ($$0.d() instanceof cki $$3) {
               this.U.a($$3.g(), $$2);
            } else {
               this.U.a(bma.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(ewu $$0, int $$1, int $$2) {
      if (this.J()) {
         $$0.a(x, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(ewu $$0, int $$1, int $$2) {
      Optional<vf> $$3 = Optional.empty();
      if (this.J() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(B);
      }

      if (this.r != null) {
         cmy $$4 = this.p.b(0).g();
         cmy $$5 = this.r.g();
         if ($$4.b()) {
            if (this.r.e == 0) {
               $$3 = Optional.of(A);
            }
         } else if ($$4.d() instanceof coa $$6 && $$5.b()) {
            if (this.r.e == 1) {
               $$3 = Optional.of($$6.i());
            } else if (this.r.e == 2) {
               $$3 = Optional.of($$6.x());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.i, this.i.c($$3x, 115), $$1, $$2));
   }

   private boolean J() {
      return this.p.b(0).h() && this.p.b(1).h() && this.p.b(2).h() && !this.p.b(this.p.o()).h();
   }
}
