import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eho {
   public static final int a = 90;
   static final ajv b = new ajv("igloo/top");
   private static final ajv c = new ajv("igloo/middle");
   private static final ajv d = new ajv("igloo/bottom");
   static final Map<ajv, id> e = ImmutableMap.of(b, new id(3, 5, 5), c, new id(1, 3, 1), d, new id(3, 6, 7));
   static final Map<ajv, id> f = ImmutableMap.of(b, id.c, c, new id(2, -3, 4), d, new id(0, -3, -2));

   public static void a(ejr $$0, id $$1, dit $$2, efv $$3, axt $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eho.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eho.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eho.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends ega {
      public a(ejr $$0, ajv $$1, id $$2, dit $$3, int $$4) {
         super(egh.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ejr $$0, to $$1) {
         super(egh.I, $$1, $$0, $$1x -> a(dit.valueOf($$1.l("Rot")), $$1x));
      }

      private static ejm a(dit $$0, ajv $$1) {
         return new ejm().a($$0).a(dhd.a).a(eho.e.get($$1)).a(eis.b);
      }

      private static id a(ajv $$0, id $$1, int $$2) {
         return $$1.a(eho.f.get($$0)).c($$2);
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, id $$1, czv $$2, axt $$3, efi $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dcj.a.n(), 3);
            dmo $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dmv) {
               ((dmv)$$5).a(eni.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         ajv $$7 = new ajv(this.a);
         ejm $$8 = a(this.c.d(), $$7);
         id $$9 = eho.f.get($$7);
         id $$10 = this.d.a((ji)ejq.a($$8, new id(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dva.a.a, $$10.u(), $$10.w());
         id $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eho.b)) {
            id $$13 = this.d.a((ji)ejq.a($$8, new id(3, 0, 5)));
            dpi $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dcj.cO)) {
               $$0.a($$13, dcj.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
