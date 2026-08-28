import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dfo extends ddr implements dma {
   public static final MapCodec<dfo> c = b(dfo::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dtc f = dss.az;
   public static final dst g = ddr.b;
   public static final dst h = dss.C;
   public static final ToIntFunction<dsc> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<evr>> j = ac.a(() -> {
      Int2ObjectMap<List<evr>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new evr(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new evr(0.375, 0.44, 0.5), new evr(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new evr(0.5, 0.313, 0.625), new evr(0.375, 0.44, 0.5), new evr(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new evr(0.44, 0.313, 0.56), new evr(0.625, 0.44, 0.56), new evr(0.375, 0.44, 0.375), new evr(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ewk k = dez.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ewk l = dez.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ewk m = dez.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ewk n = dez.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dfo> a() {
      return c;
   }

   public dfo(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if ($$0.e() && $$4.gd().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bqw.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dsc $$0, cya $$1) {
      return !$$1.h() && $$1.n().g() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dsc a(cya $$0) {
      dsc $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         env $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == enw.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(h) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
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
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dbz $$0, iz $$1, dsc $$2, env $$3) {
      if (!$$2.c(h) && $$3.a() == enw.c) {
         dsc $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dsc $$0) {
      return $$0.a(awp.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<evr> b(dsc $$0) {
      return (Iterable<evr>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dsc $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return dez.a($$1, $$2.d(), je.b);
   }
}
