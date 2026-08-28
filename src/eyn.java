import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyn(eyj b, eyj c) implements eyj {
   public static final MapCodec<eyn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eyk.a.fieldOf("min").forGetter(eyn::c), eyk.a.fieldOf("max").forGetter(eyn::d)).apply($$0, eyn::new)
   );

   @Override
   public eyi b() {
      return eyk.c;
   }

   public static eyn a(float $$0, float $$1) {
      return new eyn(eyg.a($$0), eyg.a($$1));
   }

   @Override
   public int a(euc $$0) {
      return azk.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(euc $$0) {
      return azk.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<ewv<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eyj c() {
      return this.b;
   }

   public eyj d() {
      return this.c;
   }
}
