import com.mojang.serialization.MapCodec;

public class dcc extends cwg implements cud {
   public static final MapCodec<dcc> c = b(dcc::new);

   @Override
   public MapCodec<dcc> a() {
      return c;
   }

   public dcc(dga.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return true;
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      a($$0, $$2, new ckj(this));
   }
}
