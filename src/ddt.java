import com.mojang.serialization.MapCodec;

public class ddt extends cvw {
   public static final MapCodec<ddt> c = b(ddt::new);

   @Override
   public MapCodec<ddt> a() {
      return c;
   }

   public ddt(diz.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : cwl.a.o();
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return h($$1.a_($$2.d()));
   }

   public static boolean h(dja $$0) {
      return $$0.a(asb.aS);
   }

   @Override
   protected boolean f(dja $$0) {
      return true;
   }
}
