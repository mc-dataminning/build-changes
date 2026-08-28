import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dks extends dfo implements dfi {
   public static final MapCodec<dks> a = b(dks::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dtb d = dsx.R;
   public static final dth e = dsx.S;
   private static final BiFunction<jf, Integer, ews> f = ac.a(
      ($$0, $$1) -> {
         ews[] $$2 = new ews[]{
            dff.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dff.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dff.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dff.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ews $$3 = ewp.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ewp.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   protected dks(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, jf.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dsh a(dsh $$0, dls $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dsh $$0, cxk $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return true;
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cua(this));
      }
   }
}
