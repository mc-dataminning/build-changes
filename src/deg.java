import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deg extends dez implements dma {
   public static final MapCodec<deg> a = b(deg::new);
   public static final dst b = dss.C;

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   protected deg(dsb.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dsc $$0, dbe $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.a;
   }

   @Override
   protected float d(dsc $$0, dbe $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(b) ? enw.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == enw.c));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   public cup a(@Nullable cmx $$0, dbz $$1, iz $$2, dsc $$3) {
      return $$0 != null && $$0.f() ? dma.super.a($$0, $$1, $$2, $$3) : cup.l;
   }

   @Override
   public boolean a(@Nullable cmx $$0, dbe $$1, iz $$2, dsc $$3, enu $$4) {
      return $$0 != null && $$0.f() ? dma.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
