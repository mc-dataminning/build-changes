import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fds(alg b) implements fdq {
   public static final MapCodec<fds> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("source").forGetter(fds::c)).apply($$0, fds::new));

   @Override
   public fdp a() {
      return fdr.b;
   }

   @Override
   public uw a(ezt $$0) {
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
