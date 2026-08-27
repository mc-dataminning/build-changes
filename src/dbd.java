import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dbd extends dap {
   public static final MapCodec<dbd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cqc.q.fieldOf("color").forGetter(dap::b), u()).apply($$0, dbd::new));
   public static final dpz b = dpp.ba;
   private static final Map<cqc, dby> c = Maps.newHashMap();
   private static final est d = dby.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dbd> a() {
      return a;
   }

   public dbd(cqc $$0, doy.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return d;
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(b, Integer.valueOf(dqf.a($$0.i() + 180.0F)));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   public static dby a(cqc $$0) {
      return c.getOrDefault($$0, dca.iJ);
   }
}
