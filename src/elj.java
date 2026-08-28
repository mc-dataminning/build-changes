import com.mojang.serialization.Codec;

public class elj extends ekk<enb> {
   public elj(Codec<enb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<enb> $$0) {
      enb $$1 = $$0.f();
      azx $$2 = $$0.d();
      dkw $$3 = $$0.b();
      edc $$4 = $$0.c();
      iv $$5 = $$0.e();

      for (eme $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
