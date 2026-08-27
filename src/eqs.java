import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eqs(ajt b) implements eqq {
   public static final Codec<eqs> a = RecordCodecBuilder.create($$0 -> $$0.group(ajt.a.fieldOf("source").forGetter(eqs::c)).apply($$0, eqs::new));

   @Override
   public eqp a() {
      return eqr.b;
   }

   @Nullable
   @Override
   public uj a(enb $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<epl<?>> b() {
      return ImmutableSet.of();
   }

   public ajt c() {
      return this.b;
   }
}
