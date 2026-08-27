import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class czv extends cxx {
   public static final MapCodec<czv> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, czv::new)
   );
   public static final dmv d = cxx.b;
   protected static final float e = 1.0F;
   protected static final epo f = czf.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final epo g = czf.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final epo h = epl.a(f, g);
   private static final Map<czu, czv> i = Maps.newHashMap();
   private static final Iterable<eov> j = ImmutableList.of(new eov(0.5, 1.0, 0.5));
   private final czu k;

   @Override
   public MapCodec<czv> a() {
      return c;
   }

   protected czv(czf $$0, dmd.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof czu $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + czu.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<eov> b(dme $$0) {
      return j;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return h;
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if ($$0.a(cpt.or) || $$0.a(cpt.tV)) {
         return bmn.e;
      } else if (a($$6) && $$0.b() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bmn.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      bml $$5 = czr.a($$1, $$2, czh.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(eor $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(d);
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq(czh.eg);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return czr.d;
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   public static dme a(czu $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dme $$0) {
      return $$0.a(aue.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
