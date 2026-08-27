import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eff(he<cno> b, List<Float> c) implements efp {
   public static final Codec<eff> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.g.r().fieldOf("enchantment").forGetter(eff::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(eff::d)).apply($$0, eff::new)
   );

   @Override
   public efq b() {
      return efr.l;
   }

   @Override
   public Set<eey<?>> a() {
      return ImmutableSet.of(efb.i);
   }

   public boolean a(ecq $$0) {
      cjf $$1 = $$0.c(efb.i);
      int $$2 = $$1 != null ? cnq.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static efp.a a(cno $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eff($$0.j(), $$2);
   }

   public he<cno> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
