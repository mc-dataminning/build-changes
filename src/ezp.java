import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezp(akv b) implements ezn {
   public static final MapCodec<ezp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akv.a.fieldOf("source").forGetter(ezp::c)).apply($$0, ezp::new));

   @Override
   public ezm a() {
      return ezo.b;
   }

   @Override
   public un a(evq $$0) {
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
