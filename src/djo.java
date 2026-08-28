import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class djo extends djl {
   public static final MapCodec<djo> b = b(djo::new);
   public static final dyl<jm> c = dob.aF;
   private static final Map<jm, fcl> e = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkd.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jm.d,
         dkd.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jm.e,
         dkd.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jm.f,
         dkd.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends djo> a() {
      return b;
   }

   protected djo(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return $$4.g() == $$0.c(c) && !$$0.a($$1, $$3) ? dkf.a.m() : $$0;
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jm $$3 = $$0.c(c);
      jh $$4 = $$2.a($$3.g());
      dxo $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = super.a($$0);
      dhc $$2 = $$0.q();
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
