import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record esd(ix<czb> b, List<Float> c) implements esn {
   public static final MapCodec<esd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.f.r().fieldOf("enchantment").forGetter(esd::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(esd::d)).apply($$0, esd::new)
   );

   @Override
   public eso b() {
      return esp.m;
   }

   @Override
   public Set<erw<?>> a() {
      return ImmutableSet.of(erz.i);
   }

   public boolean a(eph $$0) {
      ctq $$1 = $$0.c(erz.i);
      int $$2 = $$1 != null ? czc.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static esn.a a(czb $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new esd($$0.m(), $$2);
   }

   public ix<czb> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
