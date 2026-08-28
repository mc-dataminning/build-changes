import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyu(boolean b) implements eza {
   public static final MapCodec<eyu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(eyu::e)).apply($$0, eyu::new));

   public boolean a(evr $$0) {
      return $$0.b(eyl.l) == this.b;
   }

   @Override
   public ezb b() {
      return ezc.s;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.l);
   }

   public static eza.a c() {
      return () -> new eyu(true);
   }

   public static eza.a d() {
      return () -> new eyu(false);
   }

   public boolean e() {
      return this.b;
   }
}
