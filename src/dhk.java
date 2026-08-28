import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dhk extends dfn implements dnx {
   public static final MapCodec<dhk> c = b(dhk::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dva f = duq.az;
   public static final dur g = dfn.b;
   public static final dur h = duq.C;
   public static final ToIntFunction<dua> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<eye>> j = ad.a(() -> {
      Int2ObjectMap<List<eye>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new eye(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new eye(0.375, 0.44, 0.5), new eye(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new eye(0.5, 0.313, 0.625), new eye(0.375, 0.44, 0.5), new eye(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new eye(0.44, 0.313, 0.56), new eye(0.625, 0.44, 0.56), new eye(0.375, 0.44, 0.375), new eye(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eyx k = dgv.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eyx l = dgv.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eyx m = dgv.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eyx n = dgv.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dhk> a() {
      return c;
   }

   public dhk(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if ($$0.f() && $$4.gd().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return brk.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dua $$0, cyw $$1) {
      return !$$1.h() && $$1.n().h() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dua a(cyw $$0) {
      dua $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eqb $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eqc.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(h) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
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
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(ddt $$0, je $$1, dua $$2, eqb $$3) {
      if (!$$2.c(h) && $$3.a() == eqc.c) {
         dua $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dua $$0) {
      return $$0.a(aws.af, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<eye> b(dua $$0) {
      return (Iterable<eye>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dua $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return dgv.a($$1, $$2.e(), jj.b);
   }
}
