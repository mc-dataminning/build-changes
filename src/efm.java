import com.mojang.serialization.Codec;

public class efm extends eef<ehb> {
   public efm(Codec<ehb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<ehb> $$0) {
      ehb $$1 = $$0.f();
      dfs $$2 = $$0.b();
      jg $$3 = $$0.e();
      dvd $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dkg) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dkg.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
