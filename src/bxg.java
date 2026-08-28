import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bxg {
   void a(bxd var1, czy var2);

   czy a(bxd var1);

   void a(bxd var1, float var2);

   default void a(bxf $$0, fak $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(alh<fam> $$0, fak $$1, Map<bxd, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(alh<fam> $$0, fak $$1, long $$2, Map<bxd, Float> $$3) {
      fam $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != fam.f) {
         List<czy> $$5 = $$4.a($$1, $$2);
         List<bxd> $$6 = new ArrayList<>();

         for (czy $$7 : $$5) {
            bxd $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               czy $$9 = $$8.a($$7);
               this.a($$8, $$9);
               Float $$10 = $$3.get($$8);
               if ($$10 != null) {
                  this.a($$8, $$10);
               }

               $$6.add($$8);
            }
         }
      }
   }

   @Nullable
   default bxd a(czy $$0, List<bxd> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dih $$2 = $$0.a(kk.D);
         if ($$2 != null) {
            bxd $$3 = $$2.b();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bxd.a)) {
            return bxd.a;
         }

         return null;
      }
   }
}
