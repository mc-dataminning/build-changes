import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ems(emp b, emp c) implements emp {
   public static final Codec<ems> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emq.a.fieldOf("min").forGetter(ems::c), emq.a.fieldOf("max").forGetter(ems::d)).apply($$0, ems::new)
   );

   @Override
   public emo b() {
      return emq.c;
   }

   public static ems a(float $$0, float $$1) {
      return new ems(emn.a($$0), emn.a($$1));
   }

   @Override
   public int a(eiv $$0) {
      return awh.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eiv $$0) {
      return awh.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eld<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public emp c() {
      return this.b;
   }

   public emp d() {
      return this.c;
   }
}
