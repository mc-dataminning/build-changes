import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface awi {
   awi a = $$0 -> true;

   boolean accept(awj var1);

   static awi codepoint(int $$0, wr $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static awi forward(String $$0, wr $$1) {
      return $$0.isEmpty() ? a : $$2 -> axp.a($$0, $$1, $$2);
   }

   static awi forward(String $$0, wr $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> axp.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static awi backward(String $$0, wr $$1) {
      return $$0.isEmpty() ? a : $$2 -> axp.b($$0, $$1, $$2);
   }

   static awi backward(String $$0, wr $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> axp.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static awj decorateOutput(awj $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static awi composite() {
      return a;
   }

   static awi composite(awi $$0) {
      return $$0;
   }

   static awi composite(awi $$0, awi $$1) {
      return fromPair($$0, $$1);
   }

   static awi composite(awi... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static awi composite(List<awi> $$0) {
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

   static awi fromPair(awi $$0, awi $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static awi fromList(List<awi> $$0) {
      return $$1 -> {
         for (awi $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
