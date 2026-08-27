import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ejm(ejy b, egd c) implements ejd {
   public static final Codec<ejm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejz.a.fieldOf("value").forGetter(ejm::c), egd.a.fieldOf("range").forGetter(ejm::d)).apply($$0, ejm::new)
   );

   @Override
   public eje b() {
      return ejf.s;
   }

   @Override
   public Set<eim<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ege $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ejd.a a(ejy $$0, egd $$1) {
      return () -> new ejm($$0, $$1);
   }

   public ejy c() {
      return this.b;
   }

   public egd d() {
      return this.c;
   }
}
