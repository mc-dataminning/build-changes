import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface ayz {
   ayz a = $$0 -> true;

   boolean accept(aza var1);

   static ayz codepoint(int $$0, yi $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static ayz forward(String $$0, yi $$1) {
      return $$0.isEmpty() ? a : $$2 -> bai.a($$0, $$1, $$2);
   }

   static ayz forward(String $$0, yi $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> bai.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static ayz backward(String $$0, yi $$1) {
      return $$0.isEmpty() ? a : $$2 -> bai.b($$0, $$1, $$2);
   }

   static ayz backward(String $$0, yi $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> bai.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static aza decorateOutput(aza $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static ayz composite() {
      return a;
   }

   static ayz composite(ayz $$0) {
      return $$0;
   }

   static ayz composite(ayz $$0, ayz $$1) {
      return fromPair($$0, $$1);
   }

   static ayz composite(ayz... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static ayz composite(List<ayz> $$0) {
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

   static ayz fromPair(ayz $$0, ayz $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static ayz fromList(List<ayz> $$0) {
      return $$1 -> {
         for (ayz $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
