import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class diu extends dgw {
   public static final MapCodec<diu> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ly.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, diu::new)
   );
   public static final dwa d = dgw.b;
   protected static final float e = 1.0F;
   protected static final fah f = die.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final fah g = die.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final fah h = fae.a(f, g);
   private static final Map<dit, diu> i = Maps.newHashMap();
   private static final Iterable<ezn> j = ImmutableList.of(new ezn(0.5, 1.0, 0.5));
   private final dit k;

   @Override
   public MapCodec<diu> a() {
      return c;
   }

   protected diu(die $$0, dvi.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dit $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dit.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<ezn> b(dvj $$0) {
      return j;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return h;
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if ($$0.a(cwf.ot) || $$0.a(cwf.tY)) {
         return bsd.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bsd.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      bsd $$5 = diq.a($$1, $$2, dig.eg.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(ezj $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(d);
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb(dig.eg);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == jm.a && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return diq.d;
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   public static dvj a(dit $$0) {
      return i.get($$0).m();
   }

   public static boolean h(dvj $$0) {
      return $$0.a(axa.bl, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
