import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class czf extends cyr {
   public static final MapCodec<czf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cpb.q.fieldOf("color").forGetter(cyr::b), u()).apply($$0, czf::new));
   public static final dnz b = dnp.ba;
   private static final Map<cpb, daa> c = Maps.newHashMap();
   private static final eqk d = daa.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<czf> a() {
      return a;
   }

   public czf(cpb $$0, dmy.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return d;
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(b, Integer.valueOf(dof.a($$0.i() + 180.0F)));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   public static daa a(cpb $$0) {
      return c.getOrDefault($$0, dac.iJ);
   }
}
