import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class ddl extends ddi {
   public static final MapCodec<ddl> b = b(ddl::new);
   public static final drx c = dhw.aE;
   private static final Map<it, evf> e = Maps.newEnumMap(
      ImmutableMap.of(
         it.c,
         dea.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         it.d,
         dea.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         it.e,
         dea.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         it.f,
         dea.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends ddl> a() {
      return b;
   }

   protected ddl(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, it.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dec.a.n() : $$0;
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      it $$3 = $$0.c(c);
      io $$4 = $$2.a($$3.g());
      drd $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      drd $$1 = super.a($$0);
      dbc $$2 = $$0.q();
      io $$3 = $$0.a();
      it[] $$4 = $$0.f();

      for (it $$5 : $$4) {
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
