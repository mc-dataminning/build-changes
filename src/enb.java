import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class enb {
   public static final int a = 90;
   static final alc b = alc.b("igloo/top");
   private static final alc c = alc.b("igloo/middle");
   private static final alc d = alc.b("igloo/bottom");
   static final Map<alc, je> e = ImmutableMap.of(b, new je(3, 5, 5), c, new je(1, 3, 1), d, new je(3, 6, 7));
   static final Map<alc, je> f = ImmutableMap.of(b, je.c, c, new je(2, -3, 4), d, new je(0, -3, -2));

   public static void a(epf $$0, je $$1, dnx $$2, elh $$3, azl $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new enb.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new enb.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new enb.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends elm {
      public a(epf $$0, alc $$1, je $$2, dnx $$3, int $$4) {
         super(elt.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(epf $$0, uf $$1) {
         super(elt.I, $$1, $$0, $$1x -> a(dnx.valueOf($$1.l("Rot")), $$1x));
      }

      private static epa a(dnx $$0, alc $$1) {
         return new epa().a($$0).a(dmg.a).a(enb.e.get($$1)).a(eof.b).a(eoo.a);
      }

      private static je a(alc $$0, je $$1, int $$2) {
         return $$1.a(enb.f.get($$0)).c($$2);
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, je $$1, dew $$2, azl $$3, eku $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dhl.a.o(), 3);
            drs $$5 = $$2.c_($$1.e());
            if ($$5 instanceof drz) {
               ((drz)$$5).a(etd.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         alc $$7 = alc.a(this.a);
         epa $$8 = a(this.c.d(), $$7);
         je $$9 = enb.f.get($$7);
         je $$10 = this.d.a((ki)epe.a($$8, new je(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(eak.a.a, $$10.u(), $$10.w());
         je $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(enb.b)) {
            je $$13 = this.d.a((ki)epe.a($$8, new je(3, 0, 5)));
            duo $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dhl.cO)) {
               $$0.a($$13, dhl.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
