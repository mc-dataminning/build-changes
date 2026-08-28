import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deq extends dek implements dep {
   public static final MapCodec<deq> a = b(deq::new);

   @Override
   public MapCodec<deq> a() {
      return a;
   }

   public deq(dsa.d $$0) {
      super($$0);
   }

   @Override
   public cth b() {
      return cth.a;
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return a($$2, dpi.o, dpb::a);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         if ($$1.c_($$2) instanceof dpb $$5) {
            $$3.a($$5);
            $$3.a(awj.ab);
         }

         return bqt.c;
      }
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }
}
