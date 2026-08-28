import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exe(exa b, exa c) implements exa {
   public static final MapCodec<exe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(exb.a.fieldOf("min").forGetter(exe::c), exb.a.fieldOf("max").forGetter(exe::d)).apply($$0, exe::new)
   );

   @Override
   public ewz b() {
      return exb.c;
   }

   public static exe a(float $$0, float $$1) {
      return new exe(ewx.a($$0), ewx.a($$1));
   }

   @Override
   public int a(est $$0) {
      return azc.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(est $$0) {
      return azc.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<evm<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public exa c() {
      return this.b;
   }

   public exa d() {
      return this.c;
   }
}
