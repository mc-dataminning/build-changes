import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ele(ehf.b c) implements elh {
   public static final Codec<ele> a = RecordCodecBuilder.create($$0 -> $$0.group(ehf.b.e.fieldOf("target").forGetter(ele::c)).apply($$0, ele::new));
   public static final Codec<ele> b = ehf.b.e.xmap(ele::new, ele::c);

   public static elh a(ehf.b $$0) {
      return new ele($$0);
   }

   @Override
   public elg a() {
      return eli.c;
   }

   @Nullable
   @Override
   public enf a(ehf $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<ejn<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
