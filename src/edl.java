import com.mojang.serialization.Codec;

public class edl extends ecd<efa> {
   public edl(Codec<efa> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<efa> $$0) {
      ayw $$1 = $$0.d();
      efa $$2 = $$0.f();
      dds $$3 = $$0.b();
      jd $$4 = $$0.e();
      duz $$5 = $$0.c();
      int $$6 = $$1.a($$2.b.b());
      eit $$7 = $$2.b.a($$6).a();
      return $$7.a($$3, $$5, $$1, $$4);
   }
}
