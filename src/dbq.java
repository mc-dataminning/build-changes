import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbq extends dbk implements dbp {
   public static final MapCodec<dbq> a = b(dbq::new);

   @Override
   public MapCodec<dbq> a() {
      return a;
   }

   public dbq(doy.d $$0) {
      super($$0);
   }

   @Override
   public cqc b() {
      return cqc.a;
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dma($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return a($$2, dmh.o, dma::a);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         if ($$1.c_($$2) instanceof dma $$5) {
            $$3.a($$5);
            $$3.a(auw.ab);
         }

         return boa.b;
      }
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }
}
