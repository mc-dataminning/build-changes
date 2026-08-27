import com.mojang.serialization.MapCodec;

public class dcd extends cug {
   public static final MapCodec<dcd> c = b(dcd::new);

   @Override
   public MapCodec<dcd> a() {
      return c;
   }

   public dcd(dgv.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : cuv.a.o();
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return h($$1.a_($$2.d()));
   }

   public static boolean h(dgw $$0) {
      return $$0.a(arc.aS);
   }

   @Override
   protected boolean f(dgw $$0) {
      return true;
   }
}
