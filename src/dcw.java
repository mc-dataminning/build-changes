import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dcw extends daz implements djh {
   public static final MapCodec<dcw> c = b(dcw::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dqi f = dpy.az;
   public static final dpz g = daz.b;
   public static final dpz h = dpy.C;
   public static final ToIntFunction<dpi> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<esj>> j = ac.a(() -> {
      Int2ObjectMap<List<esj>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new esj(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new esj(0.375, 0.44, 0.5), new esj(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new esj(0.5, 0.313, 0.625), new esj(0.375, 0.44, 0.5), new esj(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new esj(0.44, 0.313, 0.56), new esj(0.625, 0.44, 0.56), new esj(0.375, 0.44, 0.375), new esj(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final etc k = dch.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final etc l = dch.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final etc m = dch.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final etc n = dch.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dcw> a() {
      return c;
   }

   public dcw(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if ($$0.d() && $$4.ga().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return boh.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dpi $$0, cux $$1) {
      return !$$1.h() && $$1.n().f() == this.p() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dpi a(cux $$0) {
      dpi $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         elb $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == elc.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(h) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
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
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(czh $$0, id $$1, dpi $$2, elb $$3) {
      if (!$$2.c(h) && $$3.a() == elc.c) {
         dpi $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dpi $$0) {
      return $$0.a(ave.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<esj> b(dpi $$0) {
      return (Iterable<esj>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dpi $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return dch.a($$1, $$2.d(), ij.b);
   }
}
