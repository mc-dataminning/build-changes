import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fpt implements fpl<ddb> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fhn h;
   private final fhn i;
   private final fhn j;
   private final fhn k;
   private final fhn l;
   private final fhn m;
   private final fhn n;
   private final gap o = Objects.requireNonNull(fnz.c(ddc.a));

   public fpt(fpm.a $$0) {
      fhn $$1 = $$0.a(fhm.E);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fhn $$2 = $$0.a(fhm.F);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fht b() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      fhr $$2 = new fhr(0.2F);
      fhr $$3 = new fhr(-0.1F);
      $$1.a(
         "neck",
         fhs.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fhp.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fhs $$4 = fhs.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fhp.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fhp.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fht.a($$0, 32, 32);
   }

   public static fht c() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      fhs $$2 = fhs.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ha.c));
      $$1.a("back", $$2, fhp.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fhp.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fhp.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fhp.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fht.a($$0, 16, 16);
   }

   @Nullable
   private static gap a(cit $$0) {
      gap $$1 = fnz.c(ddc.a($$0));
      if ($$1 == null) {
         $$1 = fnz.c(ddc.a(cjb.pX));
      }

      return $$1;
   }

   public void a(ddb $$0, float $$1, elg $$2, fnl $$3, int $$4, int $$5) {
      $$2.a();
      ha $$6 = $$0.d();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      elk $$7 = this.o.a($$3, fnt::c);
      this.h.a($$2, $$7, $$4, $$5);
      this.m.a($$2, $$7, $$4, $$5);
      this.n.a($$2, $$7, $$4, $$5);
      ddb.a $$8 = $$0.f();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$8.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$8.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$8.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$8.d()));
      $$2.b();
   }

   private void a(fhn $$0, elg $$1, fnl $$2, int $$3, int $$4, @Nullable gap $$5) {
      if ($$5 == null) {
         $$5 = a(cjb.pX);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, fnt::c), $$3, $$4);
      }
   }
}
