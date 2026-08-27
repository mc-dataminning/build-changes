import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dam extends cvj implements cvd {
   public static final MapCodec<dam> a = b(dam::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dic d = dhy.R;
   public static final dii e = dhy.S;
   private static final BiFunction<hx, Integer, ekn> f = ac.a(
      ($$0, $$1) -> {
         ekn[] $$2 = new ekn[]{
            cva.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            cva.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            cva.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            cva.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ekn $$3 = ekk.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ekk.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dam> a() {
      return a;
   }

   protected dam(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, hx.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dhi $$0, cnr $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return true;
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new clj(this));
      }
   }
}
