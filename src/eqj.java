import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eqj {
   public static final int a = 90;
   static final alz b = alz.b("igloo/top");
   private static final alz c = alz.b("igloo/middle");
   private static final alz d = alz.b("igloo/bottom");
   static final Map<alz, jh> e = ImmutableMap.of(b, new jh(3, 5, 5), c, new jh(1, 3, 1), d, new jh(3, 6, 7));
   static final Map<alz, jh> f = ImmutableMap.of(b, jh.c, c, new jh(2, -3, 4), d, new jh(0, -3, -2));

   public static void a(esn $$0, jh $$1, drc $$2, eop $$3, bam $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eqj.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eqj.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eqj.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eou {
      public a(esn $$0, alz $$1, jh $$2, drc $$3, int $$4) {
         super(epb.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(esn $$0, ux $$1) {
         super(epb.I, $$1, $$0, $$1x -> a(drc.valueOf($$1.l("Rot")), $$1x));
      }

      private static esi a(drc $$0, alz $$1) {
         return new esi().a($$0).a(dpl.a).a(eqj.e.get($$1)).a(ern.b).a(erw.a);
      }

      private static jh a(alz $$0, jh $$1, int $$2) {
         return $$1.a(eqj.f.get($$0)).c($$2);
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dhz $$2, bam $$3, eoc $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dko.a.m(), 3);
            dux $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dve) {
               ((dve)$$5).a(ewl.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         alz $$7 = alz.a(this.a);
         esi $$8 = a(this.c.d(), $$7);
         jh $$9 = eqj.f.get($$7);
         jh $$10 = this.d.a((kl)esm.a($$8, new jh(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(edq.a.a, $$10.u(), $$10.w());
         jh $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eqj.b)) {
            jh $$13 = this.d.a((kl)esm.a($$8, new jh(3, 0, 5)));
            dxv $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dko.cX)) {
               $$0.a($$13, dko.ec.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
