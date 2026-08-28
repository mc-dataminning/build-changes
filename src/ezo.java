import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezo(aku b) implements ezm {
   public static final MapCodec<ezo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aku.a.fieldOf("source").forGetter(ezo::c)).apply($$0, ezo::new));

   @Override
   public ezl a() {
      return ezn.b;
   }

   @Override
   public un a(evp $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<bah<?>> b() {
      return Set.of();
   }

   public aku c() {
      return this.b;
   }
}
