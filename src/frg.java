import java.util.Calendar;

public class frg<T extends ddx & dez> implements fra<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fiw d;
   private final fiw e;
   private final fiw f;
   private final fiw g;
   private final fiw h;
   private final fiw i;
   private final fiw j;
   private final fiw k;
   private final fiw l;
   private boolean m;

   public frg(frb.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fiw $$2 = $$0.a(fiv.r);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fiw $$3 = $$0.a(fiv.I);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fiw $$4 = $$0.a(fiv.J);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("bottom", fjb.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fiy.a);
      $$1.a("lid", fjb.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fiy.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fjb.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fiy.a(0.0F, 9.0F, 1.0F));
      return fjc.a($$0, 64, 64);
   }

   public static fjc c() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("bottom", fjb.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fiy.a);
      $$1.a("lid", fjb.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fiy.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fjb.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fiy.a(0.0F, 9.0F, 1.0F));
      return fjc.a($$0, 64, 64);
   }

   public static fjc d() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("bottom", fjb.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fiy.a);
      $$1.a("lid", fjb.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fiy.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fjb.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fiy.a(0.0F, 9.0F, 1.0F));
      return fjc.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      cqz $$6 = $$0.k();
      boolean $$7 = $$6 != null;
      dgb $$8 = $$7 ? $$0.q() : cuc.cv.o().a(cvd.c, hx.d);
      dgt $$9 = $$8.b(cvd.d) ? $$8.c(cvd.d) : dgt.a;
      if ($$8.b() instanceof cst<?> $$11) {
         boolean $$12 = $$9 != dgt.a;
         $$2.a();
         float $$13 = $$8.c(cvd.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cwf.c<? extends dee> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.p(), true);
         } else {
            $$14 = cwf.b::b;
         }

         float $$16 = $$14.apply(cvd.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new frd<>()).applyAsInt($$4);
         gce $$18 = fpp.a($$0, $$9, this.m);
         eml $$19 = $$18.a($$3, fpj::d);
         if ($$12) {
            if ($$9 == dgt.b) {
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

   private void a(emh $$0, eml $$1, fiw $$2, fiw $$3, fiw $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
