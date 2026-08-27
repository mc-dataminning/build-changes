import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ddf extends dac {
   public static final MapCodec<ddf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, ddf::new)
   );
   private static final Map<dac, dac> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final eqm c = dac.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dac e;

   @Override
   public MapCodec<ddf> a() {
      return a;
   }

   public ddf(dac $$0, dna.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      dnb $$8 = ($$0.d() instanceof coh $$7 ? d.getOrDefault($$7.d(), dae.a) : dae.a).o();
      if ($$8.i()) {
         return bnf.d;
      } else if (!this.i()) {
         return bnf.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, drp.c, $$3);
         $$4.a(aui.ah);
         $$0.a(1, $$4);
         return bnf.a($$2.B);
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if (this.i()) {
         return bnd.b;
      } else {
         cqm $$5 = new cqm(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dae.fR.o(), 3);
         $$1.a($$3, drp.c, $$2);
         return bnd.a($$1.B);
      }
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return this.i() ? super.a($$0, $$1, $$2) : new cqm(this.e);
   }

   private boolean i() {
      return this.e == dae.a;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dac b() {
      return this.e;
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
