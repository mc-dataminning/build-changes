import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eaq extends ebe {
   public static final Codec<eaq> a = Codec.unit(() -> eaq.b);
   public static final eaq b = new eaq();

   @Nullable
   @Override
   public ebh.c a(csd $$0, ht $$1, ht $$2, ebh.c $$3, ebh.c $$4, ebd $$5) {
      ht $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(cvc.H);
      return $$7 && !cva.a($$4.b().j($$0, $$6)) ? new ebh.c($$6, cvc.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected ebg<?> a() {
      return ebg.m;
   }
}
