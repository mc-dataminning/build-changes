import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record elr(ij<ctm> b, List<Float> c) implements emb {
   public static final Codec<elr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.f.r().fieldOf("enchantment").forGetter(elr::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(elr::d)).apply($$0, elr::new)
   );

   @Override
   public emc b() {
      return emd.l;
   }

   @Override
   public Set<elk<?>> a() {
      return ImmutableSet.of(eln.i);
   }

   public boolean a(ejc $$0) {
      cpd $$1 = $$0.c(eln.i);
      int $$2 = $$1 != null ? ctn.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static emb.a a(ctm $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new elr($$0.k(), $$2);
   }

   public ij<ctm> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
