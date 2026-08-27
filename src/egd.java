import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egd(ega b, ega c) implements ega {
   public static final Codec<egd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egb.a.fieldOf("min").forGetter(egd::c), egb.a.fieldOf("max").forGetter(egd::d)).apply($$0, egd::new)
   );

   @Override
   public efz b() {
      return egb.c;
   }

   public static egd a(float $$0, float $$1) {
      return new egd(efy.a($$0), efy.a($$1));
   }

   @Override
   public int a(ecg $$0) {
      return arp.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ecg $$0) {
      return arp.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eeo<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ega c() {
      return this.b;
   }

   public ega d() {
      return this.c;
   }
}
