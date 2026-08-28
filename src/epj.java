import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class epj {
   public static final int a = 90;
   static final aku b = aku.b("igloo/top");
   private static final aku c = aku.b("igloo/middle");
   private static final aku d = aku.b("igloo/bottom");
   static final Map<aku, ji> e = ImmutableMap.of(b, new ji(3, 5, 5), c, new ji(1, 3, 1), d, new ji(3, 6, 7));
   static final Map<aku, ji> f = ImmutableMap.of(b, ji.c, c, new ji(2, -3, 4), d, new ji(0, -3, -2));

   public static void a(ern $$0, ji $$1, dqc $$2, enp $$3, azg $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new epj.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new epj.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new epj.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends enu {
      public a(ern $$0, aku $$1, ji $$2, dqc $$3, int $$4) {
         super(eob.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ern $$0, tq $$1) {
         super(eob.I, $$1, $$0, $$1x -> a(dqc.valueOf($$1.l("Rot")), $$1x));
      }

      private static eri a(dqc $$0, aku $$1) {
         return new eri().a($$0).a(doj.a).a(epj.e.get($$1)).a(eqn.b).a(eqw.a);
      }

      private static ji a(aku $$0, ji $$1, int $$2) {
         return $$1.a(epj.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eoa $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ji $$1, dgx $$2, azg $$3, enc $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, djm.a.m(), 3);
            dtx $$5 = $$2.c_($$1.e());
            if ($$5 instanceof due) {
               ((due)$$5).a(evl.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dhe $$0, dhc $$1, dyr $$2, azg $$3, enc $$4, dfm $$5, ji $$6) {
         aku $$7 = aku.a(this.a);
         eri $$8 = a(this.c.d(), $$7);
         ji $$9 = epj.f.get($$7);
         ji $$10 = this.d.a((km)erm.a($$8, new ji(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(ecq.a.a, $$10.u(), $$10.w());
         ji $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(epj.b)) {
            ji $$13 = this.d.a((km)erm.a($$8, new ji(3, 0, 5)));
            dwv $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(djm.cX)) {
               $$0.a($$13, djm.ec.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
