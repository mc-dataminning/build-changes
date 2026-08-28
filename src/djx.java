import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class djx extends dju {
   public static final MapCodec<djx> b = b(djx::new);
   public static final dys<jm> c = dok.aF;
   private static final Map<jm, fcs> e = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkm.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jm.d,
         dkm.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jm.e,
         dkm.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jm.f,
         dkm.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends djx> a() {
      return b;
   }

   protected djx(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return $$4.g() == $$0.c(c) && !$$0.a($$1, $$3) ? dko.a.m() : $$0;
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jm $$3 = $$0.c(c);
      jh $$4 = $$2.a($$3.g());
      dxv $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = super.a($$0);
      dhl $$2 = $$0.q();
      jh $$3 = $$0.a();
      jm[] $$4 = $$0.f();

      for (jm $$5 : $$4) {
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
