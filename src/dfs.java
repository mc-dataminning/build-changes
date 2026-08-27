import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfs extends ddt {
   public static final MapCodec<dfs> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lh.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dfs::new)
   );
   public static final dtt d = ddt.b;
   protected static final float e = 1.0F;
   protected static final exn f = dfc.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final exn g = dfc.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final exn h = exk.a(f, g);
   private static final Map<dfr, dfs> i = Maps.newHashMap();
   private static final Iterable<ewu> j = ImmutableList.of(new ewu(0.5, 1.0, 0.5));
   private final dfr k;

   @Override
   public MapCodec<dfs> a() {
      return c;
   }

   protected dfs(dfc $$0, dtb.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dfr $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dfr.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<ewu> b(dtc $$0) {
      return j;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return h;
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if ($$0.a(cuk.pI) || $$0.a(cuk.vz)) {
         return bqc.e;
      } else if (a($$6) && $$0.d() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bqc.a($$2.C);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      bqa $$5 = dfo.a($$1, $$2, dfe.eY.n(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(ewq $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(d);
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh(dfe.eY);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1 == iw.a && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return dfo.d;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   public static dtc a(dfr $$0) {
      return i.get($$0).n();
   }

   public static boolean g(dtc $$0) {
      return $$0.a(awe.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
