import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eqb(in<cwz> b, List<Float> c) implements eql {
   public static final Codec<eqb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kt.f.r().fieldOf("enchantment").forGetter(eqb::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(eqb::d)).apply($$0, eqb::new)
   );

   @Override
   public eqm b() {
      return eqn.l;
   }

   @Override
   public Set<epu<?>> a() {
      return ImmutableSet.of(epx.i);
   }

   public boolean a(enk $$0) {
      crs $$1 = $$0.c(epx.i);
      int $$2 = $$1 != null ? cxa.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static eql.a a(cwz $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eqb($$0.k(), $$2);
   }

   public in<cwz> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
