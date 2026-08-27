import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eje(ih<crc> b, List<Float> c) implements ejo {
   public static final Codec<eje> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.f.r().fieldOf("enchantment").forGetter(eje::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(eje::d)).apply($$0, eje::new)
   );

   @Override
   public ejp b() {
      return ejq.l;
   }

   @Override
   public Set<eix<?>> a() {
      return ImmutableSet.of(eja.i);
   }

   public boolean a(egp $$0) {
      cmr $$1 = $$0.c(eja.i);
      int $$2 = $$1 != null ? cre.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ejo.a a(crc $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eje($$0.j(), $$2);
   }

   public ih<crc> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
