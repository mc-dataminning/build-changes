import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eor(eoo b, eoo c) implements eoo {
   public static final Codec<eor> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eop.a.fieldOf("min").forGetter(eor::c), eop.a.fieldOf("max").forGetter(eor::d)).apply($$0, eor::new)
   );

   @Override
   public eon b() {
      return eop.c;
   }

   public static eor a(float $$0, float $$1) {
      return new eor(eom.a($$0), eom.a($$1));
   }

   @Override
   public int a(eku $$0) {
      return aww.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eku $$0) {
      return aww.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<enc<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eoo c() {
      return this.b;
   }

   public eoo d() {
      return this.c;
   }
}
