import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eoh {
   public static final int a = 90;
   static final alj b = alj.b("igloo/top");
   private static final alj c = alj.b("igloo/middle");
   private static final alj d = alj.b("igloo/bottom");
   static final Map<alj, jh> e = ImmutableMap.of(b, new jh(3, 5, 5), c, new jh(1, 3, 1), d, new jh(3, 6, 7));
   static final Map<alj, jh> f = ImmutableMap.of(b, jh.c, c, new jh(2, -3, 4), d, new jh(0, -3, -2));

   public static void a(eql $$0, jh $$1, dpd $$2, emn $$3, azu $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eoh.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eoh.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eoh.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends ems {
      public a(eql $$0, alj $$1, jh $$2, dpd $$3, int $$4) {
         super(emz.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(eql $$0, ul $$1) {
         super(emz.I, $$1, $$0, $$1x -> a(dpd.valueOf($$1.l("Rot")), $$1x));
      }

      private static eqg a(dpd $$0, alj $$1) {
         return new eqg().a($$0).a(dnm.a).a(eoh.e.get($$1)).a(epl.b).a(epu.a);
      }

      private static jh a(alj $$0, jh $$1, int $$2) {
         return $$1.a(eoh.f.get($$0)).c($$2);
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dgd $$2, azu $$3, ema $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dis.a.m(), 3);
            dsy $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dtf) {
               ((dtf)$$5).a(euj.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         alj $$7 = alj.a(this.a);
         eqg $$8 = a(this.c.d(), $$7);
         jh $$9 = eoh.f.get($$7);
         jh $$10 = this.d.a((kl)eqk.a($$8, new jh(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(ebq.a.a, $$10.u(), $$10.w());
         jh $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eoh.b)) {
            jh $$13 = this.d.a((kl)eqk.a($$8, new jh(3, 0, 5)));
            dvv $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dis.cO)) {
               $$0.a($$13, dis.dP.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
