import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dyt {
   public static final int a = 90;
   static final agg b = new agg("igloo/top");
   private static final agg c = new agg("igloo/middle");
   private static final agg d = new agg("igloo/bottom");
   static final Map<agg, ht> e = ImmutableMap.of(b, new ht(3, 5, 5), c, new ht(1, 3, 1), d, new ht(3, 6, 7));
   static final Map<agg, ht> f = ImmutableMap.of(b, ht.b, c, new ht(2, -3, 4), d, new ht(0, -3, -2));

   public static void a(eaw $$0, ht $$1, dbf $$2, dxa $$3, ato $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new dyt.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new dyt.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new dyt.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dxf {
      public a(eaw $$0, agg $$1, ht $$2, dbf $$3, int $$4) {
         super(dxm.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(eaw $$0, rz $$1) {
         super(dxm.I, $$1, $$0, $$1x -> a(dbf.valueOf($$1.l("Rot")), $$1x));
      }

      private static ear a(dbf $$0, agg $$1) {
         return new ear().a($$0).a(czp.a).a(dyt.e.get($$1)).a(dzx.b);
      }

      private static ht a(agg $$0, ht $$1, int $$2) {
         return $$1.a(dyt.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ht $$1, csh $$2, ato $$3, dwn $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cuv.a.o(), 3);
            der $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dey) {
               ((dey)$$5).a(eej.C, $$3.g());
            }
         }
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         agg $$7 = new agg(this.a);
         ear $$8 = a(this.c.d(), $$7);
         ht $$9 = dyt.f.get($$7);
         ht $$10 = this.d.a((iw)eav.a($$8, new ht(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dmf.a.a, $$10.u(), $$10.w());
         ht $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(dyt.b)) {
            ht $$13 = this.d.a((iw)eav.a($$8, new ht(3, 0, 5)));
            dgw $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cuv.cO)) {
               $$0.a($$13, cuv.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
