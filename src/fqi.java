import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqi(float b, float c) implements fqj {
   public static final MapCodec<fqi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fqi::b), ayu.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fqi::c))
            .apply($$0, fqi::new)
   );

   public fqi() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2) {
      return diy.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<fqi> a() {
      return a;
   }
}
