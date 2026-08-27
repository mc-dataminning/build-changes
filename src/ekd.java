import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ekd(ege.b c) implements ekg {
   public static final Codec<ekd> a = RecordCodecBuilder.create($$0 -> $$0.group(ege.b.e.fieldOf("target").forGetter(ekd::c)).apply($$0, ekd::new));
   public static final Codec<ekd> b = ege.b.e.xmap(ekd::new, ekd::c);

   public static ekg a(ege.b $$0) {
      return new ekd($$0);
   }

   @Override
   public ekf a() {
      return ekh.c;
   }

   @Nullable
   @Override
   public String a(ege $$0) {
      blf $$1 = $$0.c(this.c.a());
      return $$1 != null ? $$1.cy() : null;
   }

   @Override
   public Set<eim<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
