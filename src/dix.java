import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dix extends diu {
   public static final MapCodec<dix> b = b(dix::new);
   public static final dxu<jn> c = dnk.aF;
   private static final Map<jn, fbu> e = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djm.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jn.d,
         djm.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jn.e,
         djm.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jn.f,
         djm.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dix> a() {
      return b;
   }

   protected dix(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jn.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return $$4.g() == $$0.c(c) && !$$0.a($$1, $$3) ? djo.a.m() : $$0;
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      jn $$3 = $$0.c(c);
      ji $$4 = $$2.a($$3.g());
      dwx $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      dwx $$1 = super.a($$0);
      dgl $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
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
