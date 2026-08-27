import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fpo implements fpg<dcz> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fhj h;
   private final fhj i;
   private final fhj j;
   private final fhj k;
   private final fhj l;
   private final fhj m;
   private final fhj n;
   private final gak o = Objects.requireNonNull(fnu.c(dda.a));

   public fpo(fph.a $$0) {
      fhj $$1 = $$0.a(fhi.E);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fhj $$2 = $$0.a(fhi.F);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fhp b() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      fhn $$2 = new fhn(0.2F);
      fhn $$3 = new fhn(-0.1F);
      $$1.a(
         "neck",
         fho.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fhl.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fho $$4 = fho.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fhl.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fhl.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fhp.a($$0, 32, 32);
   }

   public static fhp c() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      fho $$2 = fho.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(hb.c));
      $$1.a("back", $$2, fhl.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fhl.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fhl.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fhl.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fhp.a($$0, 16, 16);
   }

   @Nullable
   private static gak a(cir $$0) {
      gak $$1 = fnu.c(dda.a($$0));
      if ($$1 == null) {
         $$1 = fnu.c(dda.a(ciz.pX));
      }

      return $$1;
   }

   public void a(dcz $$0, float $$1, elh $$2, fng $$3, int $$4, int $$5) {
      $$2.a();
      hb $$6 = $$0.d();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      ell $$7 = this.o.a($$3, fno::b);
      this.h.a($$2, $$7, $$4, $$5);
      this.m.a($$2, $$7, $$4, $$5);
      this.n.a($$2, $$7, $$4, $$5);
      dcz.a $$8 = $$0.f();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$8.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$8.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$8.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$8.d()));
      $$2.b();
   }

   private void a(fhj $$0, elh $$1, fng $$2, int $$3, int $$4, @Nullable gak $$5) {
      if ($$5 == null) {
         $$5 = a(ciz.pX);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, fno::b), $$3, $$4);
      }
   }
}
