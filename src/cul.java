import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class cul extends cui {
   public static final MapCodec<cul> b = b(cul::new);
   public static final dic c = cyv.aE;
   private static final Map<hx, ekn> e = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cva.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         hx.d,
         cva.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         hx.e,
         cva.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         hx.f,
         cva.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends cul> a() {
      return b;
   }

   protected cul(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, hx.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return e.get($$0.c(c));
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c, d);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? cvc.a.o() : $$0;
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      hx $$3 = $$0.c(c);
      ht $$4 = $$2.a($$3.g());
      dhi $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = super.a($$0);
      csd $$2 = $$0.q();
      ht $$3 = $$0.a();
      hx[] $$4 = $$0.f();

      for (hx $$5 : $$4) {
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
