import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egk(ecl.b c) implements egn {
   public static final Codec<egk> a = RecordCodecBuilder.create($$0 -> $$0.group(ecl.b.e.fieldOf("target").forGetter(egk::c)).apply($$0, egk::new));
   public static final Codec<egk> b = ecl.b.e.xmap(egk::new, egk::c);

   public static egn a(ecl.b $$0) {
      return new egk($$0);
   }

   @Override
   public egm a() {
      return ego.c;
   }

   @Nullable
   @Override
   public String a(ecl $$0) {
      bil $$1 = $$0.c(this.c.a());
      return $$1 != null ? $$1.cx() : null;
   }

   @Override
   public Set<eet<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
