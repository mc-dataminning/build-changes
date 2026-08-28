import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfn extends ddp {
   public static final MapCodec<dfn> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dfn::new)
   );
   public static final dsr d = ddp.b;
   protected static final float e = 1.0F;
   protected static final ewi f = dex.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ewi g = dex.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ewi h = ewf.a(f, g);
   private static final Map<dfm, dfn> i = Maps.newHashMap();
   private static final Iterable<evp> j = ImmutableList.of(new evp(0.5, 1.0, 0.5));
   private final dfm k;

   @Override
   public MapCodec<dfn> a() {
      return c;
   }

   protected dfn(dex $$0, drz.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dfm $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dfm.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<evp> b(dsa $$0) {
      return j;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return h;
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if ($$0.a(cuq.os) || $$0.a(cuq.tX)) {
         return bqu.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bqu.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      bqs $$5 = dfj.a($$1, $$2, dez.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(evl $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(d);
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return new cun(dez.eg);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return dfj.d;
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   public static dsa a(dfm $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dsa $$0) {
      return $$0.a(awo.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
