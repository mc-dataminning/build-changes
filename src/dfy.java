import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfy extends dea {
   public static final MapCodec<dfy> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.e.r().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dfy::new)
   );
   public static final dtc d = dea.b;
   protected static final float e = 1.0F;
   protected static final exa f = dfi.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final exa g = dfi.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final exa h = ewx.a(f, g);
   private static final Map<dfx, dfy> i = Maps.newHashMap();
   private static final Iterable<ewh> j = ImmutableList.of(new ewh(0.5, 1.0, 0.5));
   private final dfx k;

   @Override
   public MapCodec<dfy> a() {
      return c;
   }

   protected dfy(dfi $$0, dsk.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dfx $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dfx.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<ewh> b(dsl $$0) {
      return j;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return h;
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if ($$0.a(cug.os) || $$0.a(cug.tX)) {
         return bqj.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bqj.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      bqh $$5 = dfu.a($$1, $$2, dfk.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(ewd $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(d);
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud(dfk.eg);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return dfu.d;
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   public static dsl a(dfx $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dsl $$0) {
      return $$0.a(avw.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
