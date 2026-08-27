import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record esf(esc b, esc c) implements esc {
   public static final Codec<esf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(esd.a.fieldOf("min").forGetter(esf::c), esd.a.fieldOf("max").forGetter(esf::d)).apply($$0, esf::new)
   );

   @Override
   public esb b() {
      return esd.c;
   }

   public static esf a(float $$0, float $$1) {
      return new esf(esa.a($$0), esa.a($$1));
   }

   @Override
   public int a(eoa $$0) {
      return axw.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eoa $$0) {
      return axw.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eqq<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public esc c() {
      return this.b;
   }

   public esc d() {
      return this.c;
   }
}
