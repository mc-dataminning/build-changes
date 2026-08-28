import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public interface asg extends dgr {
   ash a();

   @Nullable
   default cps a(cgs $$0, bwb $$1) {
      return this.a(this.y(), $$0, $$1, $$1.dA(), $$1.dC(), $$1.dG());
   }

   @Nullable
   default cps a(cgs $$0, bwb $$1, double $$2, double $$3, double $$4) {
      return this.a(this.y(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cps a(cgs $$0, double $$1, double $$2, double $$3) {
      return this.a(this.y(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bwb> T a(Class<? extends T> $$0, cgs $$1, @Nullable bwb $$2, double $$3, double $$4, double $$5, fbn $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bwb> T a(List<? extends T> $$0, cgs $$1, @Nullable bwb $$2, double $$3, double $$4, double $$5) {
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

   default List<cps> a(cgs $$0, bwb $$1, fbn $$2) {
      List<cps> $$3 = new ArrayList<>();

      for (cps $$4 : this.y()) {
         if ($$2.e($$4.dA(), $$4.dC(), $$4.dG()) && $$0.a(this.a(), $$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bwb> List<T> a(Class<T> $$0, cgs $$1, bwb $$2, fbn $$3) {
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
