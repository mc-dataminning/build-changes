import com.mojang.serialization.Codec;

public class eaw extends dzx<ecn> {
   public eaw(Codec<ecn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<ecn> $$0) {
      ecn $$1 = $$0.f();
      ayk $$2 = $$0.d();
      dbs $$3 = $$0.b();
      dsy $$4 = $$0.c();
      io $$5 = $$0.e();

      for (ebr $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
