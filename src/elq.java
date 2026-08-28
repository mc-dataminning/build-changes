import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class elq {
   public static final int a = 90;
   static final akr b = akr.b("igloo/top");
   private static final akr c = akr.b("igloo/middle");
   private static final akr d = akr.b("igloo/bottom");
   static final Map<akr, jd> e = ImmutableMap.of(b, new jd(3, 5, 5), c, new jd(1, 3, 1), d, new jd(3, 6, 7));
   static final Map<akr, jd> f = ImmutableMap.of(b, jd.c, c, new jd(2, -3, 4), d, new jd(0, -3, -2));

   public static void a(enu $$0, jd $$1, dmm $$2, ejw $$3, ayw $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new elq.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new elq.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new elq.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends ekb {
      public a(enu $$0, akr $$1, jd $$2, dmm $$3, int $$4) {
         super(eki.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(enu $$0, ub $$1) {
         super(eki.I, $$1, $$0, $$1x -> a(dmm.valueOf($$1.l("Rot")), $$1x));
      }

      private static enp a(dmm $$0, akr $$1) {
         return new enp().a($$0).a(dkv.a).a(elq.e.get($$1)).a(emu.b).a(end.a);
      }

      private static jd a(akr $$0, jd $$1, int $$2) {
         return $$1.a(elq.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ekh $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jd $$1, ddl $$2, ayw $$3, ejj $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dga.a.o(), 3);
            dqh $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dqo) {
               ((dqo)$$5).a(ern.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         akr $$7 = akr.a(this.a);
         enp $$8 = a(this.c.d(), $$7);
         jd $$9 = elq.f.get($$7);
         jd $$10 = this.d.a((kh)ent.a($$8, new jd(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dyy.a.a, $$10.u(), $$10.w());
         jd $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(elq.b)) {
            jd $$13 = this.d.a((kh)ent.a($$8, new jd(3, 0, 5)));
            dtc $$14 = $$0.a_($$13.e());
            if (!$$14.i() && !$$14.a(dga.cO)) {
               $$0.a($$13, dga.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
