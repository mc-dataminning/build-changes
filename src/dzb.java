import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dzb implements dze {
   public static final Codec<dzb> a = RecordCodecBuilder.create($$0 -> $$0.group(qu.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, dzb::new));
   private final qu b;

   public dzb(qu $$0) {
      this.b = $$0;
   }

   @Override
   public qu a(arx $$0, @Nullable qu $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public dzf<?> a() {
      return dzf.c;
   }
}
