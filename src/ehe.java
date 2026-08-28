import com.mojang.serialization.Codec;

public class ehe extends efw<eit> {
   public ehe(Codec<eit> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eit> $$0) {
      azg $$1 = $$0.d();
      eit $$2 = $$0.f();
      dhe $$3 = $$0.b();
      ji $$4 = $$0.e();
      dyr $$5 = $$0.c();
      int $$6 = $$1.a($$2.b.b());
      emo $$7 = $$2.b.a($$6).a();
      return $$7.a($$3, $$5, $$1, $$4);
   }
}
