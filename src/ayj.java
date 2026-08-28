import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ayj {
   ayj a = $$0 -> true;

   boolean accept(ayk var1);

   static ayj codepoint(int $$0, yl $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ayj forward(String $$0, yl $$1) {
      return $$0.isEmpty() ? a : $$2 -> azr.a($$0, $$1, $$2);
   }

   static ayj forward(String $$0, yl $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azr.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayj backward(String $$0, yl $$1) {
      return $$0.isEmpty() ? a : $$2 -> azr.b($$0, $$1, $$2);
   }

   static ayj backward(String $$0, yl $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azr.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayk decorateOutput(ayk $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ayj composite() {
      return a;
   }

   static ayj composite(ayj $$0) {
      return $$0;
   }

   static ayj composite(ayj $$0, ayj $$1) {
      return fromPair($$0, $$1);
   }

   static ayj composite(ayj... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ayj composite(List<ayj> $$0) {
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

   static ayj fromPair(ayj $$0, ayj $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ayj fromList(List<ayj> $$0) {
      return $$1 -> {
         for (ayj $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
