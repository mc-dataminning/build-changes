import java.util.Calendar;

public class fsn<T extends der & dfu> implements fsh<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fkb d;
   private final fkb e;
   private final fkb f;
   private final fkb g;
   private final fkb h;
   private final fkb i;
   private final fkb j;
   private final fkb k;
   private final fkb l;
   private boolean m;

   public fsn(fsi.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fkb $$2 = $$0.a(fka.r);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fkb $$3 = $$0.a(fka.I);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fkb $$4 = $$0.a(fka.J);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fkh b() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      $$1.a("bottom", fkg.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fkd.a);
      $$1.a("lid", fkg.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fkd.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fkg.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fkd.a(0.0F, 9.0F, 1.0F));
      return fkh.a($$0, 64, 64);
   }

   public static fkh c() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      $$1.a("bottom", fkg.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fkd.a);
      $$1.a("lid", fkg.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fkd.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fkg.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fkd.a(0.0F, 9.0F, 1.0F));
      return fkh.a($$0, 64, 64);
   }

   public static fkh d() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      $$1.a("bottom", fkg.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fkd.a);
      $$1.a("lid", fkg.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fkd.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fkg.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fkd.a(0.0F, 9.0F, 1.0F));
      return fkh.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      crs $$6 = $$0.k();
      boolean $$7 = $$6 != null;
      dgw $$8 = $$7 ? $$0.q() : cuv.cv.o().a(cvw.c, hx.d);
      dho $$9 = $$8.b(cvw.d) ? $$8.c(cvw.d) : dho.a;
      if ($$8.b() instanceof ctm<?> $$11) {
         boolean $$12 = $$9 != dho.a;
         $$2.a();
         float $$13 = $$8.c(cvw.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cwz.c<? extends dey> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.p(), true);
         } else {
            $$14 = cwz.b::b;
         }

         float $$16 = $$14.apply(cvw.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fsk<>()).applyAsInt($$4);
         gdl $$18 = fqw.a($$0, $$9, this.m);
         eno $$19 = $$18.a($$3, fqp::d);
         if ($$12) {
            if ($$9 == dho.b) {
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

   private void a(enk $$0, eno $$1, fkb $$2, fkb $$3, fkb $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
