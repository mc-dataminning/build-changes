import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eju(ih<crr> b, List<Float> c) implements eke {
   public static final Codec<eju> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.f.r().fieldOf("enchantment").forGetter(eju::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(eju::d)).apply($$0, eju::new)
   );

   @Override
   public ekf b() {
      return ekg.l;
   }

   @Override
   public Set<ejn<?>> a() {
      return ImmutableSet.of(ejq.i);
   }

   public boolean a(ehf $$0) {
      cng $$1 = $$0.c(ejq.i);
      int $$2 = $$1 != null ? crt.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static eke.a a(crr $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eju($$0.j(), $$2);
   }

   public ih<crr> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
