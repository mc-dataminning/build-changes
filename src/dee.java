import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dee extends czb implements cyv {
   public static final MapCodec<dee> a = b(dee::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dmd d = dlz.R;
   public static final dmj e = dlz.S;
   private static final BiFunction<ie, Integer, eos> f = ac.a(
      ($$0, $$1) -> {
         eos[] $$2 = new eos[]{
            cys.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            cys.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            cys.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            cys.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         eos $$3 = eop.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = eop.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   protected dee(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ie.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dlj a(dlj $$0, dfe $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dlj $$0, crk $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dlj a(crk $$0) {
      dlj $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return true;
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cpd(this));
      }
   }
}
