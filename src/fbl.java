import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record fbl(je<dff> b, List<Float> c) implements fbw {
   public static final MapCodec<fbl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dff.c.fieldOf("enchantment").forGetter(fbl::c), ays.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(fbl::d)).apply($$0, fbl::new)
   );

   @Override
   public fbx b() {
      return fby.k;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(fbh.i);
   }

   public boolean a(eyn $$0) {
      cys $$1 = $$0.c(fbh.i);
      int $$2 = $$1 != null ? dfh.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static fbw.a a(je<dff> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new fbl($$0, $$2);
   }

   public je<dff> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
