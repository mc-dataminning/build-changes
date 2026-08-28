import com.mojang.serialization.Codec;

public class ees extends edu<egl> {
   public ees(Codec<egl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egl> $$0) {
      egl $$1 = $$0.f();
      azn $$2 = $$0.d();
      jf $$3 = $$0.e();
      dfg $$4 = $$0.b();
      int $$5 = 0;
      jf.a $$6 = new jf.a();
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
