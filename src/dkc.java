import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dkc extends did {
   public static final MapCodec<dkc> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, dkc::new)
   );
   public static final dxn d = did.b;
   protected static final float e = 1.0F;
   protected static final fbt f = djl.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final fbt g = djl.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final fbt h = fbq.a(f, g);
   private static final Map<dkb, dkc> i = Maps.newHashMap();
   private static final Iterable<faz> j = ImmutableList.of(new faz(0.5, 1.0, 0.5));
   private final dkb k;

   @Override
   public MapCodec<dkc> a() {
      return c;
   }

   protected dkc(djl $$0, dwv.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dkb $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dkb.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<faz> b(dww $$0) {
      return j;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return h;
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      if ($$0.a(cws.oX) || $$0.a(cws.uV)) {
         return bsj.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bsj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      bsj $$5 = djy.a($$1, $$2, djn.et.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fav $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(d);
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo(djn.et);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return djy.d;
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   public static dww a(dkb $$0) {
      return i.get($$0).m();
   }

   public static boolean h(dww $$0) {
      return $$0.a(awp.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
