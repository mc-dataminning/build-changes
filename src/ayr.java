import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ayr {
   ayr a = $$0 -> true;

   boolean accept(ays var1);

   static ayr codepoint(int $$0, yb $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ayr forward(String $$0, yb $$1) {
      return $$0.isEmpty() ? a : $$2 -> baa.a($$0, $$1, $$2);
   }

   static ayr forward(String $$0, yb $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> baa.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayr backward(String $$0, yb $$1) {
      return $$0.isEmpty() ? a : $$2 -> baa.b($$0, $$1, $$2);
   }

   static ayr backward(String $$0, yb $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> baa.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static ays decorateOutput(ays $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ayr composite() {
      return a;
   }

   static ayr composite(ayr $$0) {
      return $$0;
   }

   static ayr composite(ayr $$0, ayr $$1) {
      return fromPair($$0, $$1);
   }

   static ayr composite(ayr... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ayr composite(List<ayr> $$0) {
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

   static ayr fromPair(ayr $$0, ayr $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ayr fromList(List<ayr> $$0) {
      return $$1 -> {
         for (ayr $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
