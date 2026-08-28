import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fmn(int b, int c) implements fmr {
   public static final MapCodec<fmn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayh.l.optionalFieldOf("index", 0).forGetter(fmn::b), ayh.i.fieldOf("default").forGetter(fmn::c)).apply($$0, fmn::new)
   );

   @Override
   public int a(cwn $$0) {
      cyx $$1 = $$0.a(kv.p);
      if ($$1 != null) {
         Integer $$2 = $$1.d(this.b);
         if ($$2 != null) {
            return axj.f($$2);
         }
      }

      return axj.f(this.c);
   }

   @Override
   public MapCodec<fmn> a() {
      return a;
   }
}
