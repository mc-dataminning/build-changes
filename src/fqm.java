import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fqm implements fqe<ddk> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fic h;
   private final fic i;
   private final fic j;
   private final fic k;
   private final fic l;
   private final fic m;
   private final fic n;
   private final gbi o = Objects.requireNonNull(fot.c(ddl.a));

   public fqm(fqf.a $$0) {
      fic $$1 = $$0.a(fib.E);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fic $$2 = $$0.a(fib.F);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fii b() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      fig $$2 = new fig(0.2F);
      fig $$3 = new fig(-0.1F);
      $$1.a(
         "neck",
         fih.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fie.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fih $$4 = fih.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fie.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fie.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fii.a($$0, 32, 32);
   }

   public static fii c() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      fih $$2 = fih.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ha.c));
      $$1.a("back", $$2, fie.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fie.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fie.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fie.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fii.a($$0, 16, 16);
   }

   @Nullable
   private static gbi a(cja $$0) {
      gbi $$1 = fot.c(ddl.a($$0));
      if ($$1 == null) {
         $$1 = fot.c(ddl.a(cji.pX));
      }

      return $$1;
   }

   public void a(ddk $$0, float $$1, elp $$2, foe $$3, int $$4, int $$5) {
      $$2.a();
      ha $$6 = $$0.d();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      elt $$7 = this.o.a($$3, fom::c);
      this.h.a($$2, $$7, $$4, $$5);
      this.m.a($$2, $$7, $$4, $$5);
      this.n.a($$2, $$7, $$4, $$5);
      ddk.a $$8 = $$0.f();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$8.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$8.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$8.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$8.d()));
      $$2.b();
   }

   private void a(fic $$0, elp $$1, foe $$2, int $$3, int $$4, @Nullable gbi $$5) {
      if ($$5 == null) {
         $$5 = a(cji.pX);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, fom::c), $$3, $$4);
      }
   }
}
