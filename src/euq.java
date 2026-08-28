import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euq(boolean b) implements euw {
   public static final MapCodec<euq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(euq::e)).apply($$0, euq::new));

   public boolean a(erl $$0) {
      return $$0.b(euh.l) == this.b;
   }

   @Override
   public eux b() {
      return euy.s;
   }

   @Override
   public Set<eue<?>> a() {
      return Set.of(euh.l);
   }

   public static euw.a c() {
      return () -> new euq(true);
   }

   public static euw.a d() {
      return () -> new euq(false);
   }

   public boolean e() {
      return this.b;
   }
}
