import com.mojang.serialization.Codec;

public class dsc extends drv {
   public static final Codec<dsc> b = dfd.b.fieldOf("state").xmap(dfc.a::b, ctc::o).xmap(dsc::new, $$0 -> $$0.c).codec();
   private final ctc c;

   public dsc(ctc $$0) {
      this.c = $$0;
   }

   @Override
   protected drw<?> a() {
      return drw.f;
   }

   @Override
   public dfd a(ash $$0, gw $$1) {
      ha.a $$2 = ha.a.a($$0);
      return this.c.o().a(czm.i, $$2);
   }
}
