import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface axr {
   axr a = $$0 -> true;

   boolean accept(axs var1);

   static axr codepoint(int $$0, xu $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static axr forward(String $$0, xu $$1) {
      return $$0.isEmpty() ? a : $$2 -> ayy.a($$0, $$1, $$2);
   }

   static axr forward(String $$0, xu $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ayy.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static axr backward(String $$0, xu $$1) {
      return $$0.isEmpty() ? a : $$2 -> ayy.b($$0, $$1, $$2);
   }

   static axr backward(String $$0, xu $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ayy.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static axs decorateOutput(axs $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static axr composite() {
      return a;
   }

   static axr composite(axr $$0) {
      return $$0;
   }

   static axr composite(axr $$0, axr $$1) {
      return fromPair($$0, $$1);
   }

   static axr composite(axr... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static axr composite(List<axr> $$0) {
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

   static axr fromPair(axr $$0, axr $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static axr fromList(List<axr> $$0) {
      return $$1 -> {
         for (axr $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
