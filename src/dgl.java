import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dgl extends deo implements dmy {
   public static final MapCodec<dgl> c = b(dgl::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dua f = dtq.az;
   public static final dtr g = deo.b;
   public static final dtr h = dtq.C;
   public static final ToIntFunction<dta> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<eww>> j = ad.a(() -> {
      Int2ObjectMap<List<eww>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new eww(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new eww(0.375, 0.44, 0.5), new eww(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new eww(0.5, 0.313, 0.625), new eww(0.375, 0.44, 0.5), new eww(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new eww(0.44, 0.313, 0.56), new eww(0.625, 0.44, 0.56), new eww(0.375, 0.44, 0.375), new eww(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final exp k = dfw.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final exp l = dfw.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final exp m = dfw.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final exp n = dfw.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dgl> a() {
      return c;
   }

   public dgl(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$0.e() && $$4.ga().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bqs.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dta $$0, cyb $$1) {
      return !$$1.h() && $$1.n().g() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dta a(cyb $$0) {
      dta $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eoy $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eoz.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(h) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
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
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dcv $$0, jd $$1, dta $$2, eoy $$3) {
      if (!$$2.c(h) && $$3.a() == eoz.c) {
         dta $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dta $$0) {
      return $$0.a(awd.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<eww> b(dta $$0) {
      return (Iterable<eww>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dta $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return dfw.a($$1, $$2.d(), ji.b);
   }
}
