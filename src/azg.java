import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface azg {
   azg a = $$0 -> true;

   boolean accept(azh var1);

   static azg codepoint(int $$0, yh $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static azg forward(String $$0, yh $$1) {
      return $$0.isEmpty() ? a : $$2 -> bap.a($$0, $$1, $$2);
   }

   static azg forward(String $$0, yh $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> bap.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static azg backward(String $$0, yh $$1) {
      return $$0.isEmpty() ? a : $$2 -> bap.b($$0, $$1, $$2);
   }

   static azg backward(String $$0, yh $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> bap.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static azh decorateOutput(azh $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static azg composite() {
      return a;
   }

   static azg composite(azg $$0) {
      return $$0;
   }

   static azg composite(azg $$0, azg $$1) {
      return fromPair($$0, $$1);
   }

   static azg composite(azg... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static azg composite(List<azg> $$0) {
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

   static azg fromPair(azg $$0, azg $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static azg fromList(List<azg> $$0) {
      return $$1 -> {
         for (azg $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
