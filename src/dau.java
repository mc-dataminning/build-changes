import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dau(ju<bue> c) implements das {
   public static final MapCodec<dau> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kf.a(mb.W).fieldOf("effects").forGetter(dau::b)).apply($$0, dau::new));
   public static final zi<wv, dau> b = zi.a(zg.c(mb.W), dau::b, dau::new);

   public dau(jq<bue> $$0) {
      this(ju.a($$0));
   }

   @Override
   public das.a<dau> a() {
      return das.a.b;
   }

   @Override
   public boolean a(dgz $$0, cxg $$1, bvx $$2) {
      boolean $$3 = false;

      for (jq<bue> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public ju<bue> b() {
      return this.c;
   }
}
