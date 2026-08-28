import com.mojang.serialization.Codec;

public class ect extends ebl<eei> {
   public ect(Codec<eei> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<eei> $$0) {
      ayo $$1 = $$0.d();
      eei $$2 = $$0.f();
      ddc $$3 = $$0.b();
      ja $$4 = $$0.e();
      dui $$5 = $$0.c();
      int $$6 = $$1.a($$2.b.b());
      eib $$7 = $$2.b.a($$6).a();
      return $$7.a($$3, $$5, $$1, $$4);
   }
}
