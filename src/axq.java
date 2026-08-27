import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface axq {
   axq a = $$0 -> true;

   boolean accept(axr var1);

   static axq codepoint(int $$0, xu $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static axq forward(String $$0, xu $$1) {
      return $$0.isEmpty() ? a : $$2 -> ayw.a($$0, $$1, $$2);
   }

   static axq forward(String $$0, xu $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ayw.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static axq backward(String $$0, xu $$1) {
      return $$0.isEmpty() ? a : $$2 -> ayw.b($$0, $$1, $$2);
   }

   static axq backward(String $$0, xu $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ayw.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static axr decorateOutput(axr $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static axq composite() {
      return a;
   }

   static axq composite(axq $$0) {
      return $$0;
   }

   static axq composite(axq $$0, axq $$1) {
      return fromPair($$0, $$1);
   }

   static axq composite(axq... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static axq composite(List<axq> $$0) {
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

   static axq fromPair(axq $$0, axq $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static axq fromList(List<axq> $$0) {
      return $$1 -> {
         for (axq $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
