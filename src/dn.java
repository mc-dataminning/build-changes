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
   public boolean a(bwt $$0, ars $$1, @Nullable ffq $$2) {
      return $$0 instanceof cpi $$3 ? this.c.d($$3.gs()) : false;
   }

   @Override
   public MapCodec<dn> a() {
      return ca.d;
   }

   public cw.d b() {
      return this.c;
   }
}
