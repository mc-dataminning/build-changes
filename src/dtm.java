import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dtm extends dtj {
   public dtm(Codec<dux> $$0) {
      super($$0);
   }

   @Override
   protected Set<hx> a(cuk $$0, dux $$1, auv $$2, hx $$3, Predicate<djh> $$4, int $$5, int $$6) {
      Set<hx> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<hx> $$8 = new HashSet<>();
      hx.a $$9 = new hx.a();

      for (hx $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (hx $$11 : $$8) {
         $$0.a($$11, cws.G.o(), 2);
      }

      return $$8;
   }

   private static boolean a(cuk $$0, Set<hx> $$1, hx $$2, hx.a $$3) {
      return a($$0, $$2, $$3, ic.c) || a($$0, $$2, $$3, ic.f) || a($$0, $$2, $$3, ic.d) || a($$0, $$2, $$3, ic.e) || a($$0, $$2, $$3, ic.a);
   }

   private static boolean a(cuk $$0, hx $$1, hx.a $$2, ic $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(cuk $$0, dux $$1, dle $$2, auv $$3, hx $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         djh $$5 = $$0.a_($$4);
         if ($$5.b(djx.C) && !$$5.c(djx.C)) {
            $$0.a($$4, $$5.a(djx.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
