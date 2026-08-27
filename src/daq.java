import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class daq extends cys {
   public static final MapCodec<daq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, daq::new)
   );
   public static final dnq d = cys.b;
   protected static final float e = 1.0F;
   protected static final eqk f = daa.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eqk g = daa.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eqk h = eqh.a(f, g);
   private static final Map<dap, daq> i = Maps.newHashMap();
   private static final Iterable<epr> j = ImmutableList.of(new epr(0.5, 1.0, 0.5));
   private final dap k;

   @Override
   public MapCodec<daq> a() {
      return c;
   }

   protected daq(daa $$0, dmy.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dap $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dap.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<epr> b(dmz $$0) {
      return j;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return h;
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if ($$0.a(cqn.or) || $$0.a(cqn.tV)) {
         return bne.e;
      } else if (a($$6) && $$0.b() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bne.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      bnc $$5 = dam.a($$1, $$2, dac.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(epn $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(d);
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return new cqk(dac.eg);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return dam.d;
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   public static dmz a(dap $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dmz $$0) {
      return $$0.a(aun.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
