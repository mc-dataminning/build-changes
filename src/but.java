import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface but {
   void a(buq var1, cwf var2);

   cwf a(buq var1);

   void a(buq var1, float var2);

   default void a(bus $$0, euj $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(alk<eul> $$0, euj $$1, Map<buq, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(alk<eul> $$0, euj $$1, long $$2, Map<buq, Float> $$3) {
      eul $$4 = $$1.a().o().bc().b($$0);
      if ($$4 != eul.a) {
         List<cwf> $$5 = $$4.a($$1, $$2);
         List<buq> $$6 = new ArrayList<>();

         for (cwf $$7 : $$5) {
            buq $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cwf $$9 = $$8.a($$7);
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
   default buq a(cwf $$0, List<buq> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         ddr $$2 = $$0.a(ku.D);
         if ($$2 != null) {
            buq $$3 = $$2.a();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(buq.a)) {
            return buq.a;
         }

         return null;
      }
   }
}
