import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ebd {
   public static final int a = 90;
   static final ahg b = new ahg("igloo/top");
   private static final ahg c = new ahg("igloo/middle");
   private static final ahg d = new ahg("igloo/bottom");
   static final Map<ahg, hx> e = ImmutableMap.of(b, new hx(3, 5, 5), c, new hx(1, 3, 1), d, new hx(3, 6, 7));
   static final Map<ahg, hx> f = ImmutableMap.of(b, hx.b, c, new hx(2, -3, 4), d, new hx(0, -3, -2));

   public static void a(edg $$0, hx $$1, ddb $$2, dzk $$3, auu $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ebd.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ebd.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ebd.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dzp {
      public a(edg $$0, ahg $$1, hx $$2, ddb $$3, int $$4) {
         super(dzw.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(edg $$0, sn $$1) {
         super(dzw.I, $$1, $$0, $$1x -> a(ddb.valueOf($$1.l("Rot")), $$1x));
      }

      private static edb a(ddb $$0, ahg $$1) {
         return new edb().a($$0).a(dbl.a).a(ebd.e.get($$1)).a(ech.b);
      }

      private static hx a(ahg $$0, hx $$1, int $$2) {
         return $$1.a(ebd.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dzv $$0, sn $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hx $$1, cud $$2, auu $$3, dyx $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cwr.a.o(), 3);
            dgu $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dhb) {
               ((dhb)$$5).a(egt.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cuj $$0, cuh $$1, dld $$2, auu $$3, dyx $$4, csv $$5, hx $$6) {
         ahg $$7 = new ahg(this.a);
         edb $$8 = a(this.c.d(), $$7);
         hx $$9 = ebd.f.get($$7);
         hx $$10 = this.d.a((jb)edf.a($$8, new hx(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dop.a.a, $$10.u(), $$10.w());
         hx $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ebd.b)) {
            hx $$13 = this.d.a((jb)edf.a($$8, new hx(3, 0, 5)));
            djg $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cwr.cO)) {
               $$0.a($$13, cwr.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
