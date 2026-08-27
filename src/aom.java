import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface aom {
   aom a = $$0 -> true;

   boolean accept(aon var1);

   static aom codepoint(int $$0, ts $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static aom forward(String $$0, ts $$1) {
      return $$0.isEmpty() ? a : $$2 -> apq.a($$0, $$1, $$2);
   }

   static aom forward(String $$0, ts $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> apq.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static aom backward(String $$0, ts $$1) {
      return $$0.isEmpty() ? a : $$2 -> apq.b($$0, $$1, $$2);
   }

   static aom backward(String $$0, ts $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> apq.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static aon decorateOutput(aon $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static aom composite() {
      return a;
   }

   static aom composite(aom $$0) {
      return $$0;
   }

   static aom composite(aom $$0, aom $$1) {
      return fromPair($$0, $$1);
   }

   static aom composite(aom... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static aom composite(List<aom> $$0) {
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

   static aom fromPair(aom $$0, aom $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static aom fromList(List<aom> $$0) {
      return $$1 -> {
         for (aom $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
