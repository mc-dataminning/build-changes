import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class esh {
   public static final int a = 90;
   static final ale b = ale.b("igloo/top");
   private static final ale c = ale.b("igloo/middle");
   private static final ale d = ale.b("igloo/bottom");
   static final Map<ale, iu> e = ImmutableMap.of(b, new iu(3, 5, 5), c, new iu(1, 3, 1), d, new iu(3, 6, 7));
   static final Map<ale, iu> f = ImmutableMap.of(b, iu.c, c, new iu(2, -3, 4), d, new iu(0, -3, -2));

   public static void a(eul $$0, iu $$1, dsm $$2, eqn $$3, azt $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new esh.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new esh.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new esh.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eqs {
      public a(eul $$0, ale $$1, iu $$2, dsm $$3, int $$4) {
         super(eqz.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(eul $$0, tx $$1) {
         super(eqz.I, $$1, $$0, $$1x -> a(dsm.valueOf($$1.l("Rot")), $$1x));
      }

      private static eug a(dsm $$0, ale $$1) {
         return new eug().a($$0).a(dqv.a).a(esh.e.get($$1)).a(etl.b).a(etu.a);
      }

      private static iu a(ale $$0, iu $$1, int $$2) {
         return $$1.a(esh.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eqy $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iu $$1, djg $$2, azt $$3, eqa $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dlw.a.m(), 3);
            dwn $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dwv) {
               ((dwv)$$5).a(eyj.B, $$3.g());
            }
         }
      }

      @Override
      public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, dhw $$5, iu $$6) {
         ale $$7 = ale.a(this.a);
         eug $$8 = a(this.c.d(), $$7);
         iu $$9 = esh.f.get($$7);
         iu $$10 = this.d.a((jz)euk.a($$8, new iu(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(efn.a.a, $$10.u(), $$10.w());
         iu $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(esh.b)) {
            iu $$13 = this.d.a((jz)euk.a($$8, new iu(3, 0, 5)));
            dzo $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dlw.cX)) {
               $$0.a($$13, dlw.ec.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
