import com.mojang.serialization.Codec;

public class eje extends ejt<eme> {
   public eje(Codec<eme> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejv<eme> $$0) {
      dkg $$1 = $$0.b();
      iv $$2 = $$0.e();
      azv $$3 = $$0.d();
      if ($$1.v($$2) && $$1.a_($$2.e()).a(dmo.fY)) {
         dns.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
