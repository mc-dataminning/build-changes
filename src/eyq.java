import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eyq(jr<dda> b, List<Float> c) implements ezb {
   public static final MapCodec<eyq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dda.c.fieldOf("enchantment").forGetter(eyq::c), ayi.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(eyq::d)).apply($$0, eyq::new)
   );

   @Override
   public ezc b() {
      return ezd.k;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eym.i);
   }

   public boolean a(evs $$0) {
      cwq $$1 = $$0.c(eym.i);
      int $$2 = $$1 != null ? ddc.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ezb.a a(jr<dda> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eyq($$0, $$2);
   }

   public jr<dda> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
