import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dku extends diw implements dri {
   public static final MapCodec<dku> c = b(dku::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dym f = dyd.aA;
   public static final dye g = diw.b;
   public static final dye h = dyd.D;
   public static final ToIntFunction<dxn> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fbs>> j = ae.a(() -> {
      Int2ObjectMap<List<fbs>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new fbs(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new fbs(0.375, 0.44, 0.5), new fbs(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new fbs(0.5, 0.313, 0.625), new fbs(0.375, 0.44, 0.5), new fbs(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new fbs(0.44, 0.313, 0.56), new fbs(0.625, 0.44, 0.56), new fbs(0.375, 0.44, 0.375), new fbs(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final fcm k = dke.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final fcm l = dke.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final fcm m = dke.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final fcm n = dke.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dku> a() {
      return c;
   }

   public dku(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if ($$0.f() && $$4.gh().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bte.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dxn $$0, dbb $$1) {
      return !$$1.h() && $$1.n().h() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         etp $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == etq.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(h) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
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
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dhb $$0, jh $$1, dxn $$2, etp $$3) {
      if (!$$2.c(h) && $$3.a() == etq.c) {
         dxn $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dxn $$0) {
      return $$0.a(axu.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fbs> b(dxn $$0) {
      return (Iterable<fbs>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dxn $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return dke.a($$1, $$2.e(), jm.b);
   }
}
