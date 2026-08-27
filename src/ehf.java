import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ehf(ehc b, ehc c) implements ehc {
   public static final Codec<ehf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehd.a.fieldOf("min").forGetter(ehf::c), ehd.a.fieldOf("max").forGetter(ehf::d)).apply($$0, ehf::new)
   );

   @Override
   public ehb b() {
      return ehd.c;
   }

   public static ehf a(float $$0, float $$1) {
      return new ehf(eha.a($$0), eha.a($$1));
   }

   @Override
   public int a(edi $$0) {
      return asy.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(edi $$0) {
      return asy.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<efq<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ehc c() {
      return this.b;
   }

   public ehc d() {
      return this.c;
   }
}
