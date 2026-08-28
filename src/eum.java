import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eum {
   public static final int a = 90;
   static final alr b = alr.b("igloo/top");
   private static final alr c = alr.b("igloo/middle");
   private static final alr d = alr.b("igloo/bottom");
   static final Map<alr, iw> e = ImmutableMap.of(b, new iw(3, 5, 5), c, new iw(1, 3, 1), d, new iw(3, 6, 7));
   static final Map<alr, iw> f = ImmutableMap.of(b, iw.c, c, new iw(2, -3, 4), d, new iw(0, -3, -2));

   public static void a(ewq $$0, iw $$1, dui $$2, ess $$3, bai $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eum.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eum.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eum.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends esx {
      public a(ewq $$0, alr $$1, iw $$2, dui $$3, int $$4) {
         super(ete.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ewq $$0, ua $$1) {
         super(ete.I, $$1, $$0, $$1x -> a($$1.<dui>a("Rot", dui.h).orElseThrow(), $$1x));
      }

      private static ewl a(dui $$0, alr $$1) {
         return new ewl().a($$0).a(dsr.a).a(eum.e.get($$1)).a(evq.b).a(evz.a);
      }

      private static iw a(alr $$0, iw $$1, int $$2) {
         return $$1.a(eum.f.get($$0)).c($$2);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dui.h, this.c.d());
      }

      @Override
      protected void a(String $$0, iw $$1, dla $$2, bai $$3, esf $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dnq.a.m(), 3);
            dyo $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dyw) {
               ((dyw)$$5).a(fap.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         alr $$7 = alr.a(this.a);
         ewl $$8 = a(this.c.d(), $$7);
         iw $$9 = eum.f.get($$7);
         iw $$10 = this.d.a((kb)ewp.a($$8, new iw(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(ehp.a.a, $$10.u(), $$10.w());
         iw $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eum.b)) {
            iw $$13 = this.d.a((kb)ewp.a($$8, new iw(3, 0, 5)));
            ebq $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dnq.da)) {
               $$0.a($$13, dnq.ef.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
