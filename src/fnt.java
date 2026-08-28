import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fnt(int b) implements fnq {
   public static final MapCodec<fnt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fnt::b)).apply($$0, fnt::new));

   public fnt() {
      this(-13083194);
   }

   @Override
   public int a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2) {
      cze $$3 = $$0.a(kv.R);
      return $$3 != null ? axk.f($$3.a(this.b)) : axk.f(this.b);
   }

   @Override
   public MapCodec<fnt> a() {
      return a;
   }
}
