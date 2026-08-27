import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record esh(eoa.b c) implements esk {
   public static final Codec<esh> a = RecordCodecBuilder.create($$0 -> $$0.group(eoa.b.e.fieldOf("target").forGetter(esh::c)).apply($$0, esh::new));
   public static final Codec<esh> b = eoa.b.e.xmap(esh::new, esh::c);

   public static esk a(eoa.b $$0) {
      return new esh($$0);
   }

   @Override
   public esj a() {
      return esl.c;
   }

   @Nullable
   @Override
   public eui a(eoa $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<eqq<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
