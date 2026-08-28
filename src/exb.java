import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exb(exo b, etg c) implements ews {
   public static final MapCodec<exb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(exp.a.fieldOf("value").forGetter(exb::c), etg.a.fieldOf("range").forGetter(exb::d)).apply($$0, exb::new)
   );

   @Override
   public ewt b() {
      return ewu.r;
   }

   @Override
   public Set<ewa<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eth $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ews.a a(exo $$0, etg $$1) {
      return () -> new exb($$0, $$1);
   }

   public exo c() {
      return this.b;
   }

   public etg d() {
      return this.c;
   }
}
