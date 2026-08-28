import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsj extends dma {
   public static final MapCodec<dsj> a = b(dsj::new);
   public static final eaq b = dsk.b;

   @Override
   public MapCodec<dsj> a() {
      return a;
   }

   public dsj(dzy.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.D($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(b) && !$$1.D($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }
}
