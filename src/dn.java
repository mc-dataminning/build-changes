import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dn(cw.d c) implements bz {
   public static final MapCodec<dn> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cw.d.d.optionalFieldOf("size", cw.d.c).forGetter(dn::b)).apply($$0, dn::new)
   );

   public static dn a(cw.d $$0) {
      return new dn($$0);
   }

   @Override
   public boolean a(bwi $$0, arq $$1, @Nullable ffc $$2) {
      return $$0 instanceof cox $$3 ? this.c.d($$3.gr()) : false;
   }

   @Override
   public MapCodec<dn> a() {
      return ca.d;
   }

   public cw.d b() {
      return this.c;
   }
}
