import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dex extends der implements dew {
   public static final MapCodec<dex> a = b(dex::new);

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   public dex(dsg.d $$0) {
      super($$0);
   }

   @Override
   public cst b() {
      return cst.a;
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return a($$2, dpp.o, dpi::a);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         if ($$1.c_($$2) instanceof dpi $$5) {
            $$3.a($$5);
            $$3.a(avp.ab);
         }

         return bqd.c;
      }
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }
}
