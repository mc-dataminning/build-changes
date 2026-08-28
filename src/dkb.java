import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dkb extends dic {
   public static final MapCodec<dkb> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, dkb::new)
   );
   public static final dxm d = dic.b;
   protected static final float e = 1.0F;
   protected static final fbs f = djk.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final fbs g = djk.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final fbs h = fbp.a(f, g);
   private static final Map<dka, dkb> i = Maps.newHashMap();
   private static final Iterable<fay> j = ImmutableList.of(new fay(0.5, 1.0, 0.5));
   private final dka k;

   @Override
   public MapCodec<dkb> a() {
      return c;
   }

   protected dkb(djk $$0, dwu.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dka $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dka.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fay> b(dwv $$0) {
      return j;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return h;
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if ($$0.a(cwr.oX) || $$0.a(cwr.uV)) {
         return bsi.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bsi.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      bsi $$5 = djx.a($$1, $$2, djm.et.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fau $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(d);
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return new cwn(djm.et);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return djx.d;
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   public static dwv a(dka $$0) {
      return i.get($$0).m();
   }

   public static boolean h(dwv $$0) {
      return $$0.a(awo.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
