import java.util.Calendar;

public class fpm<T extends dck & ddm> implements fpg<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fhj d;
   private final fhj e;
   private final fhj f;
   private final fhj g;
   private final fhj h;
   private final fhj i;
   private final fhj j;
   private final fhj k;
   private final fhj l;
   private boolean m;

   public fpm(fph.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fhj $$2 = $$0.a(fhi.r);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fhj $$3 = $$0.a(fhi.I);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fhj $$4 = $$0.a(fhi.J);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fhp b() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("bottom", fho.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fhl.a);
      $$1.a("lid", fho.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fhl.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fho.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fhl.a(0.0F, 9.0F, 1.0F));
      return fhp.a($$0, 64, 64);
   }

   public static fhp c() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("bottom", fho.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fhl.a);
      $$1.a("lid", fho.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fhl.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fho.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fhl.a(0.0F, 9.0F, 1.0F));
      return fhp.a($$0, 64, 64);
   }

   public static fhp d() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("bottom", fho.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fhl.a);
      $$1.a("lid", fho.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fhl.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fho.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fhl.a(0.0F, 9.0F, 1.0F));
      return fhp.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, elh $$2, fng $$3, int $$4, int $$5) {
      cpk $$6 = $$0.k();
      boolean $$7 = $$6 != null;
      dey $$8 = $$7 ? $$0.q() : csl.cv.n().a(ctm.b, hb.d);
      dfq $$9 = $$8.b(ctm.c) ? $$8.c(ctm.c) : dfq.a;
      if ($$8.b() instanceof cre<?> $$11) {
         boolean $$12 = $$9 != dfq.a;
         $$2.a();
         float $$13 = $$8.c(ctm.b).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cun.c<? extends dcr> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.p(), true);
         } else {
            $$14 = cun.b::b;
         }

         float $$16 = $$14.apply(ctm.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fpj<>()).applyAsInt($$4);
         gak $$18 = fnu.a($$0, $$9, this.m);
         ell $$19 = $$18.a($$3, fno::c);
         if ($$12) {
            if ($$9 == dfq.b) {
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

   private void a(elh $$0, ell $$1, fhj $$2, fhj $$3, fhj $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
