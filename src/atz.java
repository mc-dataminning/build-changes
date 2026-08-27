import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface atz {
   atz a = $$0 -> true;

   boolean accept(aua var1);

   static atz codepoint(int $$0, wc $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static atz forward(String $$0, wc $$1) {
      return $$0.isEmpty() ? a : $$2 -> avi.a($$0, $$1, $$2);
   }

   static atz forward(String $$0, wc $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> avi.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static atz backward(String $$0, wc $$1) {
      return $$0.isEmpty() ? a : $$2 -> avi.b($$0, $$1, $$2);
   }

   static atz backward(String $$0, wc $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> avi.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static aua decorateOutput(aua $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static atz composite() {
      return a;
   }

   static atz composite(atz $$0) {
      return $$0;
   }

   static atz composite(atz $$0, atz $$1) {
      return fromPair($$0, $$1);
   }

   static atz composite(atz... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static atz composite(List<atz> $$0) {
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

   static atz fromPair(atz $$0, atz $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static atz fromList(List<atz> $$0) {
      return $$1 -> {
         for (atz $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
