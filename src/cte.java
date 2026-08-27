import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class cte extends cri implements czr {
   public static final int c = 1;
   public static final int d = 4;
   public static final dge e = dfu.az;
   public static final dfv f = cri.b;
   public static final dfv g = dfu.C;
   public static final ToIntFunction<dfe> h = $$0 -> $$0.c(f) ? 3 * $$0.c(e) : 0;
   private static final Int2ObjectMap<List<ehi>> i = ac.a(() -> {
      Int2ObjectMap<List<ehi>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ehi(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ehi(0.375, 0.44, 0.5), new ehi(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ehi(0.5, 0.313, 0.625), new ehi(0.375, 0.44, 0.5), new ehi(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ehi(0.44, 0.313, 0.56), new ehi(0.625, 0.44, 0.56), new ehi(0.375, 0.44, 0.375), new ehi(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eib j = csq.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eib k = csq.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eib l = csq.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eib m = csq.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   public cte(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Integer.valueOf(1)).a(f, Boolean.valueOf(false)).a(g, Boolean.valueOf(false)));
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$3.fR().e && $$3.b($$4).b() && $$0.c(f)) {
         a($$3, $$0, $$1, $$2);
         return bgt.a($$1.B);
      } else {
         return bgt.d;
      }
   }

   @Override
   public boolean a(dfe $$0, cli $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dfe a(cli $$0) {
      dfe $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(e);
      } else {
         eah $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eai.c;
         return super.a($$0).a(g, Boolean.valueOf($$3));
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(g) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
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
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(e, f, g);
   }

   @Override
   public boolean a(cpr $$0, gw $$1, dfe $$2, eah $$3) {
      if (!$$2.c(g) && $$3.a() == eai.c) {
         dfe $$4 = $$2.a(g, Boolean.valueOf(true));
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

   public static boolean g(dfe $$0) {
      return $$0.a(apo.ae, $$0x -> $$0x.b(f) && $$0x.b(g)) && !$$0.c(f) && !$$0.c(g);
   }

   @Override
   protected Iterable<ehi> b(dfe $$0) {
      return (Iterable<ehi>)i.get($$0.c(e));
   }

   @Override
   protected boolean d(dfe $$0) {
      return !$$0.c(g) && super.d($$0);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return csq.a($$1, $$2.d(), hc.b);
   }
}
