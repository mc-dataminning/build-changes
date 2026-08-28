import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eko {
   public static final int a = 90;
   static final akk b = new akk("igloo/top");
   private static final akk c = new akk("igloo/middle");
   private static final akk d = new akk("igloo/bottom");
   static final Map<akk, ja> e = ImmutableMap.of(b, new ja(3, 5, 5), c, new ja(1, 3, 1), d, new ja(3, 6, 7));
   static final Map<akk, ja> f = ImmutableMap.of(b, ja.c, c, new ja(2, -3, 4), d, new ja(0, -3, -2));

   public static void a(emr $$0, ja $$1, dls $$2, eiv $$3, aym $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eko.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eko.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eko.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eja {
      public a(emr $$0, akk $$1, ja $$2, dls $$3, int $$4) {
         super(ejh.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(emr $$0, tx $$1) {
         super(ejh.I, $$1, $$0, $$1x -> a(dls.valueOf($$1.l("Rot")), $$1x));
      }

      private static emm a(dls $$0, akk $$1) {
         return new emm().a($$0).a(dkc.a).a(eko.e.get($$1)).a(els.b);
      }

      private static ja a(akk $$0, ja $$1, int $$2) {
         return $$1.a(eko.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ejg $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ja $$1, dcs $$2, aym $$3, eii $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfh.a.o(), 3);
            dpn $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dpu) {
               ((dpu)$$5).a(eqk.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dcz $$0, dcx $$1, due $$2, aym $$3, eii $$4, dbk $$5, ja $$6) {
         akk $$7 = new akk(this.a);
         emm $$8 = a(this.c.d(), $$7);
         ja $$9 = eko.f.get($$7);
         ja $$10 = this.d.a((ke)emq.a($$8, new ja(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dxz.a.a, $$10.u(), $$10.w());
         ja $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eko.b)) {
            ja $$13 = this.d.a((ke)emq.a($$8, new ja(3, 0, 5)));
            dsh $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dfh.cO)) {
               $$0.a($$13, dfh.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
