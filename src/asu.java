import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface asu {
   asu a = $$0 -> true;

   boolean accept(asv var1);

   static asu codepoint(int $$0, vo $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static asu forward(String $$0, vo $$1) {
      return $$0.isEmpty() ? a : $$2 -> aua.a($$0, $$1, $$2);
   }

   static asu forward(String $$0, vo $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> aua.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static asu backward(String $$0, vo $$1) {
      return $$0.isEmpty() ? a : $$2 -> aua.b($$0, $$1, $$2);
   }

   static asu backward(String $$0, vo $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> aua.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static asv decorateOutput(asv $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static asu composite() {
      return a;
   }

   static asu composite(asu $$0) {
      return $$0;
   }

   static asu composite(asu $$0, asu $$1) {
      return fromPair($$0, $$1);
   }

   static asu composite(asu... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static asu composite(List<asu> $$0) {
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

   static asu fromPair(asu $$0, asu $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static asu fromList(List<asu> $$0) {
      return $$1 -> {
         for (asu $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
