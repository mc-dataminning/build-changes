import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fqe extends fpu<crt> {
   private static final akr E = akr.b("container/smithing/error");
   private static final akr F = akr.b("item/empty_slot_smithing_template_armor_trim");
   private static final akr G = akr.b("item/empty_slot_smithing_template_netherite_upgrade");
   private static final wz H = wz.c("container.upgrade.missing_template_tooltip");
   private static final wz I = wz.c("container.upgrade.error_tooltip");
   private static final List<akr> J = List.of(F, G);
   private static final int K = 44;
   private static final int L = 15;
   private static final int M = 28;
   private static final int N = 21;
   private static final int O = 65;
   private static final int P = 46;
   private static final int Q = 115;
   private static final int R = 210;
   private static final int S = 25;
   private static final Vector3f T = new Vector3f();
   private static final Quaternionf U = new Quaternionf().rotationXYZ(0.43633232F, 0.0F, (float) Math.PI);
   private static final int V = 25;
   private static final int W = 75;
   private static final int X = 141;
   private final fpj Y = new fpj(0);
   private final fpj Z = new fpj(1);
   private final fpj aa = new fpj(2);
   @Nullable
   private ciw ab;

   public fqe(crt $$0, cmw $$1, wz $$2) {
      super($$0, $$1, $$2, akr.b("textures/gui/container/smithing.png"));
      this.s = 44;
      this.u = 15;
   }

   @Override
   protected void E() {
      this.ab = new ciw(this.l.r, 0.0, 0.0, 0.0);
      this.ab.b(true);
      this.ab.a(true);
      this.ab.aY = 210.0F;
      this.ab.u(25.0F);
      this.ab.ba = this.ab.dE();
      this.ab.bb = this.ab.dE();
      this.b(this.x.b(3).g());
   }

   @Override
   public void C() {
      super.C();
      Optional<cvx> $$0 = this.F();
      this.Y.a(J);
      this.Z.a($$0.map(cvx::m).orElse(List.of()));
      this.aa.a($$0.map(cvx::n).orElse(List.of()));
   }

   private Optional<cvx> F() {
      cuq $$0 = this.x.b(0).g();
      return !$$0.e() && $$0.g() instanceof cvx $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fhz $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.Y.a(this.x, $$0, $$1, this.A, this.B);
      this.Z.a(this.x, $$0, $$1, this.A, this.B);
      this.aa.a(this.x, $$0, $$1, this.A, this.B);
      fpt.a($$0, (float)(this.A + 141), (float)(this.B + 75), 25.0F, T, U, null, this.ab);
   }

   @Override
   public void a(cpu $$0, int $$1, cuq $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cuq $$0) {
      if (this.ab != null) {
         for (bsy $$1 : bsy.values()) {
            this.ab.a($$1, cuq.l);
         }

         if (!$$0.e()) {
            cuq $$2 = $$0.s();
            if ($$0.g() instanceof csf $$3) {
               this.ab.a($$3.m(), $$2);
            } else {
               this.ab.a(bsy.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(fhz $$0, int $$1, int $$2) {
      if (this.G()) {
         $$0.a(E, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fhz $$0, int $$1, int $$2) {
      Optional<wz> $$3 = Optional.empty();
      if (this.G() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(I);
      }

      if (this.z != null) {
         cuq $$4 = this.x.b(0).g();
         cuq $$5 = this.z.g();
         if ($$4.e()) {
            if (this.z.d == 0) {
               $$3 = Optional.of(H);
            }
         } else if ($$4.g() instanceof cvx $$6 && $$5.e()) {
            if (this.z.d == 1) {
               $$3 = Optional.of($$6.k());
            } else if (this.z.d == 2) {
               $$3 = Optional.of($$6.l());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.o, this.o.c($$3x, 115), $$1, $$2));
   }

   private boolean G() {
      return this.x.b(0).h() && this.x.b(1).h() && this.x.b(2).h() && !this.x.b(this.x.o()).h();
   }
}
