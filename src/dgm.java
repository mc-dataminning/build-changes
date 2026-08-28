import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgm extends del implements dma {
   public static final MapCodec<dgm> a = b(dgm::new);
   public static final dst b = dss.C;
   private static final int d = 3;
   protected static final ewk c = dez.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public dgm(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return a($$2, dpj.z, $$0.B ? dpt::a : dpt::b);
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.b;
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(b) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return c;
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
