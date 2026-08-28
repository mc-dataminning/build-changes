import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fpo extends fpe<crt> {
   private static final alf D = new alf("container/smithing/error");
   private static final alf E = new alf("item/empty_slot_smithing_template_armor_trim");
   private static final alf F = new alf("item/empty_slot_smithing_template_netherite_upgrade");
   private static final xp G = xp.c("container.upgrade.missing_template_tooltip");
   private static final xp H = xp.c("container.upgrade.error_tooltip");
   private static final List<alf> I = List.of(E, F);
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
   private final fot X = new fot(0);
   private final fot Y = new fot(1);
   private final fot Z = new fot(2);
   @Nullable
   private ciy aa;

   public fpo(crt $$0, cmx $$1, xp $$2) {
      super($$0, $$1, $$2, new alf("textures/gui/container/smithing.png"));
      this.r = 44;
      this.s = 15;
   }

   @Override
   protected void I() {
      this.aa = new ciy(this.m.r, 0.0, 0.0, 0.0);
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
      Optional<cvu> $$0 = this.J();
      this.X.a(I);
      this.Y.a($$0.map(cvu::m).orElse(List.of()));
      this.Z.a($$0.map(cvu::n).orElse(List.of()));
   }

   private Optional<cvu> J() {
      cuq $$0 = this.w.b(0).g();
      return !$$0.e() && $$0.g() instanceof cvu $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fgs $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.X.a(this.w, $$0, $$1, this.z, this.A);
      this.Y.a(this.w, $$0, $$1, this.z, this.A);
      this.Z.a(this.w, $$0, $$1, this.z, this.A);
      fpd.a($$0, (float)(this.z + 141), (float)(this.A + 75), 25.0F, S, T, null, this.aa);
   }

   @Override
   public void a(cpv $$0, int $$1, cuq $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cuq $$0) {
      if (this.aa != null) {
         for (btc $$1 : btc.values()) {
            this.aa.a($$1, cuq.l);
         }

         if (!$$0.e()) {
            cuq $$2 = $$0.s();
            if ($$0.g() instanceof csf $$3) {
               this.aa.a($$3.m(), $$2);
            } else {
               this.aa.a(btc.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(fgs $$0, int $$1, int $$2) {
      if (this.K()) {
         $$0.a(D, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fgs $$0, int $$1, int $$2) {
      Optional<xp> $$3 = Optional.empty();
      if (this.K() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(H);
      }

      if (this.y != null) {
         cuq $$4 = this.w.b(0).g();
         cuq $$5 = this.y.g();
         if ($$4.e()) {
            if (this.y.d == 0) {
               $$3 = Optional.of(G);
            }
         } else if ($$4.g() instanceof cvu $$6 && $$5.e()) {
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
