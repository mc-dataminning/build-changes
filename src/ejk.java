import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record ejk(ih<cri> b, List<Float> c) implements eju {
   public static final Codec<ejk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.f.r().fieldOf("enchantment").forGetter(ejk::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(ejk::d)).apply($$0, ejk::new)
   );

   @Override
   public ejv b() {
      return ejw.l;
   }

   @Override
   public Set<ejd<?>> a() {
      return ImmutableSet.of(ejg.i);
   }

   public boolean a(egv $$0) {
      cmx $$1 = $$0.c(ejg.i);
      int $$2 = $$1 != null ? crk.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static eju.a a(cri $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new ejk($$0.j(), $$2);
   }

   public ih<cri> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
