import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eks(ekp b, ekp c) implements ekp {
   public static final Codec<eks> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekq.a.fieldOf("min").forGetter(eks::c), ekq.a.fieldOf("max").forGetter(eks::d)).apply($$0, eks::new)
   );

   @Override
   public eko b() {
      return ekq.c;
   }

   public static eks a(float $$0, float $$1) {
      return new eks(ekn.a($$0), ekn.a($$1));
   }

   @Override
   public int a(egv $$0) {
      return aun.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(egv $$0) {
      return aun.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<ejd<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ekp c() {
      return this.b;
   }

   public ekp d() {
      return this.c;
   }
}
