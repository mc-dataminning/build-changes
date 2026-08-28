import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fop(int b) implements fon {
   public static final MapCodec<fop> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.i.fieldOf("default").forGetter(fop::b)).apply($$0, fop::new));

   public fop() {
      this(dar.c.a());
   }

   @Override
   public int a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2) {
      dar $$3 = $$0.a(kx.L);
      return $$3 != null ? axu.f($$3.a()) : axu.f(this.b);
   }

   @Override
   public MapCodec<fop> a() {
      return a;
   }
}
