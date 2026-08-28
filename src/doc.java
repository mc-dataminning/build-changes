import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class doc extends diz implements dit {
   public static final MapCodec<doc> a = b(doc::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dws<jm> d = dwl.R;
   public static final dwu e = dwl.S;
   private static final BiFunction<jm, Integer, fas> f = ae.a(
      ($$0, $$1) -> {
         fas[] $$2 = new fas[]{
            diq.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            diq.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            diq.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            diq.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         fas $$3 = fap.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = fap.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   protected doc(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jm.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public dvv a(dvv $$0, dpd $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dvv $$0, dad $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dvv a(dad $$0) {
      dvv $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.m().b(d, $$0.g().g());
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return true;
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cwm(this));
      }
   }
}
