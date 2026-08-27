import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record evw(erp.b c) implements evz {
   public static final Codec<evw> a = RecordCodecBuilder.create($$0 -> $$0.group(erp.b.e.fieldOf("target").forGetter(evw::c)).apply($$0, evw::new));
   public static final Codec<evw> b = erp.b.e.xmap(evw::new, evw::c);

   public static evz a(erp.b $$0) {
      return new evw($$0);
   }

   @Override
   public evy a() {
      return ewa.c;
   }

   @Nullable
   @Override
   public exx a(erp $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<eud<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
