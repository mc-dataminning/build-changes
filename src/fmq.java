import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmq(int b) implements fmt {
   public static final MapCodec<fmq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmq::b)).apply($$0, fmq::new));

   @Override
   public int a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2) {
      return czd.a($$0, this.b);
   }

   @Override
   public MapCodec<fmq> a() {
      return a;
   }
}
