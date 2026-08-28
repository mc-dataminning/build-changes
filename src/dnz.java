import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dnz extends dnh {
   public static final MapCodec<dnz> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dnz::new));
   public static final dsu g = dit.aE;
   protected static final float h = 2.5F;
   private static final Map<je, ewi> i = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dex.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         je.d,
         dex.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         je.e,
         dex.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         je.f,
         dex.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dnz> a() {
      return f;
   }

   protected dnz(lm $$0, drz.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return m($$0);
   }

   public static ewi m(dsa $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dbz $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2.g());
      dsa $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = this.o();
      dbz $$2 = $$0.q();
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
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dez.a.o() : $$0;
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
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
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(g);
   }
}
