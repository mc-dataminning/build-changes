import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public interface arn extends dih {
   aro a();

   @Nullable
   default cqs a(cho $$0, bwz $$1) {
      return this.a(this.z(), $$0, $$1, $$1.dA(), $$1.dC(), $$1.dG());
   }

   @Nullable
   default cqs a(cho $$0, bwz $$1, double $$2, double $$3, double $$4) {
      return this.a(this.z(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cqs a(cho $$0, double $$1, double $$2, double $$3) {
      return this.a(this.z(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bwz> T a(Class<? extends T> $$0, cho $$1, @Nullable bwz $$2, double $$3, double $$4, double $$5, fdr $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bwz> T a(List<? extends T> $$0, cho $$1, @Nullable bwz $$2, double $$3, double $$4, double $$5) {
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

   default List<cqs> a(cho $$0, bwz $$1, fdr $$2) {
      List<cqs> $$3 = new ArrayList<>();

      for (cqs $$4 : this.z()) {
         if ($$2.e($$4.dA(), $$4.dC(), $$4.dG()) && $$0.a(this.a(), $$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bwz> List<T> a(Class<T> $$0, cho $$1, bwz $$2, fdr $$3) {
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
