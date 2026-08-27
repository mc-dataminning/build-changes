import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ede implements edh {
   public static final Codec<ede> a = RecordCodecBuilder.create($$0 -> $$0.group(sl.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ede::new));
   private final sl b;

   public ede(sl $$0) {
      this.b = $$0;
   }

   @Override
   public sl a(aup $$0, @Nullable sl $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public edi<?> a() {
      return edi.c;
   }
}
