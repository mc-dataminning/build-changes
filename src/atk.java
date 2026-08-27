import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface atk {
   atk a = $$0 -> true;

   boolean accept(atl var1);

   static atk codepoint(int $$0, vy $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static atk forward(String $$0, vy $$1) {
      return $$0.isEmpty() ? a : $$2 -> aus.a($$0, $$1, $$2);
   }

   static atk forward(String $$0, vy $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> aus.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static atk backward(String $$0, vy $$1) {
      return $$0.isEmpty() ? a : $$2 -> aus.b($$0, $$1, $$2);
   }

   static atk backward(String $$0, vy $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> aus.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static atl decorateOutput(atl $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static atk composite() {
      return a;
   }

   static atk composite(atk $$0) {
      return $$0;
   }

   static atk composite(atk $$0, atk $$1) {
      return fromPair($$0, $$1);
   }

   static atk composite(atk... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static atk composite(List<atk> $$0) {
      int $$1 = $$0.size();
      switch ($$1) {
         case 0:
            return a;
         case 1:
            return $$0.get(0);
         case 2:
            return fromPair($$0.get(0), $$0.get(1));
         default:
            return fromList(ImmutableList.copyOf($$0));
      }
   }

   static atk fromPair(atk $$0, atk $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static atk fromList(List<atk> $$0) {
      return $$1 -> {
         for (atk $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
