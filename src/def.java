import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class def extends dec {
   public static final MapCodec<def> b = b(def::new);
   public static final dsr c = diq.aE;
   private static final Map<je, ewf> e = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         deu.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         je.d,
         deu.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         je.e,
         deu.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         je.f,
         deu.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends def> a() {
      return b;
   }

   protected def(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, je.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dew.a.n() : $$0;
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      je $$3 = $$0.c(c);
      iz $$4 = $$2.a($$3.g());
      drx $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = super.a($$0);
      dbw $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
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
