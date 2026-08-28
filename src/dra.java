import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dra extends dqi {
   public static final MapCodec<dra> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dra::new));
   public static final dvx g = dlt.aF;
   protected static final float h = 2.5F;
   private static final Map<jl, fab> i = Maps.newEnumMap(
      ImmutableMap.of(
         jl.c,
         dhy.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         jl.d,
         dhy.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         jl.e,
         dhy.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         jl.f,
         dhy.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dra> a() {
      return f;
   }

   protected dra(lu $$0, dvc.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(g, jl.c));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return o($$0);
   }

   public static fab o(dvd $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dey $$0, jg $$1, jl $$2) {
      jg $$3 = $$1.a($$2.g());
      dvd $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = this.m();
      dey $$2 = $$0.q();
      jg $$3 = $$0.a();
      jl[] $$4 = $$0.f();

      for (jl $$5 : $$4) {
         if ($$5.o().d()) {
            jl $$6 = $$5.g();
            $$1 = $$1.b(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dia.a.m() : $$0;
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      jl $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jl $$10 = $$4.g();
      $$1.a(lq.ae, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(g);
   }
}
