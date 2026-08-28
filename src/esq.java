import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class esq implements est {
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tq.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, esq::new));
   private final tq b;

   public esq(tq $$0) {
      this.b = $$0;
   }

   @Override
   public tq a(azh $$0, @Nullable tq $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public esu<?> a() {
      return esu.c;
   }
}
