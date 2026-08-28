import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dkv extends dfr implements dfl {
   public static final MapCodec<dkv> a = b(dkv::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dtf d = dtb.R;
   public static final dtl e = dtb.S;
   private static final BiFunction<jf, Integer, exa> f = ac.a(
      ($$0, $$1) -> {
         exa[] $$2 = new exa[]{
            dfi.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dfi.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dfi.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dfi.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         exa $$3 = ewx.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ewx.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   protected dkv(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, jf.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dsl a(dsl $$0, dlv $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dsl $$0, cxn $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return true;
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cud(this));
      }
   }
}
