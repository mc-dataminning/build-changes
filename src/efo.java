import com.mojang.serialization.Codec;

public class efo extends eep<ehf> {
   public efo(Codec<ehf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eer<ehf> $$0) {
      ehf $$1 = $$0.f();
      azv $$2 = $$0.d();
      dgd $$3 = $$0.b();
      dxk $$4 = $$0.c();
      jh $$5 = $$0.e();

      for (egj $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
