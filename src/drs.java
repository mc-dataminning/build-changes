import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class drs extends dra {
   public static final MapCodec<drs> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, drs::new));
   public static final dws<jm> g = dml.aF;
   protected static final float h = 2.5F;
   private static final Map<jm, fas> i = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         diq.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         jm.d,
         diq.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         jm.e,
         diq.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         jm.f,
         diq.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<drs> a() {
      return f;
   }

   protected drs(lw $$0, dvu.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(g, jm.c));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return o($$0);
   }

   public static fas o(dvv $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dfp $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2.g());
      dvv $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dvv $$1 = this.m();
      dfp $$2 = $$0.q();
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
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dis.a.m() : $$0;
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      jm $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jm $$10 = $$4.g();
      $$1.a(ls.ae, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(g);
   }
}
