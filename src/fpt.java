import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fpt(int b) implements fpq {
   public static final MapCodec<fpt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.i.fieldOf("default").forGetter(fpt::b)).apply($$0, fpt::new));

   public fpt() {
      this(-13083194);
   }

   @Override
   public int a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2) {
      dao $$3 = $$0.a(kj.R);
      return $$3 != null ? axu.f($$3.a(this.b)) : axu.f(this.b);
   }

   @Override
   public MapCodec<fpt> a() {
      return a;
   }
}
