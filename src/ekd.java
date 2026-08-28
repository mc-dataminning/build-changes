import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ekd {
   public static final int a = 90;
   static final alb b = new alb("igloo/top");
   private static final alb c = new alb("igloo/middle");
   private static final alb d = new alb("igloo/bottom");
   static final Map<alb, iz> e = ImmutableMap.of(b, new iz(3, 5, 5), c, new iz(1, 3, 1), d, new iz(3, 6, 7));
   static final Map<alb, iz> f = ImmutableMap.of(b, iz.c, c, new iz(2, -3, 4), d, new iz(0, -3, -2));

   public static void a(emg $$0, iz $$1, dlh $$2, eik $$3, azc $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ekd.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ekd.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ekd.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eip {
      public a(emg $$0, alb $$1, iz $$2, dlh $$3, int $$4) {
         super(eiw.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(emg $$0, ur $$1) {
         super(eiw.I, $$1, $$0, $$1x -> a(dlh.valueOf($$1.l("Rot")), $$1x));
      }

      private static emb a(dlh $$0, alb $$1) {
         return new emb().a($$0).a(djr.a).a(ekd.e.get($$1)).a(elh.b);
      }

      private static iz a(alb $$0, iz $$1, int $$2) {
         return $$1.a(ekd.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eiv $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iz $$1, dci $$2, azc $$3, ehx $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dew.a.n(), 3);
            dpc $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dpj) {
               ((dpj)$$5).a(epz.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, dba $$5, iz $$6) {
         alb $$7 = new alb(this.a);
         emb $$8 = a(this.c.d(), $$7);
         iz $$9 = ekd.f.get($$7);
         iz $$10 = this.d.a((kd)emf.a($$8, new iz(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dxp.a.a, $$10.u(), $$10.w());
         iz $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ekd.b)) {
            iz $$13 = this.d.a((kd)emf.a($$8, new iz(3, 0, 5)));
            drx $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dew.cO)) {
               $$0.a($$13, dew.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
