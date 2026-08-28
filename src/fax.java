import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fax(fat b, fat c) implements fat {
   public static final MapCodec<fax> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fau.a.fieldOf("min").forGetter(fax::c), fau.a.fieldOf("max").forGetter(fax::d)).apply($$0, fax::new)
   );

   @Override
   public fas b() {
      return fau.c;
   }

   public static fax a(float $$0, float $$1) {
      return new fax(faq.a($$0), faq.a($$1));
   }

   @Override
   public int a(ewo $$0) {
      return ayz.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ewo $$0) {
      return ayz.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fat c() {
      return this.b;
   }

   public fat d() {
      return this.c;
   }
}
