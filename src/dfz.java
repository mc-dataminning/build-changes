import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfz extends dll implements dma {
   public static final MapCodec<dfz> a = b(dfz::new);
   public static final dst b = dss.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ewk e = dez.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ewk f = dez.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ewk g = dez.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   public dfz(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, je.a.b));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      switch ((je.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enw.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(b) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
