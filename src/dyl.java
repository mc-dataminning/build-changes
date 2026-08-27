import com.mojang.serialization.Codec;

public class dyl extends dye {
   public static final Codec<dyl> b = dlj.b.fieldOf("state").xmap(dli.a::b, cys::o).xmap(dyl::new, $$0 -> $$0.c).codec();
   private final cys c;

   public dyl(cys $$0) {
      this.c = $$0;
   }

   @Override
   protected dyf<?> a() {
      return dyf.f;
   }

   @Override
   public dlj a(awp $$0, hz $$1) {
      ie.a $$2 = ie.a.a($$0);
      return this.c.o().a(dfd.i, $$2);
   }
}
