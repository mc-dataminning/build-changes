import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface aub {
   aub a = $$0 -> true;

   boolean accept(auc var1);

   static aub codepoint(int $$0, wd $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static aub forward(String $$0, wd $$1) {
      return $$0.isEmpty() ? a : $$2 -> avk.a($$0, $$1, $$2);
   }

   static aub forward(String $$0, wd $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> avk.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static aub backward(String $$0, wd $$1) {
      return $$0.isEmpty() ? a : $$2 -> avk.b($$0, $$1, $$2);
   }

   static aub backward(String $$0, wd $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> avk.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static auc decorateOutput(auc $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static aub composite() {
      return a;
   }

   static aub composite(aub $$0) {
      return $$0;
   }

   static aub composite(aub $$0, aub $$1) {
      return fromPair($$0, $$1);
   }

   static aub composite(aub... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static aub composite(List<aub> $$0) {
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

   static aub fromPair(aub $$0, aub $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static aub fromList(List<aub> $$0) {
      return $$1 -> {
         for (aub $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
