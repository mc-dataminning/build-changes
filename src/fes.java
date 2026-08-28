import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fes(alr b) implements feq {
   public static final MapCodec<fes> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alr.a.fieldOf("source").forGetter(fes::c)).apply($$0, fes::new));

   @Override
   public fep a() {
      return fer.b;
   }

   @Override
   public va a(fat $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<bbk<?>> b() {
      return Set.of();
   }

   public alr c() {
      return this.b;
   }
}
