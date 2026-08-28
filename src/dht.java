import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dht extends det {
   public static final MapCodec<dht> a = b(dht::new);
   protected static final ewy b = dfh.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ja> c = ja.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ja::i).toList();

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   protected dht(dsj.d $$0) {
      super($$0);
   }

   public static boolean a(dcf $$0, ja $$1, ja $$2) {
      return $$0.a_($$1.a((ke)$$2)).a(avw.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(avw.cw);
   }

   @Override
   protected boolean f_(dsk $$0) {
      return true;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (ja $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lj.s,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return $$0.B ? a($$2, dpr.m, dqk::a) : null;
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bqg.c;
      }
   }

   @Nullable
   @Override
   protected bqk b(dsk $$0, dcf $$1, ja $$2) {
      dpp $$3 = $$1.c_($$2);
      if ($$3 instanceof dqk) {
         wu $$4 = ((bql)$$3).O_();
         return new bqq(($$2x, $$3x, $$4x) -> new cqc($$2x, $$3x, cpt.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
