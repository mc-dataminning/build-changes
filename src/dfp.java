import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfp extends ddr {
   public static final MapCodec<dfp> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dfp::new)
   );
   public static final dst d = ddr.b;
   protected static final float e = 1.0F;
   protected static final ewk f = dez.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ewk g = dez.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ewk h = ewh.a(f, g);
   private static final Map<dfo, dfp> i = Maps.newHashMap();
   private static final Iterable<evr> j = ImmutableList.of(new evr(0.5, 1.0, 0.5));
   private final dfo k;

   @Override
   public MapCodec<dfp> a() {
      return c;
   }

   protected dfp(dez $$0, dsb.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dfo $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dfo.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<evr> b(dsc $$0) {
      return j;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return h;
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if ($$0.a(cus.os) || $$0.a(cus.tX)) {
         return bqw.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bqw.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      bqu $$5 = dfl.a($$1, $$2, dfb.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(evn $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(d);
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup(dfb.eg);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return dfl.d;
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   public static dsc a(dfo $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dsc $$0) {
      return $$0.a(awp.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
