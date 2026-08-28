import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class erf {
   public static final int a = 90;
   static final ald b = ald.b("igloo/top");
   private static final ald c = ald.b("igloo/middle");
   private static final ald d = ald.b("igloo/bottom");
   static final Map<ald, jj> e = ImmutableMap.of(b, new jj(3, 5, 5), c, new jj(1, 3, 1), d, new jj(3, 6, 7));
   static final Map<ald, jj> f = ImmutableMap.of(b, jj.c, c, new jj(2, -3, 4), d, new jj(0, -3, -2));

   public static void a(etj $$0, jj $$1, drm $$2, epl $$3, azs $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new erf.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new erf.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new erf.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends epq {
      public a(etj $$0, ald $$1, jj $$2, drm $$3, int $$4) {
         super(epx.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(etj $$0, tw $$1) {
         super(epx.I, $$1, $$0, $$1x -> a(drm.valueOf($$1.l("Rot")), $$1x));
      }

      private static ete a(drm $$0, ald $$1) {
         return new ete().a($$0).a(dpv.a).a(erf.e.get($$1)).a(esj.b).a(ess.a);
      }

      private static jj a(ald $$0, jj $$1, int $$2) {
         return $$1.a(erf.f.get($$0)).c($$2);
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jj $$1, dig $$2, azs $$3, eoy $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dkw.a.m(), 3);
            dvl $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dvt) {
               ((dvt)$$5).a(exh.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         ald $$7 = ald.a(this.a);
         ete $$8 = a(this.c.d(), $$7);
         jj $$9 = erf.f.get($$7);
         jj $$10 = this.d.a((kn)eti.a($$8, new jj(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(eel.a.a, $$10.u(), $$10.w());
         jj $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(erf.b)) {
            jj $$13 = this.d.a((kn)eti.a($$8, new jj(3, 0, 5)));
            dym $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dkw.cX)) {
               $$0.a($$13, dkw.ec.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
