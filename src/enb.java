import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record enb(ejc.b c) implements ene {
   public static final Codec<enb> a = RecordCodecBuilder.create($$0 -> $$0.group(ejc.b.e.fieldOf("target").forGetter(enb::c)).apply($$0, enb::new));
   public static final Codec<enb> b = ejc.b.e.xmap(enb::new, enb::c);

   public static ene a(ejc.b $$0) {
      return new enb($$0);
   }

   @Override
   public end a() {
      return enf.c;
   }

   @Nullable
   @Override
   public epc a(ejc $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<elk<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
