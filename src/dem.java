import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dem extends dej {
   public static final MapCodec<dem> b = b(dem::new);
   public static final dtw c = djc.aE;
   private static final Map<iw, exn> e = Maps.newEnumMap(
      ImmutableMap.of(
         iw.c,
         dfc.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         iw.d,
         dfc.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         iw.e,
         dfc.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         iw.f,
         dfc.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dem> a() {
      return b;
   }

   protected dem(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, iw.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dfe.a.n() : $$0;
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      iw $$3 = $$0.c(c);
      ir $$4 = $$2.a($$3.g());
      dtc $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = super.a($$0);
      dcd $$2 = $$0.q();
      ir $$3 = $$0.a();
      iw[] $$4 = $$0.f();

      for (iw $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.a(c, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
