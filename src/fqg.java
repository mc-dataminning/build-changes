import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqg(int b) implements fqj {
   public static final MapCodec<fqg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(fqg::b)).apply($$0, fqg::new));

   @Override
   public int a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2) {
      return dbq.a($$0, this.b);
   }

   @Override
   public MapCodec<fqg> a() {
      return a;
   }
}
