import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dy(dh.d c) implements bw {
   public static final MapCodec<dy> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dh.d.d.optionalFieldOf("size", dh.d.c).forGetter(dy::b)).apply($$0, dy::new)
   );

   public static dy a(dh.d $$0) {
      return new dy($$0);
   }

   @Override
   public boolean a(bto $$0, arh $$1, @Nullable eys $$2) {
      return $$0 instanceof clj $$3 ? this.c.d($$3.gq()) : false;
   }

   @Override
   public MapCodec<dy> a() {
      return bx.d;
   }

   public dh.d b() {
      return this.c;
   }
}
