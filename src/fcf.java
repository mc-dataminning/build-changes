import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record fcf(je<dfq> b, List<Float> c) implements fcq {
   public static final MapCodec<fcf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfq.c.fieldOf("enchantment").forGetter(fcf::c), ayu.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(fcf::d)).apply($$0, fcf::new)
   );

   @Override
   public fcr b() {
      return fcs.k;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcb.i);
   }

   public boolean a(ezh $$0) {
      czd $$1 = $$0.c(fcb.i);
      int $$2 = $$1 != null ? dfs.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static fcq.a a(je<dfq> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new fcf($$0, $$2);
   }

   public je<dfq> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
