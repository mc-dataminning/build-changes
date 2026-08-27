import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class cyn extends ctl implements ctf {
   public static final MapCodec<cyn> a = b(cyn::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dfx d = dft.R;
   public static final dgd e = dft.S;
   private static final BiFunction<ha, Integer, eia> f = ac.a(
      ($$0, $$1) -> {
         eia[] $$2 = new eia[]{
            ctc.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            ctc.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            ctc.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            ctc.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         eia $$3 = ehx.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ehx.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<cyn> a() {
      return a;
   }

   protected cyn(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ha.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dfd $$0, clt $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dfd a(clt $$0) {
      dfd $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return true;
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cjl(this));
      }
   }
}
