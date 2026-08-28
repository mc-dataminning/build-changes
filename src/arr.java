import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public interface arr extends djp {
   ars a();

   @Nullable
   default crx a(cij $$0, bxu $$1) {
      return this.a(this.z(), $$0, $$1, $$1.dA(), $$1.dC(), $$1.dG());
   }

   @Nullable
   default crx a(cij $$0, bxu $$1, double $$2, double $$3, double $$4) {
      return this.a(this.z(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default crx a(cij $$0, double $$1, double $$2, double $$3) {
      return this.a(this.z(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bxu> T a(Class<? extends T> $$0, cij $$1, @Nullable bxu $$2, double $$3, double $$4, double $$5, ffl $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bxu> T a(List<? extends T> $$0, cij $$1, @Nullable bxu $$2, double $$3, double $$4, double $$5) {
      double $$6 = -1.0;
      T $$7 = null;

      for (T $$8 : $$0) {
         if ($$1.a(this.a(), $$2, $$8)) {
            double $$9 = $$8.h($$3, $$4, $$5);
            if ($$6 == -1.0 || $$9 < $$6) {
               $$6 = $$9;
               $$7 = $$8;
            }
         }
      }

      return $$7;
   }

   default List<crx> a(cij $$0, bxu $$1, ffl $$2) {
      List<crx> $$3 = new ArrayList<>();

      for (crx $$4 : this.z()) {
         if ($$2.e($$4.dA(), $$4.dC(), $$4.dG()) && $$0.a(this.a(), $$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bxu> List<T> a(Class<T> $$0, cij $$1, bxu $$2, ffl $$3) {
      List<T> $$4 = this.a($$0, $$3, $$0x -> true);
      List<T> $$5 = new ArrayList<>();

      for (T $$6 : $$4) {
         if ($$1.a(this.a(), $$2, $$6)) {
            $$5.add($$6);
         }
      }

      return $$5;
   }
}
