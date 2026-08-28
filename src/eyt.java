import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyt(boolean b) implements eyz {
   public static final MapCodec<eyt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(eyt::e)).apply($$0, eyt::new));

   public boolean a(evq $$0) {
      return $$0.b(eyk.l) == this.b;
   }

   @Override
   public eza b() {
      return ezb.s;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyk.l);
   }

   public static eyz.a c() {
      return () -> new eyt(true);
   }

   public static eyz.a d() {
      return () -> new eyt(false);
   }

   public boolean e() {
      return this.b;
   }
}
