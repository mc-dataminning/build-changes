import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dmw extends dhs implements dhm {
   public static final MapCodec<dmw> a = b(dmw::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dvi d = dve.R;
   public static final dvo e = dve.S;
   private static final BiFunction<jj, Integer, ezm> f = ad.a(
      ($$0, $$1) -> {
         ezm[] $$2 = new ezm[]{
            dhj.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dhj.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dhj.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dhj.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ezm $$3 = ezj.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ezj.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   protected dmw(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jj.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public duo a(duo $$0, dnx $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(duo $$0, czk $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public duo a(czk $$0) {
      duo $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().b(d, $$0.g().g());
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return true;
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cvp(this));
      }
   }
}
