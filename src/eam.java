import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class eam extends eaj {
   public eam(Codec<ebx> $$0) {
      super($$0);
   }

   @Override
   protected Set<im> a(dap $$0, ebx $$1, ayd $$2, im $$3, Predicate<dpy> $$4, int $$5, int $$6) {
      Set<im> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<im> $$8 = new HashSet<>();
      im.a $$9 = new im.a();

      for (im $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (im $$11 : $$8) {
         $$0.a($$11, dcx.G.n(), 2);
      }

      return $$8;
   }

   private static boolean a(dap $$0, Set<im> $$1, im $$2, im.a $$3) {
      return a($$0, $$2, $$3, ir.c) || a($$0, $$2, $$3, ir.f) || a($$0, $$2, $$3, ir.d) || a($$0, $$2, $$3, ir.e) || a($$0, $$2, $$3, ir.a);
   }

   private static boolean a(dap $$0, im $$1, im.a $$2, ir $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dap $$0, ebx $$1, drv $$2, ayd $$3, im $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dpy $$5 = $$0.a_($$4);
         if ($$5.b(dqo.C) && !$$5.c(dqo.C)) {
            $$0.a($$4, $$5.a(dqo.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
