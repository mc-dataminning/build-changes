import com.mojang.serialization.MapCodec;

public class dai extends cua implements cud {
   public static final MapCodec<dai> a = b(dai::new);

   @Override
   public MapCodec<dai> a() {
      return a;
   }

   public dai(dga.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      $$0.b($$2.d(), cuc.rF.o());
   }
}
