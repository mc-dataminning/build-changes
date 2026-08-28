import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ayo {
   ayo a = $$0 -> true;

   boolean accept(ayp var1);

   static ayo codepoint(int $$0, ya $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ayo forward(String $$0, ya $$1) {
      return $$0.isEmpty() ? a : $$2 -> azx.a($$0, $$1, $$2);
   }

   static ayo forward(String $$0, ya $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azx.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayo backward(String $$0, ya $$1) {
      return $$0.isEmpty() ? a : $$2 -> azx.b($$0, $$1, $$2);
   }

   static ayo backward(String $$0, ya $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azx.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayp decorateOutput(ayp $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ayo composite() {
      return a;
   }

   static ayo composite(ayo $$0) {
      return $$0;
   }

   static ayo composite(ayo $$0, ayo $$1) {
      return fromPair($$0, $$1);
   }

   static ayo composite(ayo... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ayo composite(List<ayo> $$0) {
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

   static ayo fromPair(ayo $$0, ayo $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ayo fromList(List<ayo> $$0) {
      return $$1 -> {
         for (ayo $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
