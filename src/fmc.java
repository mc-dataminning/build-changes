import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fmc implements flu<dac> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fee h;
   private final fee i;
   private final fee j;
   private final fee k;
   private final fee l;
   private final fee m;
   private final fee n;
   private final fwu o = Objects.requireNonNull(fkj.c(dad.a));

   public fmc(flv.a $$0) {
      fee $$1 = $$0.a(fed.E);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fee $$2 = $$0.a(fed.F);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fek b() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      fei $$2 = new fei(0.2F);
      fei $$3 = new fei(-0.1F);
      $$1.a(
         "neck",
         fej.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         feg.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fej $$4 = fej.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, feg.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, feg.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fek.a($$0, 32, 32);
   }

   public static fek c() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      fej $$2 = fej.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ha.c));
      $$1.a("back", $$2, feg.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, feg.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, feg.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, feg.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fek.a($$0, 16, 16);
   }

   @Nullable
   private static fwu a(cfu $$0) {
      fwu $$1 = fkj.c(dad.a($$0));
      if ($$1 == null) {
         $$1 = fkj.c(dad.a(cgc.pX));
      }

      return $$1;
   }

   public void a(dac $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
      $$2.a();
      ha $$6 = $$0.d();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      ein $$7 = this.o.a($$3, fkf::b);
      this.h.a($$2, $$7, $$4, $$5);
      this.m.a($$2, $$7, $$4, $$5);
      this.n.a($$2, $$7, $$4, $$5);
      dac.a $$8 = $$0.f();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$8.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$8.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$8.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$8.d()));
      $$2.b();
   }

   private void a(fee $$0, eij $$1, fjx $$2, int $$3, int $$4, @Nullable fwu $$5) {
      if ($$5 == null) {
         $$5 = a(cgc.pX);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, fkf::b), $$3, $$4);
      }
   }
}
