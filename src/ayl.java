import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ayl {
   ayl a = $$0 -> true;

   boolean accept(aym var1);

   static ayl codepoint(int $$0, xl $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ayl forward(String $$0, xl $$1) {
      return $$0.isEmpty() ? a : $$2 -> azu.a($$0, $$1, $$2);
   }

   static ayl forward(String $$0, xl $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azu.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayl backward(String $$0, xl $$1) {
      return $$0.isEmpty() ? a : $$2 -> azu.b($$0, $$1, $$2);
   }

   static ayl backward(String $$0, xl $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azu.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static aym decorateOutput(aym $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ayl composite() {
      return a;
   }

   static ayl composite(ayl $$0) {
      return $$0;
   }

   static ayl composite(ayl $$0, ayl $$1) {
      return fromPair($$0, $$1);
   }

   static ayl composite(ayl... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ayl composite(List<ayl> $$0) {
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

   static ayl fromPair(ayl $$0, ayl $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ayl fromList(List<ayl> $$0) {
      return $$1 -> {
         for (ayl $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
