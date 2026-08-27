import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eba implements ebd {
   public static final Codec<eba> a = RecordCodecBuilder.create($$0 -> $$0.group(rz.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, eba::new));
   private final rz b;

   public eba(rz $$0) {
      this.b = $$0;
   }

   @Override
   public rz a(ato $$0, @Nullable rz $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public ebe<?> a() {
      return ebe.c;
   }
}
