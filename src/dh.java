import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dh(ct.d c) implements bs {
   public static final MapCodec<dh> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(axh.a(ct.d.d, "size", ct.d.c).forGetter(dh::b)).apply($$0, dh::new));

   public static dh a(ct.d $$0) {
      return new dh($$0);
   }

   @Override
   public boolean a(brh $$0, aqh $$1, @Nullable etp $$2) {
      return $$0 instanceof ciw $$3 ? this.c.d($$3.gq()) : false;
   }

   @Override
   public MapCodec<dh> a() {
      return bt.d;
   }

   public ct.d b() {
      return this.c;
   }
}
