import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dom {
   fgw q_ = dno.b(14.0, 0.0, 16.0);
   ech r_ = ecg.b;

   static bvc a(@Nullable bxe $$0, ebq $$1, dkj $$2, iw $$3) {
      if ($$1.c(r_)) {
         dno.a($$2, $$3, new dak(dao.xH, 1));
         float $$4 = azz.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awy.ei, awz.e, 1.0F, $$4);
         ebq $$5 = $$1.b(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(egq.c, $$3, egq.a.a($$0, $$5));
         return bvc.a;
      } else {
         return bvc.e;
      }
   }

   static boolean j_(ebq $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<ebq> i_(int $$0) {
      return $$1 -> $$1.c(ecg.b) ? $$0 : 0;
   }
}
