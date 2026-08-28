import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dss extends dsa {
   public static final MapCodec<dss> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dss::new));
   public static final dxt<jn> g = dnj.aF;
   protected static final float h = 2.5F;
   private static final Map<jn, fbt> i = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djl.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         jn.d,
         djl.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         jn.e,
         djl.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         jn.f,
         djl.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dss> a() {
      return f;
   }

   protected dss(lx $$0, dwv.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(g, jn.c));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return o($$0);
   }

   public static fbt o(dww $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dgk $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2.g());
      dww $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      dww $$1 = this.m();
      dgk $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
         if ($$5.o().d()) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? djn.a.m() : $$0;
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      jn $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jn $$10 = $$4.g();
      $$1.a(lt.ag, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(g);
   }
}
