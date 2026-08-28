import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface aya {
   aya a = $$0 -> true;

   boolean accept(ayb var1);

   static aya codepoint(int $$0, xw $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static aya forward(String $$0, xw $$1) {
      return $$0.isEmpty() ? a : $$2 -> azj.a($$0, $$1, $$2);
   }

   static aya forward(String $$0, xw $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azj.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static aya backward(String $$0, xw $$1) {
      return $$0.isEmpty() ? a : $$2 -> azj.b($$0, $$1, $$2);
   }

   static aya backward(String $$0, xw $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azj.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayb decorateOutput(ayb $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static aya composite() {
      return a;
   }

   static aya composite(aya $$0) {
      return $$0;
   }

   static aya composite(aya $$0, aya $$1) {
      return fromPair($$0, $$1);
   }

   static aya composite(aya... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static aya composite(List<aya> $$0) {
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

   static aya fromPair(aya $$0, aya $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static aya fromList(List<aya> $$0) {
      return $$1 -> {
         for (aya $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
