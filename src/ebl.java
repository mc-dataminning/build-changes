import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ebl extends dzx<ecz> {
   public ebl(Codec<ecz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<ecz> $$0) {
      dbs $$1 = $$0.b();
      io $$2 = $$0.e();
      ecz $$3 = $$0.f();
      ayk $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         io $$6 = $$2.h($$5.getAsInt());
         js $$7 = new js($$3.c, $$3.c, $$3.c);
         ehb $$8 = ehb.a($$6.b($$7), $$6.a($$7));
         return io.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dea.kJ.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dbs $$0, io $$1, ecz $$2) {
      Predicate<drb> $$3 = $$0x -> $$0x.a(dea.G);
      Predicate<drb> $$4 = $$0x -> !$$0x.a(dea.G);
      Optional<dwj> $$5 = dwj.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dwj::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dbs $$0, io $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (it $$2 : it.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(day $$0, io $$1) {
      drb $$2 = $$0.a_($$1);
      return $$2.a(dea.G) || $$2.i();
   }
}
