import com.mojang.serialization.MapCodec;

public class dos extends dri {
   public static final MapCodec<dos> a = b(dos::new);

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   public dos(dww.d $$0) {
      super($$0);
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lt.ab, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
