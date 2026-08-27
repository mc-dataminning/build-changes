import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dxr {
   public static final int a = 90;
   static final afw b = new afw("igloo/top");
   private static final afw c = new afw("igloo/middle");
   private static final afw d = new afw("igloo/bottom");
   static final Map<afw, ht> e = ImmutableMap.of(b, new ht(3, 5, 5), c, new ht(1, 3, 1), d, new ht(3, 6, 7));
   static final Map<afw, ht> f = ImmutableMap.of(b, ht.b, c, new ht(2, -3, 4), d, new ht(0, -3, -2));

   public static void a(dzu $$0, ht $$1, dal $$2, dwf $$3, ate $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new dxr.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new dxr.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new dxr.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dwk {
      public a(dzu $$0, afw $$1, ht $$2, dal $$3, int $$4) {
         super(dwr.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(dzu $$0, rt $$1) {
         super(dwr.I, $$1, $$0, $$1x -> a(dal.valueOf($$1.l("Rot")), $$1x));
      }

      private static dzp a(dal $$0, afw $$1) {
         return new dzp().a($$0).a(cyv.a).a(dxr.e.get($$1)).a(dyv.b);
      }

      private static ht a(afw $$0, ht $$1, int $$2) {
         return $$1.a(dxr.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ht $$1, cro $$2, ate $$3, dvs $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cuc.a.o(), 3);
            ddx $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dee) {
               ((dee)$$5).a(edg.C, $$3.g());
            }
         }
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         afw $$7 = new afw(this.a);
         dzp $$8 = a(this.c.d(), $$7);
         ht $$9 = dxr.f.get($$7);
         ht $$10 = this.d.a((iw)dzt.a($$8, new ht(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dlk.a.a, $$10.u(), $$10.w());
         ht $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(dxr.b)) {
            ht $$13 = this.d.a((iw)dzt.a($$8, new ht(3, 0, 5)));
            dgb $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cuc.cO)) {
               $$0.a($$13, cuc.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
