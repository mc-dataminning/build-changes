import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eot(eoq b, eoq c) implements eoq {
   public static final Codec<eot> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eor.a.fieldOf("min").forGetter(eot::c), eor.a.fieldOf("max").forGetter(eot::d)).apply($$0, eot::new)
   );

   @Override
   public eop b() {
      return eor.c;
   }

   public static eot a(float $$0, float $$1) {
      return new eot(eoo.a($$0), eoo.a($$1));
   }

   @Override
   public int a(ekw $$0) {
      return aww.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ekw $$0) {
      return aww.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<ene<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eoq c() {
      return this.b;
   }

   public eoq d() {
      return this.c;
   }
}
