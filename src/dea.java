import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dea extends cyx implements cyr {
   public static final MapCodec<dea> a = b(dea::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dlz d = dlv.R;
   public static final dmf e = dlv.S;
   private static final BiFunction<ie, Integer, eol> f = ac.a(
      ($$0, $$1) -> {
         eol[] $$2 = new eol[]{
            cyo.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            cyo.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            cyo.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            cyo.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         eol $$3 = eoi.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = eoi.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   protected dea(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ie.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dlf a(dlf $$0, dfa $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dlf $$0, crg $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dlf a(crg $$0) {
      dlf $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return true;
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new coz(this));
      }
   }
}
