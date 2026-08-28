import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ayk {
   ayk a = $$0 -> true;

   boolean accept(ayl var1);

   static ayk codepoint(int $$0, yl $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ayk forward(String $$0, yl $$1) {
      return $$0.isEmpty() ? a : $$2 -> azs.a($$0, $$1, $$2);
   }

   static ayk forward(String $$0, yl $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azs.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayk backward(String $$0, yl $$1) {
      return $$0.isEmpty() ? a : $$2 -> azs.b($$0, $$1, $$2);
   }

   static ayk backward(String $$0, yl $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azs.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayl decorateOutput(ayl $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ayk composite() {
      return a;
   }

   static ayk composite(ayk $$0) {
      return $$0;
   }

   static ayk composite(ayk $$0, ayk $$1) {
      return fromPair($$0, $$1);
   }

   static ayk composite(ayk... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ayk composite(List<ayk> $$0) {
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

   static ayk fromPair(ayk $$0, ayk $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ayk fromList(List<ayk> $$0) {
      return $$1 -> {
         for (ayk $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
