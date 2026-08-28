import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dis extends die {
   public static final MapCodec<dis> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvn.q.fieldOf("color").forGetter(die::b), t()).apply($$0, dis::new));
   public static final dxx b = dxo.bd;
   private static final Map<cvn, djn> c = Maps.newHashMap();
   private static final fbv d = djn.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   public dis(cvn $$0, dwx.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return d;
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(b, Integer.valueOf(dyd.a($$0.i() + 180.0F)));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   public static djn a(cvn $$0) {
      return c.getOrDefault($$0, djp.jh);
   }
}
