import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fan(aku b) implements fal {
   public static final MapCodec<fan> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aku.a.fieldOf("source").forGetter(fan::c)).apply($$0, fan::new));

   @Override
   public fak a() {
      return fam.b;
   }

   @Override
   public un a(ewo $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<bai<?>> b() {
      return Set.of();
   }

   public aku c() {
      return this.b;
   }
}
