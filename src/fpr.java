import java.util.Calendar;

public class fpr<T extends dcm & ddo> implements fpl<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fhn d;
   private final fhn e;
   private final fhn f;
   private final fhn g;
   private final fhn h;
   private final fhn i;
   private final fhn j;
   private final fhn k;
   private final fhn l;
   private boolean m;

   public fpr(fpm.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fhn $$2 = $$0.a(fhm.r);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fhn $$3 = $$0.a(fhm.I);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fhn $$4 = $$0.a(fhm.J);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fht b() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      $$1.a("bottom", fhs.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fhp.a);
      $$1.a("lid", fhs.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fhp.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fhs.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fhp.a(0.0F, 9.0F, 1.0F));
      return fht.a($$0, 64, 64);
   }

   public static fht c() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      $$1.a("bottom", fhs.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fhp.a);
      $$1.a("lid", fhs.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fhp.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fhs.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fhp.a(0.0F, 9.0F, 1.0F));
      return fht.a($$0, 64, 64);
   }

   public static fht d() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      $$1.a("bottom", fhs.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fhp.a);
      $$1.a("lid", fhs.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fhp.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fhs.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fhp.a(0.0F, 9.0F, 1.0F));
      return fht.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, elg $$2, fnl $$3, int $$4, int $$5) {
      cpm $$6 = $$0.k();
      boolean $$7 = $$6 != null;
      dfa $$8 = $$7 ? $$0.q() : csn.cv.n().a(cto.b, ha.d);
      dfs $$9 = $$8.b(cto.c) ? $$8.c(cto.c) : dfs.a;
      if ($$8.b() instanceof crg<?> $$11) {
         boolean $$12 = $$9 != dfs.a;
         $$2.a();
         float $$13 = $$8.c(cto.b).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cup.c<? extends dct> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.p(), true);
         } else {
            $$14 = cup.b::b;
         }

         float $$16 = $$14.apply(cto.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fpo<>()).applyAsInt($$4);
         gap $$18 = fnz.a($$0, $$9, this.m);
         elk $$19 = $$18.a($$3, fnt::d);
         if ($$12) {
            if ($$9 == dfs.b) {
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

   private void a(elg $$0, elk $$1, fhn $$2, fhn $$3, fhn $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
