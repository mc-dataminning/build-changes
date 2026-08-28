import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dtk extends dss {
   public static final MapCodec<dtk> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dtk::new));
   public static final dyl<jm> g = dob.aF;
   protected static final float h = 2.5F;
   private static final Map<jm, fcl> i = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkd.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         jm.d,
         dkd.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         jm.e,
         dkd.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         jm.f,
         dkd.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dtk> a() {
      return f;
   }

   protected dtk(lw $$0, dxn.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(g, jm.c));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return o($$0);
   }

   public static fcl o(dxo $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dhc $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2.g());
      dxo $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = this.m();
      dhc $$2 = $$0.q();
      jh $$3 = $$0.a();
      jm[] $$4 = $$0.f();

      for (jm $$5 : $$4) {
         if ($$5.o().d()) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dkf.a.m() : $$0;
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      jm $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jm $$10 = $$4.g();
      $$1.a(ls.ag, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(g);
   }
}
