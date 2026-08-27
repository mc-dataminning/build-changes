import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fqo implements fqg<ddm> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fie h;
   private final fie i;
   private final fie j;
   private final fie k;
   private final fie l;
   private final fie m;
   private final fie n;
   private final gbk o = Objects.requireNonNull(fov.c(ddn.a));

   public fqo(fqh.a $$0) {
      fie $$1 = $$0.a(fid.E);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fie $$2 = $$0.a(fid.F);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fik b() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      fii $$2 = new fii(0.2F);
      fii $$3 = new fii(-0.1F);
      $$1.a(
         "neck",
         fij.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fig.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fij $$4 = fij.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fig.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fig.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fik.a($$0, 32, 32);
   }

   public static fik c() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      fij $$2 = fij.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(hc.c));
      $$1.a("back", $$2, fig.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fig.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fig.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fig.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fik.a($$0, 16, 16);
   }

   @Nullable
   private static gbk a(cjc $$0) {
      gbk $$1 = fov.c(ddn.a($$0));
      if ($$1 == null) {
         $$1 = fov.c(ddn.a(cjk.pX));
      }

      return $$1;
   }

   public void a(ddm $$0, float $$1, elr $$2, fog $$3, int $$4, int $$5) {
      $$2.a();
      hc $$6 = $$0.d();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      elv $$7 = this.o.a($$3, foo::c);
      this.h.a($$2, $$7, $$4, $$5);
      this.m.a($$2, $$7, $$4, $$5);
      this.n.a($$2, $$7, $$4, $$5);
      ddm.a $$8 = $$0.f();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$8.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$8.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$8.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$8.d()));
      $$2.b();
   }

   private void a(fie $$0, elr $$1, fog $$2, int $$3, int $$4, @Nullable gbk $$5) {
      if ($$5 == null) {
         $$5 = a(cjk.pX);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, foo::c), $$3, $$4);
      }
   }
}
