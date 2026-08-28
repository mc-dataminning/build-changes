import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class enb implements ene {
   public static final MapCodec<enb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tx.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, enb::new));
   private final tx b;

   public enb(tx $$0) {
      this.b = $$0;
   }

   @Override
   public tx a(ayo $$0, @Nullable tx $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public enf<?> a() {
      return enf.c;
   }
}
