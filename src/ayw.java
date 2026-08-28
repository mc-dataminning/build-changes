import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ayw {
   ayw a = $$0 -> true;

   boolean accept(ayx var1);

   static ayw codepoint(int $$0, xt $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ayw forward(String $$0, xt $$1) {
      return $$0.isEmpty() ? a : $$2 -> bah.a($$0, $$1, $$2);
   }

   static ayw forward(String $$0, xt $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> bah.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayw backward(String $$0, xt $$1) {
      return $$0.isEmpty() ? a : $$2 -> bah.b($$0, $$1, $$2);
   }

   static ayw backward(String $$0, xt $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> bah.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayx decorateOutput(ayx $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ayw composite() {
      return a;
   }

   static ayw composite(ayw $$0) {
      return $$0;
   }

   static ayw composite(ayw $$0, ayw $$1) {
      return fromPair($$0, $$1);
   }

   static ayw composite(ayw... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ayw composite(List<ayw> $$0) {
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

   static ayw fromPair(ayw $$0, ayw $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ayw fromList(List<ayw> $$0) {
      return $$1 -> {
         for (ayw $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
