import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dlb extends djd implements drp {
   public static final MapCodec<dlb> c = b(dlb::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dyt f = dyk.aA;
   public static final dyl g = djd.b;
   public static final dyl h = dyk.D;
   public static final ToIntFunction<dxu> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fbx>> j = ae.a(() -> {
      Int2ObjectMap<List<fbx>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new fbx(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new fbx(0.375, 0.44, 0.5), new fbx(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new fbx(0.5, 0.313, 0.625), new fbx(0.375, 0.44, 0.5), new fbx(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new fbx(0.44, 0.313, 0.56), new fbx(0.625, 0.44, 0.56), new fbx(0.375, 0.44, 0.375), new fbx(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final fcr k = dkl.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final fcr l = dkl.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final fcr m = dkl.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final fcr n = dkl.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dlb> a() {
      return c;
   }

   public dlb(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if ($$0.f() && $$4.gj().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bti.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dxu $$0, dbf $$1) {
      return !$$1.h() && $$1.n().h() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         etw $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == etx.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(h) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
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
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dhi $$0, jh $$1, dxu $$2, etw $$3) {
      if (!$$2.c(h) && $$3.a() == etx.c) {
         dxu $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dxu $$0) {
      return $$0.a(axu.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fbx> b(dxu $$0) {
      return (Iterable<fbx>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dxu $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return dkl.a($$1, $$2.e(), jm.b);
   }
}
