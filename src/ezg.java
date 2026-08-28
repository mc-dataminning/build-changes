import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record ezg(jq<ddq> b, List<Float> c) implements ezr {
   public static final MapCodec<ezg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddq.c.fieldOf("enchantment").forGetter(ezg::c), azd.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(ezg::d)).apply($$0, ezg::new)
   );

   @Override
   public ezs b() {
      return ezt.k;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(ezc.i);
   }

   public boolean a(ewi $$0) {
      cxg $$1 = $$0.c(ezc.i);
      int $$2 = $$1 != null ? dds.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ezr.a a(jq<ddq> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new ezg($$0, $$2);
   }

   public jq<ddq> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
