import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface aww {
   aww a = $$0 -> true;

   boolean accept(awx var1);

   static aww codepoint(int $$0, xd $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static aww forward(String $$0, xd $$1) {
      return $$0.isEmpty() ? a : $$2 -> ayd.a($$0, $$1, $$2);
   }

   static aww forward(String $$0, xd $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ayd.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static aww backward(String $$0, xd $$1) {
      return $$0.isEmpty() ? a : $$2 -> ayd.b($$0, $$1, $$2);
   }

   static aww backward(String $$0, xd $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ayd.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static awx decorateOutput(awx $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static aww composite() {
      return a;
   }

   static aww composite(aww $$0) {
      return $$0;
   }

   static aww composite(aww $$0, aww $$1) {
      return fromPair($$0, $$1);
   }

   static aww composite(aww... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static aww composite(List<aww> $$0) {
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

   static aww fromPair(aww $$0, aww $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static aww fromList(List<aww> $$0) {
      return $$1 -> {
         for (aww $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
