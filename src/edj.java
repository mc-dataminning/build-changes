import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class edj {
   public static final int a = 90;
   static final aiy b = new aiy("igloo/top");
   private static final aiy c = new aiy("igloo/middle");
   private static final aiy d = new aiy("igloo/bottom");
   static final Map<aiy, hz> e = ImmutableMap.of(b, new hz(3, 5, 5), c, new hz(1, 3, 1), d, new hz(3, 6, 7));
   static final Map<aiy, hz> f = ImmutableMap.of(b, hz.c, c, new hz(2, -3, 4), d, new hz(0, -3, -2));

   public static void a(efm $$0, hz $$1, dfe $$2, ebq $$3, awp $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new edj.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new edj.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new edj.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends ebv {
      public a(efm $$0, aiy $$1, hz $$2, dfe $$3, int $$4) {
         super(ecc.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(efm $$0, sw $$1) {
         super(ecc.I, $$1, $$0, $$1x -> a(dfe.valueOf($$1.l("Rot")), $$1x));
      }

      private static efh a(dfe $$0, aiy $$1) {
         return new efh().a($$0).a(ddo.a).a(edj.e.get($$1)).a(een.b);
      }

      private static hz a(aiy $$0, hz $$1, int $$2) {
         return $$1.a(edj.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hz $$1, cwg $$2, awp $$3, ebd $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cyu.a.o(), 3);
            dix $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dje) {
               ((dje)$$5).a(eja.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         aiy $$7 = new aiy(this.a);
         efh $$8 = a(this.c.d(), $$7);
         hz $$9 = edj.f.get($$7);
         hz $$10 = this.d.a((jd)efl.a($$8, new hz(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dqv.a.a, $$10.u(), $$10.w());
         hz $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(edj.b)) {
            hz $$13 = this.d.a((jd)efl.a($$8, new hz(3, 0, 5)));
            dlj $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cyu.cO)) {
               $$0.a($$13, cyu.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
