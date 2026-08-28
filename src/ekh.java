import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ekh {
   public static final int a = 90;
   static final ale b = new ale("igloo/top");
   private static final ale c = new ale("igloo/middle");
   private static final ale d = new ale("igloo/bottom");
   static final Map<ale, iz> e = ImmutableMap.of(b, new iz(3, 5, 5), c, new iz(1, 3, 1), d, new iz(3, 6, 7));
   static final Map<ale, iz> f = ImmutableMap.of(b, iz.c, c, new iz(2, -3, 4), d, new iz(0, -3, -2));

   public static void a(emk $$0, iz $$1, dll $$2, eio $$3, azg $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ekh.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ekh.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ekh.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eit {
      public a(emk $$0, ale $$1, iz $$2, dll $$3, int $$4) {
         super(eja.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(emk $$0, ur $$1) {
         super(eja.I, $$1, $$0, $$1x -> a(dll.valueOf($$1.l("Rot")), $$1x));
      }

      private static emf a(dll $$0, ale $$1) {
         return new emf().a($$0).a(djv.a).a(ekh.e.get($$1)).a(ell.b);
      }

      private static iz a(ale $$0, iz $$1, int $$2) {
         return $$1.a(ekh.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eiz $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iz $$1, dcm $$2, azg $$3, eib $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfa.a.o(), 3);
            dpg $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dpn) {
               ((dpn)$$5).a(eqd.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dcs $$0, dcq $$1, dty $$2, azg $$3, eib $$4, dbe $$5, iz $$6) {
         ale $$7 = new ale(this.a);
         emf $$8 = a(this.c.d(), $$7);
         iz $$9 = ekh.f.get($$7);
         iz $$10 = this.d.a((kd)emj.a($$8, new iz(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dxt.a.a, $$10.u(), $$10.w());
         iz $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ekh.b)) {
            iz $$13 = this.d.a((kd)emj.a($$8, new iz(3, 0, 5)));
            dsb $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dfa.cO)) {
               $$0.a($$13, dfa.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
