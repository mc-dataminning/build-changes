import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ewu implements ewx {
   public static final MapCodec<ewu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ua.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ewu::new));
   private final ua b;

   public ewu(ua $$0) {
      this.b = $$0;
   }

   @Override
   public ua a(bai $$0, @Nullable ua $$1) {
      return $$1 == null ? this.b.l() : $$1.a(this.b);
   }

   @Override
   public ewy<?> a() {
      return ewy.c;
   }
}
