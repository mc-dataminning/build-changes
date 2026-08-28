import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record ewl(jo<dbn> b, List<Float> c) implements eww {
   public static final MapCodec<ewl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbn.c.fieldOf("enchantment").forGetter(ewl::c), ayo.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(ewl::d)).apply($$0, ewl::new)
   );

   @Override
   public ewx b() {
      return ewy.k;
   }

   @Override
   public Set<ewe<?>> a() {
      return ImmutableSet.of(ewh.i);
   }

   public boolean a(etl $$0) {
      cvs $$1 = $$0.c(ewh.i);
      int $$2 = $$1 != null ? dbp.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static eww.a a(jo<dbn> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new ewl($$0, $$2);
   }

   public jo<dbn> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
