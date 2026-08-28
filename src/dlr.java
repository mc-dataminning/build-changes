import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dlr extends dld {
   public static final MapCodec<dlr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyi.q.fieldOf("color").forGetter(dld::b), t()).apply($$0, dlr::new));
   public static final ebo b = ebe.bd;
   private static final Map<cyi, dmm> c = Maps.newHashMap();
   private static final ffr d = dmm.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   public dlr(cyi $$0, ean.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return d;
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(b, Integer.valueOf(ebu.a($$0.i() + 180.0F)));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   public static dmm a(cyi $$0) {
      return c.getOrDefault($$0, dmo.jl);
   }
}
