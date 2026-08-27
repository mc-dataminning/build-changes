import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ein {
   public static final int a = 90;
   static final akh b = new akh("igloo/top");
   private static final akh c = new akh("igloo/middle");
   private static final akh d = new akh("igloo/bottom");
   static final Map<akh, in> e = ImmutableMap.of(b, new in(3, 5, 5), c, new in(1, 3, 1), d, new in(3, 6, 7));
   static final Map<akh, in> f = ImmutableMap.of(b, in.c, c, new in(2, -3, 4), d, new in(0, -3, -2));

   public static void a(ekq $$0, in $$1, djr $$2, egu $$3, ayg $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ein.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ein.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ein.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends egz {
      public a(ekq $$0, akh $$1, in $$2, djr $$3, int $$4) {
         super(ehg.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ekq $$0, ua $$1) {
         super(ehg.I, $$1, $$0, $$1x -> a(djr.valueOf($$1.l("Rot")), $$1x));
      }

      private static ekl a(djr $$0, akh $$1) {
         return new ekl().a($$0).a(dib.a).a(ein.e.get($$1)).a(ejr.b);
      }

      private static in a(akh $$0, in $$1, int $$2) {
         return $$1.a(ein.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, in $$1, das $$2, ayg $$3, egh $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, ddg.a.n(), 3);
            dnm $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dnt) {
               ((dnt)$$5).a(eoj.C, $$3.g());
            }
         }
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         akh $$7 = new akh(this.a);
         ekl $$8 = a(this.c.d(), $$7);
         in $$9 = ein.f.get($$7);
         in $$10 = this.d.a((jr)ekp.a($$8, new in(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dvz.a.a, $$10.u(), $$10.w());
         in $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ein.b)) {
            in $$13 = this.d.a((jr)ekp.a($$8, new in(3, 0, 5)));
            dqh $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(ddg.cO)) {
               $$0.a($$13, ddg.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
