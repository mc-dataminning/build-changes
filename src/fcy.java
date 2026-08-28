import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcy(alg b) implements fcw {
   public static final MapCodec<fcy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("source").forGetter(fcy::c)).apply($$0, fcy::new));

   @Override
   public fcv a() {
      return fcx.b;
   }

   @Override
   public uw a(eyz $$0) {
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
