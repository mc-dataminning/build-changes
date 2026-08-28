import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dsm extends dib {
   public static final MapCodec<dsm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvk.q.fieldOf("color").forGetter(dib::b), t()).apply($$0, dsm::new));
   public static final dxs<jn> b = dni.aF;
   private static final Map<jn, fbs> c = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djk.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jn.d,
         djk.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jn.e,
         djk.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jn.f,
         djk.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dsm> a() {
      return a;
   }

   public dsm(cvk $$0, dwu.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dwv a(dae $$0) {
      dwv $$1 = this.m();
      dgj $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
         if ($$5.o().d()) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }
}
