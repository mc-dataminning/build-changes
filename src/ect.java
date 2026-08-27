import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ect implements ecw {
   public static final Codec<ect> a = RecordCodecBuilder.create($$0 -> $$0.group(sj.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ect::new));
   private final sj b;

   public ect(sj $$0) {
      this.b = $$0;
   }

   @Override
   public sj a(auf $$0, @Nullable sj $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public ecx<?> a() {
      return ecx.c;
   }
}
