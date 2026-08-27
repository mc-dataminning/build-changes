import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record ejl(ih<crj> b, List<Float> c) implements ejv {
   public static final Codec<ejl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.f.r().fieldOf("enchantment").forGetter(ejl::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(ejl::d)).apply($$0, ejl::new)
   );

   @Override
   public ejw b() {
      return ejx.l;
   }

   @Override
   public Set<eje<?>> a() {
      return ImmutableSet.of(ejh.i);
   }

   public boolean a(egw $$0) {
      cmy $$1 = $$0.c(ejh.i);
      int $$2 = $$1 != null ? crl.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ejv.a a(crj $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new ejl($$0.j(), $$2);
   }

   public ih<crj> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
