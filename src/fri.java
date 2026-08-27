import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fri implements fra<dem> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fiw h;
   private final fiw i;
   private final fiw j;
   private final fiw k;
   private final fiw l;
   private final fiw m;
   private final fiw n;
   private final gce o = Objects.requireNonNull(fpp.c(den.a));
   private static final float p = 0.125F;

   public fri(frb.a $$0) {
      fiw $$1 = $$0.a(fiv.E);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fiw $$2 = $$0.a(fiv.F);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      fja $$2 = new fja(0.2F);
      fja $$3 = new fja(-0.1F);
      $$1.a(
         "neck",
         fjb.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fiy.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fjb $$4 = fjb.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fiy.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fiy.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fjc.a($$0, 32, 32);
   }

   public static fjc c() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      fjb $$2 = fjb.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(hx.c));
      $$1.a("back", $$2, fiy.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fiy.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fiy.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fiy.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fjc.a($$0, 16, 16);
   }

   @Nullable
   private static gce a(cke $$0) {
      gce $$1 = fpp.c(den.a($$0));
      if ($$1 == null) {
         $$1 = fpp.c(den.a(ckm.pX));
      }

      return $$1;
   }

   public void a(dem $$0, float $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      $$2.a();
      hx $$6 = $$0.g();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dem.b $$7 = $$0.g;
      if ($$7 != null && $$0.k() != null) {
         float $$8 = ((float)($$0.k().V() - $$0.f) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dem.b.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (asy.b($$10) + 0.5F) * asy.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = asy.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = asy.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      eml $$15 = this.o.a($$3, fpj::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dem.a $$16 = $$0.i();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(fiw $$0, emh $$1, fpb $$2, int $$3, int $$4, @Nullable gce $$5) {
      if ($$5 == null) {
         $$5 = a(ckm.pX);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, fpj::c), $$3, $$4);
      }
   }
}
