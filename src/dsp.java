import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dsp extends die {
   public static final MapCodec<dsp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvn.q.fieldOf("color").forGetter(die::b), t()).apply($$0, dsp::new));
   public static final dxv<jn> b = dnl.aF;
   private static final Map<jn, fbv> c = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djn.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jn.d,
         djn.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jn.e,
         djn.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jn.f,
         djn.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dsp> a() {
      return a;
   }

   public dsp(cvn $$0, dwx.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dwy a(dah $$0) {
      dwy $$1 = this.m();
      dgm $$2 = $$0.q();
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
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }
}
