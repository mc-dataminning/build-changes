import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface atu {
   atu a = $$0 -> true;

   boolean accept(atv var1);

   static atu codepoint(int $$0, wa $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static atu forward(String $$0, wa $$1) {
      return $$0.isEmpty() ? a : $$2 -> avd.a($$0, $$1, $$2);
   }

   static atu forward(String $$0, wa $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> avd.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static atu backward(String $$0, wa $$1) {
      return $$0.isEmpty() ? a : $$2 -> avd.b($$0, $$1, $$2);
   }

   static atu backward(String $$0, wa $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> avd.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static atv decorateOutput(atv $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static atu composite() {
      return a;
   }

   static atu composite(atu $$0) {
      return $$0;
   }

   static atu composite(atu $$0, atu $$1) {
      return fromPair($$0, $$1);
   }

   static atu composite(atu... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static atu composite(List<atu> $$0) {
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

   static atu fromPair(atu $$0, atu $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static atu fromList(List<atu> $$0) {
      return $$1 -> {
         for (atu $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
