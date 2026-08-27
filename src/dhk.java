import com.mojang.serialization.MapCodec;

public class dhk extends czn {
   public static final MapCodec<dhk> c = b(dhk::new);

   @Override
   public MapCodec<dhk> a() {
      return c;
   }

   public dhk(dmy.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dac.a.o();
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dmz $$0) {
      return $$0.a(aun.aT);
   }

   @Override
   protected boolean f(dmz $$0) {
      return true;
   }
}
