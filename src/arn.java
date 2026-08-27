import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface arn {
   arn a = $$0 -> true;

   boolean accept(aro var1);

   static arn codepoint(int $$0, ui $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static arn forward(String $$0, ui $$1) {
      return $$0.isEmpty() ? a : $$2 -> ast.a($$0, $$1, $$2);
   }

   static arn forward(String $$0, ui $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ast.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static arn backward(String $$0, ui $$1) {
      return $$0.isEmpty() ? a : $$2 -> ast.b($$0, $$1, $$2);
   }

   static arn backward(String $$0, ui $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ast.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static aro decorateOutput(aro $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static arn composite() {
      return a;
   }

   static arn composite(arn $$0) {
      return $$0;
   }

   static arn composite(arn $$0, arn $$1) {
      return fromPair($$0, $$1);
   }

   static arn composite(arn... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static arn composite(List<arn> $$0) {
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

   static arn fromPair(arn $$0, arn $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static arn fromList(List<arn> $$0) {
      return $$1 -> {
         for (arn $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
