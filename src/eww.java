import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eww(jp<dbm> b, List<Float> c) implements exh {
   public static final MapCodec<eww> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbm.c.fieldOf("enchantment").forGetter(eww::c), ays.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(eww::d)).apply($$0, eww::new)
   );

   @Override
   public exi b() {
      return exj.k;
   }

   @Override
   public Set<ewp<?>> a() {
      return ImmutableSet.of(ews.i);
   }

   public boolean a(etw $$0) {
      cvx $$1 = $$0.c(ews.i);
      int $$2 = $$1 != null ? dbo.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static exh.a a(jp<dbm> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eww($$0, $$2);
   }

   public jp<dbm> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
