import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dmx extends dkx {
   public static final MapCodec<dmx> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("candle").forGetter($$0x -> $$0x.h), t()).apply($$0, dmx::new)
   );
   public static final eay d = dkx.b;
   private static final ffk e = ffh.a(dmf.b(2.0, 8.0, 14.0), dmf.b(14.0, 0.0, 8.0));
   private static final Map<dmw, dmx> f = Maps.newHashMap();
   private static final Iterable<feq> g = List.of(new feq(8.0, 16.0, 8.0).c(0.0625));
   private final dmw h;

   @Override
   public MapCodec<dmx> a() {
      return c;
   }

   protected dmx(dmf $$0, eag.d $$1) {
      super($$1);
      this.l(this.C.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dmw $$2) {
         f.put($$2, this);
         this.h = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dmw.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<feq> b(eah $$0) {
      return g;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return e;
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if ($$0.a(czh.pg) || $$0.a(czh.vg)) {
         return bud.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bud.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      bud $$5 = dmt.a($$1, $$2, dmh.ex.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fem $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(d);
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd(dmh.ex);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return dmt.d;
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   public static eah a(dmw $$0) {
      return f.get($$0).m();
   }

   public static boolean h(eah $$0) {
      return $$0.a(axc.bn, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
