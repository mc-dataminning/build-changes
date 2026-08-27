import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface arj {
   arj a = $$0 -> true;

   boolean accept(ark var1);

   static arj codepoint(int $$0, uh $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static arj forward(String $$0, uh $$1) {
      return $$0.isEmpty() ? a : $$2 -> aso.a($$0, $$1, $$2);
   }

   static arj forward(String $$0, uh $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> aso.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static arj backward(String $$0, uh $$1) {
      return $$0.isEmpty() ? a : $$2 -> aso.b($$0, $$1, $$2);
   }

   static arj backward(String $$0, uh $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> aso.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static ark decorateOutput(ark $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static arj composite() {
      return a;
   }

   static arj composite(arj $$0) {
      return $$0;
   }

   static arj composite(arj $$0, arj $$1) {
      return fromPair($$0, $$1);
   }

   static arj composite(arj... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static arj composite(List<arj> $$0) {
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

   static arj fromPair(arj $$0, arj $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static arj fromList(List<arj> $$0) {
      return $$1 -> {
         for (arj $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
