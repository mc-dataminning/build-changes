import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dzg implements dzj {
   public static final Codec<dzg> a = RecordCodecBuilder.create($$0 -> $$0.group(qy.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, dzg::new));
   private final qy b;

   public dzg(qy $$0) {
      this.b = $$0;
   }

   @Override
   public qy a(asc $$0, @Nullable qy $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public dzk<?> a() {
      return dzk.c;
   }
}
