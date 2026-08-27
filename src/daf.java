import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class daf extends cvc implements cuw {
   public static final MapCodec<daf> a = b(daf::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dhq d = dhm.R;
   public static final dhw e = dhm.S;
   private static final BiFunction<hx, Integer, ekb> f = ac.a(
      ($$0, $$1) -> {
         ekb[] $$2 = new ekb[]{
            cut.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            cut.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            cut.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            cut.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ekb $$3 = ejy.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ejy.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<daf> a() {
      return a;
   }

   protected daf(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, hx.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dgw $$0, cnj $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return true;
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new clb(this));
      }
   }
}
