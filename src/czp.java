import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czp(ju<bth> c) implements czn {
   public static final MapCodec<czp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kf.a(lz.W).fieldOf("effects").forGetter(czp::b)).apply($$0, czp::new));
   public static final zg<wt, czp> b = zg.a(ze.c(lz.W), czp::b, czp::new);

   public czp(jq<bth> $$0) {
      this(ju.a($$0));
   }

   @Override
   public czn.a<czp> a() {
      return czn.a.b;
   }

   @Override
   public boolean a(dfb $$0, cwb $$1, bva $$2) {
      boolean $$3 = false;

      for (jq<bth> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public ju<bth> b() {
      return this.c;
   }
}
