import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record day(ju<bui> c) implements daw {
   public static final MapCodec<day> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kf.a(mb.W).fieldOf("effects").forGetter(day::b)).apply($$0, day::new));
   public static final zt<xg, day> b = zt.a(zr.c(mb.W), day::b, day::new);

   public day(jq<bui> $$0) {
      this(ju.a($$0));
   }

   @Override
   public daw.a<day> a() {
      return daw.a.b;
   }

   @Override
   public boolean a(dha $$0, cxk $$1, bwb $$2) {
      boolean $$3 = false;

      for (jq<bui> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public ju<bui> b() {
      return this.c;
   }
}
