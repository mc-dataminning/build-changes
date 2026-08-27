import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eco extends edc {
   public static final Codec<eco> a = Codec.unit(() -> eco.b);
   public static final eco b = new eco();

   @Nullable
   @Override
   public edf.c a(ctr $$0, hx $$1, hx $$2, edf.c $$3, edf.c $$4, edb $$5) {
      hx $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(cwr.H);
      return $$7 && !cwp.a($$4.b().j($$0, $$6)) ? new edf.c($$6, cwr.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected ede<?> a() {
      return ede.m;
   }
}
