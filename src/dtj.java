import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dtj extends dsr {
   public static final MapCodec<dtj> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dtj::new));
   public static final dyk<jm> g = doc.aF;
   protected static final float h = 2.5F;
   private static final Map<jm, fcm> i = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dke.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         jm.d,
         dke.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         jm.e,
         dke.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         jm.f,
         dke.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dtj> a() {
      return f;
   }

   protected dtj(lw $$0, dxm.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(g, jm.c));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return o($$0);
   }

   public static fcm o(dxn $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dhd $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2.g());
      dxn $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = this.m();
      dhd $$2 = $$0.q();
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
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dkg.a.m() : $$0;
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      jm $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jm $$10 = $$4.g();
      $$1.a(ls.af, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(g);
   }
}
