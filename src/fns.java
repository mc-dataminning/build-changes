import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fns(int b) implements fnq {
   public static final MapCodec<fns> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fns::b)).apply($$0, fns::new));

   public fns() {
      this(dab.c.a());
   }

   @Override
   public int a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2) {
      dab $$3 = $$0.a(kv.L);
      return $$3 != null ? axk.f($$3.a()) : axk.f(this.b);
   }

   @Override
   public MapCodec<fns> a() {
      return a;
   }
}
