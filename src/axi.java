import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface axi {
   axi a = $$0 -> true;

   boolean accept(axj var1);

   static axi codepoint(int $$0, xp $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static axi forward(String $$0, xp $$1) {
      return $$0.isEmpty() ? a : $$2 -> ayp.a($$0, $$1, $$2);
   }

   static axi forward(String $$0, xp $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ayp.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static axi backward(String $$0, xp $$1) {
      return $$0.isEmpty() ? a : $$2 -> ayp.b($$0, $$1, $$2);
   }

   static axi backward(String $$0, xp $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ayp.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static axj decorateOutput(axj $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static axi composite() {
      return a;
   }

   static axi composite(axi $$0) {
      return $$0;
   }

   static axi composite(axi $$0, axi $$1) {
      return fromPair($$0, $$1);
   }

   static axi composite(axi... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static axi composite(List<axi> $$0) {
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

   static axi fromPair(axi $$0, axi $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static axi fromList(List<axi> $$0) {
      return $$1 -> {
         for (axi $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
