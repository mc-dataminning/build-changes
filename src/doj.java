import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doj extends dnr {
   public static final MapCodec<doj> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, doj::new));
   public static final dte g = djd.aE;
   protected static final float h = 2.5F;
   private static final Map<jf, ewy> i = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dfh.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         jf.d,
         dfh.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         jf.e,
         dfh.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         jf.f,
         dfh.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<doj> a() {
      return f;
   }

   protected doj(ln $$0, dsj.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, jf.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return m($$0);
   }

   public static ewy m(dsk $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dci $$0, ja $$1, jf $$2) {
      ja $$3 = $$1.a($$2.g());
      dsk $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = this.o();
      dci $$2 = $$0.q();
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
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dfj.a.o() : $$0;
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
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
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(g);
   }
}
