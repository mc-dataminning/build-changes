import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eee {
   public static final int a = 90;
   static final ajc b = new ajc("igloo/top");
   private static final ajc c = new ajc("igloo/middle");
   private static final ajc d = new ajc("igloo/bottom");
   static final Map<ajc, ib> e = ImmutableMap.of(b, new ib(3, 5, 5), c, new ib(1, 3, 1), d, new ib(3, 6, 7));
   static final Map<ajc, ib> f = ImmutableMap.of(b, ib.c, c, new ib(2, -3, 4), d, new ib(0, -3, -2));

   public static void a(egh $$0, ib $$1, dfr $$2, ecl $$3, awt $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eee.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eee.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eee.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends ecq {
      public a(egh $$0, ajc $$1, ib $$2, dfr $$3, int $$4) {
         super(ecx.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(egh $$0, sy $$1) {
         super(ecx.I, $$1, $$0, $$1x -> a(dfr.valueOf($$1.l("Rot")), $$1x));
      }

      private static egc a(dfr $$0, ajc $$1) {
         return new egc().a($$0).a(deb.a).a(eee.e.get($$1)).a(efi.b);
      }

      private static ib a(ajc $$0, ib $$1, int $$2) {
         return $$1.a(eee.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ib $$1, cwt $$2, awt $$3, eby $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, czh.a.o(), 3);
            djl $$5 = $$2.c_($$1.d());
            if ($$5 instanceof djs) {
               ((djs)$$5).a(ejw.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         ajc $$7 = new ajc(this.a);
         egc $$8 = a(this.c.d(), $$7);
         ib $$9 = eee.f.get($$7);
         ib $$10 = this.d.a((jf)egg.a($$8, new ib(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(drq.a.a, $$10.u(), $$10.w());
         ib $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eee.b)) {
            ib $$13 = this.d.a((jf)egg.a($$8, new ib(3, 0, 5)));
            dme $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(czh.cO)) {
               $$0.a($$13, czh.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
