import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dll extends djm {
   public static final MapCodec<dll> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(md.e.q().fieldOf("candle").forGetter($$0x -> $$0x.h), t()).apply($$0, dll::new)
   );
   public static final dzd d = djm.b;
   private static final fdo e = fdl.a(dku.b(2.0, 8.0, 14.0), dku.b(14.0, 0.0, 8.0));
   private static final Map<dlk, dll> f = Maps.newHashMap();
   private static final Iterable<fcu> g = List.of(new fcu(8.0, 16.0, 8.0).c(0.0625));
   private final dlk h;

   @Override
   public MapCodec<dll> a() {
      return c;
   }

   protected dll(dku $$0, dyl.d $$1) {
      super($$1);
      this.l(this.B.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dlk $$2) {
         f.put($$2, this);
         this.h = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dlk.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fcu> b(dym $$0) {
      return g;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e;
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if ($$0.a(cyc.pb) || $$0.a(cyc.uZ)) {
         return btq.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return btq.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      btq $$5 = dlh.a($$1, $$2, dkw.et.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fcq $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(d);
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy(dkw.et);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == jo.a && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return dlh.d;
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   public static dym a(dlk $$0) {
      return f.get($$0).m();
   }

   public static boolean h(dym $$0) {
      return $$0.a(awz.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
