import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface arl {
   arl a = $$0 -> true;

   boolean accept(arm var1);

   static arl codepoint(int $$0, uj $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static arl forward(String $$0, uj $$1) {
      return $$0.isEmpty() ? a : $$2 -> asq.a($$0, $$1, $$2);
   }

   static arl forward(String $$0, uj $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> asq.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static arl backward(String $$0, uj $$1) {
      return $$0.isEmpty() ? a : $$2 -> asq.b($$0, $$1, $$2);
   }

   static arl backward(String $$0, uj $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> asq.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static arm decorateOutput(arm $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static arl composite() {
      return a;
   }

   static arl composite(arl $$0) {
      return $$0;
   }

   static arl composite(arl $$0, arl $$1) {
      return fromPair($$0, $$1);
   }

   static arl composite(arl... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static arl composite(List<arl> $$0) {
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

   static arl fromPair(arl $$0, arl $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static arl fromList(List<arl> $$0) {
      return $$1 -> {
         for (arl $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
