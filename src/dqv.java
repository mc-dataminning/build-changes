import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dqv extends dgp {
   public static final MapCodec<dqv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuu.q.fieldOf("color").forGetter(dgp::b), t()).apply($$0, dqv::new));
   public static final dvx b = dlt.aF;
   private static final Map<jl, fab> c = Maps.newEnumMap(
      ImmutableMap.of(
         jl.c,
         dhy.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jl.d,
         dhy.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jl.e,
         dhy.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jl.f,
         dhy.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dqv> a() {
      return a;
   }

   public dqv(cuu $$0, dvc.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jl.c));
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dvd a(czm $$0) {
      dvd $$1 = this.m();
      dey $$2 = $$0.q();
      jg $$3 = $$0.a();
      jl[] $$4 = $$0.f();

      for (jl $$5 : $$4) {
         if ($$5.o().d()) {
            jl $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }
}
