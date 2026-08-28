import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezr(akv b) implements ezp {
   public static final MapCodec<ezr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akv.a.fieldOf("source").forGetter(ezr::c)).apply($$0, ezr::new));

   @Override
   public ezo a() {
      return ezq.b;
   }

   @Override
   public un a(evs $$0) {
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
