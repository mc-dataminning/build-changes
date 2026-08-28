import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eul(jm<daa> b, List<Float> c) implements euw {
   public static final MapCodec<eul> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(daa.c.fieldOf("enchantment").forGetter(eul::c), axv.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(eul::d)).apply($$0, eul::new)
   );

   @Override
   public eux b() {
      return euy.k;
   }

   @Override
   public Set<eue<?>> a() {
      return ImmutableSet.of(euh.i);
   }

   public boolean a(erl $$0) {
      cuo $$1 = $$0.c(euh.i);
      int $$2 = $$1 != null ? dac.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static euw.a a(jm<daa> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eul($$0, $$2);
   }

   public jm<daa> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
