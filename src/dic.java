import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dic extends dge {
   public static final MapCodec<dic> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lv.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, dic::new)
   );
   public static final dvj d = dge.b;
   protected static final float e = 1.0F;
   protected static final ezq f = dhm.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ezq g = dhm.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ezq h = ezn.a(f, g);
   private static final Map<dib, dic> i = Maps.newHashMap();
   private static final Iterable<eyw> j = ImmutableList.of(new eyw(0.5, 1.0, 0.5));
   private final dib k;

   @Override
   public MapCodec<dic> a() {
      return c;
   }

   protected dic(dhm $$0, dur.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dib $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dib.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<eyw> b(dus $$0) {
      return j;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return h;
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if ($$0.a(cvw.ot) || $$0.a(cvw.tY)) {
         return brs.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return brs.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      brs $$5 = dhy.a($$1, $$2, dho.eg.n(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(eys $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(d);
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs(dho.eg);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == jk.a && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return dhy.d;
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   public static dus a(dib $$0) {
      return i.get($$0).n();
   }

   public static boolean h(dus $$0) {
      return $$0.a(awv.bl, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
