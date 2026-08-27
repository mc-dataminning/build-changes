import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fqh implements fpz<ddf> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fhx h;
   private final fhx i;
   private final fhx j;
   private final fhx k;
   private final fhx l;
   private final fhx m;
   private final fhx n;
   private final gbd o = Objects.requireNonNull(fon.c(ddg.a));

   public fqh(fqa.a $$0) {
      fhx $$1 = $$0.a(fhw.E);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fhx $$2 = $$0.a(fhw.F);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fid b() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      fib $$2 = new fib(0.2F);
      fib $$3 = new fib(-0.1F);
      $$1.a(
         "neck",
         fic.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fhz.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fic $$4 = fic.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fhz.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fhz.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fid.a($$0, 32, 32);
   }

   public static fid c() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      fic $$2 = fic.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(hc.c));
      $$1.a("back", $$2, fhz.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fhz.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fhz.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fhz.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fid.a($$0, 16, 16);
   }

   @Nullable
   private static gbd a(civ $$0) {
      gbd $$1 = fon.c(ddg.a($$0));
      if ($$1 == null) {
         $$1 = fon.c(ddg.a(cjd.pX));
      }

      return $$1;
   }

   public void a(ddf $$0, float $$1, elk $$2, fnz $$3, int $$4, int $$5) {
      $$2.a();
      hc $$6 = $$0.d();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      elo $$7 = this.o.a($$3, foh::c);
      this.h.a($$2, $$7, $$4, $$5);
      this.m.a($$2, $$7, $$4, $$5);
      this.n.a($$2, $$7, $$4, $$5);
      ddf.a $$8 = $$0.f();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$8.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$8.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$8.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$8.d()));
      $$2.b();
   }

   private void a(fhx $$0, elk $$1, fnz $$2, int $$3, int $$4, @Nullable gbd $$5) {
      if ($$5 == null) {
         $$5 = a(cjd.pX);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, foh::c), $$3, $$4);
      }
   }
}
