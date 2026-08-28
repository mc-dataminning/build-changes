import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fps(int b) implements fpq {
   public static final MapCodec<fps> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.i.fieldOf("default").forGetter(fps::b)).apply($$0, fps::new));

   public fps() {
      this(dbo.c.a());
   }

   @Override
   public int a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2) {
      dbo $$3 = $$0.a(kj.L);
      return $$3 != null ? axu.f($$3.a()) : axu.f(this.b);
   }

   @Override
   public MapCodec<fps> a() {
      return a;
   }
}
