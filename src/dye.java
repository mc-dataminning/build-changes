import com.mojang.serialization.Codec;

public class dye extends dxx {
   public static final Codec<dye> b = dlf.b.fieldOf("state").xmap(dle.a::b, cyo::o).xmap(dye::new, $$0 -> $$0.c).codec();
   private final cyo c;

   public dye(cyo $$0) {
      this.c = $$0;
   }

   @Override
   protected dxy<?> a() {
      return dxy.f;
   }

   @Override
   public dlf a(awo $$0, hz $$1) {
      ie.a $$2 = ie.a.a($$0);
      return this.c.o().a(dez.i, $$2);
   }
}
