import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class efj implements efm {
   public static final Codec<efj> a = RecordCodecBuilder.create($$0 -> $$0.group(sw.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, efj::new));
   private final sw b;

   public efj(sw $$0) {
      this.b = $$0;
   }

   @Override
   public sw a(awo $$0, @Nullable sw $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public efn<?> a() {
      return efn.c;
   }
}
