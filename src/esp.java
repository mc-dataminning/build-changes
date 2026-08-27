import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record esp(esl b, esl c) implements esl {
   public static final Codec<esp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(esm.a.fieldOf("min").forGetter(esp::c), esm.a.fieldOf("max").forGetter(esp::d)).apply($$0, esp::new)
   );

   @Override
   public esk b() {
      return esm.c;
   }

   public static esp a(float $$0, float $$1) {
      return new esp(esj.a($$0), esj.a($$1));
   }

   @Override
   public int a(eol $$0) {
      return axz.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eol $$0) {
      return axz.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eqz<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public esl c() {
      return this.b;
   }

   public esl d() {
      return this.c;
   }
}
