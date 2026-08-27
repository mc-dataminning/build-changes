import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egj(eck.b c) implements egm {
   public static final Codec<egj> a = RecordCodecBuilder.create($$0 -> $$0.group(eck.b.e.fieldOf("target").forGetter(egj::c)).apply($$0, egj::new));
   public static final Codec<egj> b = eck.b.e.xmap(egj::new, egj::c);

   public static egm a(eck.b $$0) {
      return new egj($$0);
   }

   @Override
   public egl a() {
      return egn.c;
   }

   @Nullable
   @Override
   public String a(eck $$0) {
      biw $$1 = $$0.c(this.c.a());
      return $$1 != null ? $$1.cx() : null;
   }

   @Override
   public Set<ees<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
