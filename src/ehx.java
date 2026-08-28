import com.mojang.serialization.Codec;

public class ehx extends egp<ejm> {
   public ehx(Codec<ejm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<ejm> $$0) {
      bac $$1 = $$0.d();
      ejm $$2 = $$0.f();
      dhx $$3 = $$0.b();
      jh $$4 = $$0.e();
      dzk $$5 = $$0.c();
      int $$6 = $$1.a($$2.b.b());
      enh $$7 = $$2.b.a($$6).a();
      return $$7.a($$3, $$5, $$1, $$4);
   }
}
