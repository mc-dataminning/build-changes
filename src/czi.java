import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czi(jp<awj> c) implements czh {
   public static final MapCodec<czi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awj.b.fieldOf("sound").forGetter(czi::b)).apply($$0, czi::new));
   public static final zf<ws, czi> b = zf.a(awj.d, czi::b, czi::new);

   @Override
   public czh.a<czi> a() {
      return czh.a.e;
   }

   @Override
   public boolean a(dev $$0, cvx $$1, buv $$2) {
      $$0.a(null, $$2.dx(), this.c.a(), $$2.dn(), 1.0F, 1.0F);
      return true;
   }

   public jp<awj> b() {
      return this.c;
   }
}
