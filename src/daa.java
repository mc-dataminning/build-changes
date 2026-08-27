import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class daa extends def implements cws {
   public static final MapCodec<daa> a = b(daa::new);

   @Override
   public MapCodec<daa> a() {
      return a;
   }

   public daa(djf.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      hx $$4 = $$2.c();
      djg $$5 = cwr.bt.o();
      Optional<ih.c<dyj>> $$6 = $$0.I_().d(ke.aC).b(ra.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         hx $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         djg $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((cws)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            ih<dyj> $$12;
            if ($$1.a(8) == 0) {
               List<drg<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((duk)$$11.get(0).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$12 = $$6.get();
            }

            $$12.a().a($$0, $$0.l().g(), $$1, $$8);
         }
      }
   }
}
