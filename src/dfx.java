import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dfx extends dea implements dmj {
   public static final MapCodec<dfx> c = b(dfx::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dtl f = dtb.az;
   public static final dtc g = dea.b;
   public static final dtc h = dtb.C;
   public static final ToIntFunction<dsl> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ewh>> j = ac.a(() -> {
      Int2ObjectMap<List<ewh>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ewh(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ewh(0.375, 0.44, 0.5), new ewh(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ewh(0.5, 0.313, 0.625), new ewh(0.375, 0.44, 0.5), new ewh(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ewh(0.44, 0.313, 0.56), new ewh(0.625, 0.44, 0.56), new ewh(0.375, 0.44, 0.375), new ewh(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final exa k = dfi.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final exa l = dfi.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final exa m = dfi.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final exa n = dfi.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dfx> a() {
      return c;
   }

   public dfx(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if ($$0.e() && $$4.gb().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bqj.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dsl $$0, cxn $$1) {
      return !$$1.h() && $$1.n().g() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eoj $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eok.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(h) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
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
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dch $$0, ja $$1, dsl $$2, eoj $$3) {
      if (!$$2.c(h) && $$3.a() == eok.c) {
         dsl $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dsl $$0) {
      return $$0.a(avw.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ewh> b(dsl $$0) {
      return (Iterable<ewh>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dsl $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return dfi.a($$1, $$2.d(), jf.b);
   }
}
