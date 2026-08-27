import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class czh extends cyt {
   public static final MapCodec<czh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cpd.q.fieldOf("color").forGetter(cyt::b), u()).apply($$0, czh::new));
   public static final dob b = dnr.ba;
   private static final Map<cpd, dac> c = Maps.newHashMap();
   private static final eqm d = dac.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<czh> a() {
      return a;
   }

   public czh(cpd $$0, dna.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return d;
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(b, Integer.valueOf(doh.a($$0.i() + 180.0F)));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   public static dac a(cpd $$0) {
      return c.getOrDefault($$0, dae.iJ);
   }
}
