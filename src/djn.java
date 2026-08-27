import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class djn extends dej implements ded {
   public static final MapCodec<djn> a = b(djn::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final drx d = drt.R;
   public static final dsd e = drt.S;
   private static final BiFunction<it, Integer, evf> f = ac.a(
      ($$0, $$1) -> {
         evf[] $$2 = new evf[]{
            dea.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dea.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dea.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dea.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         evf $$3 = evc.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = evc.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   protected djn(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, it.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public drd a(drd $$0, dkn $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(drd $$0, cxb $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public drd a(cxb $$0) {
      drd $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.n().a(d, $$0.g().g());
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return true;
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new ctq(this));
      }
   }
}
