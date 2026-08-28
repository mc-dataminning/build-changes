import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbd(ju<bun> c) implements dbb {
   public static final MapCodec<dbd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kf.a(mb.W).fieldOf("effects").forGetter(dbd::b)).apply($$0, dbd::new));
   public static final zt<xg, dbd> b = zt.a(zr.c(mb.W), dbd::b, dbd::new);

   public dbd(jq<bun> $$0) {
      this(ju.a($$0));
   }

   @Override
   public dbb.a<dbd> a() {
      return dbb.a.b;
   }

   @Override
   public boolean a(dhi $$0, cxp $$1, bwg $$2) {
      boolean $$3 = false;

      for (jq<bun> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public ju<bun> b() {
      return this.c;
   }
}
