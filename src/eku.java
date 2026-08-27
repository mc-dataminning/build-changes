import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eku implements ekx {
   public static final Codec<eku> a = RecordCodecBuilder.create($$0 -> $$0.group(ua.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, eku::new));
   private final ua b;

   public eku(ua $$0) {
      this.b = $$0;
   }

   @Override
   public ua a(ayg $$0, @Nullable ua $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public eky<?> a() {
      return eky.c;
   }
}
