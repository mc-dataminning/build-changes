import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface azc {
   azc a = $$0 -> true;

   boolean accept(azd var1);

   static azc codepoint(int $$0, xz $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static azc forward(String $$0, xz $$1) {
      return $$0.isEmpty() ? a : $$2 -> ban.a($$0, $$1, $$2);
   }

   static azc forward(String $$0, xz $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ban.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static azc backward(String $$0, xz $$1) {
      return $$0.isEmpty() ? a : $$2 -> ban.b($$0, $$1, $$2);
   }

   static azc backward(String $$0, xz $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ban.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static azd decorateOutput(azd $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static azc composite() {
      return a;
   }

   static azc composite(azc $$0) {
      return $$0;
   }

   static azc composite(azc $$0, azc $$1) {
      return fromPair($$0, $$1);
   }

   static azc composite(azc... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static azc composite(List<azc> $$0) {
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

   static azc fromPair(azc $$0, azc $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static azc fromList(List<azc> $$0) {
      return $$1 -> {
         for (azc $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
