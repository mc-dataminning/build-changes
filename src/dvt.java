import com.mojang.serialization.Codec;

public class dvt extends duu<dxk> {
   public dvt(Codec<dxk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxk> $$0) {
      dxk $$1 = $$0.f();
      awt $$2 = $$0.d();
      cwz $$3 = $$0.b();
      dob $$4 = $$0.c();
      ib $$5 = $$0.e();

      for (dwo $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
