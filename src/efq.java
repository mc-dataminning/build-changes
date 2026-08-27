import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class efq implements eft {
   public static final Codec<efq> a = RecordCodecBuilder.create($$0 -> $$0.group(sw.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, efq::new));
   private final sw b;

   public efq(sw $$0) {
      this.b = $$0;
   }

   @Override
   public sw a(awp $$0, @Nullable sw $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public efu<?> a() {
      return efu.c;
   }
}
