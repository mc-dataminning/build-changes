import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface avu {
   avu a = $$0 -> true;

   boolean accept(avv var1);

   static avu codepoint(int $$0, wn $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static avu forward(String $$0, wn $$1) {
      return $$0.isEmpty() ? a : $$2 -> axb.a($$0, $$1, $$2);
   }

   static avu forward(String $$0, wn $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> axb.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static avu backward(String $$0, wn $$1) {
      return $$0.isEmpty() ? a : $$2 -> axb.b($$0, $$1, $$2);
   }

   static avu backward(String $$0, wn $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> axb.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static avv decorateOutput(avv $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static avu composite() {
      return a;
   }

   static avu composite(avu $$0) {
      return $$0;
   }

   static avu composite(avu $$0, avu $$1) {
      return fromPair($$0, $$1);
   }

   static avu composite(avu... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static avu composite(List<avu> $$0) {
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

   static avu fromPair(avu $$0, avu $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static avu fromList(List<avu> $$0) {
      return $$1 -> {
         for (avu $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
