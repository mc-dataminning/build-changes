import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eax {
   public static final int a = 90;
   static final ahd b = new ahd("igloo/top");
   private static final ahd c = new ahd("igloo/middle");
   private static final ahd d = new ahd("igloo/bottom");
   static final Map<ahd, hx> e = ImmutableMap.of(b, new hx(3, 5, 5), c, new hx(1, 3, 1), d, new hx(3, 6, 7));
   static final Map<ahd, hx> f = ImmutableMap.of(b, hx.b, c, new hx(2, -3, 4), d, new hx(0, -3, -2));

   public static void a(eda $$0, hx $$1, dcv $$2, dze $$3, aup $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eax.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eax.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eax.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dzj {
      public a(eda $$0, ahd $$1, hx $$2, dcv $$3, int $$4) {
         super(dzq.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(eda $$0, sl $$1) {
         super(dzq.I, $$1, $$0, $$1x -> a(dcv.valueOf($$1.l("Rot")), $$1x));
      }

      private static ecv a(dcv $$0, ahd $$1) {
         return new ecv().a($$0).a(dbf.a).a(eax.e.get($$1)).a(ecb.b);
      }

      private static hx a(ahd $$0, hx $$1, int $$2) {
         return $$1.a(eax.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dzp $$0, sl $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hx $$1, ctx $$2, aup $$3, dyr $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cwl.a.o(), 3);
            dgo $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dgv) {
               ((dgv)$$5).a(egn.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5, hx $$6) {
         ahd $$7 = new ahd(this.a);
         ecv $$8 = a(this.c.d(), $$7);
         hx $$9 = eax.f.get($$7);
         hx $$10 = this.d.a((jb)ecz.a($$8, new hx(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(doj.a.a, $$10.u(), $$10.w());
         hx $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eax.b)) {
            hx $$13 = this.d.a((jb)ecz.a($$8, new hx(3, 0, 5)));
            dja $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cwl.cO)) {
               $$0.a($$13, cwl.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
