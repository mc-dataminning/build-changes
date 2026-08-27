import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dwq {
   public static final int a = 90;
   static final aer b = new aer("igloo/top");
   private static final aer c = new aer("igloo/middle");
   private static final aer d = new aer("igloo/bottom");
   static final Map<aer, gu> e = ImmutableMap.of(b, new gu(3, 5, 5), c, new gu(1, 3, 1), d, new gu(3, 6, 7));
   static final Map<aer, gu> f = ImmutableMap.of(b, gu.b, c, new gu(2, -3, 4), d, new gu(0, -3, -2));

   public static void a(dyt $$0, gu $$1, cyy $$2, dve $$3, aru $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new dwq.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new dwq.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new dwq.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dvj {
      public a(dyt $$0, aer $$1, gu $$2, cyy $$3, int $$4) {
         super(dvq.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(dyt $$0, qr $$1) {
         super(dvq.I, $$1, $$0, $$1x -> a(cyy.valueOf($$1.l("Rot")), $$1x));
      }

      private static dyo a(cyy $$0, aer $$1) {
         return new dyo().a($$0).a(cxh.a).a(dwq.e.get($$1)).a(dxu.b);
      }

      private static gu a(aer $$0, gu $$1, int $$2) {
         return $$1.a(dwq.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gu $$1, cqb $$2, aru $$3, dur $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, csn.a.n(), 3);
            dcm $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dct) {
               ((dct)$$5).a(ecf.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         aer $$7 = new aer(this.a);
         dyo $$8 = a(this.c.d(), $$7);
         gu $$9 = dwq.f.get($$7);
         gu $$10 = this.d.a((hz)dys.a($$8, new gu(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dkj.a.a, $$10.u(), $$10.w());
         gu $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(dwq.b)) {
            gu $$13 = this.d.a((hz)dys.a($$8, new gu(3, 0, 5)));
            dfa $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(csn.cO)) {
               $$0.a($$13, csn.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
