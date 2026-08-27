import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class don extends dfc {
   private static final dxj<brv, bso> c = dxj.a(bso.class);
   public static final dtt a = dts.f;
   public static final MapCodec<don> b = b(don::new);

   public don(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<don> a() {
      return b;
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if ($$1 instanceof aqt $$6) {
         boolean $$7 = $$1.C($$2) || $$1.C($$2.c());
         if ($$7) {
            this.a($$6, $$2, 5.0F);
         }
      }
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      super.b($$0, $$1, $$2, $$3);
      if (this.a($$1, $$2, 5.0F)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 20 + $$3.a(100));
      }
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$3.i() * 0.7F;
      if (this.a($$1, $$2, $$4) && $$3.i() < 1.0F - $$4 * $$4) {
         $$1.a($$2, this, 20 + $$3.a(1 + (int)($$4 * 100.0F)));
      } else {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 2);
      }
   }

   private boolean a(aqt $$0, ir $$1, float $$2) {
      ewu $$3 = ewu.b($$1);
      ewp $$4 = ewp.a($$3, 16.0, 16.0, 16.0);
      List<bso> $$5 = new ArrayList<>();
      $$0.a(c, $$4, bsa.e, $$5, 10);
      Optional<bso> $$6 = ad.b($$5, $$0.F_());
      if ($$6.isEmpty()) {
         return false;
      } else {
         bso $$7 = $$6.get();
         ewu $$8 = $$7.cP().f();
         ewu $$9 = $$8.d($$3).d();
         ewu $$10 = $$9.e($$3);
         cng $$11 = bsb.f.a((dca)$$0);
         $$11.a($$2);
         $$11.a_($$10.a(), $$10.b(), $$10.c());
         $$11.c($$9.c, $$9.d, $$9.e, 0.5F, 0.0F);
         $$0.b($$11);
         $$0.c(1002, $$1, 0);
         return true;
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(a);
   }
}
