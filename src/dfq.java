import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dfq extends ddt implements dmc {
   public static final MapCodec<dfq> c = b(dfq::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dte f = dsu.az;
   public static final dsv g = ddt.b;
   public static final dsv h = dsu.C;
   public static final ToIntFunction<dse> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<evt>> j = ac.a(() -> {
      Int2ObjectMap<List<evt>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new evt(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new evt(0.375, 0.44, 0.5), new evt(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new evt(0.5, 0.313, 0.625), new evt(0.375, 0.44, 0.5), new evt(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new evt(0.44, 0.313, 0.56), new evt(0.625, 0.44, 0.56), new evt(0.375, 0.44, 0.375), new evt(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ewm k = dfb.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ewm l = dfb.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ewm m = dfb.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ewm n = dfb.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dfq> a() {
      return c;
   }

   public dfq(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if ($$0.e() && $$4.gd().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bqy.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dse $$0, cyc $$1) {
      return !$$1.h() && $$1.n().g() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dse a(cyc $$0) {
      dse $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         enx $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eny.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(h) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      switch ($$0.c(f)) {
         case 1:
         default:
            return k;
         case 2:
            return l;
         case 3:
            return m;
         case 4:
            return n;
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dcb $$0, iz $$1, dse $$2, enx $$3) {
      if (!$$2.c(h) && $$3.a() == eny.c) {
         dse $$4 = $$2.a(h, Boolean.valueOf(true));
         if ($$2.c(g)) {
            a(null, $$4, $$0, $$1);
         } else {
            $$0.a($$1, $$4, 3);
         }

         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(dse $$0) {
      return $$0.a(awp.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<evt> b(dse $$0) {
      return (Iterable<evt>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dse $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return dfb.a($$1, $$2.d(), je.b);
   }
}
