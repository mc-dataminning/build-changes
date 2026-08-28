import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfk extends ddm {
   public static final MapCodec<dfk> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dfk::new)
   );
   public static final dso d = ddm.b;
   protected static final float e = 1.0F;
   protected static final ewf f = deu.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ewf g = deu.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ewf h = ewc.a(f, g);
   private static final Map<dfj, dfk> i = Maps.newHashMap();
   private static final Iterable<evm> j = ImmutableList.of(new evm(0.5, 1.0, 0.5));
   private final dfj k;

   @Override
   public MapCodec<dfk> a() {
      return c;
   }

   protected dfk(deu $$0, drw.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dfj $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dfj.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<evm> b(drx $$0) {
      return j;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return h;
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if ($$0.a(cun.os) || $$0.a(cun.tX)) {
         return bqr.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bqr.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      bqp $$5 = dfg.a($$1, $$2, dew.eg.n(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(evi $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(d);
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return new cuk(dew.eg);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return dfg.d;
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   public static drx a(dfj $$0) {
      return i.get($$0).n();
   }

   public static boolean g(drx $$0) {
      return $$0.a(awl.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
