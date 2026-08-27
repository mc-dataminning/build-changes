import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record enj(il<cuu> b, List<Float> c) implements ent {
   public static final Codec<enj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ki.f.r().fieldOf("enchantment").forGetter(enj::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(enj::d)).apply($$0, enj::new)
   );

   @Override
   public enu b() {
      return env.l;
   }

   @Override
   public Set<enc<?>> a() {
      return ImmutableSet.of(enf.i);
   }

   public boolean a(eku $$0) {
      cqk $$1 = $$0.c(enf.i);
      int $$2 = $$1 != null ? cuv.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ent.a a(cuu $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new enj($$0.k(), $$2);
   }

   public il<cuu> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
