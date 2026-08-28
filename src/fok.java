import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fok(int b) implements fon {
   public static final MapCodec<fok> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.i.fieldOf("default").forGetter(fok::b)).apply($$0, fok::new));

   @Override
   public int a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2) {
      return daj.a($$0, this.b);
   }

   @Override
   public MapCodec<fok> a() {
      return a;
   }
}
