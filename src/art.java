import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public interface art extends djr {
   aru a();

   @Nullable
   default crz a(cil $$0, bxw $$1) {
      return this.a(this.z(), $$0, $$1, $$1.dA(), $$1.dC(), $$1.dG());
   }

   @Nullable
   default crz a(cil $$0, bxw $$1, double $$2, double $$3, double $$4) {
      return this.a(this.z(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default crz a(cil $$0, double $$1, double $$2, double $$3) {
      return this.a(this.z(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bxw> T a(Class<? extends T> $$0, cil $$1, @Nullable bxw $$2, double $$3, double $$4, double $$5, ffn $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bxw> T a(List<? extends T> $$0, cil $$1, @Nullable bxw $$2, double $$3, double $$4, double $$5) {
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

   default List<crz> a(cil $$0, bxw $$1, ffn $$2) {
      List<crz> $$3 = new ArrayList<>();

      for (crz $$4 : this.z()) {
         if ($$2.e($$4.dA(), $$4.dC(), $$4.dG()) && $$0.a(this.a(), $$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bxw> List<T> a(Class<T> $$0, cil $$1, bxw $$2, ffn $$3) {
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
