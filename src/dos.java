import com.mojang.serialization.MapCodec;

public class dos extends dff {
   public static final MapCodec<dos> a = b(dos::new);

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   public dos(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      evz $$4 = new evz(0.25, 0.05F, 0.25);
      if ($$3 instanceof bsy $$5 && $$5.b(brn.K)) {
         $$4 = new evz(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
