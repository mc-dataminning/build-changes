import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class deg extends dds {
   public static final MapCodec<deg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctk.q.fieldOf("color").forGetter(dds::b), u()).apply($$0, deg::new));
   public static final dte b = dsu.ba;
   private static final Map<ctk, dfb> c = Maps.newHashMap();
   private static final ewm d = dfb.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   public deg(ctk $$0, dsd.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return d;
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(b, Integer.valueOf(dtk.a($$0.i() + 180.0F)));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   public static dfb a(ctk $$0) {
      return c.getOrDefault($$0, dfd.iJ);
   }
}
