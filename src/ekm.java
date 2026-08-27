import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekm(ekj b, ekj c) implements ekj {
   public static final Codec<ekm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekk.a.fieldOf("min").forGetter(ekm::c), ekk.a.fieldOf("max").forGetter(ekm::d)).apply($$0, ekm::new)
   );

   @Override
   public eki b() {
      return ekk.c;
   }

   public static ekm a(float $$0, float $$1) {
      return new ekm(ekh.a($$0), ekh.a($$1));
   }

   @Override
   public int a(egp $$0) {
      return aui.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(egp $$0) {
      return aui.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eix<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ekj c() {
      return this.b;
   }

   public ekj d() {
      return this.c;
   }
}
