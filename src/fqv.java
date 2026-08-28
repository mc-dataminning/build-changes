import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqv(int b) implements fqy {
   public static final MapCodec<fqv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(fqv::b)).apply($$0, fqv::new));

   @Override
   public int a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2) {
      return dbx.a($$0, this.b);
   }

   @Override
   public MapCodec<fqv> a() {
      return a;
   }
}
