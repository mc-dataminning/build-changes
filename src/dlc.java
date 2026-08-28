import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dlc extends djd {
   public static final MapCodec<dlc> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, dlc::new)
   );
   public static final dyl d = djd.b;
   protected static final float e = 1.0F;
   protected static final fcr f = dkl.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final fcr g = dkl.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final fcr h = fco.a(f, g);
   private static final Map<dlb, dlc> i = Maps.newHashMap();
   private static final Iterable<fbx> j = ImmutableList.of(new fbx(0.5, 1.0, 0.5));
   private final dlb k;

   @Override
   public MapCodec<dlc> a() {
      return c;
   }

   protected dlc(dkl $$0, dxt.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dlb $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dlb.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fbx> b(dxu $$0) {
      return j;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return h;
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if ($$0.a(cxs.oO) || $$0.a(cxs.uM)) {
         return bti.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bti.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      bti $$5 = dky.a($$1, $$2, dkn.et.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fbt $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(d);
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return new cxo(dkn.et);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return dky.d;
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   public static dxu a(dlb $$0) {
      return i.get($$0).m();
   }

   public static boolean h(dxu $$0) {
      return $$0.a(axu.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
