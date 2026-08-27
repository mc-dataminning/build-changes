import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egg(ech.b c) implements egj {
   public static final Codec<egg> a = RecordCodecBuilder.create($$0 -> $$0.group(ech.b.e.fieldOf("target").forGetter(egg::c)).apply($$0, egg::new));
   public static final Codec<egg> b = ech.b.e.xmap(egg::new, egg::c);

   public static egj a(ech.b $$0) {
      return new egg($$0);
   }

   @Override
   public egi a() {
      return egk.c;
   }

   @Nullable
   @Override
   public String a(ech $$0) {
      bii $$1 = $$0.c(this.c.a());
      return $$1 != null ? $$1.cx() : null;
   }

   @Override
   public Set<eep<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
