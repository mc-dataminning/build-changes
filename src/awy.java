import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface awy {
   awy a = $$0 -> true;

   boolean accept(awz var1);

   static awy codepoint(int $$0, xf $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static awy forward(String $$0, xf $$1) {
      return $$0.isEmpty() ? a : $$2 -> ayf.a($$0, $$1, $$2);
   }

   static awy forward(String $$0, xf $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ayf.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static awy backward(String $$0, xf $$1) {
      return $$0.isEmpty() ? a : $$2 -> ayf.b($$0, $$1, $$2);
   }

   static awy backward(String $$0, xf $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ayf.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static awz decorateOutput(awz $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static awy composite() {
      return a;
   }

   static awy composite(awy $$0) {
      return $$0;
   }

   static awy composite(awy $$0, awy $$1) {
      return fromPair($$0, $$1);
   }

   static awy composite(awy... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static awy composite(List<awy> $$0) {
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

   static awy fromPair(awy $$0, awy $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static awy fromList(List<awy> $$0) {
      return $$1 -> {
         for (awy $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
