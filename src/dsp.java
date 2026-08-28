import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dsp extends dqp {
   public static final MapCodec<dsp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyh.a.fieldOf("wood_type").forGetter(dqp::d), t()).apply($$0, dsp::new));
   public static final dxs<jn> b = dni.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jn, fbs> i = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djk.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jn.d,
         djk.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jn.f,
         djk.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jn.e,
         djk.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dsp> a() {
      return a;
   }

   public dsp(dyh $$0, dwu.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jn.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dwv $$1 = this.m();
      esx $$2 = $$0.q().b_($$0.a());
      dgj $$3 = $$0.q();
      ji $$4 = $$0.a();
      jn[] $$5 = $$0.f();

      for (jn $$6 : $$5) {
         if ($$6.o().d()) {
            jn $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == esy.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dwv $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fay o(dwv $$0) {
      fbs $$1 = i.get($$0.c(b));
      return $$1.a().f();
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
      $$0.a(b, f);
   }
}
