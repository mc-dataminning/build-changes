import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dml extends dkm {
   public static final MapCodec<dml> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("candle").forGetter($$0x -> $$0x.h), t()).apply($$0, dml::new)
   );
   public static final eaf d = dkm.b;
   private static final feq e = fen.a(dlu.b(2.0, 8.0, 14.0), dlu.b(14.0, 0.0, 8.0));
   private static final Map<dmk, dml> f = Maps.newHashMap();
   private static final Iterable<fdw> g = List.of(new fdw(8.0, 16.0, 8.0).c(0.0625));
   private final dmk h;

   @Override
   public MapCodec<dml> a() {
      return c;
   }

   protected dml(dlu $$0, dzn.d $$1) {
      super($$1);
      this.l(this.B.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dmk $$2) {
         f.put($$2, this);
         this.h = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dmk.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fdw> b(dzo $$0) {
      return g;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e;
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if ($$0.a(cyw.pb) || $$0.a(cyw.uZ)) {
         return bty.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bty.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      bty $$5 = dmh.a($$1, $$2, dlw.et.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fds $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(d);
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys(dlw.et);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return dmh.d;
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   public static dzo a(dmk $$0) {
      return f.get($$0).m();
   }

   public static boolean h(dzo $$0) {
      return $$0.a(axa.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
