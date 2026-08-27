import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class csz extends crd implements czm {
   public static final int c = 1;
   public static final int d = 4;
   public static final dfz e = dfp.az;
   public static final dfq f = crd.b;
   public static final dfq g = dfp.C;
   public static final ToIntFunction<dez> h = $$0 -> $$0.c(f) ? 3 * $$0.c(e) : 0;
   private static final Int2ObjectMap<List<ehd>> i = ac.a(() -> {
      Int2ObjectMap<List<ehd>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ehd(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ehd(0.375, 0.44, 0.5), new ehd(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ehd(0.5, 0.313, 0.625), new ehd(0.375, 0.44, 0.5), new ehd(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ehd(0.44, 0.313, 0.56), new ehd(0.625, 0.44, 0.56), new ehd(0.375, 0.44, 0.375), new ehd(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ehw j = csl.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ehw k = csl.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ehw l = csl.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ehw m = csl.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   public csz(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Integer.valueOf(1)).a(f, Boolean.valueOf(false)).a(g, Boolean.valueOf(false)));
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$3.fR().e && $$3.b($$4).b() && $$0.c(f)) {
         a($$3, $$0, $$1, $$2);
         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   @Override
   public boolean a(dez $$0, clf $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dez a(clf $$0) {
      dez $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(e);
      } else {
         eac $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ead.c;
         return super.a($$0).a(g, Boolean.valueOf($$3));
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(g) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
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
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(e, f, g);
   }

   @Override
   public boolean a(cpm $$0, gu $$1, dez $$2, eac $$3) {
      if (!$$2.c(g) && $$3.a() == ead.c) {
         dez $$4 = $$2.a(g, Boolean.valueOf(true));
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

   public static boolean g(dez $$0) {
      return $$0.a(apl.ae, $$0x -> $$0x.b(f) && $$0x.b(g)) && !$$0.c(f) && !$$0.c(g);
   }

   @Override
   protected Iterable<ehd> b(dez $$0) {
      return (Iterable<ehd>)i.get($$0.c(e));
   }

   @Override
   protected boolean d(dez $$0) {
      return !$$0.c(g) && super.d($$0);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return csl.a($$1, $$2.d(), ha.b);
   }
}
