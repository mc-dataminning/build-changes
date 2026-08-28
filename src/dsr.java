import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dsr extends drz {
   public static final MapCodec<dsr> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dsr::new));
   public static final dxs<jn> g = dni.aF;
   protected static final float h = 2.5F;
   private static final Map<jn, fbs> i = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djk.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         jn.d,
         djk.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         jn.e,
         djk.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         jn.f,
         djk.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dsr> a() {
      return f;
   }

   protected dsr(lx $$0, dwu.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(g, jn.c));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return o($$0);
   }

   public static fbs o(dwv $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dgj $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2.g());
      dwv $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dwv $$1 = this.m();
      dgj $$2 = $$0.q();
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
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? djm.a.m() : $$0;
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
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
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(g);
   }
}
