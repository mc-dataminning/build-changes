import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dcn extends daq implements diy {
   public static final MapCodec<dcn> c = b(dcn::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dpz f = dpp.az;
   public static final dpq g = daq.b;
   public static final dpq h = dpp.C;
   public static final ToIntFunction<doz> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<esa>> j = ac.a(() -> {
      Int2ObjectMap<List<esa>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new esa(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new esa(0.375, 0.44, 0.5), new esa(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new esa(0.5, 0.313, 0.625), new esa(0.375, 0.44, 0.5), new esa(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new esa(0.44, 0.313, 0.56), new esa(0.625, 0.44, 0.56), new esa(0.375, 0.44, 0.375), new esa(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final est k = dby.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final est l = dby.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final est m = dby.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final est n = dby.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dcn> a() {
      return c;
   }

   public dcn(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if ($$0.d() && $$4.ga().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return boc.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(doz $$0, cuo $$1) {
      return !$$1.h() && $$1.n().f() == this.p() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public doz a(cuo $$0) {
      doz $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eks $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ekt.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(h) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
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
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(cyy $$0, ib $$1, doz $$2, eks $$3) {
      if (!$$2.c(h) && $$3.a() == ekt.c) {
         doz $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(doz $$0) {
      return $$0.a(avc.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<esa> b(doz $$0) {
      return (Iterable<esa>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(doz $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return dby.a($$1, $$2.d(), ih.b);
   }
}
