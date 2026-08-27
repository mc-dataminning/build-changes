import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class czu extends cxx implements dgf {
   public static final MapCodec<czu> c = b(czu::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dne f = dmu.az;
   public static final dmv g = cxx.b;
   public static final dmv h = dmu.C;
   public static final ToIntFunction<dme> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<eov>> j = ac.a(() -> {
      Int2ObjectMap<List<eov>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new eov(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new eov(0.375, 0.44, 0.5), new eov(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new eov(0.5, 0.313, 0.625), new eov(0.375, 0.44, 0.5), new eov(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new eov(0.44, 0.313, 0.56), new eov(0.625, 0.44, 0.56), new eov(0.375, 0.44, 0.375), new eov(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final epo k = czf.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final epo l = czf.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final epo m = czf.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final epo n = czf.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<czu> a() {
      return c;
   }

   public czu(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if ($$0.b() && $$4.fW().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bmn.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dme $$0, crx $$1) {
      return !$$1.h() && $$1.n().d() == this.l() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dme a(crx $$0) {
      dme $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ehr $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ehs.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(h) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
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
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(cwf $$0, ib $$1, dme $$2, ehr $$3) {
      if (!$$2.c(h) && $$3.a() == ehs.c) {
         dme $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dme $$0) {
      return $$0.a(aue.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<eov> b(dme $$0) {
      return (Iterable<eov>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dme $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return czf.a($$1, $$2.d(), ih.b);
   }
}
