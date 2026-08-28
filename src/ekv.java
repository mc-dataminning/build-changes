import com.mojang.serialization.Codec;

public class ekv extends ejy<emn> {
   public ekv(Codec<emn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<emn> $$0) {
      azv $$1 = $$0.d();
      emn $$2 = $$0.f();
      dkl $$3 = $$0.b();
      ecr $$4 = $$0.c();
      iv $$5 = $$0.e();
      boolean $$6 = $$1.h();
      return ($$6 ? $$2.b : $$2.c).a().a($$3, $$4, $$1, $$5);
   }
}
