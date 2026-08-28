import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eku {
   public static final int a = 90;
   static final akk b = new akk("igloo/top");
   private static final akk c = new akk("igloo/middle");
   private static final akk d = new akk("igloo/bottom");
   static final Map<akk, ja> e = ImmutableMap.of(b, new ja(3, 5, 5), c, new ja(1, 3, 1), d, new ja(3, 6, 7));
   static final Map<akk, ja> f = ImmutableMap.of(b, ja.c, c, new ja(2, -3, 4), d, new ja(0, -3, -2));

   public static void a(emx $$0, ja $$1, dlu $$2, ejb $$3, ayo $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eku.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eku.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eku.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends ejg {
      public a(emx $$0, akk $$1, ja $$2, dlu $$3, int $$4) {
         super(ejn.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(emx $$0, tx $$1) {
         super(ejn.I, $$1, $$0, $$1x -> a(dlu.valueOf($$1.l("Rot")), $$1x));
      }

      private static ems a(dlu $$0, akk $$1) {
         return new ems().a($$0).a(dke.a).a(eku.e.get($$1)).a(ely.b);
      }

      private static ja a(akk $$0, ja $$1, int $$2) {
         return $$1.a(eku.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ejm $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ja $$1, dcu $$2, ayo $$3, eio $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfj.a.o(), 3);
            dpp $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dpw) {
               ((dpw)$$5).a(eqq.C, $$3.g());
            }
         }
      }

      @Override
      public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, dbm $$5, ja $$6) {
         akk $$7 = new akk(this.a);
         ems $$8 = a(this.c.d(), $$7);
         ja $$9 = eku.f.get($$7);
         ja $$10 = this.d.a((ke)emw.a($$8, new ja(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dyf.a.a, $$10.u(), $$10.w());
         ja $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eku.b)) {
            ja $$13 = this.d.a((ke)emw.a($$8, new ja(3, 0, 5)));
            dsk $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dfj.cO)) {
               $$0.a($$13, dfj.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
