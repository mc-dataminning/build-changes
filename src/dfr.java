import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfr extends ddt {
   public static final MapCodec<dfr> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dfr::new)
   );
   public static final dsv d = ddt.b;
   protected static final float e = 1.0F;
   protected static final ewm f = dfb.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ewm g = dfb.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ewm h = ewj.a(f, g);
   private static final Map<dfq, dfr> i = Maps.newHashMap();
   private static final Iterable<evt> j = ImmutableList.of(new evt(0.5, 1.0, 0.5));
   private final dfq k;

   @Override
   public MapCodec<dfr> a() {
      return c;
   }

   protected dfr(dfb $$0, dsd.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dfq $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dfq.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<evt> b(dse $$0) {
      return j;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return h;
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if ($$0.a(cuu.os) || $$0.a(cuu.tX)) {
         return bqy.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bqy.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      bqw $$5 = dfn.a($$1, $$2, dfd.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(evp $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(d);
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return new cur(dfd.eg);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return dfn.d;
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   public static dse a(dfq $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dse $$0) {
      return $$0.a(awp.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
