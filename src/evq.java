import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record evq(akr b) implements evo {
   public static final MapCodec<evq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akr.a.fieldOf("source").forGetter(evq::c)).apply($$0, evq::new));

   @Override
   public evn a() {
      return evp.b;
   }

   @Nullable
   @Override
   public uy a(erp $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<eui<?>> b() {
      return ImmutableSet.of();
   }

   public akr c() {
      return this.b;
   }
}
