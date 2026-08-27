import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record erj(erg b, erg c) implements erg {
   public static final Codec<erj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(erh.a.fieldOf("min").forGetter(erj::c), erh.a.fieldOf("max").forGetter(erj::d)).apply($$0, erj::new)
   );

   @Override
   public erf b() {
      return erh.c;
   }

   public static erj a(float $$0, float $$1) {
      return new erj(ere.a($$0), ere.a($$1));
   }

   @Override
   public int a(enk $$0) {
      return axm.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(enk $$0) {
      return axm.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<epu<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public erg c() {
      return this.b;
   }

   public erg d() {
      return this.c;
   }
}
