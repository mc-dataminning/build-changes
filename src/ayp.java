import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ayp {
   ayp a = $$0 -> true;

   boolean accept(ayq var1);

   static ayp codepoint(int $$0, ya $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ayp forward(String $$0, ya $$1) {
      return $$0.isEmpty() ? a : $$2 -> azy.a($$0, $$1, $$2);
   }

   static ayp forward(String $$0, ya $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azy.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayp backward(String $$0, ya $$1) {
      return $$0.isEmpty() ? a : $$2 -> azy.b($$0, $$1, $$2);
   }

   static ayp backward(String $$0, ya $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azy.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayq decorateOutput(ayq $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ayp composite() {
      return a;
   }

   static ayp composite(ayp $$0) {
      return $$0;
   }

   static ayp composite(ayp $$0, ayp $$1) {
      return fromPair($$0, $$1);
   }

   static ayp composite(ayp... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ayp composite(List<ayp> $$0) {
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

   static ayp fromPair(ayp $$0, ayp $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ayp fromList(List<ayp> $$0) {
      return $$1 -> {
         for (ayp $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
