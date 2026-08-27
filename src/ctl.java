import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class ctl extends crp implements czy {
   public static final int c = 1;
   public static final int d = 4;
   public static final dgl e = dgb.az;
   public static final dgc f = crp.b;
   public static final dgc g = dgb.C;
   public static final ToIntFunction<dfl> h = $$0 -> $$0.c(f) ? 3 * $$0.c(e) : 0;
   private static final Int2ObjectMap<List<ehp>> i = ac.a(() -> {
      Int2ObjectMap<List<ehp>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ehp(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ehp(0.375, 0.44, 0.5), new ehp(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ehp(0.5, 0.313, 0.625), new ehp(0.375, 0.44, 0.5), new ehp(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ehp(0.44, 0.313, 0.56), new ehp(0.625, 0.44, 0.56), new ehp(0.375, 0.44, 0.375), new ehp(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eii j = csx.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eii k = csx.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eii l = csx.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eii m = csx.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   public ctl(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Integer.valueOf(1)).a(f, Boolean.valueOf(false)).a(g, Boolean.valueOf(false)));
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$3.fS().e && $$3.b($$4).b() && $$0.c(f)) {
         a($$3, $$0, $$1, $$2);
         return bha.a($$1.B);
      } else {
         return bha.d;
      }
   }

   @Override
   public boolean a(dfl $$0, clp $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dfl a(clp $$0) {
      dfl $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(e);
      } else {
         eao $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eap.c;
         return super.a($$0).a(g, Boolean.valueOf($$3));
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(g) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
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
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(e, f, g);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfl $$2, eao $$3) {
      if (!$$2.c(g) && $$3.a() == eap.c) {
         dfl $$4 = $$2.a(g, Boolean.valueOf(true));
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

   public static boolean g(dfl $$0) {
      return $$0.a(apu.ae, $$0x -> $$0x.b(f) && $$0x.b(g)) && !$$0.c(f) && !$$0.c(g);
   }

   @Override
   protected Iterable<ehp> b(dfl $$0) {
      return (Iterable<ehp>)i.get($$0.c(e));
   }

   @Override
   protected boolean d(dfl $$0) {
      return !$$0.c(g) && super.d($$0);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return csx.a($$1, $$2.d(), hc.b);
   }
}
