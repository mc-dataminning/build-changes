import java.util.Calendar;

public class ftf<T extends dfi & dgl> implements fsz<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fkt d;
   private final fkt e;
   private final fkt f;
   private final fkt g;
   private final fkt h;
   private final fkt i;
   private final fkt j;
   private final fkt k;
   private final fkt l;
   private boolean m;

   public ftf(fta.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fkt $$2 = $$0.a(fks.r);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fkt $$3 = $$0.a(fks.I);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fkt $$4 = $$0.a(fks.J);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fkz b() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      $$1.a("bottom", fky.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fkv.a);
      $$1.a("lid", fky.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fkv.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fky.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fkv.a(0.0F, 9.0F, 1.0F));
      return fkz.a($$0, 64, 64);
   }

   public static fkz c() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      $$1.a("bottom", fky.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fkv.a);
      $$1.a("lid", fky.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fkv.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fky.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fkv.a(0.0F, 9.0F, 1.0F));
      return fkz.a($$0, 64, 64);
   }

   public static fkz d() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      $$1.a("bottom", fky.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fkv.a);
      $$1.a("lid", fky.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fkv.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fky.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fkv.a(0.0F, 9.0F, 1.0F));
      return fkz.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, eob $$2, fqz $$3, int $$4, int $$5) {
      csf $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dhn $$8 = $$7 ? $$0.r() : cvh.cv.o().a(cwi.c, ib.d);
      dif $$9 = $$8.b(cwi.d) ? $$8.c(cwi.d) : dif.a;
      if ($$8.b() instanceof ctz<?> $$11) {
         boolean $$12 = $$9 != dif.a;
         $$2.a();
         float $$13 = $$8.c(cwi.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cxm.c<? extends dfp> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aC_(), true);
         } else {
            $$14 = cxm.b::b;
         }

         float $$16 = $$14.apply(cwi.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new ftc<>()).applyAsInt($$4);
         ged $$18 = fro.a($$0, $$9, this.m);
         eof $$19 = $$18.a($$3, frh::d);
         if ($$12) {
            if ($$9 == dif.b) {
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

   private void a(eob $$0, eof $$1, fkt $$2, fkt $$3, fkt $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
