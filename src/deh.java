import com.mojang.serialization.MapCodec;

public class deh extends dgv {
   public static final MapCodec<deh> a = b(deh::new);

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   public deh(dmd.d $$0) {
      super($$0);
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(kb.W, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
