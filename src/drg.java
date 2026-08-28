import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class drg extends dha {
   public static final MapCodec<drg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvc.q.fieldOf("color").forGetter(dha::b), t()).apply($$0, drg::new));
   public static final dwl<jm> b = dme.aF;
   private static final Map<jm, fal> c = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dij.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         dij.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jm.e,
         dij.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jm.f,
         dij.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<drg> a() {
      return a;
   }

   public drg(cvc $$0, dvn.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dvo a(czw $$0) {
      dvo $$1 = this.m();
      dfi $$2 = $$0.q();
      jh $$3 = $$0.a();
      jm[] $$4 = $$0.f();

      for (jm $$5 : $$4) {
         if ($$5.o().d()) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }
}
