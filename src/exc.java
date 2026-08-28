import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record exc(jq<dbs> b, List<Float> c) implements exn {
   public static final MapCodec<exc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbs.c.fieldOf("enchantment").forGetter(exc::c), ayt.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(exc::d)).apply($$0, exc::new)
   );

   @Override
   public exo b() {
      return exp.k;
   }

   @Override
   public Set<ewv<?>> a() {
      return ImmutableSet.of(ewy.i);
   }

   public boolean a(euc $$0) {
      cwb $$1 = $$0.c(ewy.i);
      int $$2 = $$1 != null ? dbu.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static exn.a a(jq<dbs> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new exc($$0, $$2);
   }

   public jq<dbs> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
