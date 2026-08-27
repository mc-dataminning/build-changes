import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record emn(il<ctz> b, List<Float> c) implements emx {
   public static final Codec<emn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kh.f.r().fieldOf("enchantment").forGetter(emn::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(emn::d)).apply($$0, emn::new)
   );

   @Override
   public emy b() {
      return emz.l;
   }

   @Override
   public Set<emg<?>> a() {
      return ImmutableSet.of(emj.i);
   }

   public boolean a(ejy $$0) {
      cpq $$1 = $$0.c(emj.i);
      int $$2 = $$1 != null ? cua.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static emx.a a(ctz $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new emn($$0.k(), $$2);
   }

   public il<ctz> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
