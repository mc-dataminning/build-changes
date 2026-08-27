import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eiz(eiw b, eiw c) implements eiw {
   public static final Codec<eiz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eix.a.fieldOf("min").forGetter(eiz::c), eix.a.fieldOf("max").forGetter(eiz::d)).apply($$0, eiz::new)
   );

   @Override
   public eiv b() {
      return eix.c;
   }

   public static eiz a(float $$0, float $$1) {
      return new eiz(eiu.a($$0), eiu.a($$1));
   }

   @Override
   public int a(efc $$0) {
      return atq.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(efc $$0) {
      return atq.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<ehk<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eiw c() {
      return this.b;
   }

   public eiw d() {
      return this.c;
   }
}
