import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dku extends diw implements drl {
   public static final MapCodec<dku> c = b(dku::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dyq f = dyg.aC;
   public static final dyh g = diw.b;
   public static final dyh h = dyg.I;
   public static final ToIntFunction<dxq> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fbx>> C = af.a(
      new Int2ObjectOpenHashMap(4),
      $$0 -> {
         float $$1 = 0.0625F;
         $$0.put(1, List.of(new fbx(8.0, 8.0, 8.0).c(0.0625)));
         $$0.put(2, List.of(new fbx(6.0, 7.0, 8.0).c(0.0625), new fbx(10.0, 8.0, 7.0).c(0.0625)));
         $$0.put(3, List.of(new fbx(8.0, 5.0, 10.0).c(0.0625), new fbx(6.0, 7.0, 8.0).c(0.0625), new fbx(9.0, 8.0, 7.0).c(0.0625)));
         $$0.put(
            4, List.of(new fbx(7.0, 5.0, 9.0).c(0.0625), new fbx(10.0, 7.0, 9.0).c(0.0625), new fbx(6.0, 7.0, 6.0).c(0.0625), new fbx(9.0, 8.0, 6.0).c(0.0625))
         );
      }
   );
   private static final fcr[] Q = new fcr[]{
      dke.b(2.0, 0.0, 6.0), dke.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0), dke.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0), dke.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)
   };

   @Override
   public MapCodec<dku> a() {
      return c;
   }

   public dku(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if ($$0.f() && $$4.gm().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bsy.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dxq $$0, dax $$1) {
      return !$$1.h() && $$1.n().h() == this.i() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dxq a(dax $$0) {
      dxq $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         etw $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == etx.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(h) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return Q[$$0.c(f) - 1];
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dha $$0, ji $$1, dxq $$2, etw $$3) {
      if (!$$2.c(h) && $$3.a() == etx.c) {
         dxq $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dxq $$0) {
      return $$0.a(awp.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fbx> b(dxq $$0) {
      return (Iterable<fbx>)C.get($$0.c(f));
   }

   @Override
   protected boolean d(dxq $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return dke.a($$1, $$2.e(), jn.b);
   }
}
