import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class ctj extends crn implements czw {
   public static final int c = 1;
   public static final int d = 4;
   public static final dgj e = dfz.az;
   public static final dga f = crn.b;
   public static final dga g = dfz.C;
   public static final ToIntFunction<dfj> h = $$0 -> $$0.c(f) ? 3 * $$0.c(e) : 0;
   private static final Int2ObjectMap<List<ehn>> i = ac.a(() -> {
      Int2ObjectMap<List<ehn>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ehn(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ehn(0.375, 0.44, 0.5), new ehn(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ehn(0.5, 0.313, 0.625), new ehn(0.375, 0.44, 0.5), new ehn(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ehn(0.44, 0.313, 0.56), new ehn(0.625, 0.44, 0.56), new ehn(0.375, 0.44, 0.375), new ehn(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eig j = csv.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eig k = csv.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eig l = csv.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eig m = csv.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   public ctj(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Integer.valueOf(1)).a(f, Boolean.valueOf(false)).a(g, Boolean.valueOf(false)));
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$3.fS().e && $$3.b($$4).b() && $$0.c(f)) {
         a($$3, $$0, $$1, $$2);
         return bgy.a($$1.B);
      } else {
         return bgy.d;
      }
   }

   @Override
   public boolean a(dfj $$0, cln $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dfj a(cln $$0) {
      dfj $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(e);
      } else {
         eam $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ean.c;
         return super.a($$0).a(g, Boolean.valueOf($$3));
      }
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(g) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
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
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(e, f, g);
   }

   @Override
   public boolean a(cpw $$0, gw $$1, dfj $$2, eam $$3) {
      if (!$$2.c(g) && $$3.a() == ean.c) {
         dfj $$4 = $$2.a(g, Boolean.valueOf(true));
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

   public static boolean g(dfj $$0) {
      return $$0.a(apt.ae, $$0x -> $$0x.b(f) && $$0x.b(g)) && !$$0.c(f) && !$$0.c(g);
   }

   @Override
   protected Iterable<ehn> b(dfj $$0) {
      return (Iterable<ehn>)i.get($$0.c(e));
   }

   @Override
   protected boolean d(dfj $$0) {
      return !$$0.c(g) && super.d($$0);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return csv.a($$1, $$2.d(), hc.b);
   }
}
