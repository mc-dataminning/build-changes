import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eiw(eex.b c) implements eiz {
   public static final Codec<eiw> a = RecordCodecBuilder.create($$0 -> $$0.group(eex.b.e.fieldOf("target").forGetter(eiw::c)).apply($$0, eiw::new));
   public static final Codec<eiw> b = eex.b.e.xmap(eiw::new, eiw::c);

   public static eiz a(eex.b $$0) {
      return new eiw($$0);
   }

   @Override
   public eiy a() {
      return eja.c;
   }

   @Nullable
   @Override
   public String a(eex $$0) {
      bkq $$1 = $$0.c(this.c.a());
      return $$1 != null ? $$1.cy() : null;
   }

   @Override
   public Set<ehf<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
