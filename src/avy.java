import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface avy {
   avy a = $$0 -> true;

   boolean accept(avz var1);

   static avy codepoint(int $$0, wp $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static avy forward(String $$0, wp $$1) {
      return $$0.isEmpty() ? a : $$2 -> axf.a($$0, $$1, $$2);
   }

   static avy forward(String $$0, wp $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> axf.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static avy backward(String $$0, wp $$1) {
      return $$0.isEmpty() ? a : $$2 -> axf.b($$0, $$1, $$2);
   }

   static avy backward(String $$0, wp $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> axf.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static avz decorateOutput(avz $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static avy composite() {
      return a;
   }

   static avy composite(avy $$0) {
      return $$0;
   }

   static avy composite(avy $$0, avy $$1) {
      return fromPair($$0, $$1);
   }

   static avy composite(avy... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static avy composite(List<avy> $$0) {
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

   static avy fromPair(avy $$0, avy $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static avy fromList(List<avy> $$0) {
      return $$1 -> {
         for (avy $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
