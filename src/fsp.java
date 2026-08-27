import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fsp implements fsh<dfh> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fkb h;
   private final fkb i;
   private final fkb j;
   private final fkb k;
   private final fkb l;
   private final fkb m;
   private final fkb n;
   private final gdl o = Objects.requireNonNull(fqw.c(dfi.a));
   private static final float p = 0.125F;

   public fsp(fsi.a $$0) {
      fkb $$1 = $$0.a(fka.E);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fkb $$2 = $$0.a(fka.F);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fkh b() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      fkf $$2 = new fkf(0.2F);
      fkf $$3 = new fkf(-0.1F);
      $$1.a(
         "neck",
         fkg.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fkd.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fkg $$4 = fkg.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fkd.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fkd.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fkh.a($$0, 32, 32);
   }

   public static fkh c() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      fkg $$2 = fkg.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(hx.c));
      $$1.a("back", $$2, fkd.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fkd.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fkd.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fkd.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fkh.a($$0, 16, 16);
   }

   @Nullable
   private static gdl a(ckw $$0) {
      gdl $$1 = fqw.c(dfi.a($$0));
      if ($$1 == null) {
         $$1 = fqw.c(dfi.a(cle.pX));
      }

      return $$1;
   }

   public void a(dfh $$0, float $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      $$2.a();
      hx $$6 = $$0.g();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dfh.b $$7 = $$0.g;
      if ($$7 != null && $$0.k() != null) {
         float $$8 = ((float)($$0.k().V() - $$0.f) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dfh.b.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (ati.b($$10) + 0.5F) * ati.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = ati.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = ati.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      eno $$15 = this.o.a($$3, fqp::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dfh.a $$16 = $$0.i();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(fkb $$0, enk $$1, fqh $$2, int $$3, int $$4, @Nullable gdl $$5) {
      if ($$5 == null) {
         $$5 = a(cle.pX);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, fqp::c), $$3, $$4);
      }
   }
}
