import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fpi extends foy<crn> {
   private static final alb D = new alb("container/smithing/error");
   private static final alb E = new alb("item/empty_slot_smithing_template_armor_trim");
   private static final alb F = new alb("item/empty_slot_smithing_template_netherite_upgrade");
   private static final xl G = xl.c("container.upgrade.missing_template_tooltip");
   private static final xl H = xl.c("container.upgrade.error_tooltip");
   private static final List<alb> I = List.of(E, F);
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
   private final fom X = new fom(0);
   private final fom Y = new fom(1);
   private final fom Z = new fom(2);
   @Nullable
   private cis aa;

   public fpi(crn $$0, cmr $$1, xl $$2) {
      super($$0, $$1, $$2, new alb("textures/gui/container/smithing.png"));
      this.r = 44;
      this.s = 15;
   }

   @Override
   protected void E() {
      this.aa = new cis(this.m.r, 0.0, 0.0, 0.0);
      this.aa.b(true);
      this.aa.a(true);
      this.aa.aY = 210.0F;
      this.aa.s(25.0F);
      this.aa.ba = this.aa.dF();
      this.aa.bb = this.aa.dF();
      this.b(this.w.b(3).g());
   }

   @Override
   public void C() {
      super.C();
      Optional<cvo> $$0 = this.F();
      this.X.a(I);
      this.Y.a($$0.map(cvo::m).orElse(List.of()));
      this.Z.a($$0.map(cvo::n).orElse(List.of()));
   }

   private Optional<cvo> F() {
      cuk $$0 = this.w.b(0).g();
      return !$$0.e() && $$0.g() instanceof cvo $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fgm $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.X.a(this.w, $$0, $$1, this.z, this.A);
      this.Y.a(this.w, $$0, $$1, this.z, this.A);
      this.Z.a(this.w, $$0, $$1, this.z, this.A);
      fox.a($$0, (float)(this.z + 141), (float)(this.A + 75), 25.0F, S, T, null, this.aa);
   }

   @Override
   public void a(cpp $$0, int $$1, cuk $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cuk $$0) {
      if (this.aa != null) {
         for (bsw $$1 : bsw.values()) {
            this.aa.a($$1, cuk.l);
         }

         if (!$$0.e()) {
            cuk $$2 = $$0.s();
            if ($$0.g() instanceof crz $$3) {
               this.aa.a($$3.m(), $$2);
            } else {
               this.aa.a(bsw.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(fgm $$0, int $$1, int $$2) {
      if (this.I()) {
         $$0.a(D, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fgm $$0, int $$1, int $$2) {
      Optional<xl> $$3 = Optional.empty();
      if (this.I() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(H);
      }

      if (this.y != null) {
         cuk $$4 = this.w.b(0).g();
         cuk $$5 = this.y.g();
         if ($$4.e()) {
            if (this.y.d == 0) {
               $$3 = Optional.of(G);
            }
         } else if ($$4.g() instanceof cvo $$6 && $$5.e()) {
            if (this.y.d == 1) {
               $$3 = Optional.of($$6.k());
            } else if (this.y.d == 2) {
               $$3 = Optional.of($$6.l());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.p, this.p.c($$3x, 115), $$1, $$2));
   }

   private boolean I() {
      return this.w.b(0).h() && this.w.b(1).h() && this.w.b(2).h() && !this.w.b(this.w.o()).h();
   }
}
