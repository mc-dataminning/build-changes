import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evf(evs b, erk c) implements euw {
   public static final MapCodec<evf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evt.a.fieldOf("value").forGetter(evf::c), erk.a.fieldOf("range").forGetter(evf::d)).apply($$0, evf::new)
   );

   @Override
   public eux b() {
      return euy.r;
   }

   @Override
   public Set<eue<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(erl $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static euw.a a(evs $$0, erk $$1) {
      return () -> new evf($$0, $$1);
   }

   public evs c() {
      return this.b;
   }

   public erk d() {
      return this.c;
   }
}
