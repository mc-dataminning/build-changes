import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class foi extends fny<cqt> {
   private static final akn D = new akn("container/smithing/error");
   private static final akn E = new akn("item/empty_slot_smithing_template_armor_trim");
   private static final akn F = new akn("item/empty_slot_smithing_template_netherite_upgrade");
   private static final wx G = wx.c("container.upgrade.missing_template_tooltip");
   private static final wx H = wx.c("container.upgrade.error_tooltip");
   private static final List<akn> I = List.of(E, F);
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
   private final fnn X = new fnn(0);
   private final fnn Y = new fnn(1);
   private final fnn Z = new fnn(2);
   @Nullable
   private chy aa;

   public foi(cqt $$0, clx $$1, wx $$2) {
      super($$0, $$1, $$2, new akn("textures/gui/container/smithing.png"));
      this.r = 44;
      this.s = 15;
   }

   @Override
   protected void E() {
      this.aa = new chy(this.m.r, 0.0, 0.0, 0.0);
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
      Optional<cuu> $$0 = this.F();
      this.X.a(I);
      this.Y.a($$0.map(cuu::m).orElse(List.of()));
      this.Z.a($$0.map(cuu::n).orElse(List.of()));
   }

   private Optional<cuu> F() {
      ctq $$0 = this.w.b(0).g();
      return !$$0.e() && $$0.g() instanceof cuu $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(ffn $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.X.a(this.w, $$0, $$1, this.z, this.A);
      this.Y.a(this.w, $$0, $$1, this.z, this.A);
      this.Z.a(this.w, $$0, $$1, this.z, this.A);
      fnx.a($$0, (float)(this.z + 141), (float)(this.A + 75), 25.0F, S, T, null, this.aa);
   }

   @Override
   public void a(cov $$0, int $$1, ctq $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(ctq $$0) {
      if (this.aa != null) {
         for (bsd $$1 : bsd.values()) {
            this.aa.a($$1, ctq.i);
         }

         if (!$$0.e()) {
            ctq $$2 = $$0.s();
            if ($$0.g() instanceof crf $$3) {
               this.aa.a($$3.m(), $$2);
            } else {
               this.aa.a(bsd.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(ffn $$0, int $$1, int $$2) {
      if (this.I()) {
         $$0.a(D, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(ffn $$0, int $$1, int $$2) {
      Optional<wx> $$3 = Optional.empty();
      if (this.I() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(H);
      }

      if (this.y != null) {
         ctq $$4 = this.w.b(0).g();
         ctq $$5 = this.y.g();
         if ($$4.e()) {
            if (this.y.d == 0) {
               $$3 = Optional.of(G);
            }
         } else if ($$4.g() instanceof cuu $$6 && $$5.e()) {
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
