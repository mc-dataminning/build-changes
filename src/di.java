import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record di(ct.d c) implements bs {
   public static final MapCodec<di> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ct.d.d.optionalFieldOf("size", ct.d.c).forGetter(di::b)).apply($$0, di::new)
   );

   public static di a(ct.d $$0) {
      return new di($$0);
   }

   @Override
   public boolean a(bru $$0, aqm $$1, @Nullable euk $$2) {
      return $$0 instanceof cjl $$3 ? this.c.d($$3.gq()) : false;
   }

   @Override
   public MapCodec<di> a() {
      return bt.d;
   }

   public ct.d b() {
      return this.c;
   }
}
