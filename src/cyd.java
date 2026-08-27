import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class cyd extends cya {
   public static final MapCodec<cyd> b = b(cyd::new);
   public static final dmd c = dcn.aE;
   private static final Map<ie, eos> e = Maps.newEnumMap(
      ImmutableMap.of(
         ie.c,
         cys.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ie.d,
         cys.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ie.e,
         cys.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ie.f,
         cys.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends cyd> a() {
      return b;
   }

   protected cyd(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ie.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? cyu.a.o() : $$0;
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      ie $$3 = $$0.c(c);
      hz $$4 = $$2.a($$3.g());
      dlj $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      dlj $$1 = super.a($$0);
      cvu $$2 = $$0.q();
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
