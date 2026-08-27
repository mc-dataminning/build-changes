import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class cxz extends cxw {
   public static final MapCodec<cxz> b = b(cxz::new);
   public static final dlz c = dcj.aE;
   private static final Map<ie, eol> e = Maps.newEnumMap(
      ImmutableMap.of(
         ie.c,
         cyo.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ie.d,
         cyo.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ie.e,
         cyo.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ie.f,
         cyo.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends cxz> a() {
      return b;
   }

   protected cxz(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ie.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? cyq.a.o() : $$0;
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      ie $$3 = $$0.c(c);
      hz $$4 = $$2.a($$3.g());
      dlf $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = super.a($$0);
      cvq $$2 = $$0.q();
      hz $$3 = $$0.a();
      ie[] $$4 = $$0.f();

      for (ie $$5 : $$4) {
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
