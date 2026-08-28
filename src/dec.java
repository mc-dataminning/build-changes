import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dec extends ddo {
   public static final MapCodec<dec> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctg.q.fieldOf("color").forGetter(ddo::b), u()).apply($$0, dec::new));
   public static final dta b = dsq.ba;
   private static final Map<ctg, dex> c = Maps.newHashMap();
   private static final ewi d = dex.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   public dec(ctg $$0, drz.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return d;
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(b, Integer.valueOf(dtg.a($$0.i() + 180.0F)));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   public static dex a(ctg $$0) {
      return c.getOrDefault($$0, dez.iJ);
   }
}
