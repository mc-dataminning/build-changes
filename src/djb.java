import com.mojang.serialization.MapCodec;

public class djb extends dkd {
   public static final MapCodec<djb> a = b(djb::new);

   @Override
   public MapCodec<? extends djb> a() {
      return a;
   }

   public djb(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dgz $$0, dxo $$1, fbn $$2, cqh $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         $$0.a(null, $$4, awv.E, aww.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
