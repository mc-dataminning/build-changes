import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dtm extends djd {
   public static final MapCodec<dtm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwm.q.fieldOf("color").forGetter(djd::b), t()).apply($$0, dtm::new));
   public static final dys<jm> b = dok.aF;
   private static final Map<jm, fcs> c = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkm.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         dkm.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jm.e,
         dkm.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jm.f,
         dkm.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dtm> a() {
      return a;
   }

   public dtm(cwm $$0, dxu.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = this.m();
      dhl $$2 = $$0.q();
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
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }
}
