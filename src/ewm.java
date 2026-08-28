import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewm(boolean b) implements ews {
   public static final MapCodec<ewm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(ewm::e)).apply($$0, ewm::new));

   public boolean a(eth $$0) {
      return $$0.b(ewd.l) == this.b;
   }

   @Override
   public ewt b() {
      return ewu.s;
   }

   @Override
   public Set<ewa<?>> a() {
      return Set.of(ewd.l);
   }

   public static ews.a c() {
      return () -> new ewm(true);
   }

   public static ews.a d() {
      return () -> new ewm(false);
   }

   public boolean e() {
      return this.b;
   }
}
