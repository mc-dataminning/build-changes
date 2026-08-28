import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dme extends dhh implements dfc, dma {
   public static final MapCodec<dme> c = b(dme::new);
   private static final dst g = dss.C;
   public static final dsw d = dss.R;
   protected static final float e = 6.0F;
   protected static final ewk f = dez.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dme> a() {
      return c;
   }

   public dme(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsy.b).a(g, Boolean.valueOf(false)).a(d, je.c));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return f;
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.a(awp.bx) || $$1.b_($$2.c()).a(enw.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dsc $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, btp $$3, cup $$4) {
      if (!$$0.x_()) {
         iz $$5 = $$1.c();
         dsc $$6 = dhh.c($$0, $$5, this.o().a(b, dsy.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(g) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      if ($$0.c(b) == dsy.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iz $$3 = $$2.d();
         dsc $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return true;
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      if ($$3.c(dhh.b) == dsy.b) {
         iz $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dew.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iz $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float as_() {
      return 0.1F;
   }
}
