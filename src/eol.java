import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eol(ajh b) implements eoj {
   public static final Codec<eol> a = RecordCodecBuilder.create($$0 -> $$0.group(ajh.a.fieldOf("source").forGetter(eol::c)).apply($$0, eol::new));

   @Override
   public eoi a() {
      return eok.b;
   }

   @Nullable
   @Override
   public tx a(ekw $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<ene<?>> b() {
      return ImmutableSet.of();
   }

   public ajh c() {
      return this.b;
   }
}
