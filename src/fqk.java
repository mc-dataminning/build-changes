import java.util.Calendar;

public class fqk<T extends dcv & ddx> implements fqe<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fic d;
   private final fic e;
   private final fic f;
   private final fic g;
   private final fic h;
   private final fic i;
   private final fic j;
   private final fic k;
   private final fic l;
   private boolean m;

   public fqk(fqf.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fic $$2 = $$0.a(fib.r);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fic $$3 = $$0.a(fib.I);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fic $$4 = $$0.a(fib.J);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fii b() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      $$1.a("bottom", fih.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fie.a);
      $$1.a("lid", fih.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fie.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fih.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fie.a(0.0F, 9.0F, 1.0F));
      return fii.a($$0, 64, 64);
   }

   public static fii c() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      $$1.a("bottom", fih.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fie.a);
      $$1.a("lid", fih.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fie.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fih.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fie.a(0.0F, 9.0F, 1.0F));
      return fii.a($$0, 64, 64);
   }

   public static fii d() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      $$1.a("bottom", fih.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fie.a);
      $$1.a("lid", fih.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fie.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fih.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fie.a(0.0F, 9.0F, 1.0F));
      return fii.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, elp $$2, foe $$3, int $$4, int $$5) {
      cpv $$6 = $$0.k();
      boolean $$7 = $$6 != null;
      dfj $$8 = $$7 ? $$0.q() : csw.cv.n().a(ctx.b, ha.d);
      dgb $$9 = $$8.b(ctx.c) ? $$8.c(ctx.c) : dgb.a;
      if ($$8.b() instanceof crp<?> $$11) {
         boolean $$12 = $$9 != dgb.a;
         $$2.a();
         float $$13 = $$8.c(ctx.b).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cuy.c<? extends ddc> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.p(), true);
         } else {
            $$14 = cuy.b::b;
         }

         float $$16 = $$14.apply(ctx.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fqh<>()).applyAsInt($$4);
         gbi $$18 = fot.a($$0, $$9, this.m);
         elt $$19 = $$18.a($$3, fom::d);
         if ($$12) {
            if ($$9 == dgb.b) {
               this.a($$2, $$19, this.g, this.i, this.h, $$16, $$17, $$5);
            } else {
               this.a($$2, $$19, this.j, this.l, this.k, $$16, $$17, $$5);
            }
         } else {
            this.a($$2, $$19, this.d, this.f, this.e, $$16, $$17, $$5);
         }

         $$2.b();
      }
   }

   private void a(elp $$0, elt $$1, fic $$2, fic $$3, fic $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
