import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eev(he<cne> b, List<Float> c) implements eff {
   public static final Codec<eev> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.g.r().fieldOf("enchantment").forGetter(eev::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(eev::d)).apply($$0, eev::new)
   );

   @Override
   public efg b() {
      return efh.l;
   }

   @Override
   public Set<eeo<?>> a() {
      return ImmutableSet.of(eer.i);
   }

   public boolean a(ecg $$0) {
      cix $$1 = $$0.c(eer.i);
      int $$2 = $$1 != null ? cng.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static eff.a a(cne $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eev($$0.j(), $$2);
   }

   public he<cne> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
