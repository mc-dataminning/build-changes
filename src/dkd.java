import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dkd extends die {
   public static final MapCodec<dkd> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, dkd::new)
   );
   public static final dxo d = die.b;
   protected static final float e = 1.0F;
   protected static final fbu f = djm.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final fbu g = djm.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final fbu h = fbr.a(f, g);
   private static final Map<dkc, dkd> i = Maps.newHashMap();
   private static final Iterable<fba> j = ImmutableList.of(new fba(0.5, 1.0, 0.5));
   private final dkc k;

   @Override
   public MapCodec<dkd> a() {
      return c;
   }

   protected dkd(djm $$0, dww.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dkc $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dkc.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fba> b(dwx $$0) {
      return j;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return h;
   }

   @Override
   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      if ($$0.a(cwt.oX) || $$0.a(cwt.uV)) {
         return bsj.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bsj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      bsj $$5 = djz.a($$1, $$2, djo.et.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(faw $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(d);
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp(djo.et);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return djz.d;
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   public static dwx a(dkc $$0) {
      return i.get($$0).m();
   }

   public static boolean h(dwx $$0) {
      return $$0.a(awp.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
