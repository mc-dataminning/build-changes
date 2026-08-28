import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eub(boolean b) implements euh {
   public static final MapCodec<eub> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(eub::e)).apply($$0, eub::new));

   public boolean a(eqw $$0) {
      return $$0.b(ets.l) == this.b;
   }

   @Override
   public eui b() {
      return euj.s;
   }

   @Override
   public Set<etp<?>> a() {
      return Set.of(ets.l);
   }

   public static euh.a c() {
      return () -> new eub(true);
   }

   public static euh.a d() {
      return () -> new eub(false);
   }

   public boolean e() {
      return this.b;
   }
}
