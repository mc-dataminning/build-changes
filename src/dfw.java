import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dfw extends ddz implements dmi {
   public static final MapCodec<dfw> c = b(dfw::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dtk f = dta.az;
   public static final dtb g = ddz.b;
   public static final dtb h = dta.C;
   public static final ToIntFunction<dsk> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ewf>> j = ac.a(() -> {
      Int2ObjectMap<List<ewf>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ewf(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ewf(0.375, 0.44, 0.5), new ewf(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ewf(0.5, 0.313, 0.625), new ewf(0.375, 0.44, 0.5), new ewf(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ewf(0.44, 0.313, 0.56), new ewf(0.625, 0.44, 0.56), new ewf(0.375, 0.44, 0.375), new ewf(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ewy k = dfh.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ewy l = dfh.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ewy m = dfh.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ewy n = dfh.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dfw> a() {
      return c;
   }

   public dfw(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if ($$0.e() && $$4.ga().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bqi.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dsk $$0, cxm $$1) {
      return !$$1.h() && $$1.n().g() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eoh $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eoi.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(h) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
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
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dcg $$0, ja $$1, dsk $$2, eoh $$3) {
      if (!$$2.c(h) && $$3.a() == eoi.c) {
         dsk $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dsk $$0) {
      return $$0.a(avw.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ewf> b(dsk $$0) {
      return (Iterable<ewf>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dsk $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return dfh.a($$1, $$2.d(), jf.b);
   }
}
