import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class diz extends dhb {
   public static final MapCodec<diz> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lz.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, diz::new)
   );
   public static final dwf d = dhb.b;
   protected static final float e = 1.0F;
   protected static final fal f = dij.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final fal g = dij.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final fal h = fai.a(f, g);
   private static final Map<diy, diz> i = Maps.newHashMap();
   private static final Iterable<ezr> j = ImmutableList.of(new ezr(0.5, 1.0, 0.5));
   private final diy k;

   @Override
   public MapCodec<diz> a() {
      return c;
   }

   protected diz(dij $$0, dvn.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof diy $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + diy.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<ezr> b(dvo $$0) {
      return j;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return h;
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if ($$0.a(cwj.ot) || $$0.a(cwj.uo)) {
         return bsh.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bsh.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      bsh $$5 = div.a($$1, $$2, dil.eg.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(ezn $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(d);
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return new cwf(dil.eg);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return div.d;
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   public static dvo a(diy $$0) {
      return i.get($$0).m();
   }

   public static boolean h(dvo $$0) {
      return $$0.a(axd.bl, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
