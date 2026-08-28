import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class djf extends dhi implements dpr {
   public static final MapCodec<djf> c = b(djf::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dwu f = dwl.az;
   public static final dwm g = dhi.b;
   public static final dwm h = dwl.C;
   public static final ToIntFunction<dvv> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ezy>> j = ae.a(() -> {
      Int2ObjectMap<List<ezy>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ezy(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ezy(0.375, 0.44, 0.5), new ezy(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ezy(0.5, 0.313, 0.625), new ezy(0.375, 0.44, 0.5), new ezy(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ezy(0.44, 0.313, 0.56), new ezy(0.625, 0.44, 0.56), new ezy(0.375, 0.44, 0.375), new ezy(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final fas k = diq.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final fas l = diq.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final fas m = diq.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final fas n = diq.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<djf> a() {
      return c;
   }

   public djf(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if ($$0.f() && $$4.gh().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bsk.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dvv $$0, dad $$1) {
      return !$$1.h() && $$1.n().h() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dvv a(dad $$0) {
      dvv $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         erv $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == erw.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(h) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
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
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dfn $$0, jh $$1, dvv $$2, erv $$3) {
      if (!$$2.c(h) && $$3.a() == erw.c) {
         dvv $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dvv $$0) {
      return $$0.a(axc.af, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ezy> b(dvv $$0) {
      return (Iterable<ezy>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dvv $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return diq.a($$1, $$2.e(), jm.b);
   }
}
