import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eki {
   public static final int a = 90;
   static final alf b = new alf("igloo/top");
   private static final alf c = new alf("igloo/middle");
   private static final alf d = new alf("igloo/bottom");
   static final Map<alf, iz> e = ImmutableMap.of(b, new iz(3, 5, 5), c, new iz(1, 3, 1), d, new iz(3, 6, 7));
   static final Map<alf, iz> f = ImmutableMap.of(b, iz.c, c, new iz(2, -3, 4), d, new iz(0, -3, -2));

   public static void a(eml $$0, iz $$1, dlm $$2, eip $$3, azh $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eki.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eki.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eki.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eiu {
      public a(eml $$0, alf $$1, iz $$2, dlm $$3, int $$4) {
         super(ejb.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(eml $$0, us $$1) {
         super(ejb.I, $$1, $$0, $$1x -> a(dlm.valueOf($$1.l("Rot")), $$1x));
      }

      private static emg a(dlm $$0, alf $$1) {
         return new emg().a($$0).a(djw.a).a(eki.e.get($$1)).a(elm.b);
      }

      private static iz a(alf $$0, iz $$1, int $$2) {
         return $$1.a(eki.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eja $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iz $$1, dcn $$2, azh $$3, eic $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfb.a.o(), 3);
            dph $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dpo) {
               ((dpo)$$5).a(eqe.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         alf $$7 = new alf(this.a);
         emg $$8 = a(this.c.d(), $$7);
         iz $$9 = eki.f.get($$7);
         iz $$10 = this.d.a((kd)emk.a($$8, new iz(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dxu.a.a, $$10.u(), $$10.w());
         iz $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eki.b)) {
            iz $$13 = this.d.a((kd)emk.a($$8, new iz(3, 0, 5)));
            dsc $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dfb.cO)) {
               $$0.a($$13, dfb.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
