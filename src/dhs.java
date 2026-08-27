import com.mojang.serialization.MapCodec;

public class dhs extends dai {
   public static final MapCodec<dhs> n = b(dhs::new);

   @Override
   public MapCodec<dhs> a() {
      return n;
   }

   public dhs(dmd.d $$0) {
      super($$0, () -> djn.c);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dld($$0, $$1);
   }

   @Override
   protected atw<ajc> c() {
      return atz.i.b(atz.ai);
   }

   @Override
   protected boolean f_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return awm.a(djs.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$3 == ih.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
