import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dfn extends ddq implements dlz {
   public static final MapCodec<dfn> c = b(dfn::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dtb f = dsr.az;
   public static final dss g = ddq.b;
   public static final dss h = dsr.C;
   public static final ToIntFunction<dsb> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<evq>> j = ac.a(() -> {
      Int2ObjectMap<List<evq>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new evq(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new evq(0.375, 0.44, 0.5), new evq(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new evq(0.5, 0.313, 0.625), new evq(0.375, 0.44, 0.5), new evq(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new evq(0.44, 0.313, 0.56), new evq(0.625, 0.44, 0.56), new evq(0.375, 0.44, 0.375), new evq(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ewj k = dey.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ewj l = dey.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ewj m = dey.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ewj n = dey.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dfn> a() {
      return c;
   }

   public dfn(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if ($$0.e() && $$4.gd().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bqv.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dsb $$0, cxz $$1) {
      return !$$1.h() && $$1.n().g() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         enu $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == env.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(h) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
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
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dby $$0, iz $$1, dsb $$2, enu $$3) {
      if (!$$2.c(h) && $$3.a() == env.c) {
         dsb $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dsb $$0) {
      return $$0.a(awo.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<evq> b(dsb $$0) {
      return (Iterable<evq>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dsb $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return dey.a($$1, $$2.d(), je.b);
   }
}
