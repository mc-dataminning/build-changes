import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ejb(efc.b c) implements eje {
   public static final Codec<ejb> a = RecordCodecBuilder.create($$0 -> $$0.group(efc.b.e.fieldOf("target").forGetter(ejb::c)).apply($$0, ejb::new));
   public static final Codec<ejb> b = efc.b.e.xmap(ejb::new, ejb::c);

   public static eje a(efc.b $$0) {
      return new ejb($$0);
   }

   @Override
   public ejd a() {
      return ejf.c;
   }

   @Nullable
   @Override
   public String a(efc $$0) {
      bkv $$1 = $$0.c(this.c.a());
      return $$1 != null ? $$1.cy() : null;
   }

   @Override
   public Set<ehk<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
