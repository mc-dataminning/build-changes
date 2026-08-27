import java.util.Calendar;

public class fma<T extends czn & dap> implements flu<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fee d;
   private final fee e;
   private final fee f;
   private final fee g;
   private final fee h;
   private final fee i;
   private final fee j;
   private final fee k;
   private final fee l;
   private boolean m;

   public fma(flv.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fee $$2 = $$0.a(fed.r);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fee $$3 = $$0.a(fed.I);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fee $$4 = $$0.a(fed.J);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fek b() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      $$1.a("bottom", fej.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), feg.a);
      $$1.a("lid", fej.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), feg.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fej.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), feg.a(0.0F, 9.0F, 1.0F));
      return fek.a($$0, 64, 64);
   }

   public static fek c() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      $$1.a("bottom", fej.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), feg.a);
      $$1.a("lid", fej.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), feg.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fej.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), feg.a(0.0F, 9.0F, 1.0F));
      return fek.a($$0, 64, 64);
   }

   public static fek d() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      $$1.a("bottom", fej.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), feg.a);
      $$1.a("lid", fej.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), feg.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fej.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), feg.a(0.0F, 9.0F, 1.0F));
      return fek.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
      cmm $$6 = $$0.k();
      boolean $$7 = $$6 != null;
      dcb $$8 = $$7 ? $$0.q() : cpo.cv.n().a(cqp.b, ha.d);
      dct $$9 = $$8.b(cqp.c) ? $$8.c(cqp.c) : dct.a;
      if ($$8.b() instanceof cog<?> $$11) {
         boolean $$12 = $$9 != dct.a;
         $$2.a();
         float $$13 = $$8.c(cqp.b).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         crq.c<? extends czu> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.p(), true);
         } else {
            $$14 = crq.b::b;
         }

         float $$16 = $$14.apply(cqp.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new flx<>()).applyAsInt($$4);
         fwu $$18 = fkj.a($$0, $$9, this.m);
         ein $$19 = $$18.a($$3, fkf::c);
         if ($$12) {
            if ($$9 == dct.b) {
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

   private void a(eij $$0, ein $$1, fee $$2, fee $$3, fee $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
