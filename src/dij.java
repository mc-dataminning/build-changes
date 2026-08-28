import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dij extends djz implements dfc, dma {
   public static final MapCodec<dij> a = b(dij::new);
   private static final dst c = dss.C;
   private final dka d = new dka(this);

   @Override
   public MapCodec<dij> a() {
      return a;
   }

   public dij(dsb.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dsc> b(int $$0) {
      return $$1 -> djz.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, cya $$1) {
      return !$$1.n().a(cus.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return je.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(c) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsc $$0, dbe $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   public dka c() {
      return this.d;
   }
}
