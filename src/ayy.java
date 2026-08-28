import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ayy {
   ayy a = $$0 -> true;

   boolean accept(ayz var1);

   static ayy codepoint(int $$0, xv $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ayy forward(String $$0, xv $$1) {
      return $$0.isEmpty() ? a : $$2 -> baj.a($$0, $$1, $$2);
   }

   static ayy forward(String $$0, xv $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> baj.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayy backward(String $$0, xv $$1) {
      return $$0.isEmpty() ? a : $$2 -> baj.b($$0, $$1, $$2);
   }

   static ayy backward(String $$0, xv $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> baj.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayz decorateOutput(ayz $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ayy composite() {
      return a;
   }

   static ayy composite(ayy $$0) {
      return $$0;
   }

   static ayy composite(ayy $$0, ayy $$1) {
      return fromPair($$0, $$1);
   }

   static ayy composite(ayy... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ayy composite(List<ayy> $$0) {
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

   static ayy fromPair(ayy $$0, ayy $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ayy fromList(List<ayy> $$0) {
      return $$1 -> {
         for (ayy $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
