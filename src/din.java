import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class din extends dgq implements doz {
   public static final MapCodec<din> c = b(din::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dwd f = dvt.az;
   public static final dvu g = dgq.b;
   public static final dvu h = dvt.C;
   public static final ToIntFunction<dvd> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ezh>> j = ad.a(() -> {
      Int2ObjectMap<List<ezh>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ezh(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ezh(0.375, 0.44, 0.5), new ezh(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ezh(0.5, 0.313, 0.625), new ezh(0.375, 0.44, 0.5), new ezh(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ezh(0.44, 0.313, 0.56), new ezh(0.625, 0.44, 0.56), new ezh(0.375, 0.44, 0.375), new ezh(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final fab k = dhy.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final fab l = dhy.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final fab m = dhy.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final fab n = dhy.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<din> a() {
      return c;
   }

   public din(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if ($$0.f() && $$4.gl().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bry.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dvd $$0, czm $$1) {
      return !$$1.h() && $$1.n().h() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dvd a(czm $$0) {
      dvd $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ere $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == erf.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(h) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
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
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dew $$0, jg $$1, dvd $$2, ere $$3) {
      if (!$$2.c(h) && $$3.a() == erf.c) {
         dvd $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dvd $$0) {
      return $$0.a(awz.af, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ezh> b(dvd $$0) {
      return (Iterable<ezh>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dvd $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return dhy.a($$1, $$2.e(), jl.b);
   }
}
