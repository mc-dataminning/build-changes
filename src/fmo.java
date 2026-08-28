import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmo(int b, int c) implements fms {
   public static final MapCodec<fmo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(fmo::b), ayi.i.fieldOf("default").forGetter(fmo::c)).apply($$0, fmo::new)
   );

   @Override
   public int a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2) {
      cyy $$3 = $$0.a(kv.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return axk.f($$4);
         }
      }

      return axk.f(this.c);
   }

   @Override
   public MapCodec<fmo> a() {
      return a;
   }
}
