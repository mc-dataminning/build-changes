import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record fbx(je<dfl> b, List<Float> c) implements fci {
   public static final MapCodec<fbx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfl.c.fieldOf("enchantment").forGetter(fbx::c), ayu.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(fbx::d)).apply($$0, fbx::new)
   );

   @Override
   public fcj b() {
      return fck.k;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.i);
   }

   public boolean a(eyz $$0) {
      cyy $$1 = $$0.c(fbt.i);
      int $$2 = $$1 != null ? dfn.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static fci.a a(je<dfl> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new fbx($$0, $$2);
   }

   public je<dfl> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
