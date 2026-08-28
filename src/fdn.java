import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdn(alg b) implements fdl {
   public static final MapCodec<fdn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("source").forGetter(fdn::c)).apply($$0, fdn::new));

   @Override
   public fdk a() {
      return fdm.b;
   }

   @Override
   public uw a(ezo $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<bax<?>> b() {
      return Set.of();
   }

   public alg c() {
      return this.b;
   }
}
