import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dho extends dha {
   public static final MapCodec<dho> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvc.q.fieldOf("color").forGetter(dha::b), t()).apply($$0, dho::new));
   public static final dwn b = dwe.ba;
   private static final Map<cvc, dij> c = Maps.newHashMap();
   private static final fal d = dij.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dho> a() {
      return a;
   }

   public dho(cvc $$0, dvn.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return d;
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(b, Integer.valueOf(dwt.a($$0.i() + 180.0F)));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   public static dij a(cvc $$0) {
      return c.getOrDefault($$0, dil.iJ);
   }
}
