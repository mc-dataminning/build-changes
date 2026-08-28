import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface aza {
   aza a = $$0 -> true;

   boolean accept(azb var1);

   static aza codepoint(int $$0, xx $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static aza forward(String $$0, xx $$1) {
      return $$0.isEmpty() ? a : $$2 -> bal.a($$0, $$1, $$2);
   }

   static aza forward(String $$0, xx $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> bal.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static aza backward(String $$0, xx $$1) {
      return $$0.isEmpty() ? a : $$2 -> bal.b($$0, $$1, $$2);
   }

   static aza backward(String $$0, xx $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> bal.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static azb decorateOutput(azb $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static aza composite() {
      return a;
   }

   static aza composite(aza $$0) {
      return $$0;
   }

   static aza composite(aza $$0, aza $$1) {
      return fromPair($$0, $$1);
   }

   static aza composite(aza... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static aza composite(List<aza> $$0) {
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

   static aza fromPair(aza $$0, aza $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static aza fromList(List<aza> $$0) {
      return $$1 -> {
         for (aza $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
