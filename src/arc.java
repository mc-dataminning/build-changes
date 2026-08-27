import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface arc {
   arc a = $$0 -> true;

   boolean accept(ard var1);

   static arc codepoint(int $$0, ub $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static arc forward(String $$0, ub $$1) {
      return $$0.isEmpty() ? a : $$2 -> asg.a($$0, $$1, $$2);
   }

   static arc forward(String $$0, ub $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> asg.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static arc backward(String $$0, ub $$1) {
      return $$0.isEmpty() ? a : $$2 -> asg.b($$0, $$1, $$2);
   }

   static arc backward(String $$0, ub $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> asg.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static ard decorateOutput(ard $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static arc composite() {
      return a;
   }

   static arc composite(arc $$0) {
      return $$0;
   }

   static arc composite(arc $$0, arc $$1) {
      return fromPair($$0, $$1);
   }

   static arc composite(arc... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static arc composite(List<arc> $$0) {
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

   static arc fromPair(arc $$0, arc $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static arc fromList(List<arc> $$0) {
      return $$1 -> {
         for (arc $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
