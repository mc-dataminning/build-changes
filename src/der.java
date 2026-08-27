import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class der extends czo implements czi {
   public static final MapCodec<der> a = b(der::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dmy d = dmu.R;
   public static final dne e = dmu.S;
   private static final BiFunction<ih, Integer, epo> f = ac.a(
      ($$0, $$1) -> {
         epo[] $$2 = new epo[]{
            czf.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            czf.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            czf.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            czf.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         epo $$3 = epl.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = epl.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<der> a() {
      return a;
   }

   protected der(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ih.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dme a(dme $$0, dfr $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dme $$0, crx $$1) {
      return !$$1.h() && $$1.n().a(this.l()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dme a(crx $$0) {
      dme $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return true;
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cpq(this));
      }
   }
}
