import com.mojang.serialization.Codec;

public class ekx extends ejy<emo> {
   public ekx(Codec<emo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<emo> $$0) {
      emo $$1 = $$0.f();
      azv $$2 = $$0.d();
      dkl $$3 = $$0.b();
      ecr $$4 = $$0.c();
      iv $$5 = $$0.e();

      for (els $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
