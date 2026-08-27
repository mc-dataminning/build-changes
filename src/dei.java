import com.mojang.serialization.MapCodec;

public class dei extends cwl {
   public static final MapCodec<dei> c = b(dei::new);

   @Override
   public MapCodec<dei> a() {
      return c;
   }

   public dei(djo.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : cxa.a.o();
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return h($$1.a_($$2.d()));
   }

   public static boolean h(djp $$0) {
      return $$0.a(asi.aS);
   }

   @Override
   protected boolean f(djp $$0) {
      return true;
   }
}
