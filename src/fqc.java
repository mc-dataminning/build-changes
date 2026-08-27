import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fqc implements fpu<dda> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fhs h;
   private final fhs i;
   private final fhs j;
   private final fhs k;
   private final fhs l;
   private final fhs m;
   private final fhs n;
   private final gay o = Objects.requireNonNull(foi.c(ddb.a));

   public fqc(fpv.a $$0) {
      fhs $$1 = $$0.a(fhr.E);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fhs $$2 = $$0.a(fhr.F);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fhy b() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      fhw $$2 = new fhw(0.2F);
      fhw $$3 = new fhw(-0.1F);
      $$1.a(
         "neck",
         fhx.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fhu.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fhx $$4 = fhx.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fhu.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fhu.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fhy.a($$0, 32, 32);
   }

   public static fhy c() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      fhx $$2 = fhx.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ha.c));
      $$1.a("back", $$2, fhu.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fhu.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fhu.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fhu.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fhy.a($$0, 16, 16);
   }

   @Nullable
   private static gay a(cis $$0) {
      gay $$1 = foi.c(ddb.a($$0));
      if ($$1 == null) {
         $$1 = foi.c(ddb.a(cja.pX));
      }

      return $$1;
   }

   public void a(dda $$0, float $$1, elf $$2, fnu $$3, int $$4, int $$5) {
      $$2.a();
      ha $$6 = $$0.d();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      elj $$7 = this.o.a($$3, foc::c);
      this.h.a($$2, $$7, $$4, $$5);
      this.m.a($$2, $$7, $$4, $$5);
      this.n.a($$2, $$7, $$4, $$5);
      dda.a $$8 = $$0.f();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$8.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$8.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$8.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$8.d()));
      $$2.b();
   }

   private void a(fhs $$0, elf $$1, fnu $$2, int $$3, int $$4, @Nullable gay $$5) {
      if ($$5 == null) {
         $$5 = a(cja.pX);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, foc::c), $$3, $$4);
      }
   }
}
