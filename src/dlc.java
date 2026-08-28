import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dlc extends dje implements drq {
   public static final MapCodec<dlc> c = b(dlc::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dyu f = dyl.aA;
   public static final dym g = dje.b;
   public static final dym h = dyl.D;
   public static final ToIntFunction<dxv> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fby>> j = ae.a(() -> {
      Int2ObjectMap<List<fby>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new fby(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new fby(0.375, 0.44, 0.5), new fby(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new fby(0.5, 0.313, 0.625), new fby(0.375, 0.44, 0.5), new fby(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new fby(0.44, 0.313, 0.56), new fby(0.625, 0.44, 0.56), new fby(0.375, 0.44, 0.375), new fby(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final fcs k = dkm.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final fcs l = dkm.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final fcs m = dkm.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final fcs n = dkm.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dlc> a() {
      return c;
   }

   public dlc(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if ($$0.f() && $$4.gj().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return btj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dxv $$0, dbg $$1) {
      return !$$1.h() && $$1.n().h() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         etx $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ety.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(h) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
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
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dhj $$0, jh $$1, dxv $$2, etx $$3) {
      if (!$$2.c(h) && $$3.a() == ety.c) {
         dxv $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dxv $$0) {
      return $$0.a(axu.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fby> b(dxv $$0) {
      return (Iterable<fby>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dxv $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return dkm.a($$1, $$2.e(), jm.b);
   }
}
