import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fsh extends frx<csz> {
   private static final ale G = ale.b("container/smithing/error");
   private static final ale H = ale.b("item/empty_slot_smithing_template_armor_trim");
   private static final ale I = ale.b("item/empty_slot_smithing_template_netherite_upgrade");
   private static final xe J = xe.c("container.upgrade.missing_template_tooltip");
   private static final xe K = xe.c("container.upgrade.error_tooltip");
   private static final List<ale> L = List.of(H, I);
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
   private final frm aa = new frm(0);
   private final frm ab = new frm(1);
   private final frm ac = new frm(2);
   @Nullable
   private cjw ad;

   public fsh(csz $$0, cnw $$1, xe $$2) {
      super($$0, $$1, $$2, ale.b("textures/gui/container/smithing.png"));
      this.v = 44;
      this.w = 15;
   }

   @Override
   protected void F() {
      this.ad = new cjw(this.m.s, 0.0, 0.0, 0.0);
      this.ad.b(true);
      this.ad.a(true);
      this.ad.aT = 210.0F;
      this.ad.w(25.0F);
      this.ad.aV = this.ad.dI();
      this.ad.aW = this.ad.dI();
      this.b(this.z.b(3).g());
   }

   @Override
   public void D() {
      super.D();
      Optional<cwy> $$0 = this.G();
      this.aa.a(L);
      this.ab.a($$0.map(cwy::g).orElse(List.of()));
      this.ac.a($$0.map(cwy::j).orElse(List.of()));
   }

   private Optional<cwy> G() {
      cvs $$0 = this.z.b(0).g();
      return !$$0.f() && $$0.h() instanceof cwy $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fkb $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.aa.a(this.z, $$0, $$1, this.C, this.D);
      this.ab.a(this.z, $$0, $$1, this.C, this.D);
      this.ac.a(this.z, $$0, $$1, this.C, this.D);
      frw.a($$0, (float)(this.C + 141), (float)(this.D + 75), 25.0F, V, W, null, this.ad);
   }

   @Override
   public void a(cqz $$0, int $$1, cvs $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cvs $$0) {
      if (this.ad != null) {
         for (btz $$1 : btz.values()) {
            this.ad.a($$1, cvs.k);
         }

         if (!$$0.f()) {
            cvs $$2 = $$0.u();
            if ($$0.h() instanceof ctl $$3) {
               this.ad.a($$3.l(), $$2);
            } else {
               this.ad.a(btz.b, $$2);
            }
         }
      }
   }

   @Override
   protected void c(fkb $$0, int $$1, int $$2) {
      if (this.J()) {
         $$0.a(ghv::B, G, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fkb $$0, int $$1, int $$2) {
      Optional<xe> $$3 = Optional.empty();
      if (this.J() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(K);
      }

      if (this.B != null) {
         cvs $$4 = this.z.b(0).g();
         cvs $$5 = this.B.g();
         if ($$4.f()) {
            if (this.B.d == 0) {
               $$3 = Optional.of(J);
            }
         } else if ($$4.h() instanceof cwy $$6 && $$5.f()) {
            if (this.B.d == 1) {
               $$3 = Optional.of($$6.c());
            } else if (this.B.d == 2) {
               $$3 = Optional.of($$6.d());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.p, this.p.c($$3x, 115), $$1, $$2));
   }

   private boolean J() {
      return this.z.b(0).h() && this.z.b(1).h() && this.z.b(2).h() && !this.z.b(this.z.o()).h();
   }
}
