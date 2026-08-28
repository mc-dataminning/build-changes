import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record ewh(jn<dbk> b, List<Float> c) implements ews {
   public static final MapCodec<ewh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbk.c.fieldOf("enchantment").forGetter(ewh::c), aym.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(ewh::d)).apply($$0, ewh::new)
   );

   @Override
   public ewt b() {
      return ewu.k;
   }

   @Override
   public Set<ewa<?>> a() {
      return ImmutableSet.of(ewd.i);
   }

   public boolean a(eth $$0) {
      cvp $$1 = $$0.c(ewd.i);
      int $$2 = $$1 != null ? dbm.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ews.a a(jn<dbk> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new ewh($$0, $$2);
   }

   public jn<dbk> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
