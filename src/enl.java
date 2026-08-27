import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record enl(il<cuw> b, List<Float> c) implements env {
   public static final Codec<enl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ki.f.r().fieldOf("enchantment").forGetter(enl::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(enl::d)).apply($$0, enl::new)
   );

   @Override
   public enw b() {
      return enx.l;
   }

   @Override
   public Set<ene<?>> a() {
      return ImmutableSet.of(enh.i);
   }

   public boolean a(ekw $$0) {
      cqm $$1 = $$0.c(enh.i);
      int $$2 = $$1 != null ? cux.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static env.a a(cuw $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new enl($$0.k(), $$2);
   }

   public il<cuw> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
