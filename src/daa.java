import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daa(jr<avy> c) implements czz {
   public static final MapCodec<daa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(avy.b.fieldOf("sound").forGetter(daa::b)).apply($$0, daa::new));
   public static final ym<vz, daa> b = ym.a(avy.d, daa::b, daa::new);

   @Override
   public czz.a<daa> a() {
      return czz.a.e;
   }

   @Override
   public boolean a(dgg $$0, cwn $$1, bvf $$2) {
      $$0.a(null, $$2.dw(), this.c.a(), $$2.dn(), 1.0F, 1.0F);
      return true;
   }

   public jr<avy> b() {
      return this.c;
   }
}
