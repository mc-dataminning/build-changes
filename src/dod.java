import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dod extends dnl {
   public static final MapCodec<dod> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dod::new));
   public static final dsy g = dix.aE;
   protected static final float h = 2.5F;
   private static final Map<je, ewm> i = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dfb.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         je.d,
         dfb.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         je.e,
         dfb.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         je.f,
         dfb.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dod> a() {
      return f;
   }

   protected dod(lm $$0, dsd.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return m($$0);
   }

   public static ewm m(dse $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dcd $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2.g());
      dse $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dse $$1 = this.o();
      dcd $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
         if ($$5.o().d()) {
            je $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dfd.a.o() : $$0;
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      je $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      je $$10 = $$4.g();
      $$1.a(li.ae, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(g);
   }
}
