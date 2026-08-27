import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ebe {
   public static final int a = 90;
   static final ahg b = new ahg("igloo/top");
   private static final ahg c = new ahg("igloo/middle");
   private static final ahg d = new ahg("igloo/bottom");
   static final Map<ahg, hx> e = ImmutableMap.of(b, new hx(3, 5, 5), c, new hx(1, 3, 1), d, new hx(3, 6, 7));
   static final Map<ahg, hx> f = ImmutableMap.of(b, hx.b, c, new hx(2, -3, 4), d, new hx(0, -3, -2));

   public static void a(edh $$0, hx $$1, ddc $$2, dzl $$3, auv $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ebe.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ebe.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ebe.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dzq {
      public a(edh $$0, ahg $$1, hx $$2, ddc $$3, int $$4) {
         super(dzx.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(edh $$0, sn $$1) {
         super(dzx.I, $$1, $$0, $$1x -> a(ddc.valueOf($$1.l("Rot")), $$1x));
      }

      private static edc a(ddc $$0, ahg $$1) {
         return new edc().a($$0).a(dbm.a).a(ebe.e.get($$1)).a(eci.b);
      }

      private static hx a(ahg $$0, hx $$1, int $$2) {
         return $$1.a(ebe.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dzw $$0, sn $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hx $$1, cue $$2, auv $$3, dyy $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cws.a.o(), 3);
            dgv $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dhc) {
               ((dhc)$$5).a(egu.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cuk $$0, cui $$1, dle $$2, auv $$3, dyy $$4, csw $$5, hx $$6) {
         ahg $$7 = new ahg(this.a);
         edc $$8 = a(this.c.d(), $$7);
         hx $$9 = ebe.f.get($$7);
         hx $$10 = this.d.a((jb)edg.a($$8, new hx(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(doq.a.a, $$10.u(), $$10.w());
         hx $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ebe.b)) {
            hx $$13 = this.d.a((jb)edg.a($$8, new hx(3, 0, 5)));
            djh $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cws.cO)) {
               $$0.a($$13, cws.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
