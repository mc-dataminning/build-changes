import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezq(akv b) implements ezo {
   public static final MapCodec<ezq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akv.a.fieldOf("source").forGetter(ezq::c)).apply($$0, ezq::new));

   @Override
   public ezn a() {
      return ezp.b;
   }

   @Override
   public un a(evr $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<bai<?>> b() {
      return Set.of();
   }

   public akv c() {
      return this.b;
   }
}
