import com.mojang.serialization.Codec;

public class eaa extends dzd<ebs> {
   public eaa(Codec<ebs> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebs> $$0) {
      ayg $$1 = $$0.d();
      ebs $$2 = $$0.f();
      day $$3 = $$0.b();
      dse $$4 = $$0.c();
      in $$5 = $$0.e();
      boolean $$6 = $$1.h();
      return ($$6 ? $$2.b : $$2.c).a().a($$3, $$4, $$1, $$5);
   }
}
