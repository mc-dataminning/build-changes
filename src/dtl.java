import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dtl extends djc {
   public static final MapCodec<dtl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwl.q.fieldOf("color").forGetter(djc::b), t()).apply($$0, dtl::new));
   public static final dyr<jm> b = doj.aF;
   private static final Map<jm, fcr> c = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkl.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         dkl.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jm.e,
         dkl.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jm.f,
         dkl.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dtl> a() {
      return a;
   }

   public dtl(cwl $$0, dxt.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = this.m();
      dhk $$2 = $$0.q();
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
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }
}
