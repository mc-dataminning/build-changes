import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface arf {
   arf a = $$0 -> true;

   boolean accept(arg var1);

   static arf codepoint(int $$0, ue $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static arf forward(String $$0, ue $$1) {
      return $$0.isEmpty() ? a : $$2 -> asj.a($$0, $$1, $$2);
   }

   static arf forward(String $$0, ue $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> asj.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static arf backward(String $$0, ue $$1) {
      return $$0.isEmpty() ? a : $$2 -> asj.b($$0, $$1, $$2);
   }

   static arf backward(String $$0, ue $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> asj.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static arg decorateOutput(arg $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static arf composite() {
      return a;
   }

   static arf composite(arf $$0) {
      return $$0;
   }

   static arf composite(arf $$0, arf $$1) {
      return fromPair($$0, $$1);
   }

   static arf composite(arf... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static arf composite(List<arf> $$0) {
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

   static arf fromPair(arf $$0, arf $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static arf fromList(List<arf> $$0) {
      return $$1 -> {
         for (arf $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
