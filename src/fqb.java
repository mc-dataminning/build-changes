import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqb(float b, float c) implements fqc {
   public static final MapCodec<fqb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fqb::b), ayu.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fqb::c))
            .apply($$0, fqb::new)
   );

   public fqb() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2) {
      return dit.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<fqb> a() {
      return a;
   }
}
