import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dgn extends deq implements dna {
   public static final MapCodec<dgn> c = b(dgn::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final duc f = dts.az;
   public static final dtt g = deq.b;
   public static final dtt h = dts.C;
   public static final ToIntFunction<dtc> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<exa>> j = ad.a(() -> {
      Int2ObjectMap<List<exa>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new exa(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new exa(0.375, 0.44, 0.5), new exa(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new exa(0.5, 0.313, 0.625), new exa(0.375, 0.44, 0.5), new exa(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new exa(0.44, 0.313, 0.56), new exa(0.625, 0.44, 0.56), new exa(0.375, 0.44, 0.375), new exa(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ext k = dfy.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ext l = dfy.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ext m = dfy.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ext n = dfy.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dgn> a() {
      return c;
   }

   public dgn(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, eww $$6) {
      if ($$0.e() && $$4.ga().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bqt.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      return !$$1.h() && $$1.n().g() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         epc $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == epd.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, epd.c, epd.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(h) ? epd.c.a(false) : super.b_($$0);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
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
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dcx $$0, jd $$1, dtc $$2, epc $$3) {
      if (!$$2.c(h) && $$3.a() == epd.c) {
         dtc $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dtc $$0) {
      return $$0.a(awe.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<exa> b(dtc $$0) {
      return (Iterable<exa>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dtc $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return dfy.a($$1, $$2.e(), ji.b);
   }
}
