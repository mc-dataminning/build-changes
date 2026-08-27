import com.mojang.serialization.MapCodec;

public class cyw extends cua implements cud {
   public static final MapCodec<cyw> a = b(cyw::new);

   @Override
   public MapCodec<cyw> a() {
      return a;
   }

   public cyw(dga.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      $$0.H_().c(jz.at).flatMap($$0x -> $$0x.b(pm.n)).ifPresent($$3x -> ((dob)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2.c()));
   }
}
