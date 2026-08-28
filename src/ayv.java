import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ayv {
   ayv a = $$0 -> true;

   boolean accept(ayw var1);

   static ayv codepoint(int $$0, ye $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ayv forward(String $$0, ye $$1) {
      return $$0.isEmpty() ? a : $$2 -> bae.a($$0, $$1, $$2);
   }

   static ayv forward(String $$0, ye $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> bae.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayv backward(String $$0, ye $$1) {
      return $$0.isEmpty() ? a : $$2 -> bae.b($$0, $$1, $$2);
   }

   static ayv backward(String $$0, ye $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> bae.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayw decorateOutput(ayw $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ayv composite() {
      return a;
   }

   static ayv composite(ayv $$0) {
      return $$0;
   }

   static ayv composite(ayv $$0, ayv $$1) {
      return fromPair($$0, $$1);
   }

   static ayv composite(ayv... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ayv composite(List<ayv> $$0) {
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

   static ayv fromPair(ayv $$0, ayv $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ayv fromList(List<ayv> $$0) {
      return $$1 -> {
         for (ayv $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
