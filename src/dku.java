import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dku extends div {
   public static final MapCodec<dku> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, dku::new)
   );
   public static final dyf d = div.b;
   protected static final float e = 1.0F;
   protected static final fcl f = dkd.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final fcl g = dkd.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final fcl h = fci.a(f, g);
   private static final Map<dkt, dku> i = Maps.newHashMap();
   private static final Iterable<fbr> j = ImmutableList.of(new fbr(0.5, 1.0, 0.5));
   private final dkt k;

   @Override
   public MapCodec<dku> a() {
      return c;
   }

   protected dku(dkd $$0, dxn.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dkt $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dkt.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fbr> b(dxo $$0) {
      return j;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return h;
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if ($$0.a(cxk.oX) || $$0.a(cxk.uV)) {
         return bta.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bta.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      bta $$5 = dkq.a($$1, $$2, dkf.et.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fbn $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(d);
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return new cxg(dkf.et);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return dkq.d;
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   public static dxo a(dkt $$0) {
      return i.get($$0).m();
   }

   public static boolean h(dxo $$0) {
      return $$0.a(axk.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
