import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eoa {
   public static final int a = 90;
   static final all b = all.b("igloo/top");
   private static final all c = all.b("igloo/middle");
   private static final all d = all.b("igloo/bottom");
   static final Map<all, jh> e = ImmutableMap.of(b, new jh(3, 5, 5), c, new jh(1, 3, 1), d, new jh(3, 6, 7));
   static final Map<all, jh> f = ImmutableMap.of(b, jh.c, c, new jh(2, -3, 4), d, new jh(0, -3, -2));

   public static void a(eqe $$0, jh $$1, dow $$2, emg $$3, azv $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eoa.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eoa.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eoa.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eml {
      public a(eqe $$0, all $$1, jh $$2, dow $$3, int $$4) {
         super(ems.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(eqe $$0, un $$1) {
         super(ems.I, $$1, $$0, $$1x -> a(dow.valueOf($$1.l("Rot")), $$1x));
      }

      private static epz a(dow $$0, all $$1) {
         return new epz().a($$0).a(dnf.a).a(eoa.e.get($$1)).a(epe.b).a(epn.a);
      }

      private static jh a(all $$0, jh $$1, int $$2) {
         return $$1.a(eoa.f.get($$0)).c($$2);
      }

      @Override
      protected void a(emr $$0, un $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dfw $$2, azv $$3, elt $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dil.a.m(), 3);
            dsr $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dsy) {
               ((dsy)$$5).a(euc.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5, jh $$6) {
         all $$7 = all.a(this.a);
         epz $$8 = a(this.c.d(), $$7);
         jh $$9 = eoa.f.get($$7);
         jh $$10 = this.d.a((kl)eqd.a($$8, new jh(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(ebj.a.a, $$10.u(), $$10.w());
         jh $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eoa.b)) {
            jh $$13 = this.d.a((kl)eqd.a($$8, new jh(3, 0, 5)));
            dvo $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dil.cO)) {
               $$0.a($$13, dil.dP.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
