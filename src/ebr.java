import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ebr implements ebu {
   public static final Codec<ebr> a = RecordCodecBuilder.create($$0 -> $$0.group(sd.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ebr::new));
   private final sd b;

   public ebr(sd $$0) {
      this.b = $$0;
   }

   @Override
   public sd a(atw $$0, @Nullable sd $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public ebv<?> a() {
      return ebv.c;
   }
}
