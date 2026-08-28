import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fpn(int b) implements fpq {
   public static final MapCodec<fpn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.i.fieldOf("default").forGetter(fpn::b)).apply($$0, fpn::new));

   @Override
   public int a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2) {
      return dbf.a($$0, this.b);
   }

   @Override
   public MapCodec<fpn> a() {
      return a;
   }
}
