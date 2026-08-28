import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewn(exa b, ess c) implements ewe {
   public static final MapCodec<ewn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(exb.a.fieldOf("value").forGetter(ewn::c), ess.a.fieldOf("range").forGetter(ewn::d)).apply($$0, ewn::new)
   );

   @Override
   public ewf b() {
      return ewg.r;
   }

   @Override
   public Set<evm<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(est $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ewe.a a(exa $$0, ess $$1) {
      return () -> new ewn($$0, $$1);
   }

   public exa c() {
      return this.b;
   }

   public ess d() {
      return this.c;
   }
}
