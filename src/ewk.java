import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ewk implements ewn {
   public static final MapCodec<ewk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ua.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ewk::new));
   private final ua b;

   public ewk(ua $$0) {
      this.b = $$0;
   }

   @Override
   public ua a(azz $$0, @Nullable ua $$1) {
      return $$1 == null ? this.b.l() : $$1.a(this.b);
   }

   @Override
   public ewo<?> a() {
      return ewo.c;
   }
}
