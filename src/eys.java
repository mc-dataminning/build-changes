import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eys(boolean b) implements eyy {
   public static final MapCodec<eys> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(eys::e)).apply($$0, eys::new));

   public boolean a(evp $$0) {
      return $$0.b(eyj.l) == this.b;
   }

   @Override
   public eyz b() {
      return eza.s;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(eyj.l);
   }

   public static eyy.a c() {
      return () -> new eys(true);
   }

   public static eyy.a d() {
      return () -> new eys(false);
   }

   public boolean e() {
      return this.b;
   }
}
