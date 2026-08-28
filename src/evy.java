import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evy(boolean b) implements ewe {
   public static final MapCodec<evy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(evy::e)).apply($$0, evy::new));

   public boolean a(est $$0) {
      return $$0.b(evp.l) == this.b;
   }

   @Override
   public ewf b() {
      return ewg.s;
   }

   @Override
   public Set<evm<?>> a() {
      return Set.of(evp.l);
   }

   public static ewe.a c() {
      return () -> new evy(true);
   }

   public static ewe.a d() {
      return () -> new evy(false);
   }

   public boolean e() {
      return this.b;
   }
}
