import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface axy {
   axy a = $$0 -> true;

   boolean accept(axz var1);

   static axy codepoint(int $$0, yb $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static axy forward(String $$0, yb $$1) {
      return $$0.isEmpty() ? a : $$2 -> azf.a($$0, $$1, $$2);
   }

   static axy forward(String $$0, yb $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azf.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static axy backward(String $$0, yb $$1) {
      return $$0.isEmpty() ? a : $$2 -> azf.b($$0, $$1, $$2);
   }

   static axy backward(String $$0, yb $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azf.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static axz decorateOutput(axz $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static axy composite() {
      return a;
   }

   static axy composite(axy $$0) {
      return $$0;
   }

   static axy composite(axy $$0, axy $$1) {
      return fromPair($$0, $$1);
   }

   static axy composite(axy... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static axy composite(List<axy> $$0) {
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

   static axy fromPair(axy $$0, axy $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static axy fromList(List<axy> $$0) {
      return $$1 -> {
         for (axy $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
