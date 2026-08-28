import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface buv {
   void a(bus var1, cwo var2);

   cwo a(bus var1);

   void a(bus var1, float var2);

   default void a(buu $$0, evt $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(aku<evv> $$0, evt $$1, Map<bus, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(aku<evv> $$0, evt $$1, long $$2, Map<bus, Float> $$3) {
      evv $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != evv.a) {
         List<cwo> $$5 = $$4.a($$1, $$2);
         List<bus> $$6 = new ArrayList<>();

         for (cwo $$7 : $$5) {
            bus $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cwo $$9 = $$8.a($$7);
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
   default bus a(cwo $$0, List<bus> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         det $$2 = $$0.a(kv.D);
         if ($$2 != null) {
            bus $$3 = $$2.a();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bus.a)) {
            return bus.a;
         }

         return null;
      }
   }
}
