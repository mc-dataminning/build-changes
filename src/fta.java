import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fta extends fsq<cto> {
   private static final ali G = ali.b("container/smithing/error");
   private static final ali H = ali.b("item/empty_slot_smithing_template_armor_trim");
   private static final ali I = ali.b("item/empty_slot_smithing_template_netherite_upgrade");
   private static final xi J = xi.c("container.upgrade.missing_template_tooltip");
   private static final xi K = xi.c("container.upgrade.error_tooltip");
   private static final List<ali> L = List.of(H, I);
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
   private final fsf aa = new fsf(0);
   private final fsf ab = new fsf(1);
   private final fsf ac = new fsf(2);
   @Nullable
   private ckk ad;

   public fta(cto $$0, col $$1, xi $$2) {
      super($$0, $$1, $$2, ali.b("textures/gui/container/smithing.png"));
      this.v = 44;
      this.w = 15;
   }

   @Override
   protected void F() {
      this.ad = new ckk(this.m.s, 0.0, 0.0, 0.0);
      this.ad.b(true);
      this.ad.a(true);
      this.ad.aX = 210.0F;
      this.ad.w(25.0F);
      this.ad.aZ = this.ad.dN();
      this.ad.ba = this.ad.dN();
      this.b(this.z.b(3).g());
   }

   @Override
   public void D() {
      super.D();
      Optional<cxh> $$0 = this.G();
      this.aa.a(L);
      this.ab.a($$0.map(cxh::d).orElse(List.of()));
      this.ac.a($$0.map(cxh::p).orElse(List.of()));
   }

   private Optional<cxh> G() {
      cwb $$0 = this.z.b(0).g();
      return !$$0.f() && $$0.h() instanceof cxh $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fku $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.aa.a(this.z, $$0, $$1, this.C, this.D);
      this.ab.a(this.z, $$0, $$1, this.C, this.D);
      this.ac.a(this.z, $$0, $$1, this.C, this.D);
      fsp.a($$0, (float)(this.C + 141), (float)(this.D + 75), 25.0F, V, W, null, this.ad);
   }

   @Override
   public void a(cro $$0, int $$1, cwb $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cwb $$0) {
      if (this.ad != null) {
         for (bum $$1 : bum.i) {
            this.ad.a($$1, cwb.k);
         }

         if (!$$0.f()) {
            ddn $$2 = $$0.a(ku.D);
            bum $$3 = $$2 != null ? $$2.a() : bum.b;
            this.ad.a($$3, $$0.v());
         }
      }
   }

   @Override
   protected void c(fku $$0, int $$1, int $$2) {
      if (this.J()) {
         $$0.a(gir::B, G, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fku $$0, int $$1, int $$2) {
      Optional<xi> $$3 = Optional.empty();
      if (this.J() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(K);
      }

      if (this.B != null) {
         cwb $$4 = this.z.b(0).g();
         cwb $$5 = this.B.g();
         if ($$4.f()) {
            if (this.B.d == 0) {
               $$3 = Optional.of(J);
            }
         } else if ($$4.h() instanceof cxh $$6 && $$5.f()) {
            if (this.B.d == 1) {
               $$3 = Optional.of($$6.b());
            } else if (this.B.d == 2) {
               $$3 = Optional.of($$6.c());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.p, this.p.c($$3x, 115), $$1, $$2));
   }

   private boolean J() {
      return this.z.b(0).h() && this.z.b(1).h() && this.z.b(2).h() && !this.z.b(this.z.o()).h();
   }
}
