import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dqk extends dgd {
   public static final MapCodec<dqk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cum.q.fieldOf("color").forGetter(dgd::b), t()).apply($$0, dqk::new));
   public static final dvm b = dli.aF;
   private static final Map<jk, ezq> c = Maps.newEnumMap(
      ImmutableMap.of(
         jk.c,
         dhm.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jk.d,
         dhm.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jk.e,
         dhm.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jk.f,
         dhm.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dqk> a() {
      return a;
   }

   public dqk(cum $$0, dur.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jk.c));
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dus a(czn $$0) {
      dus $$1 = this.n();
      dem $$2 = $$0.q();
      jf $$3 = $$0.a();
      jk[] $$4 = $$0.f();

      for (jk $$5 : $$4) {
         if ($$5.o().d()) {
            jk $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }
}
