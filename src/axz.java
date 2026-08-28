import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface axz {
   axz a = $$0 -> true;

   boolean accept(aya var1);

   static axz codepoint(int $$0, xv $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static axz forward(String $$0, xv $$1) {
      return $$0.isEmpty() ? a : $$2 -> azi.a($$0, $$1, $$2);
   }

   static axz forward(String $$0, xv $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azi.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static axz backward(String $$0, xv $$1) {
      return $$0.isEmpty() ? a : $$2 -> azi.b($$0, $$1, $$2);
   }

   static axz backward(String $$0, xv $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azi.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static aya decorateOutput(aya $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static axz composite() {
      return a;
   }

   static axz composite(axz $$0) {
      return $$0;
   }

   static axz composite(axz $$0, axz $$1) {
      return fromPair($$0, $$1);
   }

   static axz composite(axz... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static axz composite(List<axz> $$0) {
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

   static axz fromPair(axz $$0, axz $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static axz fromList(List<axz> $$0) {
      return $$1 -> {
         for (axz $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
