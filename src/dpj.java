import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dpj extends dpg {
   public dpj(Codec<dqu> $$0) {
      super($$0);
   }

   @Override
   protected Set<gw> a(cqk $$0, dqu $$1, arx $$2, gw $$3, Predicate<dfe> $$4, int $$5, int $$6) {
      Set<gw> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<gw> $$8 = new HashSet<>();
      gw.a $$9 = new gw.a();

      for (gw $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (gw $$11 : $$8) {
         $$0.a($$11, csr.G.n(), 2);
      }

      return $$8;
   }

   private static boolean a(cqk $$0, Set<gw> $$1, gw $$2, gw.a $$3) {
      return a($$0, $$2, $$3, hc.c) || a($$0, $$2, $$3, hc.f) || a($$0, $$2, $$3, hc.d) || a($$0, $$2, $$3, hc.e) || a($$0, $$2, $$3, hc.a);
   }

   private static boolean a(cqk $$0, gw $$1, gw.a $$2, hc $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(cqk $$0, dqu $$1, dhb $$2, arx $$3, gw $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dfe $$5 = $$0.a_($$4);
         if ($$5.b(dfu.C) && !$$5.c(dfu.C)) {
            $$0.a($$4, $$5.a(dfu.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
