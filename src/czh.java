import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czh(jr<bst> c) implements czf {
   public static final MapCodec<czh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kc.a(lv.W).fieldOf("effects").forGetter(czh::b)).apply($$0, czh::new));
   public static final zb<wo, czh> b = zb.a(yz.c(lv.W), czh::b, czh::new);

   public czh(jn<bst> $$0) {
      this(jr.a($$0));
   }

   @Override
   public czf.a<czh> a() {
      return czf.a.b;
   }

   @Override
   public boolean a(deg $$0, cvp $$1, buk $$2) {
      boolean $$3 = false;

      for (jn<bst> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jr<bst> b() {
      return this.c;
   }
}
