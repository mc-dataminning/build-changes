import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface atc {
   atc a = $$0 -> true;

   boolean accept(atd var1);

   static atc codepoint(int $$0, vs $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static atc forward(String $$0, vs $$1) {
      return $$0.isEmpty() ? a : $$2 -> auj.a($$0, $$1, $$2);
   }

   static atc forward(String $$0, vs $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> auj.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static atc backward(String $$0, vs $$1) {
      return $$0.isEmpty() ? a : $$2 -> auj.b($$0, $$1, $$2);
   }

   static atc backward(String $$0, vs $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> auj.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static atd decorateOutput(atd $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static atc composite() {
      return a;
   }

   static atc composite(atc $$0) {
      return $$0;
   }

   static atc composite(atc $$0, atc $$1) {
      return fromPair($$0, $$1);
   }

   static atc composite(atc... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static atc composite(List<atc> $$0) {
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

   static atc fromPair(atc $$0, atc $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static atc fromList(List<atc> $$0) {
      return $$1 -> {
         for (atc $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
