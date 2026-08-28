import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class deq extends den {
   public static final MapCodec<deq> b = b(deq::new);
   public static final dtb c = djb.aE;
   private static final Map<jf, ews> e = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dff.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jf.d,
         dff.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jf.e,
         dff.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jf.f,
         dff.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends deq> a() {
      return b;
   }

   protected deq(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, jf.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dfh.a.o() : $$0;
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      jf $$3 = $$0.c(c);
      ja $$4 = $$2.a($$3.g());
      dsh $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = super.a($$0);
      dcg $$2 = $$0.q();
      ja $$3 = $$0.a();
      jf[] $$4 = $$0.f();

      for (jf $$5 : $$4) {
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
