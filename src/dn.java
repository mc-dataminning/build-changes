import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dn(boolean d, boolean e) implements bv {
   public static final MapCodec<dn> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("has_raid", false).forGetter(dn::b), Codec.BOOL.optionalFieldOf("is_captain", false).forGetter(dn::c))
            .apply($$0, dn::new)
   );
   public static final dn c = new dn(false, true);

   @Override
   public MapCodec<dn> a() {
      return bw.e;
   }

   @Override
   public boolean a(bsh $$0, aqm $$1, @Nullable ewh $$2) {
      return !($$0 instanceof cnx $$3) ? false : $$3.gD() == this.d && $$3.gC() == this.e;
   }

   public boolean b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
