import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euw(boolean b) implements evc {
   public static final MapCodec<euw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(euw::e)).apply($$0, euw::new));

   public boolean a(err $$0) {
      return $$0.b(eun.l) == this.b;
   }

   @Override
   public evd b() {
      return eve.s;
   }

   @Override
   public Set<euk<?>> a() {
      return Set.of(eun.l);
   }

   public static evc.a c() {
      return () -> new euw(true);
   }

   public static evc.a d() {
      return () -> new euw(false);
   }

   public boolean e() {
      return this.b;
   }
}
