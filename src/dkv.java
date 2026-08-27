import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dkv extends dfl implements dff {
   public static final MapCodec<dkv> a = b(dkv::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dtw d = dts.R;
   public static final duc e = dts.S;
   private static final BiFunction<iw, Integer, exn> f = ad.a(
      ($$0, $$1) -> {
         exn[] $$2 = new exn[]{
            dfc.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dfc.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dfc.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dfc.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         exn $$3 = exk.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = exk.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   protected dkv(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, iw.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dtc a(dtc $$0, dmd $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dtc $$0, cyd $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.n().a(d, $$0.g().g());
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return true;
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cuh(this));
      }
   }
}
