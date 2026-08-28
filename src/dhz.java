import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dhz extends dgb {
   public static final MapCodec<dhz> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dhz::new)
   );
   public static final dvf d = dgb.b;
   protected static final float e = 1.0F;
   protected static final ezm f = dhj.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ezm g = dhj.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ezm h = ezj.a(f, g);
   private static final Map<dhy, dhz> i = Maps.newHashMap();
   private static final Iterable<eys> j = ImmutableList.of(new eys(0.5, 1.0, 0.5));
   private final dhy k;

   @Override
   public MapCodec<dhz> a() {
      return c;
   }

   protected dhz(dhj $$0, dun.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dhy $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dhy.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<eys> b(duo $$0) {
      return j;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return h;
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if ($$0.a(cvt.ot) || $$0.a(cvt.tY)) {
         return brp.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return brp.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      brp $$5 = dhv.a($$1, $$2, dhl.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(eyo $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(d);
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp(dhl.eg);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == jj.a && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return dhv.d;
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   public static duo a(dhy $$0) {
      return i.get($$0).o();
   }

   public static boolean h(duo $$0) {
      return $$0.a(awt.bl, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
