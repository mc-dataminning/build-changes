import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class cvp extends cts implements dca {
   public static final MapCodec<cvp> c = b(cvp::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dii f = dhy.az;
   public static final dhz g = cts.b;
   public static final dhz h = dhy.C;
   public static final ToIntFunction<dhi> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<eju>> j = ac.a(() -> {
      Int2ObjectMap<List<eju>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new eju(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new eju(0.375, 0.44, 0.5), new eju(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new eju(0.5, 0.313, 0.625), new eju(0.375, 0.44, 0.5), new eju(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new eju(0.44, 0.313, 0.56), new eju(0.625, 0.44, 0.56), new eju(0.375, 0.44, 0.375), new eju(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ekn k = cva.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ekn l = cva.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ekn m = cva.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ekn n = cva.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<cvp> a() {
      return c;
   }

   public cvp(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$3.fU().e && $$3.b($$4).b() && $$0.c(g)) {
         a($$3, $$0, $$1, $$2);
         return bix.a($$1.B);
      } else {
         return bix.d;
      }
   }

   @Override
   public boolean a(dhi $$0, cnr $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ecs $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ect.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(h) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
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
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(csb $$0, ht $$1, dhi $$2, ecs $$3) {
      if (!$$2.c(h) && $$3.a() == ect.c) {
         dhi $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dhi $$0) {
      return $$0.a(arg.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<eju> b(dhi $$0) {
      return (Iterable<eju>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dhi $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return cva.a($$1, $$2.d(), hx.b);
   }
}
