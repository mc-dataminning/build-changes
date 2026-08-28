import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dmi extends dhe implements dgy {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final duu d = duq.R;
   public static final dva e = duq.S;
   private static final BiFunction<jj, Integer, eyx> f = ad.a(
      ($$0, $$1) -> {
         eyx[] $$2 = new eyx[]{
            dgv.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dgv.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dgv.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dgv.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         eyx $$3 = eyu.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = eyu.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   protected dmi(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(d, jj.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public dua a(dua $$0, dnj $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dua $$0, cyw $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dua a(cyw $$0) {
      dua $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().b(d, $$0.g().g());
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return true;
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cvl(this));
      }
   }
}
