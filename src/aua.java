import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface aua {
   aua a = $$0 -> true;

   boolean accept(aub var1);

   static aua codepoint(int $$0, wc $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static aua forward(String $$0, wc $$1) {
      return $$0.isEmpty() ? a : $$2 -> avj.a($$0, $$1, $$2);
   }

   static aua forward(String $$0, wc $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> avj.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static aua backward(String $$0, wc $$1) {
      return $$0.isEmpty() ? a : $$2 -> avj.b($$0, $$1, $$2);
   }

   static aua backward(String $$0, wc $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> avj.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static aub decorateOutput(aub $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static aua composite() {
      return a;
   }

   static aua composite(aua $$0) {
      return $$0;
   }

   static aua composite(aua $$0, aua $$1) {
      return fromPair($$0, $$1);
   }

   static aua composite(aua... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static aua composite(List<aua> $$0) {
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

   static aua fromPair(aua $$0, aua $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static aua fromList(List<aua> $$0) {
      return $$1 -> {
         for (aua $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
