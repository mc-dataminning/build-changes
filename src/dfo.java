import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfo extends ddq {
   public static final MapCodec<dfo> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dfo::new)
   );
   public static final dss d = ddq.b;
   protected static final float e = 1.0F;
   protected static final ewj f = dey.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ewj g = dey.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ewj h = ewg.a(f, g);
   private static final Map<dfn, dfo> i = Maps.newHashMap();
   private static final Iterable<evq> j = ImmutableList.of(new evq(0.5, 1.0, 0.5));
   private final dfn k;

   @Override
   public MapCodec<dfo> a() {
      return c;
   }

   protected dfo(dey $$0, dsa.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dfn $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dfn.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<evq> b(dsb $$0) {
      return j;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return h;
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if ($$0.a(cur.os) || $$0.a(cur.tX)) {
         return bqv.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bqv.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      bqt $$5 = dfk.a($$1, $$2, dfa.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(evm $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(d);
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return new cuo(dfa.eg);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return dfk.d;
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   public static dsb a(dfn $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dsb $$0) {
      return $$0.a(awo.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
