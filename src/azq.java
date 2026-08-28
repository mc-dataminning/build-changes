import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface azq {
   azq a = $$0 -> true;

   boolean accept(azr var1);

   static azq codepoint(int $$0, ys $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static azq forward(String $$0, ys $$1) {
      return $$0.isEmpty() ? a : $$2 -> baz.a($$0, $$1, $$2);
   }

   static azq forward(String $$0, ys $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> baz.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static azq backward(String $$0, ys $$1) {
      return $$0.isEmpty() ? a : $$2 -> baz.b($$0, $$1, $$2);
   }

   static azq backward(String $$0, ys $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> baz.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static azr decorateOutput(azr $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static azq composite() {
      return a;
   }

   static azq composite(azq $$0) {
      return $$0;
   }

   static azq composite(azq $$0, azq $$1) {
      return fromPair($$0, $$1);
   }

   static azq composite(azq... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static azq composite(List<azq> $$0) {
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

   static azq fromPair(azq $$0, azq $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static azq fromList(List<azq> $$0) {
      return $$1 -> {
         for (azq $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
