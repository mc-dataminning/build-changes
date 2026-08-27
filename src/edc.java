import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class edc {
   public static final int a = 90;
   static final aiy b = new aiy("igloo/top");
   private static final aiy c = new aiy("igloo/middle");
   private static final aiy d = new aiy("igloo/bottom");
   static final Map<aiy, hz> e = ImmutableMap.of(b, new hz(3, 5, 5), c, new hz(1, 3, 1), d, new hz(3, 6, 7));
   static final Map<aiy, hz> f = ImmutableMap.of(b, hz.c, c, new hz(2, -3, 4), d, new hz(0, -3, -2));

   public static void a(eff $$0, hz $$1, dfa $$2, ebj $$3, awo $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new edc.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new edc.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new edc.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends ebo {
      public a(eff $$0, aiy $$1, hz $$2, dfa $$3, int $$4) {
         super(ebv.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(eff $$0, sw $$1) {
         super(ebv.I, $$1, $$0, $$1x -> a(dfa.valueOf($$1.l("Rot")), $$1x));
      }

      private static efa a(dfa $$0, aiy $$1) {
         return new efa().a($$0).a(ddk.a).a(edc.e.get($$1)).a(eeg.b);
      }

      private static hz a(aiy $$0, hz $$1, int $$2) {
         return $$1.a(edc.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ebu $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hz $$1, cwc $$2, awo $$3, eaw $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cyq.a.o(), 3);
            dit $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dja) {
               ((dja)$$5).a(eit.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, cuu $$5, hz $$6) {
         aiy $$7 = new aiy(this.a);
         efa $$8 = a(this.c.d(), $$7);
         hz $$9 = edc.f.get($$7);
         hz $$10 = this.d.a((jd)efe.a($$8, new hz(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dqo.a.a, $$10.u(), $$10.w());
         hz $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(edc.b)) {
            hz $$13 = this.d.a((jd)efe.a($$8, new hz(3, 0, 5)));
            dlf $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cyq.cO)) {
               $$0.a($$13, cyq.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
