import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dld extends dje {
   public static final MapCodec<dld> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, dld::new)
   );
   public static final dym d = dje.b;
   protected static final float e = 1.0F;
   protected static final fcs f = dkm.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final fcs g = dkm.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final fcs h = fcp.a(f, g);
   private static final Map<dlc, dld> i = Maps.newHashMap();
   private static final Iterable<fby> j = ImmutableList.of(new fby(0.5, 1.0, 0.5));
   private final dlc k;

   @Override
   public MapCodec<dld> a() {
      return c;
   }

   protected dld(dkm $$0, dxu.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dlc $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dlc.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fby> b(dxv $$0) {
      return j;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return h;
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if ($$0.a(cxt.oO) || $$0.a(cxt.uM)) {
         return btj.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return btj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      btj $$5 = dkz.a($$1, $$2, dko.et.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fbu $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(d);
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return new cxp(dko.et);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return dkz.d;
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   public static dxv a(dlc $$0) {
      return i.get($$0).m();
   }

   public static boolean h(dxv $$0) {
      return $$0.a(axu.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
