import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ark {
   ark a = $$0 -> true;

   boolean accept(arl var1);

   static ark codepoint(int $$0, uh $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ark forward(String $$0, uh $$1) {
      return $$0.isEmpty() ? a : $$2 -> aso.a($$0, $$1, $$2);
   }

   static ark forward(String $$0, uh $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> aso.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ark backward(String $$0, uh $$1) {
      return $$0.isEmpty() ? a : $$2 -> aso.b($$0, $$1, $$2);
   }

   static ark backward(String $$0, uh $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> aso.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static arl decorateOutput(arl $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ark composite() {
      return a;
   }

   static ark composite(ark $$0) {
      return $$0;
   }

   static ark composite(ark $$0, ark $$1) {
      return fromPair($$0, $$1);
   }

   static ark composite(ark... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ark composite(List<ark> $$0) {
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

   static ark fromPair(ark $$0, ark $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ark fromList(List<ark> $$0) {
      return $$1 -> {
         for (ark $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
