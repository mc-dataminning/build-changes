import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eov(ekw.b c) implements eoy {
   public static final Codec<eov> a = RecordCodecBuilder.create($$0 -> $$0.group(ekw.b.e.fieldOf("target").forGetter(eov::c)).apply($$0, eov::new));
   public static final Codec<eov> b = ekw.b.e.xmap(eov::new, eov::c);

   public static eoy a(ekw.b $$0) {
      return new eov($$0);
   }

   @Override
   public eox a() {
      return eoz.c;
   }

   @Nullable
   @Override
   public eqw a(ekw $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<ene<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
