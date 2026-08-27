import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egr(ecs.b c) implements egu {
   public static final Codec<egr> a = RecordCodecBuilder.create($$0 -> $$0.group(ecs.b.e.fieldOf("target").forGetter(egr::c)).apply($$0, egr::new));
   public static final Codec<egr> b = ecs.b.e.xmap(egr::new, egr::c);

   public static egu a(ecs.b $$0) {
      return new egr($$0);
   }

   @Override
   public egt a() {
      return egv.c;
   }

   @Nullable
   @Override
   public String a(ecs $$0) {
      bis $$1 = $$0.c(this.c.a());
      return $$1 != null ? $$1.cx() : null;
   }

   @Override
   public Set<efa<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
