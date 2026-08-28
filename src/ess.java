import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ess {
   public static final int a = 90;
   static final alg b = alg.b("igloo/top");
   private static final alg c = alg.b("igloo/middle");
   private static final alg d = alg.b("igloo/bottom");
   static final Map<alg, iu> e = ImmutableMap.of(b, new iu(3, 5, 5), c, new iu(1, 3, 1), d, new iu(3, 6, 7));
   static final Map<alg, iu> f = ImmutableMap.of(b, iu.c, c, new iu(2, -3, 4), d, new iu(0, -3, -2));

   public static void a(euw $$0, iu $$1, dst $$2, eqy $$3, azv $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ess.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ess.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ess.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends erd {
      public a(euw $$0, alg $$1, iu $$2, dst $$3, int $$4) {
         super(erk.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(euw $$0, tz $$1) {
         super(erk.I, $$1, $$0, $$1x -> a(dst.valueOf($$1.l("Rot")), $$1x));
      }

      private static eur a(dst $$0, alg $$1) {
         return new eur().a($$0).a(drc.a).a(ess.e.get($$1)).a(etw.b).a(euf.a);
      }

      private static iu a(alg $$0, iu $$1, int $$2) {
         return $$1.a(ess.f.get($$0)).c($$2);
      }

      @Override
      protected void a(erj $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iu $$1, djm $$2, azv $$3, eql $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dmc.a.m(), 3);
            dwx $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dxf) {
               ((dxf)$$5).a(eyv.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         alg $$7 = alg.a(this.a);
         eur $$8 = a(this.c.d(), $$7);
         iu $$9 = ess.f.get($$7);
         iu $$10 = this.d.a((jz)euv.a($$8, new iu(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(efy.a.a, $$10.u(), $$10.w());
         iu $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ess.b)) {
            iu $$13 = this.d.a((jz)euv.a($$8, new iu(3, 0, 5)));
            dzz $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dmc.cY)) {
               $$0.a($$13, dmc.ed.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
