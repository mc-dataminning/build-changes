import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doa extends dni {
   public static final MapCodec<doa> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, doa::new));
   public static final dsv g = diu.aE;
   protected static final float h = 2.5F;
   private static final Map<je, ewj> i = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dey.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         je.d,
         dey.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         je.e,
         dey.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         je.f,
         dey.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<doa> a() {
      return f;
   }

   protected doa(lm $$0, dsa.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return m($$0);
   }

   public static ewj m(dsb $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dca $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2.g());
      dsb $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = this.o();
      dca $$2 = $$0.q();
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
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dfa.a.o() : $$0;
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
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
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(g);
   }
}
