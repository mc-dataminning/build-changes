import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record ea(di.d c) implements bw {
   public static final MapCodec<ea> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(di.d.d.optionalFieldOf("size", di.d.c).forGetter(ea::b)).apply($$0, ea::new)
   );

   public static ea a(di.d $$0) {
      return new ea($$0);
   }

   @Override
   public boolean a(btz $$0, arm $$1, @Nullable ezh $$2) {
      return $$0 instanceof clv $$3 ? this.c.d($$3.gw()) : false;
   }

   @Override
   public MapCodec<ea> a() {
      return bx.d;
   }

   public di.d b() {
      return this.c;
   }
}
