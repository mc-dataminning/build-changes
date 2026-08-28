import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public interface arc extends dgr {
   ard a();

   @Nullable
   default cpr a(cgp $$0, bvy $$1) {
      return this.a(this.z(), $$0, $$1, $$1.dz(), $$1.dB(), $$1.dF());
   }

   @Nullable
   default cpr a(cgp $$0, bvy $$1, double $$2, double $$3, double $$4) {
      return this.a(this.z(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cpr a(cgp $$0, double $$1, double $$2, double $$3) {
      return this.a(this.z(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bvy> T a(Class<? extends T> $$0, cgp $$1, @Nullable bvy $$2, double $$3, double $$4, double $$5, fbs $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bvy> T a(List<? extends T> $$0, cgp $$1, @Nullable bvy $$2, double $$3, double $$4, double $$5) {
      double $$6 = -1.0;
      T $$7 = null;

      for (T $$8 : $$0) {
         if ($$1.a(this.a(), $$2, $$8)) {
            double $$9 = $$8.i($$3, $$4, $$5);
            if ($$6 == -1.0 || $$9 < $$6) {
               $$6 = $$9;
               $$7 = $$8;
            }
         }
      }

      return $$7;
   }

   default List<cpr> a(cgp $$0, bvy $$1, fbs $$2) {
      List<cpr> $$3 = new ArrayList<>();

      for (cpr $$4 : this.z()) {
         if ($$2.e($$4.dz(), $$4.dB(), $$4.dF()) && $$0.a(this.a(), $$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bvy> List<T> a(Class<T> $$0, cgp $$1, bvy $$2, fbs $$3) {
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
