import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface asy {
   asy a = $$0 -> true;

   boolean accept(asz var1);

   static asy codepoint(int $$0, vo $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static asy forward(String $$0, vo $$1) {
      return $$0.isEmpty() ? a : $$2 -> auf.a($$0, $$1, $$2);
   }

   static asy forward(String $$0, vo $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> auf.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static asy backward(String $$0, vo $$1) {
      return $$0.isEmpty() ? a : $$2 -> auf.b($$0, $$1, $$2);
   }

   static asy backward(String $$0, vo $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> auf.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static asz decorateOutput(asz $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static asy composite() {
      return a;
   }

   static asy composite(asy $$0) {
      return $$0;
   }

   static asy composite(asy $$0, asy $$1) {
      return fromPair($$0, $$1);
   }

   static asy composite(asy... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static asy composite(List<asy> $$0) {
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

   static asy fromPair(asy $$0, asy $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static asy fromList(List<asy> $$0) {
      return $$1 -> {
         for (asy $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
