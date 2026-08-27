import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ask {
   ask a = $$0 -> true;

   boolean accept(asl var1);

   static ask codepoint(int $$0, vf $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ask forward(String $$0, vf $$1) {
      return $$0.isEmpty() ? a : $$2 -> atq.a($$0, $$1, $$2);
   }

   static ask forward(String $$0, vf $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> atq.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ask backward(String $$0, vf $$1) {
      return $$0.isEmpty() ? a : $$2 -> atq.b($$0, $$1, $$2);
   }

   static ask backward(String $$0, vf $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> atq.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static asl decorateOutput(asl $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ask composite() {
      return a;
   }

   static ask composite(ask $$0) {
      return $$0;
   }

   static ask composite(ask $$0, ask $$1) {
      return fromPair($$0, $$1);
   }

   static ask composite(ask... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ask composite(List<ask> $$0) {
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

   static ask fromPair(ask $$0, ask $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ask fromList(List<ask> $$0) {
      return $$1 -> {
         for (ask $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
