import com.mojang.serialization.Codec;

public class ebt extends eaw<edl> {
   public ebt(Codec<edl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eay<edl> $$0) {
      azf $$1 = $$0.d();
      edl $$2 = $$0.f();
      dcr $$3 = $$0.b();
      dtx $$4 = $$0.c();
      iz $$5 = $$0.e();
      boolean $$6 = $$1.h();
      return ($$6 ? $$2.b : $$2.c).a().a($$3, $$4, $$1, $$5);
   }
}
