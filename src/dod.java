import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dod extends doo<dqz> {
   public dod(Codec<dqz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<dqz> $$0) {
      ate $$1 = $$0.d();
      crt $$2 = $$0.b();
      ht $$3 = $$0.e();
      Optional<cua> $$4 = jy.f.b(aqs.ap).flatMap($$1x -> $$1x.a($$1)).map(ib::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(cra var1, ate var2, ht var3, dgb var4);

   protected boolean b(cra $$0, ate $$1, ht $$2, dgb $$3) {
      ht $$4 = $$2.c();
      dgb $$5 = $$0.a_($$2);
      if (($$5.a(cuc.G) || $$5.a(aqs.as)) && $$0.a_($$4).a(cuc.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            jy.f.b(aqs.as).flatMap($$1x -> $$1x.a($$1)).map(ib::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cuc.mV.o().a(dav.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (hx $$6 : hx.c.a) {
            if ($$1.i() < 0.2F) {
               ht $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cuc.G)) {
                  jy.f.b(aqs.aq).flatMap($$1x -> $$1x.a($$1)).map(ib::a).ifPresent($$3x -> {
                     dgb $$4x = $$3x.o();
                     if ($$4x.b(ctl.c)) {
                        $$4x = $$4x.a(ctl.c, $$6);
                     }

                     $$0.a($$7, $$4x, 2);
                  });
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
