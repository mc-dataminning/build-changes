import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dqn extends don {
   public static final MapCodec<dqn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dwf.a.fieldOf("wood_type").forGetter(don::d), t()).apply($$0, dqn::new));
   public static final dvm b = dli.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jk, ezq> i = Maps.newEnumMap(
      ImmutableMap.of(
         jk.c,
         dhm.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jk.d,
         dhm.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jk.f,
         dhm.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jk.e,
         dhm.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   public dqn(dwf $$0, dur.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jk.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = this.n();
      eqt $$2 = $$0.q().b_($$0.a());
      dem $$3 = $$0.q();
      jf $$4 = $$0.a();
      jk[] $$5 = $$0.f();

      for (jk $$6 : $$5) {
         if ($$6.o().d()) {
            jk $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == equ.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dus $$0) {
      return $$0.c(b).p();
   }

   @Override
   public eyw o(dus $$0) {
      ezq $$1 = i.get($$0.c(b));
      return $$1.a().f();
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
      $$0.a(b, f);
   }
}
