import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface avt {
   avt a = $$0 -> true;

   boolean accept(avu var1);

   static avt codepoint(int $$0, wn $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static avt forward(String $$0, wn $$1) {
      return $$0.isEmpty() ? a : $$2 -> axb.a($$0, $$1, $$2);
   }

   static avt forward(String $$0, wn $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> axb.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static avt backward(String $$0, wn $$1) {
      return $$0.isEmpty() ? a : $$2 -> axb.b($$0, $$1, $$2);
   }

   static avt backward(String $$0, wn $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> axb.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static avu decorateOutput(avu $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply($$4));
   }

   static avt composite() {
      return a;
   }

   static avt composite(avt $$0) {
      return $$0;
   }

   static avt composite(avt $$0, avt $$1) {
      return fromPair($$0, $$1);
   }

   static avt composite(avt... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static avt composite(List<avt> $$0) {
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

   static avt fromPair(avt $$0, avt $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static avt fromList(List<avt> $$0) {
      return $$1 -> {
         for (avt $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
