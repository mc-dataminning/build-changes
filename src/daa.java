import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daa(ju<bto> c) implements czy {
   public static final MapCodec<daa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kf.a(ma.W).fieldOf("effects").forGetter(daa::b)).apply($$0, daa::new));
   public static final zh<wu, daa> b = zh.a(zf.c(ma.W), daa::b, daa::new);

   public daa(jq<bto> $$0) {
      this(ju.a($$0));
   }

   @Override
   public czy.a<daa> a() {
      return czy.a.b;
   }

   @Override
   public boolean a(dfm $$0, cwm $$1, bvh $$2) {
      boolean $$3 = false;

      for (jq<bto> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public ju<bto> b() {
      return this.c;
   }
}
