import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dkz extends dkh {
   public static final MapCodec<dkz> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dkz::new));
   public static final dpt g = dft.aE;
   protected static final float h = 2.5F;
   private static final Map<ih, est> i = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         dby.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ih.d,
         dby.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ih.e,
         dby.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ih.f,
         dby.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dkz> a() {
      return f;
   }

   protected dkz(ko $$0, doy.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, ih.c));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return m($$0);
   }

   public static est m(doz $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(cza $$0, ib $$1, ih $$2) {
      ib $$3 = $$1.a($$2.g());
      doz $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = this.n();
      cza $$2 = $$0.q();
      ib $$3 = $$0.a();
      ih[] $$4 = $$0.f();

      for (ih $$5 : $$4) {
         if ($$5.o().d()) {
            ih $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dca.a.n() : $$0;
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      ih $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ih $$10 = $$4.g();
      $$1.a(kl.ac, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(g);
   }
}
