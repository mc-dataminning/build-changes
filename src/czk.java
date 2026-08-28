import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czk(js<bsw> c) implements czi {
   public static final MapCodec<czk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kd.a(lw.W).fieldOf("effects").forGetter(czk::b)).apply($$0, czk::new));
   public static final zc<wp, czk> b = zc.a(za.c(lw.W), czk::b, czk::new);

   public czk(jo<bsw> $$0) {
      this(js.a($$0));
   }

   @Override
   public czi.a<czk> a() {
      return czi.a.b;
   }

   @Override
   public boolean a(dej $$0, cvs $$1, bun $$2) {
      boolean $$3 = false;

      for (jo<bsw> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public js<bsw> b() {
      return this.c;
   }
}
