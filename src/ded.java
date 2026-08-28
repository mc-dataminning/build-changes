import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ded extends ddp {
   public static final MapCodec<ded> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cth.q.fieldOf("color").forGetter(ddp::b), u()).apply($$0, ded::new));
   public static final dtb b = dsr.ba;
   private static final Map<cth, dey> c = Maps.newHashMap();
   private static final ewj d = dey.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   public ded(cth $$0, dsa.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return d;
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(b, Integer.valueOf(dth.a($$0.i() + 180.0F)));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   public static dey a(cth $$0) {
      return c.getOrDefault($$0, dfa.iJ);
   }
}
