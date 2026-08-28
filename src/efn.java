import com.mojang.serialization.Codec;

public class efn extends eep<ehg> {
   public efn(Codec<ehg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eer<ehg> $$0) {
      ehg $$1 = $$0.f();
      azv $$2 = $$0.d();
      jh $$3 = $$0.e();
      dgd $$4 = $$0.b();
      int $$5 = 0;
      jh.a $$6 = new jh.a();
      int $$7 = $$1.b() + 1;
      int $$8 = $$1.c() + 1;

      for (int $$9 = 0; $$9 < $$1.a(); $$9++) {
         $$6.a($$3, $$2.a($$7) - $$2.a($$7), $$2.a($$8) - $$2.a($$8), $$2.a($$7) - $$2.a($$7));
         if ($$1.d().a().a($$4, $$0.c(), $$2, $$6)) {
            $$5++;
         }
      }

      return $$5 > 0;
   }
}
