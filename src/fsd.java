import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsd(int b) implements fsa {
   public static final MapCodec<fsd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.i.fieldOf("default").forGetter(fsd::b)).apply($$0, fsd::new));

   public fsd() {
      this(-13083194);
   }

   @Override
   public int a(dak $$0, @Nullable glo $$1, @Nullable byf $$2) {
      dcg $$3 = $$0.a(kl.R);
      return $$3 != null ? ayh.f($$3.a(this.b)) : ayh.f(this.b);
   }

   @Override
   public MapCodec<fsd> a() {
      return a;
   }
}
