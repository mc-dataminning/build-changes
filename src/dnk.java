import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dnk extends dih implements dib {
   public static final MapCodec<dnk> a = b(dnk::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dvx d = dvt.R;
   public static final dwd e = dvt.S;
   private static final BiFunction<jl, Integer, fab> f = ad.a(
      ($$0, $$1) -> {
         fab[] $$2 = new fab[]{
            dhy.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dhy.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dhy.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dhy.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         fab $$3 = ezy.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ezy.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   protected dnk(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jl.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public dvd a(dvd $$0, dol $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dvd $$0, czm $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dvd a(czm $$0) {
      dvd $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.m().b(d, $$0.g().g());
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return true;
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cvx(this));
      }
   }
}
