import java.util.Calendar;

public class fqf<T extends dcq & dds> implements fpz<T> {
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

   public fqf(fqa.a $$0) {
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
   public void a(T $$0, float $$1, elk $$2, fnz $$3, int $$4, int $$5) {
      cpq $$6 = $$0.k();
      boolean $$7 = $$6 != null;
      dfe $$8 = $$7 ? $$0.q() : csr.cv.n().a(cts.b, hc.d);
      dfw $$9 = $$8.b(cts.c) ? $$8.c(cts.c) : dfw.a;
      if ($$8.b() instanceof crk<?> $$11) {
         boolean $$12 = $$9 != dfw.a;
         $$2.a();
         float $$13 = $$8.c(cts.b).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cut.c<? extends dcx> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.p(), true);
         } else {
            $$14 = cut.b::b;
         }

         float $$16 = $$14.apply(cts.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fqc<>()).applyAsInt($$4);
         gbd $$18 = fon.a($$0, $$9, this.m);
         elo $$19 = $$18.a($$3, foh::d);
         if ($$12) {
            if ($$9 == dfw.b) {
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

   private void a(elk $$0, elo $$1, fhx $$2, fhx $$3, fhx $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
