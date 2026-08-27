import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class edk implements edn {
   public static final Codec<edk> a = RecordCodecBuilder.create($$0 -> $$0.group(sn.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, edk::new));
   private final sn b;

   public edk(sn $$0) {
      this.b = $$0;
   }

   @Override
   public sn a(auu $$0, @Nullable sn $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public edo<?> a() {
      return edo.c;
   }
}
