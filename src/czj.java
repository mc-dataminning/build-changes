import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czj(jt<btc> c) implements czh {
   public static final MapCodec<czj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ke.a(ly.W).fieldOf("effects").forGetter(czj::b)).apply($$0, czj::new));
   public static final zf<ws, czj> b = zf.a(zd.c(ly.W), czj::b, czj::new);

   public czj(jp<btc> $$0) {
      this(jt.a($$0));
   }

   @Override
   public czh.a<czj> a() {
      return czh.a.b;
   }

   @Override
   public boolean a(dev $$0, cvx $$1, buv $$2) {
      boolean $$3 = false;

      for (jp<btc> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jt<btc> b() {
      return this.c;
   }
}
