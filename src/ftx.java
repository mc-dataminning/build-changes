import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ftx extends ftn<ctz> {
   private static final alj G = alj.b("container/smithing/error");
   private static final alj H = alj.b("item/empty_slot_smithing_template_armor_trim");
   private static final alj I = alj.b("item/empty_slot_smithing_template_netherite_upgrade");
   private static final xj J = xj.c("container.upgrade.missing_template_tooltip");
   private static final xj K = xj.c("container.upgrade.error_tooltip");
   private static final List<alj> L = List.of(H, I);
   private static final int M = 44;
   private static final int N = 15;
   private static final int O = 28;
   private static final int P = 21;
   private static final int Q = 65;
   private static final int R = 46;
   private static final int S = 115;
   private static final int T = 210;
   private static final int U = 25;
   private static final Vector3f V = new Vector3f();
   private static final Quaternionf W = new Quaternionf().rotationXYZ(0.43633232F, 0.0F, (float) Math.PI);
   private static final int X = 25;
   private static final int Y = 75;
   private static final int Z = 141;
   private final ftc aa = new ftc(0);
   private final ftc ab = new ftc(1);
   private final ftc ac = new ftc(2);
   @Nullable
   private ckr ad;

   public ftx(ctz $$0, cot $$1, xj $$2) {
      super($$0, $$1, $$2, alj.b("textures/gui/container/smithing.png"));
      this.v = 44;
      this.w = 15;
   }

   @Override
   protected void J() {
      this.ad = new ckr(this.m.s, 0.0, 0.0, 0.0);
      this.ad.b(true);
      this.ad.a(true);
      this.ad.aW = 210.0F;
      this.ad.w(25.0F);
      this.ad.aY = this.ad.dL();
      this.ad.aZ = this.ad.dL();
      this.b(this.z.b(3).g());
   }

   @Override
   public void F() {
      super.F();
      Optional<cxs> $$0 = this.K();
      this.aa.a(L);
      this.ab.a($$0.map(cxs::d).orElse(List.of()));
      this.ac.a($$0.map(cxs::p).orElse(List.of()));
   }

   private Optional<cxs> K() {
      cwm $$0 = this.z.b(0).g();
      return !$$0.f() && $$0.h() instanceof cxs $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(flq $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.aa.a(this.z, $$0, $$1, this.C, this.D);
      this.ab.a(this.z, $$0, $$1, this.C, this.D);
      this.ac.a(this.z, $$0, $$1, this.C, this.D);
      ftm.a($$0, (float)(this.C + 141), (float)(this.D + 75), 25.0F, V, W, null, this.ad);
   }

   @Override
   public void a(crz $$0, int $$1, cwm $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cwm $$0) {
      if (this.ad != null) {
         for (but $$1 : but.i) {
            this.ad.a($$1, cwm.k);
         }

         if (!$$0.f()) {
            ddy $$2 = $$0.a(ku.D);
            but $$3 = $$2 != null ? $$2.a() : but.b;
            this.ad.a($$3, $$0.v());
         }
      }
   }

   @Override
   protected void c(flq $$0, int $$1, int $$2) {
      if (this.L()) {
         $$0.a(gjq::B, G, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(flq $$0, int $$1, int $$2) {
      Optional<xj> $$3 = Optional.empty();
      if (this.L() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(K);
      }

      if (this.B != null) {
         cwm $$4 = this.z.b(0).g();
         cwm $$5 = this.B.g();
         if ($$4.f()) {
            if (this.B.d == 0) {
               $$3 = Optional.of(J);
            }
         } else if ($$4.h() instanceof cxs $$6 && $$5.f()) {
            if (this.B.d == 1) {
               $$3 = Optional.of($$6.b());
            } else if (this.B.d == 2) {
               $$3 = Optional.of($$6.c());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.p, this.p.c($$3x, 115), $$1, $$2));
   }

   private boolean L() {
      return this.z.b(0).h() && this.z.b(1).h() && this.z.b(2).h() && !this.z.b(this.z.o()).h();
   }
}
