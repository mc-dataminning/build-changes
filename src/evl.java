import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record evl(akt b) implements evj {
   public static final Codec<evl> a = RecordCodecBuilder.create($$0 -> $$0.group(akt.a.fieldOf("source").forGetter(evl::c)).apply($$0, evl::new));

   @Override
   public evi a() {
      return evk.b;
   }

   @Nullable
   @Override
   public vh a(erp $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<eud<?>> b() {
      return ImmutableSet.of();
   }

   public akt c() {
      return this.b;
   }
}
