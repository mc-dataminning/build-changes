import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dfs extends djx implements dck {
   public static final MapCodec<dfs> a = b(dfs::new);

   @Override
   public MapCodec<dfs> a() {
      return a;
   }

   public dfs(dph.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      id $$4 = $$2.c();
      dpi $$5 = dcj.bt.n();
      Optional<in.c<eeu>> $$6 = $$0.H_().d(ku.aF).b(rv.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         id $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dpi $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dck)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            in<eeu> $$12;
            if ($$1.a(8) == 0) {
               List<dxr<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((eav)$$11.get(0).c()).d();
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

   @Override
   public dck.a aq_() {
      return dck.a.a;
   }
}
