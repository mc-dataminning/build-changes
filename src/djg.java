import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class djg extends dhi {
   public static final MapCodec<djg> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lz.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, djg::new)
   );
   public static final dwm d = dhi.b;
   protected static final float e = 1.0F;
   protected static final fas f = diq.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final fas g = diq.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final fas h = fap.a(f, g);
   private static final Map<djf, djg> i = Maps.newHashMap();
   private static final Iterable<ezy> j = ImmutableList.of(new ezy(0.5, 1.0, 0.5));
   private final djf k;

   @Override
   public MapCodec<djg> a() {
      return c;
   }

   protected djg(diq $$0, dvu.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof djf $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + djf.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<ezy> b(dvv $$0) {
      return j;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return h;
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if ($$0.a(cwq.ot) || $$0.a(cwq.uo)) {
         return bsk.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bsk.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      bsk $$5 = djc.a($$1, $$2, dis.eg.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(ezu $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(d);
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm(dis.eg);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return djc.d;
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   public static dvv a(djf $$0) {
      return i.get($$0).m();
   }

   public static boolean h(dvv $$0) {
      return $$0.a(axc.bl, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
