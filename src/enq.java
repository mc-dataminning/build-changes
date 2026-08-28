import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class enq {
   public static final int a = 90;
   static final alh b = alh.b("igloo/top");
   private static final alh c = alh.b("igloo/middle");
   private static final alh d = alh.b("igloo/bottom");
   static final Map<alh, jg> e = ImmutableMap.of(b, new jg(3, 5, 5), c, new jg(1, 3, 1), d, new jg(3, 6, 7));
   static final Map<alh, jg> f = ImmutableMap.of(b, jg.c, c, new jg(2, -3, 4), d, new jg(0, -3, -2));

   public static void a(epu $$0, jg $$1, dol $$2, elw $$3, azr $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new enq.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new enq.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new enq.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends emb {
      public a(epu $$0, alh $$1, jg $$2, dol $$3, int $$4) {
         super(emi.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(epu $$0, uj $$1) {
         super(emi.I, $$1, $$0, $$1x -> a(dol.valueOf($$1.l("Rot")), $$1x));
      }

      private static epp a(dol $$0, alh $$1) {
         return new epp().a($$0).a(dmu.a).a(enq.e.get($$1)).a(eou.b).a(epd.a);
      }

      private static jg a(alh $$0, jg $$1, int $$2) {
         return $$1.a(enq.f.get($$0)).c($$2);
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jg $$1, dfl $$2, azr $$3, elj $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dia.a.m(), 3);
            dsg $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dsn) {
               ((dsn)$$5).a(ets.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         alh $$7 = alh.a(this.a);
         epp $$8 = a(this.c.d(), $$7);
         jg $$9 = enq.f.get($$7);
         jg $$10 = this.d.a((kk)ept.a($$8, new jg(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(eaz.a.a, $$10.u(), $$10.w());
         jg $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(enq.b)) {
            jg $$13 = this.d.a((kk)ept.a($$8, new jg(3, 0, 5)));
            dvd $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dia.cO)) {
               $$0.a($$13, dia.dP.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
