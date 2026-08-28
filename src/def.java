import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class def extends ddr {
   public static final MapCodec<def> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctj.q.fieldOf("color").forGetter(ddr::b), u()).apply($$0, def::new));
   public static final dtd b = dst.ba;
   private static final Map<ctj, dfa> c = Maps.newHashMap();
   private static final ewl d = dfa.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public def(ctj $$0, dsc.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return d;
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(b, Integer.valueOf(dtj.a($$0.i() + 180.0F)));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   public static dfa a(ctj $$0) {
      return c.getOrDefault($$0, dfc.iJ);
   }
}
