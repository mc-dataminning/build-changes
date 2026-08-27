import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ehj implements ehm {
   public static final Codec<ehj> a = RecordCodecBuilder.create($$0 -> $$0.group(ta.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ehj::new));
   private final ta b;

   public ehj(ta $$0) {
      this.b = $$0;
   }

   @Override
   public ta a(axd $$0, @Nullable ta $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public ehn<?> a() {
      return ehn.c;
   }
}
