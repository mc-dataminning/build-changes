import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fah(alp b) implements faf {
   public static final MapCodec<fah> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alp.a.fieldOf("source").forGetter(fah::c)).apply($$0, fah::new));

   @Override
   public fae a() {
      return fag.b;
   }

   @Override
   public vj a(ewi $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<bbd<?>> b() {
      return Set.of();
   }

   public alp c() {
      return this.b;
   }
}
