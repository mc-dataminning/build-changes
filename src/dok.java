import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dok extends dns {
   public static final MapCodec<dok> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dok::new));
   public static final dtf g = dje.aE;
   protected static final float h = 2.5F;
   private static final Map<jf, exa> i = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dfi.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         jf.d,
         dfi.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         jf.e,
         dfi.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         jf.f,
         dfi.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dok> a() {
      return f;
   }

   protected dok(ln $$0, dsk.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, jf.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return m($$0);
   }

   public static exa m(dsl $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dcj $$0, ja $$1, jf $$2) {
      ja $$3 = $$1.a($$2.g());
      dsl $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = this.o();
      dcj $$2 = $$0.q();
      ja $$3 = $$0.a();
      jf[] $$4 = $$0.f();

      for (jf $$5 : $$4) {
         if ($$5.o().d()) {
            jf $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dfk.a.o() : $$0;
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      jf $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jf $$10 = $$4.g();
      $$1.a(lj.ae, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(g);
   }
}
