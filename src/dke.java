import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dke extends dif {
   public static final MapCodec<dke> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, dke::new)
   );
   public static final dxp d = dif.b;
   protected static final float e = 1.0F;
   protected static final fbv f = djn.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final fbv g = djn.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final fbv h = fbs.a(f, g);
   private static final Map<dkd, dke> i = Maps.newHashMap();
   private static final Iterable<fbb> j = ImmutableList.of(new fbb(0.5, 1.0, 0.5));
   private final dkd k;

   @Override
   public MapCodec<dke> a() {
      return c;
   }

   protected dke(djn $$0, dwx.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dkd $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dkd.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fbb> b(dwy $$0) {
      return j;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return h;
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if ($$0.a(cwu.oX) || $$0.a(cwu.uV)) {
         return bsl.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bsl.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      bsl $$5 = dka.a($$1, $$2, djp.et.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fax $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(d);
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq(djp.et);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return dka.d;
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   public static dwy a(dkd $$0) {
      return i.get($$0).m();
   }

   public static boolean h(dwy $$0) {
      return $$0.a(awp.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
