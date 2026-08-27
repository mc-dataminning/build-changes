import com.mojang.serialization.Codec;

public class dqw extends dpv<dsn> {
   public dqw(Codec<dsn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dsn> $$0) {
      csu $$1 = $$0.b();
      ht $$2 = $$0.e();
      dsn $$3 = $$0.f();

      for (dsh.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
