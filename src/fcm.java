import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record fcm(jf<dfx> b, List<Float> c) implements fcx {
   public static final MapCodec<fcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfx.c.fieldOf("enchantment").forGetter(fcm::c), ayu.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(fcm::d)).apply($$0, fcm::new)
   );

   @Override
   public fcy b() {
      return fcz.k;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.i);
   }

   public boolean a(ezo $$0) {
      czk $$1 = $$0.c(fci.i);
      int $$2 = $$1 != null ? dfz.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static fcx.a a(jf<dfx> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new fcm($$0, $$2);
   }

   public jf<dfx> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
