import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dau(jv<buc> c) implements das {
   public static final MapCodec<dau> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kg.a(mc.W).fieldOf("effects").forGetter(dau::b)).apply($$0, dau::new));
   public static final yn<wa, dau> b = yn.a(yl.c(mc.W), dau::b, dau::new);

   public dau(jr<buc> $$0) {
      this(jv.a($$0));
   }

   @Override
   public das.a<dau> a() {
      return das.a.b;
   }

   @Override
   public boolean a(dgz $$0, cxh $$1, bvy $$2) {
      boolean $$3 = false;

      for (jr<buc> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jv<buc> b() {
      return this.c;
   }
}
