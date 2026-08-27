import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class csy extends crc implements czl {
   public static final int c = 1;
   public static final int d = 4;
   public static final dfy e = dfo.az;
   public static final dfp f = crc.b;
   public static final dfp g = dfo.C;
   public static final ToIntFunction<dey> h = $$0 -> $$0.c(f) ? 3 * $$0.c(e) : 0;
   private static final Int2ObjectMap<List<ehf>> i = ac.a(() -> {
      Int2ObjectMap<List<ehf>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ehf(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ehf(0.375, 0.44, 0.5), new ehf(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ehf(0.5, 0.313, 0.625), new ehf(0.375, 0.44, 0.5), new ehf(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ehf(0.44, 0.313, 0.56), new ehf(0.625, 0.44, 0.56), new ehf(0.375, 0.44, 0.375), new ehf(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ehy j = csk.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ehy k = csk.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ehy l = csk.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ehy m = csk.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   public csy(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Integer.valueOf(1)).a(f, Boolean.valueOf(false)).a(g, Boolean.valueOf(false)));
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$3.fR().e && $$3.b($$4).b() && $$0.c(f)) {
         a($$3, $$0, $$1, $$2);
         return bgo.a($$1.B);
      } else {
         return bgo.d;
      }
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dey a(cle $$0) {
      dey $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(e);
      } else {
         eab $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eac.c;
         return super.a($$0).a(g, Boolean.valueOf($$3));
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(g) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      switch ($$0.c(e)) {
         case 1:
         default:
            return j;
         case 2:
            return k;
         case 3:
            return l;
         case 4:
            return m;
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(e, f, g);
   }

   @Override
   public boolean a(cpl $$0, gv $$1, dey $$2, eab $$3) {
      if (!$$2.c(g) && $$3.a() == eac.c) {
         dey $$4 = $$2.a(g, Boolean.valueOf(true));
         if ($$2.c(f)) {
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

   public static boolean g(dey $$0) {
      return $$0.a(apj.ae, $$0x -> $$0x.b(f) && $$0x.b(g)) && !$$0.c(f) && !$$0.c(g);
   }

   @Override
   protected Iterable<ehf> b(dey $$0) {
      return (Iterable<ehf>)i.get($$0.c(e));
   }

   @Override
   protected boolean d(dey $$0) {
      return !$$0.c(g) && super.d($$0);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return csk.a($$1, $$2.d(), hb.b);
   }
}
