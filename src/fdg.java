import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdg(alg b) implements fde {
   public static final MapCodec<fdg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("source").forGetter(fdg::c)).apply($$0, fdg::new));

   @Override
   public fdd a() {
      return fdf.b;
   }

   @Override
   public uw a(ezh $$0) {
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
