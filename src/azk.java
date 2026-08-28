import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface azk {
   azk a = $$0 -> true;

   boolean accept(azl var1);

   static azk codepoint(int $$0, yd $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static azk forward(String $$0, yd $$1) {
      return $$0.isEmpty() ? a : $$2 -> baw.a($$0, $$1, $$2);
   }

   static azk forward(String $$0, yd $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> baw.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static azk backward(String $$0, yd $$1) {
      return $$0.isEmpty() ? a : $$2 -> baw.b($$0, $$1, $$2);
   }

   static azk backward(String $$0, yd $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> baw.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static azl decorateOutput(azl $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static azk composite() {
      return a;
   }

   static azk composite(azk $$0) {
      return $$0;
   }

   static azk composite(azk $$0, azk $$1) {
      return fromPair($$0, $$1);
   }

   static azk composite(azk... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static azk composite(List<azk> $$0) {
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

   static azk fromPair(azk $$0, azk $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static azk fromList(List<azk> $$0) {
      return $$1 -> {
         for (azk $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
