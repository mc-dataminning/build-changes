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
   public boolean a(bsr $$0, aqu $$1, @Nullable exa $$2) {
      return $$0 instanceof ckm $$3 ? this.c.d($$3.gm()) : false;
   }

   @Override
   public MapCodec<dy> a() {
      return bx.d;
   }

   public dh.d b() {
      return this.c;
   }
}
