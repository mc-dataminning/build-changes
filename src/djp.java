import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class djp extends djm {
   public static final MapCodec<djp> b = b(djp::new);
   public static final dyk<jm> c = doc.aF;
   private static final Map<jm, fcm> e = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dke.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jm.d,
         dke.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jm.e,
         dke.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jm.f,
         dke.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends djp> a() {
      return b;
   }

   protected djp(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return $$4.g() == $$0.c(c) && !$$0.a($$1, $$3) ? dkg.a.m() : $$0;
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jm $$3 = $$0.c(c);
      jh $$4 = $$2.a($$3.g());
      dxn $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = super.a($$0);
      dhd $$2 = $$0.q();
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
