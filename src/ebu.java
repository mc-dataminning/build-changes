import com.mojang.serialization.Codec;

public class ebu extends eat<edl> {
   public ebu(Codec<edl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<edl> $$0) {
      dco $$1 = $$0.b();
      iz $$2 = $$0.e();
      edl $$3 = $$0.f();

      for (edf.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
