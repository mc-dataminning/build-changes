import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czt(ju<btl> c) implements czr {
   public static final MapCodec<czt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kf.a(ma.W).fieldOf("effects").forGetter(czt::b)).apply($$0, czt::new));
   public static final zj<ww, czt> b = zj.a(zh.c(ma.W), czt::b, czt::new);

   public czt(jq<btl> $$0) {
      this(ju.a($$0));
   }

   @Override
   public czr.a<czt> a() {
      return czr.a.b;
   }

   @Override
   public boolean a(dff $$0, cwf $$1, bve $$2) {
      boolean $$3 = false;

      for (jq<btl> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public ju<btl> b() {
      return this.c;
   }
}
