import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dbl extends cwi implements cwc {
   public static final MapCodec<dbl> a = b(dbl::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final djj d = djf.R;
   public static final djp e = djf.S;
   private static final BiFunction<ia, Integer, elu> f = ac.a(
      ($$0, $$1) -> {
         elu[] $$2 = new elu[]{
            cvz.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            cvz.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            cvz.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            cvz.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         elu $$3 = elr.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = elr.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dbl> a() {
      return a;
   }

   protected dbl(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ia.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dip a(coq $$0) {
      dip $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return true;
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cmh(this));
      }
   }
}
