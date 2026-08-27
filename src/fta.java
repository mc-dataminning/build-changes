import java.util.Calendar;

public class fta<T extends dfd & dgg> implements fsu<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fko d;
   private final fko e;
   private final fko f;
   private final fko g;
   private final fko h;
   private final fko i;
   private final fko j;
   private final fko k;
   private final fko l;
   private boolean m;

   public fta(fsv.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fko $$2 = $$0.a(fkn.r);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fko $$3 = $$0.a(fkn.I);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fko $$4 = $$0.a(fkn.J);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fku b() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("bottom", fkt.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fkq.a);
      $$1.a("lid", fkt.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fkq.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fkt.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fkq.a(0.0F, 9.0F, 1.0F));
      return fku.a($$0, 64, 64);
   }

   public static fku c() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("bottom", fkt.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fkq.a);
      $$1.a("lid", fkt.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fkq.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fkt.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fkq.a(0.0F, 9.0F, 1.0F));
      return fku.a($$0, 64, 64);
   }

   public static fku d() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("bottom", fkt.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fkq.a);
      $$1.a("lid", fkt.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fkq.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fkt.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fkq.a(0.0F, 9.0F, 1.0F));
      return fku.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, enw $$2, fqu $$3, int $$4, int $$5) {
      csa $$6 = $$0.k();
      boolean $$7 = $$6 != null;
      dhi $$8 = $$7 ? $$0.q() : cvc.cv.o().a(cwd.c, hx.d);
      dia $$9 = $$8.b(cwd.d) ? $$8.c(cwd.d) : dia.a;
      if ($$8.b() instanceof ctu<?> $$11) {
         boolean $$12 = $$9 != dia.a;
         $$2.a();
         float $$13 = $$8.c(cwd.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cxh.c<? extends dfk> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.p(), true);
         } else {
            $$14 = cxh.b::b;
         }

         float $$16 = $$14.apply(cwd.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fsx<>()).applyAsInt($$4);
         gdy $$18 = frj.a($$0, $$9, this.m);
         eoa $$19 = $$18.a($$3, frc::d);
         if ($$12) {
            if ($$9 == dia.b) {
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

   private void a(enw $$0, eoa $$1, fko $$2, fko $$3, fko $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
