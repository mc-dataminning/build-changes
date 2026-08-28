import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record feg(ali b) implements fee {
   public static final MapCodec<feg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.a.fieldOf("source").forGetter(feg::c)).apply($$0, feg::new));

   @Override
   public fed a() {
      return fef.b;
   }

   @Override
   public uy a(fah $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<baz<?>> b() {
      return Set.of();
   }

   public ali c() {
      return this.b;
   }
}
