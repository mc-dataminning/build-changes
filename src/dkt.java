import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dkt extends div implements drj {
   public static final MapCodec<dkt> c = b(dkt::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dyn f = dye.aC;
   public static final dyf g = div.b;
   public static final dyf h = dye.J;
   public static final ToIntFunction<dxo> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fbr>> j = ae.a(() -> {
      Int2ObjectMap<List<fbr>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new fbr(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new fbr(0.375, 0.44, 0.5), new fbr(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new fbr(0.5, 0.313, 0.625), new fbr(0.375, 0.44, 0.5), new fbr(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new fbr(0.44, 0.313, 0.56), new fbr(0.625, 0.44, 0.56), new fbr(0.375, 0.44, 0.375), new fbr(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final fcl k = dkd.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final fcl l = dkd.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final fcl m = dkd.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final fcl n = dkd.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dkt> a() {
      return c;
   }

   public dkt(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if ($$0.f() && $$4.gj().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bta.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dxo $$0, dax $$1) {
      return !$$1.h() && $$1.n().h() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dxo a(dax $$0) {
      dxo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         etq $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == etr.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(h) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
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
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dha $$0, jh $$1, dxo $$2, etq $$3) {
      if (!$$2.c(h) && $$3.a() == etr.c) {
         dxo $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dxo $$0) {
      return $$0.a(axk.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fbr> b(dxo $$0) {
      return (Iterable<fbr>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dxo $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return dkd.a($$1, $$2.e(), jm.b);
   }
}
