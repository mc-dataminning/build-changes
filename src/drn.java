import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class drn extends dhh {
   public static final MapCodec<drn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvj.q.fieldOf("color").forGetter(dhh::b), t()).apply($$0, drn::new));
   public static final dws<jm> b = dml.aF;
   private static final Map<jm, fas> c = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         diq.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         diq.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jm.e,
         diq.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jm.f,
         diq.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<drn> a() {
      return a;
   }

   public drn(cvj $$0, dvu.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dvv a(dad $$0) {
      dvv $$1 = this.m();
      dfp $$2 = $$0.q();
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
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }
}
