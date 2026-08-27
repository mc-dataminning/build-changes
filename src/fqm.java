import java.util.Calendar;

public class fqm<T extends dcx & ddz> implements fqg<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fie d;
   private final fie e;
   private final fie f;
   private final fie g;
   private final fie h;
   private final fie i;
   private final fie j;
   private final fie k;
   private final fie l;
   private boolean m;

   public fqm(fqh.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fie $$2 = $$0.a(fid.r);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fie $$3 = $$0.a(fid.I);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fie $$4 = $$0.a(fid.J);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fik b() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("bottom", fij.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fig.a);
      $$1.a("lid", fij.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fig.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fij.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fig.a(0.0F, 9.0F, 1.0F));
      return fik.a($$0, 64, 64);
   }

   public static fik c() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("bottom", fij.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fig.a);
      $$1.a("lid", fij.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fig.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fij.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fig.a(0.0F, 9.0F, 1.0F));
      return fik.a($$0, 64, 64);
   }

   public static fik d() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("bottom", fij.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fig.a);
      $$1.a("lid", fij.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fig.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fij.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fig.a(0.0F, 9.0F, 1.0F));
      return fik.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, elr $$2, fog $$3, int $$4, int $$5) {
      cpx $$6 = $$0.k();
      boolean $$7 = $$6 != null;
      dfl $$8 = $$7 ? $$0.q() : csy.cv.n().a(ctz.b, hc.d);
      dgd $$9 = $$8.b(ctz.c) ? $$8.c(ctz.c) : dgd.a;
      if ($$8.b() instanceof crr<?> $$11) {
         boolean $$12 = $$9 != dgd.a;
         $$2.a();
         float $$13 = $$8.c(ctz.b).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cva.c<? extends dde> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.p(), true);
         } else {
            $$14 = cva.b::b;
         }

         float $$16 = $$14.apply(ctz.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fqj<>()).applyAsInt($$4);
         gbk $$18 = fov.a($$0, $$9, this.m);
         elv $$19 = $$18.a($$3, foo::d);
         if ($$12) {
            if ($$9 == dgd.b) {
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

   private void a(elr $$0, elv $$1, fie $$2, fie $$3, fie $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
