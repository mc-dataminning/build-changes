import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dou extends dob {
   public static final MapCodec<dou> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dou::new));
   public static final dtw g = djc.aE;
   protected static final float h = 2.5F;
   private static final Map<iw, exn> i = Maps.newEnumMap(
      ImmutableMap.of(
         iw.c,
         dfc.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         iw.d,
         dfc.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         iw.e,
         dfc.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         iw.f,
         dfc.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dou> a() {
      return f;
   }

   protected dou(le $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, iw.c));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return m($$0);
   }

   public static exn m(dtc $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dcd $$0, ir $$1, iw $$2) {
      ir $$3 = $$1.a($$2.g());
      dtc $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = this.n();
      dcd $$2 = $$0.q();
      ir $$3 = $$0.a();
      iw[] $$4 = $$0.f();

      for (iw $$5 : $$4) {
         if ($$5.o().d()) {
            iw $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dfe.a.n() : $$0;
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      iw $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      iw $$10 = $$4.g();
      $$1.a(lb.ac, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(g);
   }
}
