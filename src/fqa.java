import java.util.Calendar;

public class fqa<T extends dcl & ddn> implements fpu<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fhs d;
   private final fhs e;
   private final fhs f;
   private final fhs g;
   private final fhs h;
   private final fhs i;
   private final fhs j;
   private final fhs k;
   private final fhs l;
   private boolean m;

   public fqa(fpv.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fhs $$2 = $$0.a(fhr.r);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fhs $$3 = $$0.a(fhr.I);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fhs $$4 = $$0.a(fhr.J);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fhy b() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      $$1.a("bottom", fhx.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fhu.a);
      $$1.a("lid", fhx.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fhu.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fhx.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fhu.a(0.0F, 9.0F, 1.0F));
      return fhy.a($$0, 64, 64);
   }

   public static fhy c() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      $$1.a("bottom", fhx.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fhu.a);
      $$1.a("lid", fhx.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fhu.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fhx.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fhu.a(0.0F, 9.0F, 1.0F));
      return fhy.a($$0, 64, 64);
   }

   public static fhy d() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      $$1.a("bottom", fhx.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fhu.a);
      $$1.a("lid", fhx.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fhu.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fhx.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fhu.a(0.0F, 9.0F, 1.0F));
      return fhy.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, elf $$2, fnu $$3, int $$4, int $$5) {
      cpl $$6 = $$0.k();
      boolean $$7 = $$6 != null;
      dez $$8 = $$7 ? $$0.q() : csm.cv.n().a(ctn.b, ha.d);
      dfr $$9 = $$8.b(ctn.c) ? $$8.c(ctn.c) : dfr.a;
      if ($$8.b() instanceof crf<?> $$11) {
         boolean $$12 = $$9 != dfr.a;
         $$2.a();
         float $$13 = $$8.c(ctn.b).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cuo.c<? extends dcs> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.p(), true);
         } else {
            $$14 = cuo.b::b;
         }

         float $$16 = $$14.apply(ctn.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fpx<>()).applyAsInt($$4);
         gay $$18 = foi.a($$0, $$9, this.m);
         elj $$19 = $$18.a($$3, foc::d);
         if ($$12) {
            if ($$9 == dfr.b) {
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

   private void a(elf $$0, elj $$1, fhs $$2, fhs $$3, fhs $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
