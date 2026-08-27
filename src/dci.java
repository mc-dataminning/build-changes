import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dci extends czf {
   public static final MapCodec<dci> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dci::new)
   );
   private static final Map<czf, czf> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final epo c = czf.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final czf e;

   @Override
   public MapCodec<dci> a() {
      return a;
   }

   public dci(czf $$0, dmd.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      dme $$8 = ($$0.d() instanceof cnl $$7 ? d.getOrDefault($$7.d(), czh.a) : czh.a).o();
      if ($$8.i()) {
         return bmn.d;
      } else if (!this.i()) {
         return bmn.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dqr.c, $$3);
         $$4.a(atz.ah);
         if (!$$4.fW().d) {
            $$0.h(1);
         }

         return bmn.a($$2.B);
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if (this.i()) {
         return bml.b;
      } else {
         cpq $$5 = new cpq(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, czh.fR.o(), 3);
         $$1.a($$3, dqr.c, $$2);
         return bml.a($$1.B);
      }
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return this.i() ? super.a($$0, $$1, $$2) : new cpq(this.e);
   }

   private boolean i() {
      return this.e == czh.a;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public czf b() {
      return this.e;
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
