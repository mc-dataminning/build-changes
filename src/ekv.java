import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ekv(egw.b c) implements eky {
   public static final Codec<ekv> a = RecordCodecBuilder.create($$0 -> $$0.group(egw.b.e.fieldOf("target").forGetter(ekv::c)).apply($$0, ekv::new));
   public static final Codec<ekv> b = egw.b.e.xmap(ekv::new, ekv::c);

   public static eky a(egw.b $$0) {
      return new ekv($$0);
   }

   @Override
   public ekx a() {
      return ekz.c;
   }

   @Nullable
   @Override
   public emw a(egw $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<eje<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
