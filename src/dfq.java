import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfq extends dds {
   public static final MapCodec<dfq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dfq::new)
   );
   public static final dsu d = dds.b;
   protected static final float e = 1.0F;
   protected static final ewl f = dfa.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ewl g = dfa.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ewl h = ewi.a(f, g);
   private static final Map<dfp, dfq> i = Maps.newHashMap();
   private static final Iterable<evs> j = ImmutableList.of(new evs(0.5, 1.0, 0.5));
   private final dfp k;

   @Override
   public MapCodec<dfq> a() {
      return c;
   }

   protected dfq(dfa $$0, dsc.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dfp $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dfp.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<evs> b(dsd $$0) {
      return j;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return h;
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if ($$0.a(cut.os) || $$0.a(cut.tX)) {
         return bqx.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bqx.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      bqv $$5 = dfm.a($$1, $$2, dfc.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(evo $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(d);
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return new cuq(dfc.eg);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return dfm.d;
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   public static dsd a(dfp $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dsd $$0) {
      return $$0.a(awp.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
