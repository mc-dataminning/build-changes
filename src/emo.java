import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emo implements emr {
   public static final MapCodec<emo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ur.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, emo::new));
   private final ur b;

   public emo(ur $$0) {
      this.b = $$0;
   }

   @Override
   public ur a(azg $$0, @Nullable ur $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public ems<?> a() {
      return ems.c;
   }
}
