import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eax extends dzx<ecq> {
   public eax(Codec<ecq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<ecq> $$0) {
      ecq $$1 = $$0.f();
      dbs $$2 = $$0.b();
      ayk $$3 = $$0.d();
      ddy $$4 = $$1.b.b();
      io $$5 = a($$2, $$0.e().j().a(it.a.b, $$2.I_() + 1, $$2.al() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (io $$11 : io.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            drb $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static io a(day $$0, io.a $$1, ddy $$2) {
      while ($$1.v() > $$0.I_() + 1) {
         drb $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(it.a);
      }

      return null;
   }
}
