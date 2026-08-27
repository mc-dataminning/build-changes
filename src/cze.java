import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cze extends cxg {
   public static final MapCodec<cze> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, cze::new)
   );
   public static final dlw d = cxg.b;
   protected static final float e = 1.0F;
   protected static final eol f = cyo.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eol g = cyo.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eol h = eoi.a(f, g);
   private static final Map<czd, cze> i = Maps.newHashMap();
   private static final Iterable<ens> j = ImmutableList.of(new ens(0.5, 1.0, 0.5));
   private final czd k;

   @Override
   public MapCodec<cze> a() {
      return c;
   }

   protected cze(cyo $$0, dle.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof czd $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + czd.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<ens> b(dlf $$0) {
      return j;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return h;
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if ($$0.a(cpc.or) || $$0.a(cpc.tV)) {
         return blw.e;
      } else if (a($$6) && $$0.b() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return blw.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      blu $$5 = cza.a($$1, $$2, cyq.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(eno $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(d);
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return new coz(cyq.eg);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return cza.d;
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   public static dlf a(czd $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dlf $$0) {
      return $$0.a(atz.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
