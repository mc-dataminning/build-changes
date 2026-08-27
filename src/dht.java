import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dht extends dcq implements dck {
   public static final MapCodec<dht> a = b(dht::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dqc d = dpy.R;
   public static final dqi e = dpy.S;
   private static final BiFunction<ij, Integer, etc> f = ac.a(
      ($$0, $$1) -> {
         etc[] $$2 = new etc[]{
            dch.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dch.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dch.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dch.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         etc $$3 = esz.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = esz.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   protected dht(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ij.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dpi a(dpi $$0, dit $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dpi $$0, cux $$1) {
      return !$$1.h() && $$1.n().a(this.p()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dpi a(cux $$0) {
      dpi $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.n().a(d, $$0.g().g());
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return true;
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new crs(this));
      }
   }
}
