import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dzw extends dzt {
   public dzw(Codec<ebh> $$0) {
      super($$0);
   }

   @Override
   protected Set<id> a(dab $$0, ebh $$1, axt $$2, id $$3, Predicate<dpi> $$4, int $$5, int $$6) {
      Set<id> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<id> $$8 = new HashSet<>();
      id.a $$9 = new id.a();

      for (id $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (id $$11 : $$8) {
         $$0.a($$11, dcj.G.n(), 2);
      }

      return $$8;
   }

   private static boolean a(dab $$0, Set<id> $$1, id $$2, id.a $$3) {
      return a($$0, $$2, $$3, ij.c) || a($$0, $$2, $$3, ij.f) || a($$0, $$2, $$3, ij.d) || a($$0, $$2, $$3, ij.e) || a($$0, $$2, $$3, ij.a);
   }

   private static boolean a(dab $$0, id $$1, id.a $$2, ij $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dab $$0, ebh $$1, drf $$2, axt $$3, id $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dpi $$5 = $$0.a_($$4);
         if ($$5.b(dpy.C) && !$$5.c(dpy.C)) {
            $$0.a($$4, $$5.a(dpy.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
