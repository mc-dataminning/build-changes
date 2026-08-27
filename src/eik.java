import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eik(eel.b c) implements ein {
   public static final Codec<eik> a = RecordCodecBuilder.create($$0 -> $$0.group(eel.b.e.fieldOf("target").forGetter(eik::c)).apply($$0, eik::new));
   public static final Codec<eik> b = eel.b.e.xmap(eik::new, eik::c);

   public static ein a(eel.b $$0) {
      return new eik($$0);
   }

   @Override
   public eim a() {
      return eio.c;
   }

   @Nullable
   @Override
   public String a(eel $$0) {
      bki $$1 = $$0.c(this.c.a());
      return $$1 != null ? $$1.cx() : null;
   }

   @Override
   public Set<egt<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
