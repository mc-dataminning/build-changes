import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class das extends cyu {
   public static final MapCodec<das> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, das::new)
   );
   public static final dns d = cyu.b;
   protected static final float e = 1.0F;
   protected static final eqm f = dac.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eqm g = dac.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eqm h = eqj.a(f, g);
   private static final Map<dar, das> i = Maps.newHashMap();
   private static final Iterable<ept> j = ImmutableList.of(new ept(0.5, 1.0, 0.5));
   private final dar k;

   @Override
   public MapCodec<das> a() {
      return c;
   }

   protected das(dac $$0, dna.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dar $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dar.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<ept> b(dnb $$0) {
      return j;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return h;
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if ($$0.a(cqp.or) || $$0.a(cqp.tW)) {
         return bnf.e;
      } else if (a($$6) && $$0.b() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bnf.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      bnd $$5 = dao.a($$1, $$2, dae.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(epp $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(d);
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return new cqm(dae.eg);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return dao.d;
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   public static dnb a(dar $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dnb $$0) {
      return $$0.a(aun.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
