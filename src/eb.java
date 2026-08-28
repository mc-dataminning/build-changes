import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record eb(dj.d c) implements bx {
   public static final MapCodec<eb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dj.d.d.optionalFieldOf("size", dj.d.c).forGetter(eb::b)).apply($$0, eb::new)
   );

   public static eb a(dj.d $$0) {
      return new eb($$0);
   }

   @Override
   public boolean a(bvf $$0, ash $$1, @Nullable fbs $$2) {
      return $$0 instanceof cnb $$3 ? this.c.d($$3.gm()) : false;
   }

   @Override
   public MapCodec<eb> a() {
      return by.d;
   }

   public dj.d b() {
      return this.c;
   }
}
