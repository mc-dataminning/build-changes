import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class epk {
   public static final int a = 90;
   static final akv b = akv.b("igloo/top");
   private static final akv c = akv.b("igloo/middle");
   private static final akv d = akv.b("igloo/bottom");
   static final Map<akv, ji> e = ImmutableMap.of(b, new ji(3, 5, 5), c, new ji(1, 3, 1), d, new ji(3, 6, 7));
   static final Map<akv, ji> f = ImmutableMap.of(b, ji.c, c, new ji(2, -3, 4), d, new ji(0, -3, -2));

   public static void a(ero $$0, ji $$1, dqd $$2, enq $$3, azh $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new epk.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new epk.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new epk.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends env {
      public a(ero $$0, akv $$1, ji $$2, dqd $$3, int $$4) {
         super(eoc.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ero $$0, tq $$1) {
         super(eoc.I, $$1, $$0, $$1x -> a(dqd.valueOf($$1.l("Rot")), $$1x));
      }

      private static erj a(dqd $$0, akv $$1) {
         return new erj().a($$0).a(dok.a).a(epk.e.get($$1)).a(eqo.b).a(eqx.a);
      }

      private static ji a(akv $$0, ji $$1, int $$2) {
         return $$1.a(epk.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eob $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ji $$1, dgy $$2, azh $$3, end $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, djn.a.m(), 3);
            dty $$5 = $$2.c_($$1.e());
            if ($$5 instanceof duf) {
               ((duf)$$5).a(evm.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         akv $$7 = akv.a(this.a);
         erj $$8 = a(this.c.d(), $$7);
         ji $$9 = epk.f.get($$7);
         ji $$10 = this.d.a((km)ern.a($$8, new ji(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(ecr.a.a, $$10.u(), $$10.w());
         ji $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(epk.b)) {
            ji $$13 = this.d.a((km)ern.a($$8, new ji(3, 0, 5)));
            dww $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(djn.cX)) {
               $$0.a($$13, djn.ec.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
