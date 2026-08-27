import com.mojang.serialization.Codec;

public class ebf extends dzx<ecu> {
   public ebf(Codec<ecu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<ecu> $$0) {
      ayk $$1 = $$0.d();
      ecu $$2 = $$0.f();
      dbs $$3 = $$0.b();
      io $$4 = $$0.e();
      dsy $$5 = $$0.c();
      int $$6 = $$1.a($$2.b.b());
      egn $$7 = $$2.b.a($$6).a();
      return $$7.a($$3, $$5, $$1, $$4);
   }
}
