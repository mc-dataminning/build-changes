import com.mojang.serialization.MapCodec;

public class dck extends cun {
   public static final MapCodec<dck> c = b(dck::new);

   @Override
   public MapCodec<dck> a() {
      return c;
   }

   public dck(dhh.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : cvc.a.o();
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return h($$1.a_($$2.d()));
   }

   public static boolean h(dhi $$0) {
      return $$0.a(arg.aS);
   }

   @Override
   protected boolean f(dhi $$0) {
      return true;
   }
}
