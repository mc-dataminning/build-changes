import com.mojang.serialization.Codec;

public class elf extends ejy<emu> {
   public elf(Codec<emu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<emu> $$0) {
      emu $$1 = $$0.f();
      dkl $$2 = $$0.b();
      iv $$3 = $$0.e();
      eat $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dpa) {
            if (!$$2.v($$3.d())) {
               return false;
            }

            dpa.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof drv) {
            drv.a($$2, $$3, $$2.C_(), 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         if ($$1.b()) {
            $$2.a($$3, $$2.a_($$3).b(), 1);
         }

         return true;
      } else {
         return false;
      }
   }
}
