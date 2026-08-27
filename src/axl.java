import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface axl {
   axl a = $$0 -> true;

   boolean accept(axm var1);

   static axl codepoint(int $$0, xr $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static axl forward(String $$0, xr $$1) {
      return $$0.isEmpty() ? a : $$2 -> ays.a($$0, $$1, $$2);
   }

   static axl forward(String $$0, xr $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ays.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static axl backward(String $$0, xr $$1) {
      return $$0.isEmpty() ? a : $$2 -> ays.b($$0, $$1, $$2);
   }

   static axl backward(String $$0, xr $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> ays.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static axm decorateOutput(axm $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static axl composite() {
      return a;
   }

   static axl composite(axl $$0) {
      return $$0;
   }

   static axl composite(axl $$0, axl $$1) {
      return fromPair($$0, $$1);
   }

   static axl composite(axl... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static axl composite(List<axl> $$0) {
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

   static axl fromPair(axl $$0, axl $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static axl fromList(List<axl> $$0) {
      return $$1 -> {
         for (axl $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
