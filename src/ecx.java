import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ecx extends edl {
   public static final Codec<ecx> a = Codec.unit(() -> ecx.b);
   public static final ecx b = new ecx();

   @Nullable
   @Override
   public edo.c a(cua $$0, hx $$1, hx $$2, edo.c $$3, edo.c $$4, edk $$5) {
      hx $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(cxa.H);
      return $$7 && !cwy.a($$4.b().j($$0, $$6)) ? new edo.c($$6, cxa.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected edn<?> a() {
      return edn.m;
   }
}
