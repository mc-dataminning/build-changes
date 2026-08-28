import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfb extends den {
   public static final MapCodec<dfb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctg.q.fieldOf("color").forGetter(den::b), u()).apply($$0, dfb::new));
   public static final dua b = dtq.ba;
   private static final Map<ctg, dfw> c = Maps.newHashMap();
   private static final exp d = dfw.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public dfb(ctg $$0, dsz.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return d;
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(b, Integer.valueOf(dug.a($$0.i() + 180.0F)));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   public static dfw a(ctg $$0) {
      return c.getOrDefault($$0, dfy.iJ);
   }
}
