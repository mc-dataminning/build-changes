import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emk implements emn {
   public static final MapCodec<emk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ur.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, emk::new));
   private final ur b;

   public emk(ur $$0) {
      this.b = $$0;
   }

   @Override
   public ur a(azc $$0, @Nullable ur $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public emo<?> a() {
      return emo.c;
   }
}
