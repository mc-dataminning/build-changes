import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dne extends dle {
   public static final MapCodec<dne> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("candle").forGetter($$0x -> $$0x.h), t()).apply($$0, dne::new)
   );
   public static final ebf d = dle.b;
   private static final ffr e = ffo.a(dmm.b(2.0, 8.0, 14.0), dmm.b(14.0, 0.0, 8.0));
   private static final Map<dnd, dne> f = Maps.newHashMap();
   private static final Iterable<fex> g = List.of(new fex(8.0, 16.0, 8.0).c(0.0625));
   private final dnd h;

   @Override
   public MapCodec<dne> a() {
      return c;
   }

   protected dne(dmm $$0, ean.d $$1) {
      super($$1);
      this.l(this.C.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dnd $$2) {
         f.put($$2, this);
         this.h = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dnd.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fex> b(eao $$0) {
      return g;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e;
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if ($$0.a(czo.pg) || $$0.a(czo.vg)) {
         return bug.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bug.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      bug $$5 = dna.a($$1, $$2, dmo.ex.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fet $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(d);
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk(dmo.ex);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return dna.d;
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   public static eao a(dnd $$0) {
      return f.get($$0).m();
   }

   public static boolean h(eao $$0) {
      return $$0.a(axc.bn, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
