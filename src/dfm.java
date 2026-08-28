import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dfm extends ddp implements dly {
   public static final MapCodec<dfm> c = b(dfm::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dta f = dsq.az;
   public static final dsr g = ddp.b;
   public static final dsr h = dsq.C;
   public static final ToIntFunction<dsa> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<evp>> j = ac.a(() -> {
      Int2ObjectMap<List<evp>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new evp(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new evp(0.375, 0.44, 0.5), new evp(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new evp(0.5, 0.313, 0.625), new evp(0.375, 0.44, 0.5), new evp(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new evp(0.44, 0.313, 0.56), new evp(0.625, 0.44, 0.56), new evp(0.375, 0.44, 0.375), new evp(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ewi k = dex.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ewi l = dex.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ewi m = dex.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ewi n = dex.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dfm> a() {
      return c;
   }

   public dfm(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if ($$0.e() && $$4.gd().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bqu.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dsa $$0, cxy $$1) {
      return !$$1.h() && $$1.n().g() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ent $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == enu.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(h) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
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
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dbx $$0, iz $$1, dsa $$2, ent $$3) {
      if (!$$2.c(h) && $$3.a() == enu.c) {
         dsa $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dsa $$0) {
      return $$0.a(awo.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<evp> b(dsa $$0) {
      return (Iterable<evp>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dsa $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return dex.a($$1, $$2.d(), je.b);
   }
}
