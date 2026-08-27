import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record ehr(ig<cpz> b, List<Float> c) implements eib {
   public static final Codec<ehr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kc.g.r().fieldOf("enchantment").forGetter(ehr::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(ehr::d)).apply($$0, ehr::new)
   );

   @Override
   public eic b() {
      return eid.l;
   }

   @Override
   public Set<ehk<?>> a() {
      return ImmutableSet.of(ehn.i);
   }

   public boolean a(efc $$0) {
      clo $$1 = $$0.c(ehn.i);
      int $$2 = $$1 != null ? cqb.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static eib.a a(cpz $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new ehr($$0.j(), $$2);
   }

   public ig<cpz> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
