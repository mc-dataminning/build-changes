import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fpp extends fpf<cru> {
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
   private final fou X = new fou(0);
   private final fou Y = new fou(1);
   private final fou Z = new fou(2);
   @Nullable
   private ciz aa;

   public fpp(cru $$0, cmy $$1, xp $$2) {
      super($$0, $$1, $$2, new alf("textures/gui/container/smithing.png"));
      this.r = 44;
      this.s = 15;
   }

   @Override
   protected void I() {
      this.aa = new ciz(this.m.r, 0.0, 0.0, 0.0);
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
      Optional<cvv> $$0 = this.J();
      this.X.a(I);
      this.Y.a($$0.map(cvv::m).orElse(List.of()));
      this.Z.a($$0.map(cvv::n).orElse(List.of()));
   }

   private Optional<cvv> J() {
      cur $$0 = this.w.b(0).g();
      return !$$0.e() && $$0.g() instanceof cvv $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fgt $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.X.a(this.w, $$0, $$1, this.z, this.A);
      this.Y.a(this.w, $$0, $$1, this.z, this.A);
      this.Z.a(this.w, $$0, $$1, this.z, this.A);
      fpe.a($$0, (float)(this.z + 141), (float)(this.A + 75), 25.0F, S, T, null, this.aa);
   }

   @Override
   public void a(cpw $$0, int $$1, cur $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cur $$0) {
      if (this.aa != null) {
         for (btd $$1 : btd.values()) {
            this.aa.a($$1, cur.l);
         }

         if (!$$0.e()) {
            cur $$2 = $$0.s();
            if ($$0.g() instanceof csg $$3) {
               this.aa.a($$3.m(), $$2);
            } else {
               this.aa.a(btd.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(fgt $$0, int $$1, int $$2) {
      if (this.K()) {
         $$0.a(D, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fgt $$0, int $$1, int $$2) {
      Optional<xp> $$3 = Optional.empty();
      if (this.K() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(H);
      }

      if (this.y != null) {
         cur $$4 = this.w.b(0).g();
         cur $$5 = this.y.g();
         if ($$4.e()) {
            if (this.y.d == 0) {
               $$3 = Optional.of(G);
            }
         } else if ($$4.g() instanceof cvv $$6 && $$5.e()) {
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
