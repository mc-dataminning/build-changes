import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eae extends eas {
   public static final Codec<eae> a = Codec.unit(() -> eae.b);
   public static final eae b = new eae();

   @Nullable
   @Override
   public eav.c a(crv $$0, ht $$1, ht $$2, eav.c $$3, eav.c $$4, ear $$5) {
      ht $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(cuv.H);
      return $$7 && !cut.a($$4.b().j($$0, $$6)) ? new eav.c($$6, cuv.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected eau<?> a() {
      return eau.m;
   }
}
