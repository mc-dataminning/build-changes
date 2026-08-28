import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dkv extends diw {
   public static final MapCodec<dkv> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, dkv::new)
   );
   public static final dye d = diw.b;
   protected static final float e = 1.0F;
   protected static final fcm f = dke.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final fcm g = dke.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final fcm h = fcj.a(f, g);
   private static final Map<dku, dkv> i = Maps.newHashMap();
   private static final Iterable<fbs> j = ImmutableList.of(new fbs(0.5, 1.0, 0.5));
   private final dku k;

   @Override
   public MapCodec<dkv> a() {
      return c;
   }

   protected dkv(dke $$0, dxm.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dku $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dku.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fbs> b(dxn $$0) {
      return j;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return h;
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if ($$0.a(cxo.oO) || $$0.a(cxo.uM)) {
         return bte.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bte.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      bte $$5 = dkr.a($$1, $$2, dkg.et.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fbo $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(d);
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return new cxk(dkg.et);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return dkr.d;
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   public static dxn a(dku $$0) {
      return i.get($$0).m();
   }

   public static boolean h(dxn $$0) {
      return $$0.a(axu.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
