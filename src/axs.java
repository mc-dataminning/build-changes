import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface axs {
   axs a = $$0 -> true;

   boolean accept(axt var1);

   static axs codepoint(int $$0, xr $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static axs forward(String $$0, xr $$1) {
      return $$0.isEmpty() ? a : $$2 -> azb.a($$0, $$1, $$2);
   }

   static axs forward(String $$0, xr $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azb.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static axs backward(String $$0, xr $$1) {
      return $$0.isEmpty() ? a : $$2 -> azb.b($$0, $$1, $$2);
   }

   static axs backward(String $$0, xr $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> azb.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static axt decorateOutput(axt $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static axs composite() {
      return a;
   }

   static axs composite(axs $$0) {
      return $$0;
   }

   static axs composite(axs $$0, axs $$1) {
      return fromPair($$0, $$1);
   }

   static axs composite(axs... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static axs composite(List<axs> $$0) {
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

   static axs fromPair(axs $$0, axs $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static axs fromList(List<axs> $$0) {
      return $$1 -> {
         for (axs $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
