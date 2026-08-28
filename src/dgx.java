import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dgx extends dgu {
   public static final MapCodec<dgx> b = b(dgx::new);
   public static final dvm c = dli.aF;
   private static final Map<jk, ezq> e = Maps.newEnumMap(
      ImmutableMap.of(
         jk.c,
         dhm.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jk.d,
         dhm.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jk.e,
         dhm.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jk.f,
         dhm.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dgx> a() {
      return b;
   }

   protected dgx(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jk.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dho.a.n() : $$0;
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jk $$3 = $$0.c(c);
      jf $$4 = $$2.a($$3.g());
      dus $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = super.a($$0);
      dem $$2 = $$0.q();
      jf $$3 = $$0.a();
      jk[] $$4 = $$0.f();

      for (jk $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(c, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
