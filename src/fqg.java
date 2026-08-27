import java.util.Calendar;

public class fqg<T extends dcz & deb> implements fqa<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fhx d;
   private final fhx e;
   private final fhx f;
   private final fhx g;
   private final fhx h;
   private final fhx i;
   private final fhx j;
   private final fhx k;
   private final fhx l;
   private boolean m;

   public fqg(fqb.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fhx $$2 = $$0.a(fhw.r);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fhx $$3 = $$0.a(fhw.I);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fhx $$4 = $$0.a(fhw.J);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fid b() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("bottom", fic.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fhz.a);
      $$1.a("lid", fic.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fhz.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fic.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fhz.a(0.0F, 9.0F, 1.0F));
      return fid.a($$0, 64, 64);
   }

   public static fid c() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("bottom", fic.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fhz.a);
      $$1.a("lid", fic.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fhz.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fic.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fhz.a(0.0F, 9.0F, 1.0F));
      return fid.a($$0, 64, 64);
   }

   public static fid d() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("bottom", fic.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fhz.a);
      $$1.a("lid", fic.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fhz.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fic.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fhz.a(0.0F, 9.0F, 1.0F));
      return fid.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, elj $$2, foa $$3, int $$4, int $$5) {
      cqb $$6 = $$0.k();
      boolean $$7 = $$6 != null;
      dfd $$8 = $$7 ? $$0.q() : cte.cv.o().a(cuf.c, ha.d);
      dfv $$9 = $$8.b(cuf.d) ? $$8.c(cuf.d) : dfv.a;
      if ($$8.b() instanceof crv<?> $$11) {
         boolean $$12 = $$9 != dfv.a;
         $$2.a();
         float $$13 = $$8.c(cuf.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cvh.c<? extends ddg> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.p(), true);
         } else {
            $$14 = cvh.b::b;
         }

         float $$16 = $$14.apply(cuf.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fqd<>()).applyAsInt($$4);
         gbe $$18 = foo.a($$0, $$9, this.m);
         eln $$19 = $$18.a($$3, foi::d);
         if ($$12) {
            if ($$9 == dfv.b) {
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

   private void a(elj $$0, eln $$1, fhx $$2, fhx $$3, fhx $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
