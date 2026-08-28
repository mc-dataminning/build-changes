import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class etn implements etq {
   public static final MapCodec<etn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tw.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, etn::new));
   private final tw b;

   public etn(tw $$0) {
      this.b = $$0;
   }

   @Override
   public tw a(azs $$0, @Nullable tw $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public etr<?> a() {
      return etr.c;
   }
}
