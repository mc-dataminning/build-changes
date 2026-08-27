import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ara {
   ara a = $$0 -> true;

   boolean accept(arb var1);

   static ara codepoint(int $$0, ua $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ara forward(String $$0, ua $$1) {
      return $$0.isEmpty() ? a : $$2 -> ase.a($$0, $$1, $$2);
   }

   static ara forward(String $$0, ua $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ase.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ara backward(String $$0, ua $$1) {
      return $$0.isEmpty() ? a : $$2 -> ase.b($$0, $$1, $$2);
   }

   static ara backward(String $$0, ua $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ase.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static arb decorateOutput(arb $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ara composite() {
      return a;
   }

   static ara composite(ara $$0) {
      return $$0;
   }

   static ara composite(ara $$0, ara $$1) {
      return fromPair($$0, $$1);
   }

   static ara composite(ara... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ara composite(List<ara> $$0) {
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

   static ara fromPair(ara $$0, ara $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ara fromList(List<ara> $$0) {
      return $$1 -> {
         for (ara $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
