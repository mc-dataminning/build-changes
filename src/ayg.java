import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ayg {
   ayg a = $$0 -> true;

   boolean accept(ayh var1);

   static ayg codepoint(int $$0, yi $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ayg forward(String $$0, yi $$1) {
      return $$0.isEmpty() ? a : $$2 -> azo.a($$0, $$1, $$2);
   }

   static ayg forward(String $$0, yi $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azo.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayg backward(String $$0, yi $$1) {
      return $$0.isEmpty() ? a : $$2 -> azo.b($$0, $$1, $$2);
   }

   static ayg backward(String $$0, yi $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azo.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayh decorateOutput(ayh $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ayg composite() {
      return a;
   }

   static ayg composite(ayg $$0) {
      return $$0;
   }

   static ayg composite(ayg $$0, ayg $$1) {
      return fromPair($$0, $$1);
   }

   static ayg composite(ayg... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ayg composite(List<ayg> $$0) {
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

   static ayg fromPair(ayg $$0, ayg $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ayg fromList(List<ayg> $$0) {
      return $$1 -> {
         for (ayg $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
