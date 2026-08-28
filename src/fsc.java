import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsc(int b) implements fsa {
   public static final MapCodec<fsc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.i.fieldOf("default").forGetter(fsc::b)).apply($$0, fsc::new));

   public fsc() {
      this(ddg.c.a());
   }

   @Override
   public int a(dak $$0, @Nullable glo $$1, @Nullable byf $$2) {
      ddg $$3 = $$0.a(kl.L);
      return $$3 != null ? ayh.f($$3.a()) : ayh.f(this.b);
   }

   @Override
   public MapCodec<fsc> a() {
      return a;
   }
}
